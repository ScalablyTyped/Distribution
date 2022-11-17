package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclaration_
  extends StObject
     with BaseNode {
  
  var declarations: js.Array[VariableDeclarator_]
  
  var declare: js.UndefOr[Boolean | Null] = js.undefined
  
  var kind: "var" | "let" | "const" | "using"
  
  @JSName("type")
  var type_VariableDeclaration_ : "VariableDeclaration"
}
object VariableDeclaration_ {
  
  inline def apply(declarations: js.Array[VariableDeclarator_], kind: "var" | "let" | "const" | "using"): VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[VariableDeclaration_]
  }
  
  extension [Self <: VariableDeclaration_](x: Self) {
    
    inline def setDeclarations(value: js.Array[VariableDeclarator_]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: VariableDeclarator_ *): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setDeclareUndefined: Self = StObject.set(x, "declare", js.undefined)
    
    inline def setKind(value: "var" | "let" | "const" | "using"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: "VariableDeclaration"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
