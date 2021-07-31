package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansPurchaseRecommendationSummary extends StObject {
  
  /**
    * The currency code AWS used to generate the recommendations and present potential savings.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The current total on demand spend of the applicable usage types over the lookback period.
    */
  var CurrentOnDemandSpend: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The recommended Savings Plans cost on a daily (24 hourly) basis.
    */
  var DailyCommitmentToPurchase: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated monthly savings amount, based on the recommended Savings Plans purchase.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected time period and the Savings Plans you own. 
    */
  var EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated return on investment based on the recommended Savings Plans and estimated savings.
    */
  var EstimatedROI: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated total savings over the lookback period, based on the purchase of the recommended Savings Plans.
    */
  var EstimatedSavingsAmount: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated savings relative to the total cost of On-Demand usage, over the lookback period. This is calculated as estimatedSavingsAmount/ CurrentOnDemandSpend*100.
    */
  var EstimatedSavingsPercentage: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated total cost of the usage after purchasing the recommended Savings Plans. This is a sum of the cost of Savings Plans during this term, and the remaining On-Demand usage.
    */
  var EstimatedTotalCost: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The recommended hourly commitment based on the recommendation parameters.
    */
  var HourlyCommitmentToPurchase: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The aggregate number of Savings Plans recommendations that exist for your account.
    */
  var TotalRecommendationCount: js.UndefOr[GenericString] = js.undefined
}
object SavingsPlansPurchaseRecommendationSummary {
  
  @scala.inline
  def apply(): SavingsPlansPurchaseRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationSummary]
  }
  
  @scala.inline
  implicit class SavingsPlansPurchaseRecommendationSummaryMutableBuilder[Self <: SavingsPlansPurchaseRecommendationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setCurrentOnDemandSpend(value: GenericString): Self = StObject.set(x, "CurrentOnDemandSpend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentOnDemandSpendUndefined: Self = StObject.set(x, "CurrentOnDemandSpend", js.undefined)
    
    @scala.inline
    def setDailyCommitmentToPurchase(value: GenericString): Self = StObject.set(x, "DailyCommitmentToPurchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyCommitmentToPurchaseUndefined: Self = StObject.set(x, "DailyCommitmentToPurchase", js.undefined)
    
    @scala.inline
    def setEstimatedMonthlySavingsAmount(value: GenericString): Self = StObject.set(x, "EstimatedMonthlySavingsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedMonthlySavingsAmountUndefined: Self = StObject.set(x, "EstimatedMonthlySavingsAmount", js.undefined)
    
    @scala.inline
    def setEstimatedOnDemandCostWithCurrentCommitment(value: GenericString): Self = StObject.set(x, "EstimatedOnDemandCostWithCurrentCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedOnDemandCostWithCurrentCommitmentUndefined: Self = StObject.set(x, "EstimatedOnDemandCostWithCurrentCommitment", js.undefined)
    
    @scala.inline
    def setEstimatedROI(value: GenericString): Self = StObject.set(x, "EstimatedROI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedROIUndefined: Self = StObject.set(x, "EstimatedROI", js.undefined)
    
    @scala.inline
    def setEstimatedSavingsAmount(value: GenericString): Self = StObject.set(x, "EstimatedSavingsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedSavingsAmountUndefined: Self = StObject.set(x, "EstimatedSavingsAmount", js.undefined)
    
    @scala.inline
    def setEstimatedSavingsPercentage(value: GenericString): Self = StObject.set(x, "EstimatedSavingsPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedSavingsPercentageUndefined: Self = StObject.set(x, "EstimatedSavingsPercentage", js.undefined)
    
    @scala.inline
    def setEstimatedTotalCost(value: GenericString): Self = StObject.set(x, "EstimatedTotalCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedTotalCostUndefined: Self = StObject.set(x, "EstimatedTotalCost", js.undefined)
    
    @scala.inline
    def setHourlyCommitmentToPurchase(value: GenericString): Self = StObject.set(x, "HourlyCommitmentToPurchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyCommitmentToPurchaseUndefined: Self = StObject.set(x, "HourlyCommitmentToPurchase", js.undefined)
    
    @scala.inline
    def setTotalRecommendationCount(value: GenericString): Self = StObject.set(x, "TotalRecommendationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecommendationCountUndefined: Self = StObject.set(x, "TotalRecommendationCount", js.undefined)
  }
}
