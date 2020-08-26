package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainDeliverabilityCampaignResponse extends js.Object {
  /**
    * An object that contains the deliverability data for the campaign.
    */
  var DomainDeliverabilityCampaign: typings.awsSdk.sesv2Mod.DomainDeliverabilityCampaign = js.native
}

object GetDomainDeliverabilityCampaignResponse {
  @scala.inline
  def apply(DomainDeliverabilityCampaign: DomainDeliverabilityCampaign): GetDomainDeliverabilityCampaignResponse = {
    val __obj = js.Dynamic.literal(DomainDeliverabilityCampaign = DomainDeliverabilityCampaign.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainDeliverabilityCampaignResponse]
  }
  @scala.inline
  implicit class GetDomainDeliverabilityCampaignResponseOps[Self <: GetDomainDeliverabilityCampaignResponse] (val x: Self) extends AnyVal {
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
    def setDomainDeliverabilityCampaign(value: DomainDeliverabilityCampaign): Self = this.set("DomainDeliverabilityCampaign", value.asInstanceOf[js.Any])
  }
  
}

