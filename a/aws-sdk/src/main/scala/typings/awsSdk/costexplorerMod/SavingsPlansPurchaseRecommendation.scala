package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansPurchaseRecommendation extends js.Object {
  
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
  implicit class SavingsPlansPurchaseRecommendationOps[Self <: SavingsPlansPurchaseRecommendation] (val x: Self) extends AnyVal {
    
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
    def setAccountScope(value: AccountScope): Self = this.set("AccountScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountScope: Self = this.set("AccountScope", js.undefined)
    
    @scala.inline
    def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = this.set("LookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookbackPeriodInDays: Self = this.set("LookbackPeriodInDays", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: PaymentOption): Self = this.set("PaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentOption: Self = this.set("PaymentOption", js.undefined)
    
    @scala.inline
    def setSavingsPlansPurchaseRecommendationDetailsVarargs(value: SavingsPlansPurchaseRecommendationDetail*): Self = this.set("SavingsPlansPurchaseRecommendationDetails", js.Array(value :_*))
    
    @scala.inline
    def setSavingsPlansPurchaseRecommendationDetails(value: SavingsPlansPurchaseRecommendationDetailList): Self = this.set("SavingsPlansPurchaseRecommendationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlansPurchaseRecommendationDetails: Self = this.set("SavingsPlansPurchaseRecommendationDetails", js.undefined)
    
    @scala.inline
    def setSavingsPlansPurchaseRecommendationSummary(value: SavingsPlansPurchaseRecommendationSummary): Self = this.set("SavingsPlansPurchaseRecommendationSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlansPurchaseRecommendationSummary: Self = this.set("SavingsPlansPurchaseRecommendationSummary", js.undefined)
    
    @scala.inline
    def setSavingsPlansType(value: SupportedSavingsPlansType): Self = this.set("SavingsPlansType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlansType: Self = this.set("SavingsPlansType", js.undefined)
    
    @scala.inline
    def setTermInYears(value: TermInYears): Self = this.set("TermInYears", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermInYears: Self = this.set("TermInYears", js.undefined)
  }
}
