package typings.awsSdk.lexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentimentScore extends StObject {
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the MIXED sentiment.
    */
  var mixed: js.UndefOr[Double] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEGATIVE sentiment.
    */
  var negative: js.UndefOr[Double] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEUTRAL sentiment.
    */
  var neutral: js.UndefOr[Double] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the POSITIVE sentiment.
    */
  var positive: js.UndefOr[Double] = js.undefined
}
object SentimentScore {
  
  inline def apply(): SentimentScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentScore]
  }
  
  extension [Self <: SentimentScore](x: Self) {
    
    inline def setMixed(value: Double): Self = StObject.set(x, "mixed", value.asInstanceOf[js.Any])
    
    inline def setMixedUndefined: Self = StObject.set(x, "mixed", js.undefined)
    
    inline def setNegative(value: Double): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setNeutral(value: Double): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setNeutralUndefined: Self = StObject.set(x, "neutral", js.undefined)
    
    inline def setPositive(value: Double): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
  }
}
