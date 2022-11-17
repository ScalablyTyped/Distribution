package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionStatement_
  extends StObject
     with BaseNode {
  
  var expression: Expression
  
  @JSName("type")
  var type_ExpressionStatement_ : "ExpressionStatement"
}
object ExpressionStatement_ {
  
  inline def apply(expression: Expression): ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[ExpressionStatement_]
  }
  
  extension [Self <: ExpressionStatement_](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ExpressionStatement"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
