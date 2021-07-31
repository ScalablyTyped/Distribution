package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXExpressionContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait JSXExpressionContainer_
  extends StObject
     with BaseNode
     with Immutable
     with JSX {
  
  var expression: Expression | JSXEmptyExpression_
  
  @JSName("type")
  var type_JSXExpressionContainer_ : JSXExpressionContainer
}
object JSXExpressionContainer_ {
  
  @scala.inline
  def apply(expression: Expression | JSXEmptyExpression_): JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXExpressionContainer")
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
