package typings.regexpTreeSaQo4gle.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repetition
  extends StObject
     with Base[typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Repetition]
     with Expression {
  
  var expression: Expression
  
  var quantifier: Quantifier
}
object Repetition {
  
  inline def apply(expression: Expression, quantifier: Quantifier): Repetition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Repetition")
    __obj.asInstanceOf[Repetition]
  }
  
  extension [Self <: Repetition](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setQuantifier(value: Quantifier): Self = StObject.set(x, "quantifier", value.asInstanceOf[js.Any])
  }
}
