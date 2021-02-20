package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectSentimentResponse extends StObject {
  
  /**
    * The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
    */
  var Sentiment: js.UndefOr[SentimentType] = js.native
  
  /**
    * An object that lists the sentiments, and their corresponding confidence levels.
    */
  var SentimentScore: js.UndefOr[typings.awsSdk.comprehendMod.SentimentScore] = js.native
}
object DetectSentimentResponse {
  
  @scala.inline
  def apply(): DetectSentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectSentimentResponse]
  }
  
  @scala.inline
  implicit class DetectSentimentResponseMutableBuilder[Self <: DetectSentimentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSentiment(value: SentimentType): Self = StObject.set(x, "Sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentScore(value: SentimentScore): Self = StObject.set(x, "SentimentScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentScoreUndefined: Self = StObject.set(x, "SentimentScore", js.undefined)
    
    @scala.inline
    def setSentimentUndefined: Self = StObject.set(x, "Sentiment", js.undefined)
  }
}
