package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansPurchaseRecommendation extends StObject {
  
  /**
    * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations including the management account and member accounts if the value is set to PAYER. If the value is LINKED, recommendations are calculated for individual member accounts only.
    */
  var AccountScope: js.UndefOr[typings.awsSdk.costexplorerMod.AccountScope] = js.native
  
  /**
    * The lookback period in days, used to generate the recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.native
  
  /**
    * The payment option used to generate the recommendation.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.costexplorerMod.PaymentOption] = js.native
  
  /**
    * Details for the Savings Plans we recommend that you purchase to cover existing Savings Plans eligible workloads.
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
  def apply(): SavingsPlansPurchaseRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendation]
  }
  
  @scala.inline
  implicit class SavingsPlansPurchaseRecommendationMutableBuilder[Self <: SavingsPlansPurchaseRecommendation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountScope(value: AccountScope): Self = StObject.set(x, "AccountScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountScopeUndefined: Self = StObject.set(x, "AccountScope", js.undefined)
    
    @scala.inline
    def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = StObject.set(x, "LookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookbackPeriodInDaysUndefined: Self = StObject.set(x, "LookbackPeriodInDays", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    @scala.inline
    def setSavingsPlansPurchaseRecommendationDetails(value: SavingsPlansPurchaseRecommendationDetailList): Self = StObject.set(x, "SavingsPlansPurchaseRecommendationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlansPurchaseRecommendationDetailsUndefined: Self = StObject.set(x, "SavingsPlansPurchaseRecommendationDetails", js.undefined)
    
    @scala.inline
    def setSavingsPlansPurchaseRecommendationDetailsVarargs(value: SavingsPlansPurchaseRecommendationDetail*): Self = StObject.set(x, "SavingsPlansPurchaseRecommendationDetails", js.Array(value :_*))
    
    @scala.inline
    def setSavingsPlansPurchaseRecommendationSummary(value: SavingsPlansPurchaseRecommendationSummary): Self = StObject.set(x, "SavingsPlansPurchaseRecommendationSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlansPurchaseRecommendationSummaryUndefined: Self = StObject.set(x, "SavingsPlansPurchaseRecommendationSummary", js.undefined)
    
    @scala.inline
    def setSavingsPlansType(value: SupportedSavingsPlansType): Self = StObject.set(x, "SavingsPlansType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlansTypeUndefined: Self = StObject.set(x, "SavingsPlansType", js.undefined)
    
    @scala.inline
    def setTermInYears(value: TermInYears): Self = StObject.set(x, "TermInYears", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermInYearsUndefined: Self = StObject.set(x, "TermInYears", js.undefined)
  }
}
