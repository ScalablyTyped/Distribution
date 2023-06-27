package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.VariableDeclaration
import typings.babelTypes.babelTypesStrings.`await using`
import typings.babelTypes.babelTypesStrings.`using`
import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.babelTypesStrings.const
import typings.babelTypes.babelTypesStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with Node
     with Standardized
     with Statement {
  
  var declarations: js.Array[VariableDeclarator_]
  
  var declare: js.UndefOr[Boolean | Null] = js.undefined
  
  var kind: `var` | let | const | `using` | (`await using`)
  
  @JSName("type")
  var type_VariableDeclaration_ : VariableDeclaration
}
object VariableDeclaration_ {
  
  inline def apply(declarations: js.Array[VariableDeclarator_], kind: `var` | let | const | `using` | (`await using`)): VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[VariableDeclaration_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariableDeclaration_] (val x: Self) extends AnyVal {
    
    inline def setDeclarations(value: js.Array[VariableDeclarator_]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: VariableDeclarator_ *): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setDeclareUndefined: Self = StObject.set(x, "declare", js.undefined)
    
    inline def setKind(value: `var` | let | const | `using` | (`await using`)): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
