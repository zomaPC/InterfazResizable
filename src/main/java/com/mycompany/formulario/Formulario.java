
package com.mycompany.formulario;
import javax.swing.*;

public class Formulario extends JFrame{
    
    public Formulario(){
     setLayout(null);
     }
    public static void main(String args[]){
     Formulario formulario = new Formulario();
     formulario.setBounds(0,0,400,400);
     formulario.setVisible(true);
     formulario.setLocationRelativeTo(null);
     formulario.setResizable(false);
     
    }
}
