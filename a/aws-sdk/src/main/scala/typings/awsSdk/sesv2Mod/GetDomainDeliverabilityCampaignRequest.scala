package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainDeliverabilityCampaignRequest extends js.Object {
  
  /**
    * The unique identifier for the campaign. The Deliverability dashboard automatically generates and assigns this identifier to a campaign.
    */
  var CampaignId: typings.awsSdk.sesv2Mod.CampaignId = js.native
}
object GetDomainDeliverabilityCampaignRequest {
  
  @scala.inline
  def apply(CampaignId: CampaignId): GetDomainDeliverabilityCampaignRequest = {
    val __obj = js.Dynamic.literal(CampaignId = CampaignId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainDeliverabilityCampaignRequest]
  }
  
  @scala.inline
  implicit class GetDomainDeliverabilityCampaignRequestOps[Self <: GetDomainDeliverabilityCampaignRequest] (val x: Self) extends AnyVal {
    
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
    def setCampaignId(value: CampaignId): Self = this.set("CampaignId", value.asInstanceOf[js.Any])
  }
}
