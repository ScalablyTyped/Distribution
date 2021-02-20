package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetectSentimentItemResult extends StObject {
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  
  /**
    * The sentiment detected in the document.
    */
  var Sentiment: js.UndefOr[SentimentType] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
    */
  var SentimentScore: js.UndefOr[typings.awsSdk.comprehendMod.SentimentScore] = js.native
}
object BatchDetectSentimentItemResult {
  
  @scala.inline
  def apply(): BatchDetectSentimentItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectSentimentItemResult]
  }
  
  @scala.inline
  implicit class BatchDetectSentimentItemResultMutableBuilder[Self <: BatchDetectSentimentItemResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Integer): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
    
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
