package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansUtilizationDetailsResponse extends js.Object {
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
  /**
    * Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
    */
  var SavingsPlansUtilizationDetails: typings.awsSdk.costexplorerMod.SavingsPlansUtilizationDetails = js.native
  var TimePeriod: DateInterval = js.native
  /**
    * The total Savings Plans utilization, regardless of time period.
    */
  var Total: js.UndefOr[SavingsPlansUtilizationAggregates] = js.native
}

object GetSavingsPlansUtilizationDetailsResponse {
  @scala.inline
  def apply(SavingsPlansUtilizationDetails: SavingsPlansUtilizationDetails, TimePeriod: DateInterval): GetSavingsPlansUtilizationDetailsResponse = {
    val __obj = js.Dynamic.literal(SavingsPlansUtilizationDetails = SavingsPlansUtilizationDetails.asInstanceOf[js.Any], TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationDetailsResponse]
  }
  @scala.inline
  implicit class GetSavingsPlansUtilizationDetailsResponseOps[Self <: GetSavingsPlansUtilizationDetailsResponse] (val x: Self) extends AnyVal {
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
    def setSavingsPlansUtilizationDetailsVarargs(value: SavingsPlansUtilizationDetail*): Self = this.set("SavingsPlansUtilizationDetails", js.Array(value :_*))
    @scala.inline
    def setSavingsPlansUtilizationDetails(value: SavingsPlansUtilizationDetails): Self = this.set("SavingsPlansUtilizationDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextPageToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTotal(value: SavingsPlansUtilizationAggregates): Self = this.set("Total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
  
}

