package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlansOfferingRatesRequest extends js.Object {
  
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanOfferingRateFiltersList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operations: js.UndefOr[SavingsPlanRateOperationList] = js.native
  
  /**
    * The AWS products.
    */
  var products: js.UndefOr[SavingsPlanProductTypeList] = js.native
  
  /**
    * The IDs of the offerings.
    */
  var savingsPlanOfferingIds: js.UndefOr[UUIDs] = js.native
  
  /**
    * The payment options.
    */
  var savingsPlanPaymentOptions: js.UndefOr[SavingsPlanPaymentOptionList] = js.native
  
  /**
    * The plan types.
    */
  var savingsPlanTypes: js.UndefOr[SavingsPlanTypeList] = js.native
  
  /**
    * The services.
    */
  var serviceCodes: js.UndefOr[SavingsPlanRateServiceCodeList] = js.native
  
  /**
    * The usage details of the line item in the billing report.
    */
  var usageTypes: js.UndefOr[SavingsPlanRateUsageTypeList] = js.native
}
object DescribeSavingsPlansOfferingRatesRequest {
  
  @scala.inline
  def apply(): DescribeSavingsPlansOfferingRatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansOfferingRatesRequest]
  }
  
  @scala.inline
  implicit class DescribeSavingsPlansOfferingRatesRequestOps[Self <: DescribeSavingsPlansOfferingRatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFiltersVarargs(value: SavingsPlanOfferingRateFilterElement*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: SavingsPlanOfferingRateFiltersList): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: SavingsPlanRateOperation*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: SavingsPlanRateOperationList): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: SavingsPlanProductType*): Self = this.set("products", js.Array(value :_*))
    
    @scala.inline
    def setProducts(value: SavingsPlanProductTypeList): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
    
    @scala.inline
    def setSavingsPlanOfferingIdsVarargs(value: UUID*): Self = this.set("savingsPlanOfferingIds", js.Array(value :_*))
    
    @scala.inline
    def setSavingsPlanOfferingIds(value: UUIDs): Self = this.set("savingsPlanOfferingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlanOfferingIds: Self = this.set("savingsPlanOfferingIds", js.undefined)
    
    @scala.inline
    def setSavingsPlanPaymentOptionsVarargs(value: SavingsPlanPaymentOption*): Self = this.set("savingsPlanPaymentOptions", js.Array(value :_*))
    
    @scala.inline
    def setSavingsPlanPaymentOptions(value: SavingsPlanPaymentOptionList): Self = this.set("savingsPlanPaymentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlanPaymentOptions: Self = this.set("savingsPlanPaymentOptions", js.undefined)
    
    @scala.inline
    def setSavingsPlanTypesVarargs(value: SavingsPlanType*): Self = this.set("savingsPlanTypes", js.Array(value :_*))
    
    @scala.inline
    def setSavingsPlanTypes(value: SavingsPlanTypeList): Self = this.set("savingsPlanTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlanTypes: Self = this.set("savingsPlanTypes", js.undefined)
    
    @scala.inline
    def setServiceCodesVarargs(value: SavingsPlanRateServiceCode*): Self = this.set("serviceCodes", js.Array(value :_*))
    
    @scala.inline
    def setServiceCodes(value: SavingsPlanRateServiceCodeList): Self = this.set("serviceCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceCodes: Self = this.set("serviceCodes", js.undefined)
    
    @scala.inline
    def setUsageTypesVarargs(value: SavingsPlanRateUsageType*): Self = this.set("usageTypes", js.Array(value :_*))
    
    @scala.inline
    def setUsageTypes(value: SavingsPlanRateUsageTypeList): Self = this.set("usageTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageTypes: Self = this.set("usageTypes", js.undefined)
  }
}
