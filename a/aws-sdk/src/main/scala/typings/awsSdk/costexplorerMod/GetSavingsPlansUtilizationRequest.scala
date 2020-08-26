package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansUtilizationRequest extends js.Object {
  /**
    * Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data with the following dimensions:    LINKED_ACCOUNT     SAVINGS_PLAN_ARN     SAVINGS_PLANS_TYPE     REGION     PAYMENT_OPTION     INSTANCE_TYPE_FAMILY     GetSavingsPlansUtilization uses the same Expression object as the other operations, but only AND is supported among each dimension.
    */
  var Filter: js.UndefOr[Expression] = js.native
  /**
    * The granularity of the Amazon Web Services utillization data for your Savings Plans. The GetSavingsPlansUtilization operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: js.UndefOr[typings.awsSdk.costexplorerMod.Granularity] = js.native
  /**
    * The time period that you want the usage and costs for. The Start date must be within 13 months. The End date must be after the Start date, and before the current date. Future dates can't be used as an End date.
    */
  var TimePeriod: DateInterval = js.native
}

object GetSavingsPlansUtilizationRequest {
  @scala.inline
  def apply(TimePeriod: DateInterval): GetSavingsPlansUtilizationRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationRequest]
  }
  @scala.inline
  implicit class GetSavingsPlansUtilizationRequestOps[Self <: GetSavingsPlansUtilizationRequest] (val x: Self) extends AnyVal {
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
    def setGranularity(value: Granularity): Self = this.set("Granularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranularity: Self = this.set("Granularity", js.undefined)
  }
  
}

