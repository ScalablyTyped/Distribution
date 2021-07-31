package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignVersionResponse extends StObject {
  
  var CampaignResponse: typings.awsSdk.pinpointMod.CampaignResponse
}
object GetCampaignVersionResponse {
  
  @scala.inline
  def apply(CampaignResponse: CampaignResponse): GetCampaignVersionResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignVersionResponse]
  }
  
  @scala.inline
  implicit class GetCampaignVersionResponseMutableBuilder[Self <: GetCampaignVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignResponse(value: CampaignResponse): Self = StObject.set(x, "CampaignResponse", value.asInstanceOf[js.Any])
  }
}
