package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainDeliverabilityCampaignResponse extends js.Object {
  /**
    * An object that contains the deliverability data for the campaign.
    */
  var DomainDeliverabilityCampaign: typings.awsSdk.pinpointemailMod.DomainDeliverabilityCampaign = js.native
}

object GetDomainDeliverabilityCampaignResponse {
  @scala.inline
  def apply(DomainDeliverabilityCampaign: DomainDeliverabilityCampaign): GetDomainDeliverabilityCampaignResponse = {
    val __obj = js.Dynamic.literal(DomainDeliverabilityCampaign = DomainDeliverabilityCampaign.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDomainDeliverabilityCampaignResponse]
  }
}

