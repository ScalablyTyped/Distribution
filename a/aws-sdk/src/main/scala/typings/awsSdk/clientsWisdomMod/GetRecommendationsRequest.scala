package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommendationsRequest extends StObject {
  
  /**
    * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var assistantId: UuidOrArn
  
  /**
    * The maximum number of results to return per page.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var sessionId: UuidOrArn
  
  /**
    * The duration (in seconds) for which the call waits for a recommendation to be made available before returning. If a recommendation is available, the call returns sooner than WaitTimeSeconds. If no messages are available and the wait time expires, the call returns successfully with an empty list.
    */
  var waitTimeSeconds: js.UndefOr[WaitTimeSeconds] = js.undefined
}
object GetRecommendationsRequest {
  
  inline def apply(assistantId: UuidOrArn, sessionId: UuidOrArn): GetRecommendationsRequest = {
    val __obj = js.Dynamic.literal(assistantId = assistantId.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsRequest]
  }
  
  extension [Self <: GetRecommendationsRequest](x: Self) {
    
    inline def setAssistantId(value: UuidOrArn): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setSessionId(value: UuidOrArn): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setWaitTimeSeconds(value: WaitTimeSeconds): Self = StObject.set(x, "waitTimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setWaitTimeSecondsUndefined: Self = StObject.set(x, "waitTimeSeconds", js.undefined)
  }
}
