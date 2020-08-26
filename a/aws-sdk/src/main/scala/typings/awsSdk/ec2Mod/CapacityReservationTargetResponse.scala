package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationTargetResponse extends js.Object {
  /**
    * The ID of the targeted Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.native
  /**
    * The ARN of the targeted Capacity Reservation group.
    */
  var CapacityReservationResourceGroupArn: js.UndefOr[String] = js.native
}

object CapacityReservationTargetResponse {
  @scala.inline
  def apply(): CapacityReservationTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationTargetResponse]
  }
  @scala.inline
  implicit class CapacityReservationTargetResponseOps[Self <: CapacityReservationTargetResponse] (val x: Self) extends AnyVal {
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
    def setCapacityReservationId(value: String): Self = this.set("CapacityReservationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationId: Self = this.set("CapacityReservationId", js.undefined)
    @scala.inline
    def setCapacityReservationResourceGroupArn(value: String): Self = this.set("CapacityReservationResourceGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationResourceGroupArn: Self = this.set("CapacityReservationResourceGroupArn", js.undefined)
  }
  
}

