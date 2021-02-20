package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCapacityReservationResult extends StObject {
  
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
  implicit class CreateCapacityReservationResultMutableBuilder[Self <: CreateCapacityReservationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityReservation(value: CapacityReservation): Self = StObject.set(x, "CapacityReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationUndefined: Self = StObject.set(x, "CapacityReservation", js.undefined)
  }
}
