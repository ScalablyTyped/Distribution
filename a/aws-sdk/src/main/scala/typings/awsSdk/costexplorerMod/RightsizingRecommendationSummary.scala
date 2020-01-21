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
    *  Savings percentage based on the recommended modifications, relative to the total On Demand costs associated with these instances.
    */
  var SavingsPercentage: js.UndefOr[GenericString] = js.native
  /**
    *  Total number of instance recommendations.
    */
  var TotalRecommendationCount: js.UndefOr[GenericString] = js.native
}

object RightsizingRecommendationSummary {
  @scala.inline
  def apply(
    EstimatedTotalMonthlySavingsAmount: GenericString = null,
    SavingsCurrencyCode: GenericString = null,
    SavingsPercentage: GenericString = null,
    TotalRecommendationCount: GenericString = null
  ): RightsizingRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    if (EstimatedTotalMonthlySavingsAmount != null) __obj.updateDynamic("EstimatedTotalMonthlySavingsAmount")(EstimatedTotalMonthlySavingsAmount.asInstanceOf[js.Any])
    if (SavingsCurrencyCode != null) __obj.updateDynamic("SavingsCurrencyCode")(SavingsCurrencyCode.asInstanceOf[js.Any])
    if (SavingsPercentage != null) __obj.updateDynamic("SavingsPercentage")(SavingsPercentage.asInstanceOf[js.Any])
    if (TotalRecommendationCount != null) __obj.updateDynamic("TotalRecommendationCount")(TotalRecommendationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightsizingRecommendationSummary]
  }
}

