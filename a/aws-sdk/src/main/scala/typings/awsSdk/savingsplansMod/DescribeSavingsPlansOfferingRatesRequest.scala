package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSavingsPlansOfferingRatesRequest extends StObject {
  
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanOfferingRateFiltersList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operations: js.UndefOr[SavingsPlanRateOperationList] = js.undefined
  
  /**
    * The AWS products.
    */
  var products: js.UndefOr[SavingsPlanProductTypeList] = js.undefined
  
  /**
    * The IDs of the offerings.
    */
  var savingsPlanOfferingIds: js.UndefOr[UUIDs] = js.undefined
  
  /**
    * The payment options.
    */
  var savingsPlanPaymentOptions: js.UndefOr[SavingsPlanPaymentOptionList] = js.undefined
  
  /**
    * The plan types.
    */
  var savingsPlanTypes: js.UndefOr[SavingsPlanTypeList] = js.undefined
  
  /**
    * The services.
    */
  var serviceCodes: js.UndefOr[SavingsPlanRateServiceCodeList] = js.undefined
  
  /**
    * The usage details of the line item in the billing report.
    */
  var usageTypes: js.UndefOr[SavingsPlanRateUsageTypeList] = js.undefined
}
object DescribeSavingsPlansOfferingRatesRequest {
  
  inline def apply(): DescribeSavingsPlansOfferingRatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansOfferingRatesRequest]
  }
  
  extension [Self <: DescribeSavingsPlansOfferingRatesRequest](x: Self) {
    
    inline def setFilters(value: SavingsPlanOfferingRateFiltersList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SavingsPlanOfferingRateFilterElement*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOperations(value: SavingsPlanRateOperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: SavingsPlanRateOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setProducts(value: SavingsPlanProductTypeList): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SavingsPlanProductType*): Self = StObject.set(x, "products", js.Array(value*))
    
    inline def setSavingsPlanOfferingIds(value: UUIDs): Self = StObject.set(x, "savingsPlanOfferingIds", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanOfferingIdsUndefined: Self = StObject.set(x, "savingsPlanOfferingIds", js.undefined)
    
    inline def setSavingsPlanOfferingIdsVarargs(value: UUID*): Self = StObject.set(x, "savingsPlanOfferingIds", js.Array(value*))
    
    inline def setSavingsPlanPaymentOptions(value: SavingsPlanPaymentOptionList): Self = StObject.set(x, "savingsPlanPaymentOptions", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanPaymentOptionsUndefined: Self = StObject.set(x, "savingsPlanPaymentOptions", js.undefined)
    
    inline def setSavingsPlanPaymentOptionsVarargs(value: SavingsPlanPaymentOption*): Self = StObject.set(x, "savingsPlanPaymentOptions", js.Array(value*))
    
    inline def setSavingsPlanTypes(value: SavingsPlanTypeList): Self = StObject.set(x, "savingsPlanTypes", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanTypesUndefined: Self = StObject.set(x, "savingsPlanTypes", js.undefined)
    
    inline def setSavingsPlanTypesVarargs(value: SavingsPlanType*): Self = StObject.set(x, "savingsPlanTypes", js.Array(value*))
    
    inline def setServiceCodes(value: SavingsPlanRateServiceCodeList): Self = StObject.set(x, "serviceCodes", value.asInstanceOf[js.Any])
    
    inline def setServiceCodesUndefined: Self = StObject.set(x, "serviceCodes", js.undefined)
    
    inline def setServiceCodesVarargs(value: SavingsPlanRateServiceCode*): Self = StObject.set(x, "serviceCodes", js.Array(value*))
    
    inline def setUsageTypes(value: SavingsPlanRateUsageTypeList): Self = StObject.set(x, "usageTypes", value.asInstanceOf[js.Any])
    
    inline def setUsageTypesUndefined: Self = StObject.set(x, "usageTypes", js.undefined)
    
    inline def setUsageTypesVarargs(value: SavingsPlanRateUsageType*): Self = StObject.set(x, "usageTypes", js.Array(value*))
  }
}
