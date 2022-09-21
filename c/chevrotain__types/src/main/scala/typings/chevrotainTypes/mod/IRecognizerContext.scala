package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecognizerContext extends StObject {
  
  /**
    * A copy of the parser's rule occurrence stack at the "time" the RecognitionException occurred.
    * This can be used to help debug parsing errors (How did we get here?).
    */
  var ruleOccurrenceStack: js.Array[Double]
  
  /**
    * A copy of the parser's rule stack at the "time" the RecognitionException occurred.
    * This can be used to help debug parsing errors (How did we get here?).
    */
  var ruleStack: js.Array[String]
}
object IRecognizerContext {
  
  inline def apply(ruleOccurrenceStack: js.Array[Double], ruleStack: js.Array[String]): IRecognizerContext = {
    val __obj = js.Dynamic.literal(ruleOccurrenceStack = ruleOccurrenceStack.asInstanceOf[js.Any], ruleStack = ruleStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecognizerContext]
  }
  
  extension [Self <: IRecognizerContext](x: Self) {
    
    inline def setRuleOccurrenceStack(value: js.Array[Double]): Self = StObject.set(x, "ruleOccurrenceStack", value.asInstanceOf[js.Any])
    
    inline def setRuleOccurrenceStackVarargs(value: Double*): Self = StObject.set(x, "ruleOccurrenceStack", js.Array(value*))
    
    inline def setRuleStack(value: js.Array[String]): Self = StObject.set(x, "ruleStack", value.asInstanceOf[js.Any])
    
    inline def setRuleStackVarargs(value: String*): Self = StObject.set(x, "ruleStack", js.Array(value*))
  }
}
