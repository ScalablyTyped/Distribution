package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelCapacityReservationRequest extends StObject {
  
  /**
    * The ID of the Capacity Reservation to be cancelled.
    */
  var CapacityReservationId: typings.awsSdk.ec2Mod.CapacityReservationId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object CancelCapacityReservationRequest {
  
  @scala.inline
  def apply(CapacityReservationId: CapacityReservationId): CancelCapacityReservationRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationId = CapacityReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelCapacityReservationRequest]
  }
  
  @scala.inline
  implicit class CancelCapacityReservationRequestMutableBuilder[Self <: CancelCapacityReservationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityReservationId(value: CapacityReservationId): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
