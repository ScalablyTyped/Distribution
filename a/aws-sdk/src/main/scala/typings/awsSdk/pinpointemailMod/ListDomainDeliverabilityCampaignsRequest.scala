package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainDeliverabilityCampaignsRequest extends js.Object {
  /**
    * The last day, in Unix time format, that you want to obtain deliverability data for. This value has to be less than or equal to 30 days after the value of the StartDate parameter.
    */
  var EndDate: Timestamp = js.native
  /**
    * A token that’s returned from a previous call to the ListDomainDeliverabilityCampaigns operation. This token indicates the position of a campaign in the list of campaigns.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointemailMod.NextToken] = js.native
  /**
    * The maximum number of results to include in response to a single call to the ListDomainDeliverabilityCampaigns operation. If the number of results is larger than the number that you specify in this parameter, the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
  /**
    * The first day, in Unix time format, that you want to obtain deliverability data for.
    */
  var StartDate: Timestamp = js.native
  /**
    * The domain to obtain deliverability data for.
    */
  var SubscribedDomain: Domain = js.native
}

object ListDomainDeliverabilityCampaignsRequest {
  @scala.inline
  def apply(
    EndDate: Timestamp,
    StartDate: Timestamp,
    SubscribedDomain: Domain,
    NextToken: NextToken = null,
    PageSize: Int | Double = null
  ): ListDomainDeliverabilityCampaignsRequest = {
    val __obj = js.Dynamic.literal(EndDate = EndDate.asInstanceOf[js.Any], StartDate = StartDate.asInstanceOf[js.Any], SubscribedDomain = SubscribedDomain.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainDeliverabilityCampaignsRequest]
  }
}

