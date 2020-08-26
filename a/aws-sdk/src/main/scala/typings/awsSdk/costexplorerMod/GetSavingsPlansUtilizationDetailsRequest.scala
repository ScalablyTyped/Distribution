package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansUtilizationDetailsRequest extends js.Object {
  /**
    * Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data with the following dimensions:    LINKED_ACCOUNT     SAVINGS_PLAN_ARN     REGION     PAYMENT_OPTION     INSTANCE_TYPE_FAMILY     GetSavingsPlansUtilizationDetails uses the same Expression object as the other operations, but only AND is supported among each dimension.
    */
  var Filter: js.UndefOr[Expression] = js.native
  /**
    * The number of items to be returned in a response. The default is 20, with a minimum value of 1.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.costexplorerMod.MaxResults] = js.native
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
  /**
    * The time period that you want the usage and costs for. The Start date must be within 13 months. The End date must be after the Start date, and before the current date. Future dates can't be used as an End date.
    */
  var TimePeriod: DateInterval = js.native
}

object GetSavingsPlansUtilizationDetailsRequest {
  @scala.inline
  def apply(TimePeriod: DateInterval): GetSavingsPlansUtilizationDetailsRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationDetailsRequest]
  }
  @scala.inline
  implicit class GetSavingsPlansUtilizationDetailsRequestOps[Self <: GetSavingsPlansUtilizationDetailsRequest] (val x: Self) extends AnyVal {
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
    def setTimePeriod(value: DateInterval): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: Expression): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextPageToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

