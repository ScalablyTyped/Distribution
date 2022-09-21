package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendedIntentSummary extends StObject {
  
  /**
    * The unique identifier of a recommended intent associated with the bot recommendation.
    */
  var intentId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of a recommended intent associated with the bot recommendation.
    */
  var intentName: js.UndefOr[Name] = js.undefined
  
  /**
    * The count of sample utterances of a recommended intent that is associated with a bot recommendation.
    */
  var sampleUtterancesCount: js.UndefOr[SampleUtterancesCount] = js.undefined
}
object RecommendedIntentSummary {
  
  inline def apply(): RecommendedIntentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendedIntentSummary]
  }
  
  extension [Self <: RecommendedIntentSummary](x: Self) {
    
    inline def setIntentId(value: Id): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setIntentIdUndefined: Self = StObject.set(x, "intentId", js.undefined)
    
    inline def setIntentName(value: Name): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    inline def setIntentNameUndefined: Self = StObject.set(x, "intentName", js.undefined)
    
    inline def setSampleUtterancesCount(value: SampleUtterancesCount): Self = StObject.set(x, "sampleUtterancesCount", value.asInstanceOf[js.Any])
    
    inline def setSampleUtterancesCountUndefined: Self = StObject.set(x, "sampleUtterancesCount", js.undefined)
  }
}
