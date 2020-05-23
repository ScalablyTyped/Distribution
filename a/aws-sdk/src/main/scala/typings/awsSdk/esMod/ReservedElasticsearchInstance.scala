package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedElasticsearchInstance extends js.Object {
  /**
    * The currency code for the reserved Elasticsearch instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * The duration, in seconds, for which the Elasticsearch instance is reserved.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The number of Elasticsearch instances that have been reserved.
    */
  var ElasticsearchInstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The Elasticsearch instance type offered by the reserved instance offering.
    */
  var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.native
  /**
    * The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering. 
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * The payment option as defined in the reserved Elasticsearch instance offering.
    */
  var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.native
  /**
    * The charge to your account regardless of whether you are creating any domains using the instance offering.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * The customer-specified identifier to track this reservation.
    */
  var ReservationName: js.UndefOr[ReservationToken] = js.native
  /**
    * The unique identifier for the reservation.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.native
  /**
    * The offering identifier.
    */
  var ReservedElasticsearchInstanceOfferingId: js.UndefOr[String] = js.native
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[UpdateTimestamp] = js.native
  /**
    * The state of the reserved Elasticsearch instance.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The rate you are charged for each hour for the domain that is using this reserved instance.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedElasticsearchInstance {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    ElasticsearchInstanceCount: js.UndefOr[Integer] = js.undefined,
    ElasticsearchInstanceType: ESPartitionInstanceType = null,
    FixedPrice: js.UndefOr[Double] = js.undefined,
    PaymentOption: ReservedElasticsearchInstancePaymentOption = null,
    RecurringCharges: RecurringChargeList = null,
    ReservationName: ReservationToken = null,
    ReservedElasticsearchInstanceId: GUID = null,
    ReservedElasticsearchInstanceOfferingId: String = null,
    StartTime: UpdateTimestamp = null,
    State: String = null,
    UsagePrice: js.UndefOr[Double] = js.undefined
  ): ReservedElasticsearchInstance = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ElasticsearchInstanceCount)) __obj.updateDynamic("ElasticsearchInstanceCount")(ElasticsearchInstanceCount.get.asInstanceOf[js.Any])
    if (ElasticsearchInstanceType != null) __obj.updateDynamic("ElasticsearchInstanceType")(ElasticsearchInstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice.get.asInstanceOf[js.Any])
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges.asInstanceOf[js.Any])
    if (ReservationName != null) __obj.updateDynamic("ReservationName")(ReservationName.asInstanceOf[js.Any])
    if (ReservedElasticsearchInstanceId != null) __obj.updateDynamic("ReservedElasticsearchInstanceId")(ReservedElasticsearchInstanceId.asInstanceOf[js.Any])
    if (ReservedElasticsearchInstanceOfferingId != null) __obj.updateDynamic("ReservedElasticsearchInstanceOfferingId")(ReservedElasticsearchInstanceOfferingId.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedElasticsearchInstance]
  }
}

