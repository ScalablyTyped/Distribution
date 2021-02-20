package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCampaignRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  /**
    * The unique identifier for the campaign.
    */
  var CampaignId: string = js.native
  
  var WriteCampaignRequest: typings.awsSdk.pinpointMod.WriteCampaignRequest = js.native
}
object UpdateCampaignRequest {
  
  @scala.inline
  def apply(ApplicationId: string, CampaignId: string, WriteCampaignRequest: WriteCampaignRequest): UpdateCampaignRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignRequest]
  }
  
  @scala.inline
  implicit class UpdateCampaignRequestMutableBuilder[Self <: UpdateCampaignRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignId(value: string): Self = StObject.set(x, "CampaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteCampaignRequest(value: WriteCampaignRequest): Self = StObject.set(x, "WriteCampaignRequest", value.asInstanceOf[js.Any])
  }
}
