package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXExpressionContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait JSXExpressionContainer_
  extends Immutable
     with BaseNode
     with JSX {
  
  var expression: Expression | JSXEmptyExpression_ = js.native
  
  @JSName("type")
  var type_JSXExpressionContainer_ : JSXExpressionContainer = js.native
}
object JSXExpressionContainer_ {
  
  @scala.inline
  def apply(expression: Expression | JSXEmptyExpression_, `type`: JSXExpressionContainer): JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXExpressionContainer_]
  }
  
  @scala.inline
  implicit class JSXExpressionContainer_MutableBuilder[Self <: JSXExpressionContainer_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression | JSXEmptyExpression_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXExpressionContainer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
