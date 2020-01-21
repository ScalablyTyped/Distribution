package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    currencies: CurrencyList = null,
    descriptions: SavingsPlanDescriptionsList = null,
    durations: DurationsList = null,
    filters: SavingsPlanOfferingFiltersList = null,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null,
    offeringIds: UUIDs = null,
    operations: SavingsPlanOperationList = null,
    paymentOptions: SavingsPlanPaymentOptionList = null,
    planTypes: SavingsPlanTypeList = null,
    productType: SavingsPlanProductType = null,
    serviceCodes: SavingsPlanServiceCodeList = null,
    usageTypes: SavingsPlanUsageTypeList = null
  ): DescribeSavingsPlansOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    if (currencies != null) __obj.updateDynamic("currencies")(currencies.asInstanceOf[js.Any])
    if (descriptions != null) __obj.updateDynamic("descriptions")(descriptions.asInstanceOf[js.Any])
    if (durations != null) __obj.updateDynamic("durations")(durations.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (offeringIds != null) __obj.updateDynamic("offeringIds")(offeringIds.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (paymentOptions != null) __obj.updateDynamic("paymentOptions")(paymentOptions.asInstanceOf[js.Any])
    if (planTypes != null) __obj.updateDynamic("planTypes")(planTypes.asInstanceOf[js.Any])
    if (productType != null) __obj.updateDynamic("productType")(productType.asInstanceOf[js.Any])
    if (serviceCodes != null) __obj.updateDynamic("serviceCodes")(serviceCodes.asInstanceOf[js.Any])
    if (usageTypes != null) __obj.updateDynamic("usageTypes")(usageTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSavingsPlansOfferingsRequest]
  }
}

