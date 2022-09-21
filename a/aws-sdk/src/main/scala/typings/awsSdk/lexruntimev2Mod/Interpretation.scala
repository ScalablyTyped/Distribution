package typings.awsSdk.lexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interpretation extends StObject {
  
  /**
    * A list of intents that might satisfy the user's utterance. The intents are ordered by the confidence score.
    */
  var intent: js.UndefOr[Intent] = js.undefined
  
  /**
    * Determines the threshold where Amazon Lex V2 will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot.
    */
  var nluConfidence: js.UndefOr[ConfidenceScore] = js.undefined
  
  /**
    * The sentiment expressed in an utterance.  When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field contains the result of the analysis.
    */
  var sentimentResponse: js.UndefOr[SentimentResponse] = js.undefined
}
object Interpretation {
  
  inline def apply(): Interpretation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interpretation]
  }
  
  extension [Self <: Interpretation](x: Self) {
    
    inline def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setNluConfidence(value: ConfidenceScore): Self = StObject.set(x, "nluConfidence", value.asInstanceOf[js.Any])
    
    inline def setNluConfidenceUndefined: Self = StObject.set(x, "nluConfidence", js.undefined)
    
    inline def setSentimentResponse(value: SentimentResponse): Self = StObject.set(x, "sentimentResponse", value.asInstanceOf[js.Any])
    
    inline def setSentimentResponseUndefined: Self = StObject.set(x, "sentimentResponse", js.undefined)
  }
}
