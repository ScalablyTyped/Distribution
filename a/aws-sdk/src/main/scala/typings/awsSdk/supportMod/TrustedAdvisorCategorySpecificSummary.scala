package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorCategorySpecificSummary extends js.Object {
  /**
    * The summary information about cost savings for a Trusted Advisor check that is in the Cost Optimizing category.
    */
  var costOptimizing: js.UndefOr[TrustedAdvisorCostOptimizingSummary] = js.native
}

object TrustedAdvisorCategorySpecificSummary {
  @scala.inline
  def apply(): TrustedAdvisorCategorySpecificSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustedAdvisorCategorySpecificSummary]
  }
  @scala.inline
  implicit class TrustedAdvisorCategorySpecificSummaryOps[Self <: TrustedAdvisorCategorySpecificSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCostOptimizing(value: TrustedAdvisorCostOptimizingSummary): Self = this.set("costOptimizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCostOptimizing: Self = this.set("costOptimizing", js.undefined)
  }
  
}

