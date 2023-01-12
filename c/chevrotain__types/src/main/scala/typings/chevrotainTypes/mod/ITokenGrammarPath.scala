package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITokenGrammarPath
  extends StObject
     with IGrammarPath {
  
  var lastTok: TokenType
  
  var lastTokOccurrence: Double
}
object ITokenGrammarPath {
  
  inline def apply(
    lastTok: TokenType,
    lastTokOccurrence: Double,
    occurrenceStack: js.Array[Double],
    ruleStack: js.Array[String]
  ): ITokenGrammarPath = {
    val __obj = js.Dynamic.literal(lastTok = lastTok.asInstanceOf[js.Any], lastTokOccurrence = lastTokOccurrence.asInstanceOf[js.Any], occurrenceStack = occurrenceStack.asInstanceOf[js.Any], ruleStack = ruleStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITokenGrammarPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITokenGrammarPath] (val x: Self) extends AnyVal {
    
    inline def setLastTok(value: TokenType): Self = StObject.set(x, "lastTok", value.asInstanceOf[js.Any])
    
    inline def setLastTokOccurrence(value: Double): Self = StObject.set(x, "lastTokOccurrence", value.asInstanceOf[js.Any])
  }
}
