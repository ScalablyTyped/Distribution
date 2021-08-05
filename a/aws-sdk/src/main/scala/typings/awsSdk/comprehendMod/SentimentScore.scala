package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentimentScore extends StObject {
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the MIXED sentiment.
    */
  var Mixed: js.UndefOr[Float] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEGATIVE sentiment.
    */
  var Negative: js.UndefOr[Float] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEUTRAL sentiment.
    */
  var Neutral: js.UndefOr[Float] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the POSITIVE sentiment.
    */
  var Positive: js.UndefOr[Float] = js.undefined
}
object SentimentScore {
  
  inline def apply(): SentimentScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentScore]
  }
  
  extension [Self <: SentimentScore](x: Self) {
    
    inline def setMixed(value: Float): Self = StObject.set(x, "Mixed", value.asInstanceOf[js.Any])
    
    inline def setMixedUndefined: Self = StObject.set(x, "Mixed", js.undefined)
    
    inline def setNegative(value: Float): Self = StObject.set(x, "Negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeUndefined: Self = StObject.set(x, "Negative", js.undefined)
    
    inline def setNeutral(value: Float): Self = StObject.set(x, "Neutral", value.asInstanceOf[js.Any])
    
    inline def setNeutralUndefined: Self = StObject.set(x, "Neutral", js.undefined)
    
    inline def setPositive(value: Float): Self = StObject.set(x, "Positive", value.asInstanceOf[js.Any])
    
    inline def setPositiveUndefined: Self = StObject.set(x, "Positive", js.undefined)
  }
}
