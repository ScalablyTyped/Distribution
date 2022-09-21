package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignStateBatchRequest extends StObject {
  
  var campaignIds: GetCampaignStateBatchRequestCampaignIdsList
}
object GetCampaignStateBatchRequest {
  
  inline def apply(campaignIds: GetCampaignStateBatchRequestCampaignIdsList): GetCampaignStateBatchRequest = {
    val __obj = js.Dynamic.literal(campaignIds = campaignIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignStateBatchRequest]
  }
  
  extension [Self <: GetCampaignStateBatchRequest](x: Self) {
    
    inline def setCampaignIds(value: GetCampaignStateBatchRequestCampaignIdsList): Self = StObject.set(x, "campaignIds", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdsVarargs(value: CampaignId*): Self = StObject.set(x, "campaignIds", js.Array(value*))
  }
}
