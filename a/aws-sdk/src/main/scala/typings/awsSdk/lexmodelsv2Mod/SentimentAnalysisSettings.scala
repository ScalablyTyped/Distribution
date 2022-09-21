package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentimentAnalysisSettings extends StObject {
  
  /**
    * Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
    */
  var detectSentiment: Boolean
}
object SentimentAnalysisSettings {
  
  inline def apply(detectSentiment: Boolean): SentimentAnalysisSettings = {
    val __obj = js.Dynamic.literal(detectSentiment = detectSentiment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentimentAnalysisSettings]
  }
  
  extension [Self <: SentimentAnalysisSettings](x: Self) {
    
    inline def setDetectSentiment(value: Boolean): Self = StObject.set(x, "detectSentiment", value.asInstanceOf[js.Any])
  }
}
