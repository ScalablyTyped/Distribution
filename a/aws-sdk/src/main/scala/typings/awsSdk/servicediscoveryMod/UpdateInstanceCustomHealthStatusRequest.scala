package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInstanceCustomHealthStatusRequest extends js.Object {
  
  /**
    * The ID of the instance that you want to change the health status for.
    */
  var InstanceId: ResourceId = js.native
  
  /**
    * The ID of the service that includes the configuration for the custom health check that you want to change the status for.
    */
  var ServiceId: ResourceId = js.native
  
  /**
    * The new status of the instance, HEALTHY or UNHEALTHY.
    */
  var Status: CustomHealthStatus = js.native
}
object UpdateInstanceCustomHealthStatusRequest {
  
  @scala.inline
  def apply(InstanceId: ResourceId, ServiceId: ResourceId, Status: CustomHealthStatus): UpdateInstanceCustomHealthStatusRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ServiceId = ServiceId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceCustomHealthStatusRequest]
  }
  
  @scala.inline
  implicit class UpdateInstanceCustomHealthStatusRequestOps[Self <: UpdateInstanceCustomHealthStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceId(value: ResourceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: ResourceId): Self = this.set("ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: CustomHealthStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
}
