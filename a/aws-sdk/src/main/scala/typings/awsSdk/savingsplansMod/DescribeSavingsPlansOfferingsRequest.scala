package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlansOfferingsRequest extends StObject {
  
  /**
    * The currencies.
    */
  var currencies: js.UndefOr[CurrencyList] = js.native
  
  /**
    * The descriptions.
    */
  var descriptions: js.UndefOr[SavingsPlanDescriptionsList] = js.native
  
  /**
    * The durations, in seconds.
    */
  var durations: js.UndefOr[DurationsList] = js.native
  
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanOfferingFiltersList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The IDs of the offerings.
    */
  var offeringIds: js.UndefOr[UUIDs] = js.native
  
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operations: js.UndefOr[SavingsPlanOperationList] = js.native
  
  /**
    * The payment options.
    */
  var paymentOptions: js.UndefOr[SavingsPlanPaymentOptionList] = js.native
  
  /**
    * The plan type.
    */
  var planTypes: js.UndefOr[SavingsPlanTypeList] = js.native
  
  /**
    * The product type.
    */
  var productType: js.UndefOr[SavingsPlanProductType] = js.native
  
  /**
    * The services.
    */
  var serviceCodes: js.UndefOr[SavingsPlanServiceCodeList] = js.native
  
  /**
    * The usage details of the line item in the billing report.
    */
  var usageTypes: js.UndefOr[SavingsPlanUsageTypeList] = js.native
}
object DescribeSavingsPlansOfferingsRequest {
  
  @scala.inline
  def apply(): DescribeSavingsPlansOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansOfferingsRequest]
  }
  
  @scala.inline
  implicit class DescribeSavingsPlansOfferingsRequestMutableBuilder[Self <: DescribeSavingsPlansOfferingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencies(value: CurrencyList): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrenciesUndefined: Self = StObject.set(x, "currencies", js.undefined)
    
    @scala.inline
    def setCurrenciesVarargs(value: CurrencyCode*): Self = StObject.set(x, "currencies", js.Array(value :_*))
    
    @scala.inline
    def setDescriptions(value: SavingsPlanDescriptionsList): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    @scala.inline
    def setDescriptionsVarargs(value: SavingsPlanDescription*): Self = StObject.set(x, "descriptions", js.Array(value :_*))
    
    @scala.inline
    def setDurations(value: DurationsList): Self = StObject.set(x, "durations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationsUndefined: Self = StObject.set(x, "durations", js.undefined)
    
    @scala.inline
    def setDurationsVarargs(value: SavingsPlansDuration*): Self = StObject.set(x, "durations", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: SavingsPlanOfferingFiltersList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: SavingsPlanOfferingFilterElement*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setOfferingIds(value: UUIDs): Self = StObject.set(x, "offeringIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdsUndefined: Self = StObject.set(x, "offeringIds", js.undefined)
    
    @scala.inline
    def setOfferingIdsVarargs(value: UUID*): Self = StObject.set(x, "offeringIds", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: SavingsPlanOperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: SavingsPlanOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setPaymentOptions(value: SavingsPlanPaymentOptionList): Self = StObject.set(x, "paymentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentOptionsUndefined: Self = StObject.set(x, "paymentOptions", js.undefined)
    
    @scala.inline
    def setPaymentOptionsVarargs(value: SavingsPlanPaymentOption*): Self = StObject.set(x, "paymentOptions", js.Array(value :_*))
    
    @scala.inline
    def setPlanTypes(value: SavingsPlanTypeList): Self = StObject.set(x, "planTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanTypesUndefined: Self = StObject.set(x, "planTypes", js.undefined)
    
    @scala.inline
    def setPlanTypesVarargs(value: SavingsPlanType*): Self = StObject.set(x, "planTypes", js.Array(value :_*))
    
    @scala.inline
    def setProductType(value: SavingsPlanProductType): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
    
    @scala.inline
    def setServiceCodes(value: SavingsPlanServiceCodeList): Self = StObject.set(x, "serviceCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCodesUndefined: Self = StObject.set(x, "serviceCodes", js.undefined)
    
    @scala.inline
    def setServiceCodesVarargs(value: SavingsPlanServiceCode*): Self = StObject.set(x, "serviceCodes", js.Array(value :_*))
    
    @scala.inline
    def setUsageTypes(value: SavingsPlanUsageTypeList): Self = StObject.set(x, "usageTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageTypesUndefined: Self = StObject.set(x, "usageTypes", js.undefined)
    
    @scala.inline
    def setUsageTypesVarargs(value: SavingsPlanUsageType*): Self = StObject.set(x, "usageTypes", js.Array(value :_*))
  }
}
