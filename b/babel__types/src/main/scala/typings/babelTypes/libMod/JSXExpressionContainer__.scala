package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.JSXExpressionContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXExpressionContainer__
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node {
  
  var expression: Expression | JSXEmptyExpression__
  
  @JSName("type")
  var type_JSXExpressionContainer__ : JSXExpressionContainer
}
object JSXExpressionContainer__ {
  
  inline def apply(expression: Expression | JSXEmptyExpression__): JSXExpressionContainer__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[JSXExpressionContainer__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXExpressionContainer__] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression | JSXEmptyExpression__): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXExpressionContainer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
