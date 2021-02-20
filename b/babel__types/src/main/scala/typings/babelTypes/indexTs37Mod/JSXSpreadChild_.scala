package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXSpreadChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait JSXSpreadChild_
  extends Immutable
     with BaseNode
     with JSX {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_JSXSpreadChild_ : JSXSpreadChild = js.native
}
object JSXSpreadChild_ {
  
  @scala.inline
  def apply(expression: Expression, `type`: JSXSpreadChild): JSXSpreadChild_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXSpreadChild_]
  }
  
  @scala.inline
  implicit class JSXSpreadChild_MutableBuilder[Self <: JSXSpreadChild_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXSpreadChild): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
