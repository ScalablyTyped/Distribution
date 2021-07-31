package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationPurchaseRecommendation extends StObject {
  
  /**
    * The account scope that AWS recommends that you purchase this instance for. For example, you can purchase this reservation for an entire organization in AWS Organizations.
    */
  var AccountScope: js.UndefOr[typings.awsSdk.costexplorerMod.AccountScope] = js.undefined
  
  /**
    * How many days of previous usage that AWS considers when making this recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.undefined
  
  /**
    * The payment option for the reservation. For example, AllUpfront or NoUpfront.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.costexplorerMod.PaymentOption] = js.undefined
  
  /**
    * Details about the recommended purchases.
    */
  var RecommendationDetails: js.UndefOr[ReservationPurchaseRecommendationDetails] = js.undefined
  
  /**
    * A summary about the recommended purchase.
    */
  var RecommendationSummary: js.UndefOr[ReservationPurchaseRecommendationSummary] = js.undefined
  
  /**
    * Hardware specifications for the service that you want recommendations for.
    */
  var ServiceSpecification: js.UndefOr[typings.awsSdk.costexplorerMod.ServiceSpecification] = js.undefined
  
  /**
    * The term of the reservation that you want recommendations for, in years.
    */
  var TermInYears: js.UndefOr[typings.awsSdk.costexplorerMod.TermInYears] = js.undefined
}
object ReservationPurchaseRecommendation {
  
  @scala.inline
  def apply(): ReservationPurchaseRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendation]
  }
  
  @scala.inline
  implicit class ReservationPurchaseRecommendationMutableBuilder[Self <: ReservationPurchaseRecommendation] (val x: Self) extends AnyVal {
    
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
    def setRecommendationDetails(value: ReservationPurchaseRecommendationDetails): Self = StObject.set(x, "RecommendationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationDetailsUndefined: Self = StObject.set(x, "RecommendationDetails", js.undefined)
    
    @scala.inline
    def setRecommendationDetailsVarargs(value: ReservationPurchaseRecommendationDetail*): Self = StObject.set(x, "RecommendationDetails", js.Array(value :_*))
    
    @scala.inline
    def setRecommendationSummary(value: ReservationPurchaseRecommendationSummary): Self = StObject.set(x, "RecommendationSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationSummaryUndefined: Self = StObject.set(x, "RecommendationSummary", js.undefined)
    
    @scala.inline
    def setServiceSpecification(value: ServiceSpecification): Self = StObject.set(x, "ServiceSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceSpecificationUndefined: Self = StObject.set(x, "ServiceSpecification", js.undefined)
    
    @scala.inline
    def setTermInYears(value: TermInYears): Self = StObject.set(x, "TermInYears", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermInYearsUndefined: Self = StObject.set(x, "TermInYears", js.undefined)
  }
}
