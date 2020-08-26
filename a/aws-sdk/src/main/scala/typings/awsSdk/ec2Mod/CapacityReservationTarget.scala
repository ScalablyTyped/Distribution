package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationTarget extends js.Object {
  /**
    * The ID of the Capacity Reservation in which to run the instance.
    */
  var CapacityReservationId: js.UndefOr[typings.awsSdk.ec2Mod.CapacityReservationId] = js.native
  /**
    * The ARN of the Capacity Reservation resource group in which to run the instance.
    */
  var CapacityReservationResourceGroupArn: js.UndefOr[String] = js.native
}

object CapacityReservationTarget {
  @scala.inline
  def apply(): CapacityReservationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationTarget]
  }
  @scala.inline
  implicit class CapacityReservationTargetOps[Self <: CapacityReservationTarget] (val x: Self) extends AnyVal {
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
    def setCapacityReservationId(value: CapacityReservationId): Self = this.set("CapacityReservationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationId: Self = this.set("CapacityReservationId", js.undefined)
    @scala.inline
    def setCapacityReservationResourceGroupArn(value: String): Self = this.set("CapacityReservationResourceGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationResourceGroupArn: Self = this.set("CapacityReservationResourceGroupArn", js.undefined)
  }
  
}

