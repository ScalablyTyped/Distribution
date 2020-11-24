package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobShipmentStateRequest extends js.Object {
  
  /**
    * The job ID of the job whose shipment date you want to update, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.snowballMod.JobId = js.native
  
  /**
    * The state of a device when it is being shipped.  Set to RECEIVED when the device arrives at your location. Set to RETURNED when you have returned the device to AWS.
    */
  var ShipmentState: typings.awsSdk.snowballMod.ShipmentState = js.native
}
object UpdateJobShipmentStateRequest {
  
  @scala.inline
  def apply(JobId: JobId, ShipmentState: ShipmentState): UpdateJobShipmentStateRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], ShipmentState = ShipmentState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobShipmentStateRequest]
  }
  
  @scala.inline
  implicit class UpdateJobShipmentStateRequestOps[Self <: UpdateJobShipmentStateRequest] (val x: Self) extends AnyVal {
    
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
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentState(value: ShipmentState): Self = this.set("ShipmentState", value.asInstanceOf[js.Any])
  }
}
