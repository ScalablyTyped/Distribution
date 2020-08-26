package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansPurchaseRecommendationDetail extends js.Object {
  /**
    * The AccountID the recommendation is generated for.
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  /**
    * The currency code Amazon Web Services used to generate the recommendations and present potential savings.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    * The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentAverageHourlyOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentMaximumHourlyOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentMinimumHourlyOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The estimated utilization of the recommended Savings Plans.
    */
  var EstimatedAverageUtilization: js.UndefOr[GenericString] = js.native
  /**
    * The estimated monthly savings amount, based on the recommended Savings Plans.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plans, over the length of the lookback period.
    */
  var EstimatedOnDemandCost: js.UndefOr[GenericString] = js.native
  /**
    *  The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected time period and the Savings Plans you own. 
    */
  var EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The estimated return on investment based on the recommended Savings Plans purchased. This is calculated as estimatedSavingsAmount/ estimatedSPCost*100.
    */
  var EstimatedROI: js.UndefOr[GenericString] = js.native
  /**
    * The cost of the recommended Savings Plans over the length of the lookback period.
    */
  var EstimatedSPCost: js.UndefOr[GenericString] = js.native
  /**
    * The estimated savings amount based on the recommended Savings Plans over the length of the lookback period.
    */
  var EstimatedSavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * The estimated savings percentage relative to the total cost of applicable On-Demand usage over the lookback period.
    */
  var EstimatedSavingsPercentage: js.UndefOr[GenericString] = js.native
  /**
    * The recommended hourly commitment level for the Savings Plans type, and configuration based on the usage during the lookback period.
    */
  var HourlyCommitmentToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * Details for your recommended Savings Plans.
    */
  var SavingsPlansDetails: js.UndefOr[typings.awsSdk.costexplorerMod.SavingsPlansDetails] = js.native
  /**
    * The upfront cost of the recommended Savings Plans, based on the selected payment option.
    */
  var UpfrontCost: js.UndefOr[GenericString] = js.native
}

object SavingsPlansPurchaseRecommendationDetail {
  @scala.inline
  def apply(): SavingsPlansPurchaseRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationDetail]
  }
  @scala.inline
  implicit class SavingsPlansPurchaseRecommendationDetailOps[Self <: SavingsPlansPurchaseRecommendationDetail] (val x: Self) extends AnyVal {
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
    def setAccountId(value: GenericString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setCurrencyCode(value: GenericString): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    @scala.inline
    def setCurrentAverageHourlyOnDemandSpend(value: GenericString): Self = this.set("CurrentAverageHourlyOnDemandSpend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentAverageHourlyOnDemandSpend: Self = this.set("CurrentAverageHourlyOnDemandSpend", js.undefined)
    @scala.inline
    def setCurrentMaximumHourlyOnDemandSpend(value: GenericString): Self = this.set("CurrentMaximumHourlyOnDemandSpend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentMaximumHourlyOnDemandSpend: Self = this.set("CurrentMaximumHourlyOnDemandSpend", js.undefined)
    @scala.inline
    def setCurrentMinimumHourlyOnDemandSpend(value: GenericString): Self = this.set("CurrentMinimumHourlyOnDemandSpend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentMinimumHourlyOnDemandSpend: Self = this.set("CurrentMinimumHourlyOnDemandSpend", js.undefined)
    @scala.inline
    def setEstimatedAverageUtilization(value: GenericString): Self = this.set("EstimatedAverageUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedAverageUtilization: Self = this.set("EstimatedAverageUtilization", js.undefined)
    @scala.inline
    def setEstimatedMonthlySavingsAmount(value: GenericString): Self = this.set("EstimatedMonthlySavingsAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedMonthlySavingsAmount: Self = this.set("EstimatedMonthlySavingsAmount", js.undefined)
    @scala.inline
    def setEstimatedOnDemandCost(value: GenericString): Self = this.set("EstimatedOnDemandCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedOnDemandCost: Self = this.set("EstimatedOnDemandCost", js.undefined)
    @scala.inline
    def setEstimatedOnDemandCostWithCurrentCommitment(value: GenericString): Self = this.set("EstimatedOnDemandCostWithCurrentCommitment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedOnDemandCostWithCurrentCommitment: Self = this.set("EstimatedOnDemandCostWithCurrentCommitment", js.undefined)
    @scala.inline
    def setEstimatedROI(value: GenericString): Self = this.set("EstimatedROI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedROI: Self = this.set("EstimatedROI", js.undefined)
    @scala.inline
    def setEstimatedSPCost(value: GenericString): Self = this.set("EstimatedSPCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedSPCost: Self = this.set("EstimatedSPCost", js.undefined)
    @scala.inline
    def setEstimatedSavingsAmount(value: GenericString): Self = this.set("EstimatedSavingsAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedSavingsAmount: Self = this.set("EstimatedSavingsAmount", js.undefined)
    @scala.inline
    def setEstimatedSavingsPercentage(value: GenericString): Self = this.set("EstimatedSavingsPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedSavingsPercentage: Self = this.set("EstimatedSavingsPercentage", js.undefined)
    @scala.inline
    def setHourlyCommitmentToPurchase(value: GenericString): Self = this.set("HourlyCommitmentToPurchase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourlyCommitmentToPurchase: Self = this.set("HourlyCommitmentToPurchase", js.undefined)
    @scala.inline
    def setSavingsPlansDetails(value: SavingsPlansDetails): Self = this.set("SavingsPlansDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavingsPlansDetails: Self = this.set("SavingsPlansDetails", js.undefined)
    @scala.inline
    def setUpfrontCost(value: GenericString): Self = this.set("UpfrontCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpfrontCost: Self = this.set("UpfrontCost", js.undefined)
  }
  
}

