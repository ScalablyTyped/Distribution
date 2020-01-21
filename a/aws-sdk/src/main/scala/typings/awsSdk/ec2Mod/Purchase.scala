package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Purchase extends js.Object {
  /**
    * The currency in which the UpfrontPrice and HourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The duration of the reservation's term in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The IDs of the Dedicated Hosts associated with the reservation.
    */
  var HostIdSet: js.UndefOr[ResponseHostIdSet] = js.native
  /**
    * The ID of the reservation.
    */
  var HostReservationId: js.UndefOr[String] = js.native
  /**
    * The hourly price of the reservation per hour.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  /**
    * The instance family on the Dedicated Host that the reservation can be associated with.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * The payment option for the reservation.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.ec2Mod.PaymentOption] = js.native
  /**
    * The upfront price of the reservation.
    */
  var UpfrontPrice: js.UndefOr[String] = js.native
}

object Purchase {
  @scala.inline
  def apply(
    CurrencyCode: CurrencyCodeValues = null,
    Duration: Int | scala.Double = null,
    HostIdSet: ResponseHostIdSet = null,
    HostReservationId: String = null,
    HourlyPrice: String = null,
    InstanceFamily: String = null,
    PaymentOption: PaymentOption = null,
    UpfrontPrice: String = null
  ): Purchase = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (HostIdSet != null) __obj.updateDynamic("HostIdSet")(HostIdSet.asInstanceOf[js.Any])
    if (HostReservationId != null) __obj.updateDynamic("HostReservationId")(HostReservationId.asInstanceOf[js.Any])
    if (HourlyPrice != null) __obj.updateDynamic("HourlyPrice")(HourlyPrice.asInstanceOf[js.Any])
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily.asInstanceOf[js.Any])
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (UpfrontPrice != null) __obj.updateDynamic("UpfrontPrice")(UpfrontPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Purchase]
  }
}

