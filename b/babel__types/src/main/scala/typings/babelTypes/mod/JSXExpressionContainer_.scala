package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXExpressionContainer_
  extends StObject
     with BaseNode {
  
  var expression: Expression | JSXEmptyExpression_
  
  @JSName("type")
  var type_JSXExpressionContainer_ : "JSXExpressionContainer"
}
object JSXExpressionContainer_ {
  
  inline def apply(expression: Expression | JSXEmptyExpression_): JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[JSXExpressionContainer_]
  }
  
  extension [Self <: JSXExpressionContainer_](x: Self) {
    
    inline def setExpression(value: Expression | JSXEmptyExpression_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: "JSXExpressionContainer"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
