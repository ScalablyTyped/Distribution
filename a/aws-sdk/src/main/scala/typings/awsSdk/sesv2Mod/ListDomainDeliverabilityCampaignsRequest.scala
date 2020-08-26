package typings.awsSdk.sesv2Mod

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
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
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
  def apply(EndDate: Timestamp, StartDate: Timestamp, SubscribedDomain: Domain): ListDomainDeliverabilityCampaignsRequest = {
    val __obj = js.Dynamic.literal(EndDate = EndDate.asInstanceOf[js.Any], StartDate = StartDate.asInstanceOf[js.Any], SubscribedDomain = SubscribedDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainDeliverabilityCampaignsRequest]
  }
  @scala.inline
  implicit class ListDomainDeliverabilityCampaignsRequestOps[Self <: ListDomainDeliverabilityCampaignsRequest] (val x: Self) extends AnyVal {
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
    def setEndDate(value: Timestamp): Self = this.set("EndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: Timestamp): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscribedDomain(value: Domain): Self = this.set("SubscribedDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPageSize(value: MaxItems): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
  }
  
}

