package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainDeliverabilityCampaignsResponse extends js.Object {
  /**
    * An array of responses, one for each campaign that used the domain to send email during the specified time range.
    */
  var DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList = js.native
  /**
    * A token that’s returned from a previous call to the ListDomainDeliverabilityCampaigns operation. This token indicates the position of the campaign in the list of campaigns.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointemailMod.NextToken] = js.native
}

object ListDomainDeliverabilityCampaignsResponse {
  @scala.inline
  def apply(DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList): ListDomainDeliverabilityCampaignsResponse = {
    val __obj = js.Dynamic.literal(DomainDeliverabilityCampaigns = DomainDeliverabilityCampaigns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainDeliverabilityCampaignsResponse]
  }
  @scala.inline
  implicit class ListDomainDeliverabilityCampaignsResponseOps[Self <: ListDomainDeliverabilityCampaignsResponse] (val x: Self) extends AnyVal {
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
    def setDomainDeliverabilityCampaignsVarargs(value: DomainDeliverabilityCampaign*): Self = this.set("DomainDeliverabilityCampaigns", js.Array(value :_*))
    @scala.inline
    def setDomainDeliverabilityCampaigns(value: DomainDeliverabilityCampaignList): Self = this.set("DomainDeliverabilityCampaigns", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

