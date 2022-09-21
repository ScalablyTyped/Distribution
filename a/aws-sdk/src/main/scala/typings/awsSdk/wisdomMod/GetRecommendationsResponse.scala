package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommendationsResponse extends StObject {
  
  /**
    * The recommendations.
    */
  var recommendations: RecommendationList
  
  /**
    * The triggers corresponding to recommendations.
    */
  var triggers: js.UndefOr[RecommendationTriggerList] = js.undefined
}
object GetRecommendationsResponse {
  
  inline def apply(recommendations: RecommendationList): GetRecommendationsResponse = {
    val __obj = js.Dynamic.literal(recommendations = recommendations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsResponse]
  }
  
  extension [Self <: GetRecommendationsResponse](x: Self) {
    
    inline def setRecommendations(value: RecommendationList): Self = StObject.set(x, "recommendations", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsVarargs(value: RecommendationData*): Self = StObject.set(x, "recommendations", js.Array(value*))
    
    inline def setTriggers(value: RecommendationTriggerList): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    inline def setTriggersVarargs(value: RecommendationTrigger*): Self = StObject.set(x, "triggers", js.Array(value*))
  }
}
