package typings.babelTypes.libMod

import typings.babelTypes.babelTypesBooleans.`false`
import typings.babelTypes.babelTypesBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBindingIdentifiers {
  
  inline def apply(node: Node): Record[String, js.Array[Identifier_] | Identifier_] = ^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.Array[Identifier_] | Identifier_]]
  inline def apply(node: Node, duplicates: Boolean): Record[String, js.Array[Identifier_] | Identifier_] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Array[Identifier_] | Identifier_]]
  inline def apply(node: Node, duplicates: Boolean, outerOnly: Boolean): Record[String, js.Array[Identifier_] | Identifier_] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any], outerOnly.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Array[Identifier_] | Identifier_]]
  inline def apply(node: Node, duplicates: Unit, outerOnly: Boolean): Record[String, js.Array[Identifier_] | Identifier_] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any], outerOnly.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Array[Identifier_] | Identifier_]]
  inline def apply(node: Node, duplicates: `false`): Record[String, Identifier_] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[Record[String, Identifier_]]
  inline def apply(node: Node, duplicates: `false`, outerOnly: Boolean): Record[String, Identifier_] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any], outerOnly.asInstanceOf[js.Any])).asInstanceOf[Record[String, Identifier_]]
  inline def apply(node: Node, duplicates: `true`): Record[String, js.Array[Identifier_]] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Array[Identifier_]]]
  inline def apply(node: Node, duplicates: `true`, outerOnly: Boolean): Record[String, js.Array[Identifier_]] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any], outerOnly.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Array[Identifier_]]]
  
  @JSImport("@babel/types/lib", "getBindingIdentifiers")
  @js.native
  val ^ : js.Any = js.native
  
  object keys {
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ArrayPattern")
    @js.native
    def ArrayPattern: js.Array[String] = js.native
    inline def ArrayPattern_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrayPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ArrowFunctionExpression")
    @js.native
    def ArrowFunctionExpression: js.Array[String] = js.native
    inline def ArrowFunctionExpression_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrowFunctionExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.AssignmentExpression")
    @js.native
    def AssignmentExpression: js.Array[String] = js.native
    inline def AssignmentExpression_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AssignmentExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.AssignmentPattern")
    @js.native
    def AssignmentPattern: js.Array[String] = js.native
    inline def AssignmentPattern_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AssignmentPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.CatchClause")
    @js.native
    def CatchClause: js.Array[String] = js.native
    inline def CatchClause_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CatchClause")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ClassDeclaration")
    @js.native
    def ClassDeclaration: js.Array[String] = js.native
    inline def ClassDeclaration_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ClassExpression")
    @js.native
    def ClassExpression: js.Array[String] = js.native
    inline def ClassExpression_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ClassMethod")
    @js.native
    def ClassMethod: js.Array[String] = js.native
    inline def ClassMethod_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ClassPrivateMethod")
    @js.native
    def ClassPrivateMethod: js.Array[String] = js.native
    inline def ClassPrivateMethod_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassPrivateMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.DeclareClass")
    @js.native
    def DeclareClass: js.Array[String] = js.native
    inline def DeclareClass_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareClass")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.DeclareFunction")
    @js.native
    def DeclareFunction: js.Array[String] = js.native
    inline def DeclareFunction_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.DeclareInterface")
    @js.native
    def DeclareInterface: js.Array[String] = js.native
    inline def DeclareInterface_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareInterface")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.DeclareModule")
    @js.native
    def DeclareModule: js.Array[String] = js.native
    inline def DeclareModule_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareModule")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.DeclareOpaqueType")
    @js.native
    def DeclareOpaqueType: js.Array[String] = js.native
    inline def DeclareOpaqueType_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareOpaqueType")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.DeclareTypeAlias")
    @js.native
    def DeclareTypeAlias: js.Array[String] = js.native
    inline def DeclareTypeAlias_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareTypeAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.DeclareVariable")
    @js.native
    def DeclareVariable: js.Array[String] = js.native
    inline def DeclareVariable_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareVariable")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ExportDefaultSpecifier")
    @js.native
    def ExportDefaultSpecifier: js.Array[String] = js.native
    inline def ExportDefaultSpecifier_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ExportNamespaceSpecifier")
    @js.native
    def ExportNamespaceSpecifier: js.Array[String] = js.native
    inline def ExportNamespaceSpecifier_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportNamespaceSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ExportSpecifier")
    @js.native
    def ExportSpecifier: js.Array[String] = js.native
    inline def ExportSpecifier_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ForInStatement")
    @js.native
    def ForInStatement: js.Array[String] = js.native
    inline def ForInStatement_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForInStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ForOfStatement")
    @js.native
    def ForOfStatement: js.Array[String] = js.native
    inline def ForOfStatement_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForOfStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.FunctionDeclaration")
    @js.native
    def FunctionDeclaration: js.Array[String] = js.native
    inline def FunctionDeclaration_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.FunctionExpression")
    @js.native
    def FunctionExpression: js.Array[String] = js.native
    inline def FunctionExpression_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ImportDeclaration")
    @js.native
    def ImportDeclaration: js.Array[String] = js.native
    inline def ImportDeclaration_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ImportDefaultSpecifier")
    @js.native
    def ImportDefaultSpecifier: js.Array[String] = js.native
    inline def ImportDefaultSpecifier_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportDefaultSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ImportNamespaceSpecifier")
    @js.native
    def ImportNamespaceSpecifier: js.Array[String] = js.native
    inline def ImportNamespaceSpecifier_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportNamespaceSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ImportSpecifier")
    @js.native
    def ImportSpecifier: js.Array[String] = js.native
    inline def ImportSpecifier_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.InterfaceDeclaration")
    @js.native
    def InterfaceDeclaration: js.Array[String] = js.native
    inline def InterfaceDeclaration_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InterfaceDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.LabeledStatement")
    @js.native
    def LabeledStatement: js.Array[String] = js.native
    inline def LabeledStatement_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LabeledStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ObjectMethod")
    @js.native
    def ObjectMethod: js.Array[String] = js.native
    inline def ObjectMethod_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ObjectPattern")
    @js.native
    def ObjectPattern: js.Array[String] = js.native
    inline def ObjectPattern_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.ObjectProperty")
    @js.native
    def ObjectProperty: js.Array[String] = js.native
    inline def ObjectProperty_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.OpaqueType")
    @js.native
    def OpaqueType: js.Array[String] = js.native
    inline def OpaqueType_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OpaqueType")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.RestElement")
    @js.native
    def RestElement: js.Array[String] = js.native
    inline def RestElement_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RestElement")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.TypeAlias")
    @js.native
    def TypeAlias: js.Array[String] = js.native
    inline def TypeAlias_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.UnaryExpression")
    @js.native
    def UnaryExpression: js.Array[String] = js.native
    inline def UnaryExpression_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.UpdateExpression")
    @js.native
    def UpdateExpression: js.Array[String] = js.native
    inline def UpdateExpression_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.VariableDeclaration")
    @js.native
    def VariableDeclaration: js.Array[String] = js.native
    inline def VariableDeclaration_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("@babel/types/lib", "getBindingIdentifiers.keys.VariableDeclarator")
    @js.native
    def VariableDeclarator: js.Array[String] = js.native
    inline def VariableDeclarator_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclarator")(x.asInstanceOf[js.Any])
  }
}
