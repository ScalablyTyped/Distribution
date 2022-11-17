package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryExpression_
  extends StObject
     with BaseNode {
  
  var left: Expression | PrivateName_
  
  var operator: "+" | "-" | "/" | "%" | "*" | "**" | "&" | "|" | ">>" | ">>>" | "<<" | "^" | "==" | "===" | "!=" | "!==" | "in" | "instanceof" | ">" | "<" | ">=" | "<=" | "|>"
  
  var right: Expression
  
  @JSName("type")
  var type_BinaryExpression_ : "BinaryExpression"
}
object BinaryExpression_ {
  
  inline def apply(
    left: Expression | PrivateName_,
    operator: "+" | "-" | "/" | "%" | "*" | "**" | "&" | "|" | ">>" | ">>>" | "<<" | "^" | "==" | "===" | "!=" | "!==" | "in" | "instanceof" | ">" | "<" | ">=" | "<=" | "|>",
    right: Expression
  ): BinaryExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[BinaryExpression_]
  }
  
  extension [Self <: BinaryExpression_](x: Self) {
    
    inline def setLeft(value: Expression | PrivateName_): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(
      value: "+" | "-" | "/" | "%" | "*" | "**" | "&" | "|" | ">>" | ">>>" | "<<" | "^" | "==" | "===" | "!=" | "!==" | "in" | "instanceof" | ">" | "<" | ">=" | "<=" | "|>"
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: "BinaryExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
