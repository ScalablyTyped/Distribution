package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntacticContentAssistPath
  extends StObject
     with IGrammarPath {
  
  var nextTokenOccurrence: Double
  
  var nextTokenType: TokenType
}
object ISyntacticContentAssistPath {
  
  inline def apply(
    nextTokenOccurrence: Double,
    nextTokenType: TokenType,
    occurrenceStack: js.Array[Double],
    ruleStack: js.Array[String]
  ): ISyntacticContentAssistPath = {
    val __obj = js.Dynamic.literal(nextTokenOccurrence = nextTokenOccurrence.asInstanceOf[js.Any], nextTokenType = nextTokenType.asInstanceOf[js.Any], occurrenceStack = occurrenceStack.asInstanceOf[js.Any], ruleStack = ruleStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyntacticContentAssistPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISyntacticContentAssistPath] (val x: Self) extends AnyVal {
    
    inline def setNextTokenOccurrence(value: Double): Self = StObject.set(x, "nextTokenOccurrence", value.asInstanceOf[js.Any])
    
    inline def setNextTokenType(value: TokenType): Self = StObject.set(x, "nextTokenType", value.asInstanceOf[js.Any])
  }
}
