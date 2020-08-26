package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightsizingRecommendationSummary extends js.Object {
  /**
    *  Estimated total savings resulting from modifications, on a monthly basis.
    */
  var EstimatedTotalMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    *  The currency code that Amazon Web Services used to calculate the savings.
    */
  var SavingsCurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    *  Savings percentage based on the recommended modifications, relative to the total On-Demand costs associated with these instances.
    */
  var SavingsPercentage: js.UndefOr[GenericString] = js.native
  /**
    *  Total number of instance recommendations.
    */
  var TotalRecommendationCount: js.UndefOr[GenericString] = js.native
}

object RightsizingRecommendationSummary {
  @scala.inline
  def apply(): RightsizingRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsizingRecommendationSummary]
  }
  @scala.inline
  implicit class RightsizingRecommendationSummaryOps[Self <: RightsizingRecommendationSummary] (val x: Self) extends AnyVal {
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
    def setEstimatedTotalMonthlySavingsAmount(value: GenericString): Self = this.set("EstimatedTotalMonthlySavingsAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedTotalMonthlySavingsAmount: Self = this.set("EstimatedTotalMonthlySavingsAmount", js.undefined)
    @scala.inline
    def setSavingsCurrencyCode(value: GenericString): Self = this.set("SavingsCurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavingsCurrencyCode: Self = this.set("SavingsCurrencyCode", js.undefined)
    @scala.inline
    def setSavingsPercentage(value: GenericString): Self = this.set("SavingsPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavingsPercentage: Self = this.set("SavingsPercentage", js.undefined)
    @scala.inline
    def setTotalRecommendationCount(value: GenericString): Self = this.set("TotalRecommendationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRecommendationCount: Self = this.set("TotalRecommendationCount", js.undefined)
  }
  
}

