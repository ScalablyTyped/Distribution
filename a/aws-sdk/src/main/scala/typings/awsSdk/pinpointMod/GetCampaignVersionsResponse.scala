package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCampaignVersionsResponse extends StObject {
  
  var CampaignsResponse: typings.awsSdk.pinpointMod.CampaignsResponse = js.native
}
object GetCampaignVersionsResponse {
  
  @scala.inline
  def apply(CampaignsResponse: CampaignsResponse): GetCampaignVersionsResponse = {
    val __obj = js.Dynamic.literal(CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignVersionsResponse]
  }
  
  @scala.inline
  implicit class GetCampaignVersionsResponseMutableBuilder[Self <: GetCampaignVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignsResponse(value: CampaignsResponse): Self = StObject.set(x, "CampaignsResponse", value.asInstanceOf[js.Any])
  }
}
