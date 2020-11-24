package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCampaignDateRangeKpiResponse extends js.Object {
  
  var CampaignDateRangeKpiResponse: typings.awsSdk.pinpointMod.CampaignDateRangeKpiResponse = js.native
}
object GetCampaignDateRangeKpiResponse {
  
  @scala.inline
  def apply(CampaignDateRangeKpiResponse: CampaignDateRangeKpiResponse): GetCampaignDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(CampaignDateRangeKpiResponse = CampaignDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignDateRangeKpiResponse]
  }
  
  @scala.inline
  implicit class GetCampaignDateRangeKpiResponseOps[Self <: GetCampaignDateRangeKpiResponse] (val x: Self) extends AnyVal {
    
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
    def setCampaignDateRangeKpiResponse(value: CampaignDateRangeKpiResponse): Self = this.set("CampaignDateRangeKpiResponse", value.asInstanceOf[js.Any])
  }
}
