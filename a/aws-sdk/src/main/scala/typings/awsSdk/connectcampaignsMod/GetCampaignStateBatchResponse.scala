package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignStateBatchResponse extends StObject {
  
  var failedRequests: js.UndefOr[FailedCampaignStateResponseList] = js.undefined
  
  var successfulRequests: js.UndefOr[SuccessfulCampaignStateResponseList] = js.undefined
}
object GetCampaignStateBatchResponse {
  
  inline def apply(): GetCampaignStateBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCampaignStateBatchResponse]
  }
  
  extension [Self <: GetCampaignStateBatchResponse](x: Self) {
    
    inline def setFailedRequests(value: FailedCampaignStateResponseList): Self = StObject.set(x, "failedRequests", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestsUndefined: Self = StObject.set(x, "failedRequests", js.undefined)
    
    inline def setFailedRequestsVarargs(value: FailedCampaignStateResponse*): Self = StObject.set(x, "failedRequests", js.Array(value*))
    
    inline def setSuccessfulRequests(value: SuccessfulCampaignStateResponseList): Self = StObject.set(x, "successfulRequests", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulRequestsUndefined: Self = StObject.set(x, "successfulRequests", js.undefined)
    
    inline def setSuccessfulRequestsVarargs(value: SuccessfulCampaignStateResponse*): Self = StObject.set(x, "successfulRequests", js.Array(value*))
  }
}
