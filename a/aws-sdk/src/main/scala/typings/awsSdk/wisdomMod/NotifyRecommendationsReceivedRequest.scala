package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyRecommendationsReceivedRequest extends StObject {
  
  /**
    * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var assistantId: UuidOrArn
  
  /**
    * The identifiers of the recommendations.
    */
  var recommendationIds: RecommendationIdList
  
  /**
    * The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var sessionId: UuidOrArn
}
object NotifyRecommendationsReceivedRequest {
  
  inline def apply(assistantId: UuidOrArn, recommendationIds: RecommendationIdList, sessionId: UuidOrArn): NotifyRecommendationsReceivedRequest = {
    val __obj = js.Dynamic.literal(assistantId = assistantId.asInstanceOf[js.Any], recommendationIds = recommendationIds.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyRecommendationsReceivedRequest]
  }
  
  extension [Self <: NotifyRecommendationsReceivedRequest](x: Self) {
    
    inline def setAssistantId(value: UuidOrArn): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIds(value: RecommendationIdList): Self = StObject.set(x, "recommendationIds", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdsVarargs(value: String*): Self = StObject.set(x, "recommendationIds", js.Array(value*))
    
    inline def setSessionId(value: UuidOrArn): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
