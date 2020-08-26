package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansPurchaseRecommendationSummary extends js.Object {
  /**
    * The currency code Amazon Web Services used to generate the recommendations and present potential savings.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    * The current total on demand spend of the applicable usage types over the lookback period.
    */
  var CurrentOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The recommended Savings Plans cost on a daily (24 hourly) basis.
    */
  var DailyCommitmentToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * The estimated monthly savings amount, based on the recommended Savings Plans purchase.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    *  The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected time period and the Savings Plans you own. 
    */
  var EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The estimated return on investment based on the recommended Savings Plans and estimated savings.
    */
  var EstimatedROI: js.UndefOr[GenericString] = js.native
  /**
    * The estimated total savings over the lookback period, based on the purchase of the recommended Savings Plans.
    */
  var EstimatedSavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * The estimated savings relative to the total cost of On-Demand usage, over the lookback period. This is calculated as estimatedSavingsAmount/ CurrentOnDemandSpend*100.
    */
  var EstimatedSavingsPercentage: js.UndefOr[GenericString] = js.native
  /**
    * The estimated total cost of the usage after purchasing the recommended Savings Plans. This is a sum of the cost of Savings Plans during this term, and the remaining On-Demand usage.
    */
  var EstimatedTotalCost: js.UndefOr[GenericString] = js.native
  /**
    * The recommended hourly commitment based on the recommendation parameters.
    */
  var HourlyCommitmentToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * The aggregate number of Savings Plans recommendations that exist for your account.
    */
  var TotalRecommendationCount: js.UndefOr[GenericString] = js.native
}

object SavingsPlansPurchaseRecommendationSummary {
  @scala.inline
  def apply(): SavingsPlansPurchaseRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationSummary]
  }
  @scala.inline
  implicit class SavingsPlansPurchaseRecommendationSummaryOps[Self <: SavingsPlansPurchaseRecommendationSummary] (val x: Self) extends AnyVal {
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
    def setCurrentOnDemandSpend(value: GenericString): Self = this.set("CurrentOnDemandSpend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentOnDemandSpend: Self = this.set("CurrentOnDemandSpend", js.undefined)
    @scala.inline
    def setDailyCommitmentToPurchase(value: GenericString): Self = this.set("DailyCommitmentToPurchase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDailyCommitmentToPurchase: Self = this.set("DailyCommitmentToPurchase", js.undefined)
    @scala.inline
    def setEstimatedMonthlySavingsAmount(value: GenericString): Self = this.set("EstimatedMonthlySavingsAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedMonthlySavingsAmount: Self = this.set("EstimatedMonthlySavingsAmount", js.undefined)
    @scala.inline
    def setEstimatedOnDemandCostWithCurrentCommitment(value: GenericString): Self = this.set("EstimatedOnDemandCostWithCurrentCommitment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedOnDemandCostWithCurrentCommitment: Self = this.set("EstimatedOnDemandCostWithCurrentCommitment", js.undefined)
    @scala.inline
    def setEstimatedROI(value: GenericString): Self = this.set("EstimatedROI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedROI: Self = this.set("EstimatedROI", js.undefined)
    @scala.inline
    def setEstimatedSavingsAmount(value: GenericString): Self = this.set("EstimatedSavingsAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedSavingsAmount: Self = this.set("EstimatedSavingsAmount", js.undefined)
    @scala.inline
    def setEstimatedSavingsPercentage(value: GenericString): Self = this.set("EstimatedSavingsPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedSavingsPercentage: Self = this.set("EstimatedSavingsPercentage", js.undefined)
    @scala.inline
    def setEstimatedTotalCost(value: GenericString): Self = this.set("EstimatedTotalCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedTotalCost: Self = this.set("EstimatedTotalCost", js.undefined)
    @scala.inline
    def setHourlyCommitmentToPurchase(value: GenericString): Self = this.set("HourlyCommitmentToPurchase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourlyCommitmentToPurchase: Self = this.set("HourlyCommitmentToPurchase", js.undefined)
    @scala.inline
    def setTotalRecommendationCount(value: GenericString): Self = this.set("TotalRecommendationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRecommendationCount: Self = this.set("TotalRecommendationCount", js.undefined)
  }
  
}

