package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCampaignResponse extends StObject {
  
  var CampaignResponse: typings.awsSdk.pinpointMod.CampaignResponse
}
object UpdateCampaignResponse {
  
  @scala.inline
  def apply(CampaignResponse: CampaignResponse): UpdateCampaignResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignResponse]
  }
  
  @scala.inline
  implicit class UpdateCampaignResponseMutableBuilder[Self <: UpdateCampaignResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignResponse(value: CampaignResponse): Self = StObject.set(x, "CampaignResponse", value.asInstanceOf[js.Any])
  }
}
