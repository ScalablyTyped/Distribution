package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobShipmentStateRequest extends StObject {
  
  /**
    * The job ID of the job whose shipment date you want to update, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.snowballMod.JobId
  
  /**
    * The state of a device when it is being shipped.  Set to RECEIVED when the device arrives at your location. Set to RETURNED when you have returned the device to AWS.
    */
  var ShipmentState: typings.awsSdk.snowballMod.ShipmentState
}
object UpdateJobShipmentStateRequest {
  
  @scala.inline
  def apply(JobId: JobId, ShipmentState: ShipmentState): UpdateJobShipmentStateRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], ShipmentState = ShipmentState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobShipmentStateRequest]
  }
  
  @scala.inline
  implicit class UpdateJobShipmentStateRequestMutableBuilder[Self <: UpdateJobShipmentStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentState(value: ShipmentState): Self = StObject.set(x, "ShipmentState", value.asInstanceOf[js.Any])
  }
}
