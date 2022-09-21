package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansPurchaseRecommendation extends StObject {
  
  /**
    * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations that include the management account and member accounts if the value is set to PAYER. If the value is LINKED, recommendations are calculated for individual member accounts only.
    */
  var AccountScope: js.UndefOr[typings.awsSdk.costexplorerMod.AccountScope] = js.undefined
  
  /**
    * The lookback period in days that's used to generate the recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.undefined
  
  /**
    * The payment option that's used to generate the recommendation.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.costexplorerMod.PaymentOption] = js.undefined
  
  /**
    * Details for the Savings Plans that we recommend that you purchase to cover existing Savings Plans eligible workloads.
    */
  var SavingsPlansPurchaseRecommendationDetails: js.UndefOr[SavingsPlansPurchaseRecommendationDetailList] = js.undefined
  
  /**
    * Summary metrics for your Savings Plans Recommendations. 
    */
  var SavingsPlansPurchaseRecommendationSummary: js.UndefOr[typings.awsSdk.costexplorerMod.SavingsPlansPurchaseRecommendationSummary] = js.undefined
  
  /**
    * The requested Savings Plans recommendation type.
    */
  var SavingsPlansType: js.UndefOr[SupportedSavingsPlansType] = js.undefined
  
  /**
    * The Savings Plans recommendation term in years. It's used to generate the recommendation.
    */
  var TermInYears: js.UndefOr[typings.awsSdk.costexplorerMod.TermInYears] = js.undefined
}
object SavingsPlansPurchaseRecommendation {
  
  inline def apply(): SavingsPlansPurchaseRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendation]
  }
  
  extension [Self <: SavingsPlansPurchaseRecommendation](x: Self) {
    
    inline def setAccountScope(value: AccountScope): Self = StObject.set(x, "AccountScope", value.asInstanceOf[js.Any])
    
    inline def setAccountScopeUndefined: Self = StObject.set(x, "AccountScope", js.undefined)
    
    inline def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = StObject.set(x, "LookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setLookbackPeriodInDaysUndefined: Self = StObject.set(x, "LookbackPeriodInDays", js.undefined)
    
    inline def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    inline def setSavingsPlansPurchaseRecommendationDetails(value: SavingsPlansPurchaseRecommendationDetailList): Self = StObject.set(x, "SavingsPlansPurchaseRecommendationDetails", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlansPurchaseRecommendationDetailsUndefined: Self = StObject.set(x, "SavingsPlansPurchaseRecommendationDetails", js.undefined)
    
    inline def setSavingsPlansPurchaseRecommendationDetailsVarargs(value: SavingsPlansPurchaseRecommendationDetail*): Self = StObject.set(x, "SavingsPlansPurchaseRecommendationDetails", js.Array(value*))
    
    inline def setSavingsPlansPurchaseRecommendationSummary(value: SavingsPlansPurchaseRecommendationSummary): Self = StObject.set(x, "SavingsPlansPurchaseRecommendationSummary", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlansPurchaseRecommendationSummaryUndefined: Self = StObject.set(x, "SavingsPlansPurchaseRecommendationSummary", js.undefined)
    
    inline def setSavingsPlansType(value: SupportedSavingsPlansType): Self = StObject.set(x, "SavingsPlansType", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlansTypeUndefined: Self = StObject.set(x, "SavingsPlansType", js.undefined)
    
    inline def setTermInYears(value: TermInYears): Self = StObject.set(x, "TermInYears", value.asInstanceOf[js.Any])
    
    inline def setTermInYearsUndefined: Self = StObject.set(x, "TermInYears", js.undefined)
  }
}
