import java.awt.*;
import javax.swing.*;
public class Fenetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame fenetre= new JFrame();
		
	//fenetre.setSize(350,175);
	fenetre.setTitle("Fenetre 1");
	fenetre.setVisible(true);
	fenetre.setDefaultCloseOperation(3);
	fenetre.setBounds(500,300,800,100);
	
	Container c= fenetre.getContentPane();
	Color co=new Color(200,0,10);
	c.setBackground(co);
	
	JButton bo=new JButton("Button 1");
	c.add(bo);
	
	FlowLayout f=new FlowLayout();
	c.setLayout(f);
	
	JCheckBox case1=new JCheckBox("case1");
	JCheckBox case2=new JCheckBox("case2");
	c.add(case1);
	c.add(case2);
	
	
	JRadioButton R1=new JRadioButton("R1");
	JRadioButton R2=new JRadioButton("R2");
	c.add(R1);
	c.add(R2);
	
	
	ButtonGroup gr=new ButtonGroup();
	gr.add(R1);
	gr.add(R2);
	
	
	JLabel et =new JLabel("Prenom:");
	c.add(et);
	
	JLabel info=new JLabel("Nom:");
	JTextField txt=new JTextField(15);
	c.add(info);
	c.add(txt);
	
	
	String[] Couleur= {"rg","vr","bl","nr"};
	JList lst =new JList(Couleur);
	c.add(lst);
	
	String[] Couleur2= {"rg","vr","bl","nr"};
	JList lst2 =new JList(Couleur);
	JScrollPane scr=new JScrollPane(lst2);
	c.add(scr);
	
	
	
	String[] Couleur3= {"rg","vr","bl","nr"};
	JComboBox cmb=new JComboBox(Couleur3);
	c.add(cmb);
	
	
	JOptionPane.showMessageDialog(fenetre, "Hello!");
	
	JOptionPane.showMessageDialog(fenetre, "Hello!","Msg",0);
	
	
	
	
	}
	
	

}
