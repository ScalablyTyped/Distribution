package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.VariableDeclaration
import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.babelTypesStrings.const
import typings.babelTypes.babelTypesStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait VariableDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with Statement {
  
  var declarations: js.Array[VariableDeclarator_]
  
  var declare: Boolean | Null
  
  var kind: `var` | let | const
  
  @JSName("type")
  var type_VariableDeclaration_ : VariableDeclaration
}
object VariableDeclaration_ {
  
  @scala.inline
  def apply(declarations: js.Array[VariableDeclarator_], kind: `var` | let | const): VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[VariableDeclaration_]
  }
  
  @scala.inline
  implicit class VariableDeclaration_MutableBuilder[Self <: VariableDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclarations(value: js.Array[VariableDeclarator_]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationsVarargs(value: VariableDeclarator_ *): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    @scala.inline
    def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
