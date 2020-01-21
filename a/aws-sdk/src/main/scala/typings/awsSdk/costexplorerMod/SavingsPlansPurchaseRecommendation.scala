package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansPurchaseRecommendation extends js.Object {
  /**
    * The lookback period in days, used to generate the recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.native
  /**
    * The payment option used to generate the recommendation.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.costexplorerMod.PaymentOption] = js.native
  /**
    * Details for the Savings Plans we recommend you to purchase to cover existing, Savings Plans eligible workloads.
    */
  var SavingsPlansPurchaseRecommendationDetails: js.UndefOr[SavingsPlansPurchaseRecommendationDetailList] = js.native
  /**
    * Summary metrics for your Savings Plans Recommendations. 
    */
  var SavingsPlansPurchaseRecommendationSummary: js.UndefOr[typings.awsSdk.costexplorerMod.SavingsPlansPurchaseRecommendationSummary] = js.native
  /**
    * The requested Savings Plans recommendation type.
    */
  var SavingsPlansType: js.UndefOr[SupportedSavingsPlansType] = js.native
  /**
    * The Savings Plans recommendation term in years, used to generate the recommendation.
    */
  var TermInYears: js.UndefOr[typings.awsSdk.costexplorerMod.TermInYears] = js.native
}

object SavingsPlansPurchaseRecommendation {
  @scala.inline
  def apply(
    LookbackPeriodInDays: LookbackPeriodInDays = null,
    PaymentOption: PaymentOption = null,
    SavingsPlansPurchaseRecommendationDetails: SavingsPlansPurchaseRecommendationDetailList = null,
    SavingsPlansPurchaseRecommendationSummary: SavingsPlansPurchaseRecommendationSummary = null,
    SavingsPlansType: SupportedSavingsPlansType = null,
    TermInYears: TermInYears = null
  ): SavingsPlansPurchaseRecommendation = {
    val __obj = js.Dynamic.literal()
    if (LookbackPeriodInDays != null) __obj.updateDynamic("LookbackPeriodInDays")(LookbackPeriodInDays.asInstanceOf[js.Any])
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (SavingsPlansPurchaseRecommendationDetails != null) __obj.updateDynamic("SavingsPlansPurchaseRecommendationDetails")(SavingsPlansPurchaseRecommendationDetails.asInstanceOf[js.Any])
    if (SavingsPlansPurchaseRecommendationSummary != null) __obj.updateDynamic("SavingsPlansPurchaseRecommendationSummary")(SavingsPlansPurchaseRecommendationSummary.asInstanceOf[js.Any])
    if (SavingsPlansType != null) __obj.updateDynamic("SavingsPlansType")(SavingsPlansType.asInstanceOf[js.Any])
    if (TermInYears != null) __obj.updateDynamic("TermInYears")(TermInYears.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendation]
  }
}

