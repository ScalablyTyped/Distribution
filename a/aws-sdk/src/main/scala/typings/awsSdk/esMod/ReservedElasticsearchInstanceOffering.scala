package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedElasticsearchInstanceOffering extends js.Object {
  /**
    * The currency code for the reserved Elasticsearch instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * The duration, in seconds, for which the offering will reserve the Elasticsearch instance.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The Elasticsearch instance type offered by the reserved instance offering.
    */
  var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.native
  /**
    * The upfront fixed charge you will pay to purchase the specific reserved Elasticsearch instance offering. 
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * Payment option for the reserved Elasticsearch instance offering
    */
  var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.native
  /**
    * The charge to your account regardless of whether you are creating any domains using the instance offering.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * The Elasticsearch reserved instance offering identifier.
    */
  var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.native
  /**
    * The rate you are charged for each hour the domain that is using the offering is running.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedElasticsearchInstanceOffering {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    ElasticsearchInstanceType: ESPartitionInstanceType = null,
    FixedPrice: js.UndefOr[Double] = js.undefined,
    PaymentOption: ReservedElasticsearchInstancePaymentOption = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedElasticsearchInstanceOfferingId: GUID = null,
    UsagePrice: js.UndefOr[Double] = js.undefined
  ): ReservedElasticsearchInstanceOffering = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration.get.asInstanceOf[js.Any])
    if (ElasticsearchInstanceType != null) __obj.updateDynamic("ElasticsearchInstanceType")(ElasticsearchInstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice.get.asInstanceOf[js.Any])
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges.asInstanceOf[js.Any])
    if (ReservedElasticsearchInstanceOfferingId != null) __obj.updateDynamic("ReservedElasticsearchInstanceOfferingId")(ReservedElasticsearchInstanceOfferingId.asInstanceOf[js.Any])
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedElasticsearchInstanceOffering]
  }
}

