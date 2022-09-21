package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXExpressionContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXExpressionContainer_
  extends StObject
     with Node
     with Immutable
     with JSX {
  
  var expression: Expression
  
  @JSName("type")
  var type_JSXExpressionContainer_ : JSXExpressionContainer
}
object JSXExpressionContainer_ {
  
  inline def apply(end: Double, expression: Expression, loc: SourceLocation, start: Double): JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[JSXExpressionContainer_]
  }
  
  extension [Self <: JSXExpressionContainer_](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXExpressionContainer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
