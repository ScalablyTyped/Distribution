package typings.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentimentResponse extends StObject {
  
  /**
    * The inferred sentiment that Amazon Comprehend has the highest confidence in.
    */
  var sentimentLabel: js.UndefOr[SentimentLabel] = js.undefined
  
  /**
    * The likelihood that the sentiment was correctly inferred.
    */
  var sentimentScore: js.UndefOr[SentimentScore] = js.undefined
}
object SentimentResponse {
  
  @scala.inline
  def apply(): SentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentResponse]
  }
  
  @scala.inline
  implicit class SentimentResponseMutableBuilder[Self <: SentimentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSentimentLabel(value: SentimentLabel): Self = StObject.set(x, "sentimentLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentLabelUndefined: Self = StObject.set(x, "sentimentLabel", js.undefined)
    
    @scala.inline
    def setSentimentScore(value: SentimentScore): Self = StObject.set(x, "sentimentScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentScoreUndefined: Self = StObject.set(x, "sentimentScore", js.undefined)
  }
}
