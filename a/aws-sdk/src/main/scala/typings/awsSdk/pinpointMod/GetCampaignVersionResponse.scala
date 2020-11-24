package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCampaignVersionResponse extends js.Object {
  
  var CampaignResponse: typings.awsSdk.pinpointMod.CampaignResponse = js.native
}
object GetCampaignVersionResponse {
  
  @scala.inline
  def apply(CampaignResponse: CampaignResponse): GetCampaignVersionResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignVersionResponse]
  }
  
  @scala.inline
  implicit class GetCampaignVersionResponseOps[Self <: GetCampaignVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCampaignResponse(value: CampaignResponse): Self = this.set("CampaignResponse", value.asInstanceOf[js.Any])
  }
}
