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
  def apply(): ReservedElasticsearchInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedElasticsearchInstance]
  }
  @scala.inline
  implicit class ReservedElasticsearchInstanceOps[Self <: ReservedElasticsearchInstance] (val x: Self) extends AnyVal {
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
    def setCurrencyCode(value: String): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    @scala.inline
    def setDuration(value: Integer): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    @scala.inline
    def setElasticsearchInstanceCount(value: Integer): Self = this.set("ElasticsearchInstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchInstanceCount: Self = this.set("ElasticsearchInstanceCount", js.undefined)
    @scala.inline
    def setElasticsearchInstanceType(value: ESPartitionInstanceType): Self = this.set("ElasticsearchInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchInstanceType: Self = this.set("ElasticsearchInstanceType", js.undefined)
    @scala.inline
    def setFixedPrice(value: Double): Self = this.set("FixedPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedPrice: Self = this.set("FixedPrice", js.undefined)
    @scala.inline
    def setPaymentOption(value: ReservedElasticsearchInstancePaymentOption): Self = this.set("PaymentOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentOption: Self = this.set("PaymentOption", js.undefined)
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = this.set("RecurringCharges", js.Array(value :_*))
    @scala.inline
    def setRecurringCharges(value: RecurringChargeList): Self = this.set("RecurringCharges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurringCharges: Self = this.set("RecurringCharges", js.undefined)
    @scala.inline
    def setReservationName(value: ReservationToken): Self = this.set("ReservationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservationName: Self = this.set("ReservationName", js.undefined)
    @scala.inline
    def setReservedElasticsearchInstanceId(value: GUID): Self = this.set("ReservedElasticsearchInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedElasticsearchInstanceId: Self = this.set("ReservedElasticsearchInstanceId", js.undefined)
    @scala.inline
    def setReservedElasticsearchInstanceOfferingId(value: String): Self = this.set("ReservedElasticsearchInstanceOfferingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedElasticsearchInstanceOfferingId: Self = this.set("ReservedElasticsearchInstanceOfferingId", js.undefined)
    @scala.inline
    def setStartTime(value: UpdateTimestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setUsagePrice(value: Double): Self = this.set("UsagePrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsagePrice: Self = this.set("UsagePrice", js.undefined)
  }
  
}

