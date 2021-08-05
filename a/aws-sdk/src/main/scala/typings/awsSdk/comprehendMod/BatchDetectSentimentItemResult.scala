package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectSentimentItemResult extends StObject {
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
  
  /**
    * The sentiment detected in the document.
    */
  var Sentiment: js.UndefOr[SentimentType] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
    */
  var SentimentScore: js.UndefOr[typings.awsSdk.comprehendMod.SentimentScore] = js.undefined
}
object BatchDetectSentimentItemResult {
  
  inline def apply(): BatchDetectSentimentItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectSentimentItemResult]
  }
  
  extension [Self <: BatchDetectSentimentItemResult](x: Self) {
    
    inline def setIndex(value: Integer): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
    
    inline def setSentiment(value: SentimentType): Self = StObject.set(x, "Sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentScore(value: SentimentScore): Self = StObject.set(x, "SentimentScore", value.asInstanceOf[js.Any])
    
    inline def setSentimentScoreUndefined: Self = StObject.set(x, "SentimentScore", js.undefined)
    
    inline def setSentimentUndefined: Self = StObject.set(x, "Sentiment", js.undefined)
  }
}
