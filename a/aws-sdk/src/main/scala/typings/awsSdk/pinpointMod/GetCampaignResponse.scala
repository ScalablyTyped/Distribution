package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCampaignResponse extends StObject {
  
  var CampaignResponse: typings.awsSdk.pinpointMod.CampaignResponse = js.native
}
object GetCampaignResponse {
  
  @scala.inline
  def apply(CampaignResponse: CampaignResponse): GetCampaignResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignResponse]
  }
  
  @scala.inline
  implicit class GetCampaignResponseMutableBuilder[Self <: GetCampaignResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignResponse(value: CampaignResponse): Self = StObject.set(x, "CampaignResponse", value.asInstanceOf[js.Any])
  }
}
