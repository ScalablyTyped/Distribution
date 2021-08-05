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
  
  inline def apply(): CapacityReservationTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationTargetResponse]
  }
  
  extension [Self <: CapacityReservationTargetResponse](x: Self) {
    
    inline def setCapacityReservationId(value: String): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationIdUndefined: Self = StObject.set(x, "CapacityReservationId", js.undefined)
    
    inline def setCapacityReservationResourceGroupArn(value: String): Self = StObject.set(x, "CapacityReservationResourceGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationResourceGroupArnUndefined: Self = StObject.set(x, "CapacityReservationResourceGroupArn", js.undefined)
  }
}
