package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReservationPurchaseRecommendationRequest extends StObject {
  
  /**
    * The account ID that is associated with the recommendation. 
    */
  var AccountId: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations including the management account and member accounts if the value is set to PAYER. If the value is LINKED, recommendations are calculated for individual member accounts only.
    */
  var AccountScope: js.UndefOr[typings.awsSdk.costexplorerMod.AccountScope] = js.undefined
  
  /**
    * The number of previous days that you want AWS to consider when it calculates your recommendations.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.undefined
  
  /**
    * The reservation purchase option that you want recommendations for.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.costexplorerMod.PaymentOption] = js.undefined
  
  /**
    * The specific service that you want recommendations for.
    */
  var Service: GenericString
  
  /**
    * The hardware specifications for the service instances that you want recommendations for, such as standard or convertible Amazon EC2 instances.
    */
  var ServiceSpecification: js.UndefOr[typings.awsSdk.costexplorerMod.ServiceSpecification] = js.undefined
  
  /**
    * The reservation term that you want recommendations for.
    */
  var TermInYears: js.UndefOr[typings.awsSdk.costexplorerMod.TermInYears] = js.undefined
}
object GetReservationPurchaseRecommendationRequest {
  
  inline def apply(Service: GenericString): GetReservationPurchaseRecommendationRequest = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationPurchaseRecommendationRequest]
  }
  
  extension [Self <: GetReservationPurchaseRecommendationRequest](x: Self) {
    
    inline def setAccountId(value: GenericString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAccountScope(value: AccountScope): Self = StObject.set(x, "AccountScope", value.asInstanceOf[js.Any])
    
    inline def setAccountScopeUndefined: Self = StObject.set(x, "AccountScope", js.undefined)
    
    inline def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = StObject.set(x, "LookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setLookbackPeriodInDaysUndefined: Self = StObject.set(x, "LookbackPeriodInDays", js.undefined)
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setPageSize(value: NonNegativeInteger): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    inline def setService(value: GenericString): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setServiceSpecification(value: ServiceSpecification): Self = StObject.set(x, "ServiceSpecification", value.asInstanceOf[js.Any])
    
    inline def setServiceSpecificationUndefined: Self = StObject.set(x, "ServiceSpecification", js.undefined)
    
    inline def setTermInYears(value: TermInYears): Self = StObject.set(x, "TermInYears", value.asInstanceOf[js.Any])
    
    inline def setTermInYearsUndefined: Self = StObject.set(x, "TermInYears", js.undefined)
  }
}
