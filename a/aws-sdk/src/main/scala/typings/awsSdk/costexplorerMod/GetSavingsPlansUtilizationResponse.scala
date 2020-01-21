package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansUtilizationResponse extends js.Object {
  /**
    * The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
    */
  var SavingsPlansUtilizationsByTime: js.UndefOr[typings.awsSdk.costexplorerMod.SavingsPlansUtilizationsByTime] = js.native
  /**
    * The total amount of cost/commitment that you used your Savings Plans, regardless of date ranges.
    */
  var Total: SavingsPlansUtilizationAggregates = js.native
}

object GetSavingsPlansUtilizationResponse {
  @scala.inline
  def apply(
    Total: SavingsPlansUtilizationAggregates,
    SavingsPlansUtilizationsByTime: SavingsPlansUtilizationsByTime = null
  ): GetSavingsPlansUtilizationResponse = {
    val __obj = js.Dynamic.literal(Total = Total.asInstanceOf[js.Any])
    if (SavingsPlansUtilizationsByTime != null) __obj.updateDynamic("SavingsPlansUtilizationsByTime")(SavingsPlansUtilizationsByTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationResponse]
  }
}

