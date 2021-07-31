package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansPurchaseRecommendationDetail extends StObject {
  
  /**
    * The AccountID the recommendation is generated for.
    */
  var AccountId: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The currency code AWS used to generate the recommendations and present potential savings.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentAverageHourlyOnDemandSpend: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentMaximumHourlyOnDemandSpend: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentMinimumHourlyOnDemandSpend: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated utilization of the recommended Savings Plans.
    */
  var EstimatedAverageUtilization: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated monthly savings amount, based on the recommended Savings Plans.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plans, over the length of the lookback period.
    */
  var EstimatedOnDemandCost: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected time period and the Savings Plans you own. 
    */
  var EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated return on investment based on the recommended Savings Plans purchased. This is calculated as estimatedSavingsAmount/ estimatedSPCost*100.
    */
  var EstimatedROI: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The cost of the recommended Savings Plans over the length of the lookback period.
    */
  var EstimatedSPCost: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated savings amount based on the recommended Savings Plans over the length of the lookback period.
    */
  var EstimatedSavingsAmount: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated savings percentage relative to the total cost of applicable On-Demand usage over the lookback period.
    */
  var EstimatedSavingsPercentage: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The recommended hourly commitment level for the Savings Plans type, and configuration based on the usage during the lookback period.
    */
  var HourlyCommitmentToPurchase: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Details for your recommended Savings Plans.
    */
  var SavingsPlansDetails: js.UndefOr[typings.awsSdk.costexplorerMod.SavingsPlansDetails] = js.undefined
  
  /**
    * The upfront cost of the recommended Savings Plans, based on the selected payment option.
    */
  var UpfrontCost: js.UndefOr[GenericString] = js.undefined
}
object SavingsPlansPurchaseRecommendationDetail {
  
  @scala.inline
  def apply(): SavingsPlansPurchaseRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationDetail]
  }
  
  @scala.inline
  implicit class SavingsPlansPurchaseRecommendationDetailMutableBuilder[Self <: SavingsPlansPurchaseRecommendationDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: GenericString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setCurrentAverageHourlyOnDemandSpend(value: GenericString): Self = StObject.set(x, "CurrentAverageHourlyOnDemandSpend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentAverageHourlyOnDemandSpendUndefined: Self = StObject.set(x, "CurrentAverageHourlyOnDemandSpend", js.undefined)
    
    @scala.inline
    def setCurrentMaximumHourlyOnDemandSpend(value: GenericString): Self = StObject.set(x, "CurrentMaximumHourlyOnDemandSpend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMaximumHourlyOnDemandSpendUndefined: Self = StObject.set(x, "CurrentMaximumHourlyOnDemandSpend", js.undefined)
    
    @scala.inline
    def setCurrentMinimumHourlyOnDemandSpend(value: GenericString): Self = StObject.set(x, "CurrentMinimumHourlyOnDemandSpend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMinimumHourlyOnDemandSpendUndefined: Self = StObject.set(x, "CurrentMinimumHourlyOnDemandSpend", js.undefined)
    
    @scala.inline
    def setEstimatedAverageUtilization(value: GenericString): Self = StObject.set(x, "EstimatedAverageUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedAverageUtilizationUndefined: Self = StObject.set(x, "EstimatedAverageUtilization", js.undefined)
    
    @scala.inline
    def setEstimatedMonthlySavingsAmount(value: GenericString): Self = StObject.set(x, "EstimatedMonthlySavingsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedMonthlySavingsAmountUndefined: Self = StObject.set(x, "EstimatedMonthlySavingsAmount", js.undefined)
    
    @scala.inline
    def setEstimatedOnDemandCost(value: GenericString): Self = StObject.set(x, "EstimatedOnDemandCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedOnDemandCostUndefined: Self = StObject.set(x, "EstimatedOnDemandCost", js.undefined)
    
    @scala.inline
    def setEstimatedOnDemandCostWithCurrentCommitment(value: GenericString): Self = StObject.set(x, "EstimatedOnDemandCostWithCurrentCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedOnDemandCostWithCurrentCommitmentUndefined: Self = StObject.set(x, "EstimatedOnDemandCostWithCurrentCommitment", js.undefined)
    
    @scala.inline
    def setEstimatedROI(value: GenericString): Self = StObject.set(x, "EstimatedROI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedROIUndefined: Self = StObject.set(x, "EstimatedROI", js.undefined)
    
    @scala.inline
    def setEstimatedSPCost(value: GenericString): Self = StObject.set(x, "EstimatedSPCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedSPCostUndefined: Self = StObject.set(x, "EstimatedSPCost", js.undefined)
    
    @scala.inline
    def setEstimatedSavingsAmount(value: GenericString): Self = StObject.set(x, "EstimatedSavingsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedSavingsAmountUndefined: Self = StObject.set(x, "EstimatedSavingsAmount", js.undefined)
    
    @scala.inline
    def setEstimatedSavingsPercentage(value: GenericString): Self = StObject.set(x, "EstimatedSavingsPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedSavingsPercentageUndefined: Self = StObject.set(x, "EstimatedSavingsPercentage", js.undefined)
    
    @scala.inline
    def setHourlyCommitmentToPurchase(value: GenericString): Self = StObject.set(x, "HourlyCommitmentToPurchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyCommitmentToPurchaseUndefined: Self = StObject.set(x, "HourlyCommitmentToPurchase", js.undefined)
    
    @scala.inline
    def setSavingsPlansDetails(value: SavingsPlansDetails): Self = StObject.set(x, "SavingsPlansDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlansDetailsUndefined: Self = StObject.set(x, "SavingsPlansDetails", js.undefined)
    
    @scala.inline
    def setUpfrontCost(value: GenericString): Self = StObject.set(x, "UpfrontCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpfrontCostUndefined: Self = StObject.set(x, "UpfrontCost", js.undefined)
  }
}
