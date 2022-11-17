package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogicalExpression_
  extends StObject
     with BaseNode {
  
  var left: Expression
  
  var operator: "||" | "&&" | "??"
  
  var right: Expression
  
  @JSName("type")
  var type_LogicalExpression_ : "LogicalExpression"
}
object LogicalExpression_ {
  
  inline def apply(left: Expression, operator: "||" | "&&" | "??", right: Expression): LogicalExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[LogicalExpression_]
  }
  
  extension [Self <: LogicalExpression_](x: Self) {
    
    inline def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: "||" | "&&" | "??"): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: "LogicalExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
