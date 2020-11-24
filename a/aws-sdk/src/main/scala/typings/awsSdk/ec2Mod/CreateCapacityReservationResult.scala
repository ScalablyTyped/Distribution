package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCapacityReservationResult extends js.Object {
  
  /**
    * Information about the Capacity Reservation.
    */
  var CapacityReservation: js.UndefOr[typings.awsSdk.ec2Mod.CapacityReservation] = js.native
}
object CreateCapacityReservationResult {
  
  @scala.inline
  def apply(): CreateCapacityReservationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCapacityReservationResult]
  }
  
  @scala.inline
  implicit class CreateCapacityReservationResultOps[Self <: CreateCapacityReservationResult] (val x: Self) extends AnyVal {
    
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
    def setCapacityReservation(value: CapacityReservation): Self = this.set("CapacityReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityReservation: Self = this.set("CapacityReservation", js.undefined)
  }
}
