package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateRecommendationDetail extends js.Object {
  /**
    *  The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    *  Estimated savings resulting from modification, on a monthly basis.
    */
  var EstimatedMonthlySavings: js.UndefOr[GenericString] = js.native
}

object TerminateRecommendationDetail {
  @scala.inline
  def apply(): TerminateRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateRecommendationDetail]
  }
  @scala.inline
  implicit class TerminateRecommendationDetailOps[Self <: TerminateRecommendationDetail] (val x: Self) extends AnyVal {
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
    def setCurrencyCode(value: GenericString): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    @scala.inline
    def setEstimatedMonthlySavings(value: GenericString): Self = this.set("EstimatedMonthlySavings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedMonthlySavings: Self = this.set("EstimatedMonthlySavings", js.undefined)
  }
  
}

