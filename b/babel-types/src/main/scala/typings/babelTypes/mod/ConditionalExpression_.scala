package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ConditionalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalExpression_
  extends StObject
     with Node
     with Conditional
     with Expression {
  
  var alternate: Expression
  
  var consequent: Expression
  
  var test: Expression
  
  @JSName("type")
  var type_ConditionalExpression_ : ConditionalExpression
}
object ConditionalExpression_ {
  
  inline def apply(
    alternate: Expression,
    consequent: Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression
  ): ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[ConditionalExpression_]
  }
  
  extension [Self <: ConditionalExpression_](x: Self) {
    
    inline def setAlternate(value: Expression): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setConsequent(value: Expression): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConditionalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
