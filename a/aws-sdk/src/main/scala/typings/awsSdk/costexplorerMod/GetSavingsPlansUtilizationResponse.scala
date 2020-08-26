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
  def apply(Total: SavingsPlansUtilizationAggregates): GetSavingsPlansUtilizationResponse = {
    val __obj = js.Dynamic.literal(Total = Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationResponse]
  }
  @scala.inline
  implicit class GetSavingsPlansUtilizationResponseOps[Self <: GetSavingsPlansUtilizationResponse] (val x: Self) extends AnyVal {
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
    def setTotal(value: SavingsPlansUtilizationAggregates): Self = this.set("Total", value.asInstanceOf[js.Any])
    @scala.inline
    def setSavingsPlansUtilizationsByTimeVarargs(value: SavingsPlansUtilizationByTime*): Self = this.set("SavingsPlansUtilizationsByTime", js.Array(value :_*))
    @scala.inline
    def setSavingsPlansUtilizationsByTime(value: SavingsPlansUtilizationsByTime): Self = this.set("SavingsPlansUtilizationsByTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavingsPlansUtilizationsByTime: Self = this.set("SavingsPlansUtilizationsByTime", js.undefined)
  }
  
}

