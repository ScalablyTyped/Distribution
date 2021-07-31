package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityReservationTargetResponse extends StObject {
  
  /**
    * The ID of the targeted Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the targeted Capacity Reservation group.
    */
  var CapacityReservationResourceGroupArn: js.UndefOr[String] = js.undefined
}
object CapacityReservationTargetResponse {
  
  @scala.inline
  def apply(): CapacityReservationTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationTargetResponse]
  }
  
  @scala.inline
  implicit class CapacityReservationTargetResponseMutableBuilder[Self <: CapacityReservationTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityReservationId(value: String): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationIdUndefined: Self = StObject.set(x, "CapacityReservationId", js.undefined)
    
    @scala.inline
    def setCapacityReservationResourceGroupArn(value: String): Self = StObject.set(x, "CapacityReservationResourceGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationResourceGroupArnUndefined: Self = StObject.set(x, "CapacityReservationResourceGroupArn", js.undefined)
  }
}
