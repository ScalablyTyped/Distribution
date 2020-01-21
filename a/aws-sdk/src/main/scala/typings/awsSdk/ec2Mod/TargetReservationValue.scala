package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetReservationValue extends js.Object {
  /**
    * The total value of the Convertible Reserved Instances that make up the exchange. This is the sum of the list value, remaining upfront price, and additional upfront cost of the exchange.
    */
  var ReservationValue: js.UndefOr[typings.awsSdk.ec2Mod.ReservationValue] = js.native
  /**
    * The configuration of the Convertible Reserved Instances that make up the exchange.
    */
  var TargetConfiguration: js.UndefOr[typings.awsSdk.ec2Mod.TargetConfiguration] = js.native
}

object TargetReservationValue {
  @scala.inline
  def apply(ReservationValue: ReservationValue = null, TargetConfiguration: TargetConfiguration = null): TargetReservationValue = {
    val __obj = js.Dynamic.literal()
    if (ReservationValue != null) __obj.updateDynamic("ReservationValue")(ReservationValue.asInstanceOf[js.Any])
    if (TargetConfiguration != null) __obj.updateDynamic("TargetConfiguration")(TargetConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetReservationValue]
  }
}

