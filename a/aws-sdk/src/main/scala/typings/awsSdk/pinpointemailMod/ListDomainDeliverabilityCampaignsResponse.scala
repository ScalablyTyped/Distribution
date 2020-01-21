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
  def apply(DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList, NextToken: NextToken = null): ListDomainDeliverabilityCampaignsResponse = {
    val __obj = js.Dynamic.literal(DomainDeliverabilityCampaigns = DomainDeliverabilityCampaigns.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainDeliverabilityCampaignsResponse]
  }
}

