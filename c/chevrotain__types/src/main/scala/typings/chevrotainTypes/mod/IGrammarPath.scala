package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGrammarPath extends StObject {
  
  /**
    * The occurrence index (SUBRULE1/2/3/5/...) of each Grammar rule invoked and still unterminated.
    * Used to distinguish between **different** invocations of the same subrule at the same top level rule.
    */
  var occurrenceStack: js.Array[Double]
  
  /**
    * The Grammar rules invoked and still unterminated to reach this Grammar Path.
    */
  var ruleStack: js.Array[String]
}
object IGrammarPath {
  
  inline def apply(occurrenceStack: js.Array[Double], ruleStack: js.Array[String]): IGrammarPath = {
    val __obj = js.Dynamic.literal(occurrenceStack = occurrenceStack.asInstanceOf[js.Any], ruleStack = ruleStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrammarPath]
  }
  
  extension [Self <: IGrammarPath](x: Self) {
    
    inline def setOccurrenceStack(value: js.Array[Double]): Self = StObject.set(x, "occurrenceStack", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceStackVarargs(value: Double*): Self = StObject.set(x, "occurrenceStack", js.Array(value*))
    
    inline def setRuleStack(value: js.Array[String]): Self = StObject.set(x, "ruleStack", value.asInstanceOf[js.Any])
    
    inline def setRuleStackVarargs(value: String*): Self = StObject.set(x, "ruleStack", js.Array(value*))
  }
}
