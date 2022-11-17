package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnaryExpression_
  extends StObject
     with BaseNode {
  
  var argument: Expression
  
  var operator: "void" | "throw" | "delete" | "!" | "+" | "-" | "~" | "typeof"
  
  var prefix: Boolean
  
  @JSName("type")
  var type_UnaryExpression_ : "UnaryExpression"
}
object UnaryExpression_ {
  
  inline def apply(
    argument: Expression,
    operator: "void" | "throw" | "delete" | "!" | "+" | "-" | "~" | "typeof",
    prefix: Boolean
  ): UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[UnaryExpression_]
  }
  
  extension [Self <: UnaryExpression_](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: "void" | "throw" | "delete" | "!" | "+" | "-" | "~" | "typeof"): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setType(value: "UnaryExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
