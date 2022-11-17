package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNonNullExpression_
  extends StObject
     with BaseNode {
  
  var expression: Expression
  
  @JSName("type")
  var type_TSNonNullExpression_ : "TSNonNullExpression"
}
object TSNonNullExpression_ {
  
  inline def apply(expression: Expression): TSNonNullExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[TSNonNullExpression_]
  }
  
  extension [Self <: TSNonNullExpression_](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: "TSNonNullExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
