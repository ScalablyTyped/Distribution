package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlansOfferingsRequest extends js.Object {
  
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
  implicit class DescribeSavingsPlansOfferingsRequestOps[Self <: DescribeSavingsPlansOfferingsRequest] (val x: Self) extends AnyVal {
    
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
    def setCurrenciesVarargs(value: CurrencyCode*): Self = this.set("currencies", js.Array(value :_*))
    
    @scala.inline
    def setCurrencies(value: CurrencyList): Self = this.set("currencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencies: Self = this.set("currencies", js.undefined)
    
    @scala.inline
    def setDescriptionsVarargs(value: SavingsPlanDescription*): Self = this.set("descriptions", js.Array(value :_*))
    
    @scala.inline
    def setDescriptions(value: SavingsPlanDescriptionsList): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptions: Self = this.set("descriptions", js.undefined)
    
    @scala.inline
    def setDurationsVarargs(value: SavingsPlansDuration*): Self = this.set("durations", js.Array(value :_*))
    
    @scala.inline
    def setDurations(value: DurationsList): Self = this.set("durations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurations: Self = this.set("durations", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: SavingsPlanOfferingFilterElement*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: SavingsPlanOfferingFiltersList): Self = this.set("filters", value.asInstanceOf[js.Any])
    
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
    def setOfferingIdsVarargs(value: UUID*): Self = this.set("offeringIds", js.Array(value :_*))
    
    @scala.inline
    def setOfferingIds(value: UUIDs): Self = this.set("offeringIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingIds: Self = this.set("offeringIds", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: SavingsPlanOperation*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: SavingsPlanOperationList): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    
    @scala.inline
    def setPaymentOptionsVarargs(value: SavingsPlanPaymentOption*): Self = this.set("paymentOptions", js.Array(value :_*))
    
    @scala.inline
    def setPaymentOptions(value: SavingsPlanPaymentOptionList): Self = this.set("paymentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentOptions: Self = this.set("paymentOptions", js.undefined)
    
    @scala.inline
    def setPlanTypesVarargs(value: SavingsPlanType*): Self = this.set("planTypes", js.Array(value :_*))
    
    @scala.inline
    def setPlanTypes(value: SavingsPlanTypeList): Self = this.set("planTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanTypes: Self = this.set("planTypes", js.undefined)
    
    @scala.inline
    def setProductType(value: SavingsPlanProductType): Self = this.set("productType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductType: Self = this.set("productType", js.undefined)
    
    @scala.inline
    def setServiceCodesVarargs(value: SavingsPlanServiceCode*): Self = this.set("serviceCodes", js.Array(value :_*))
    
    @scala.inline
    def setServiceCodes(value: SavingsPlanServiceCodeList): Self = this.set("serviceCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceCodes: Self = this.set("serviceCodes", js.undefined)
    
    @scala.inline
    def setUsageTypesVarargs(value: SavingsPlanUsageType*): Self = this.set("usageTypes", js.Array(value :_*))
    
    @scala.inline
    def setUsageTypes(value: SavingsPlanUsageTypeList): Self = this.set("usageTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageTypes: Self = this.set("usageTypes", js.undefined)
  }
}
