package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostReservation extends js.Object {
  /**
    * The number of Dedicated Hosts the reservation is associated with.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * The currency in which the upfrontPrice and hourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The length of the reservation's term, specified in seconds. Can be 31536000 (1 year) | 94608000 (3 years).
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The date and time that the reservation ends.
    */
  var End: js.UndefOr[DateTime] = js.native
  /**
    * The IDs of the Dedicated Hosts associated with the reservation.
    */
  var HostIdSet: js.UndefOr[ResponseHostIdSet] = js.native
  /**
    * The ID of the reservation that specifies the associated Dedicated Hosts.
    */
  var HostReservationId: js.UndefOr[String] = js.native
  /**
    * The hourly price of the reservation.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  /**
    * The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be the same in order for it to benefit from the reservation.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with it.
    */
  var OfferingId: js.UndefOr[String] = js.native
  /**
    * The payment option selected for this reservation.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.ec2Mod.PaymentOption] = js.native
  /**
    * The date and time that the reservation started.
    */
  var Start: js.UndefOr[DateTime] = js.native
  /**
    * The state of the reservation.
    */
  var State: js.UndefOr[ReservationState] = js.native
  /**
    * Any tags assigned to the Dedicated Host Reservation.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The upfront price of the reservation.
    */
  var UpfrontPrice: js.UndefOr[String] = js.native
}

object HostReservation {
  @scala.inline
  def apply(
    Count: Int | scala.Double = null,
    CurrencyCode: CurrencyCodeValues = null,
    Duration: Int | scala.Double = null,
    End: DateTime = null,
    HostIdSet: ResponseHostIdSet = null,
    HostReservationId: String = null,
    HourlyPrice: String = null,
    InstanceFamily: String = null,
    OfferingId: String = null,
    PaymentOption: PaymentOption = null,
    Start: DateTime = null,
    State: ReservationState = null,
    Tags: TagList = null,
    UpfrontPrice: String = null
  ): HostReservation = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (HostIdSet != null) __obj.updateDynamic("HostIdSet")(HostIdSet.asInstanceOf[js.Any])
    if (HostReservationId != null) __obj.updateDynamic("HostReservationId")(HostReservationId.asInstanceOf[js.Any])
    if (HourlyPrice != null) __obj.updateDynamic("HourlyPrice")(HourlyPrice.asInstanceOf[js.Any])
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily.asInstanceOf[js.Any])
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId.asInstanceOf[js.Any])
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UpfrontPrice != null) __obj.updateDynamic("UpfrontPrice")(UpfrontPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostReservation]
  }
}

