package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstanceReservationValue extends js.Object {
  /**
    * The total value of the Convertible Reserved Instance that you are exchanging.
    */
  var ReservationValue: js.UndefOr[typings.awsSdk.ec2Mod.ReservationValue] = js.native
  /**
    * The ID of the Convertible Reserved Instance that you are exchanging.
    */
  var ReservedInstanceId: js.UndefOr[String] = js.native
}

object ReservedInstanceReservationValue {
  @scala.inline
  def apply(ReservationValue: ReservationValue = null, ReservedInstanceId: String = null): ReservedInstanceReservationValue = {
    val __obj = js.Dynamic.literal()
    if (ReservationValue != null) __obj.updateDynamic("ReservationValue")(ReservationValue.asInstanceOf[js.Any])
    if (ReservedInstanceId != null) __obj.updateDynamic("ReservedInstanceId")(ReservedInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedInstanceReservationValue]
  }
}

