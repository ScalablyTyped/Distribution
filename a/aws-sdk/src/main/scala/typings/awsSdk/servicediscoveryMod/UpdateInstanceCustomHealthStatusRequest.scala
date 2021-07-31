package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceCustomHealthStatusRequest extends StObject {
  
  /**
    * The ID of the instance that you want to change the health status for.
    */
  var InstanceId: ResourceId
  
  /**
    * The ID of the service that includes the configuration for the custom health check that you want to change the status for.
    */
  var ServiceId: ResourceId
  
  /**
    * The new status of the instance, HEALTHY or UNHEALTHY.
    */
  var Status: CustomHealthStatus
}
object UpdateInstanceCustomHealthStatusRequest {
  
  @scala.inline
  def apply(InstanceId: ResourceId, ServiceId: ResourceId, Status: CustomHealthStatus): UpdateInstanceCustomHealthStatusRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ServiceId = ServiceId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceCustomHealthStatusRequest]
  }
  
  @scala.inline
  implicit class UpdateInstanceCustomHealthStatusRequestMutableBuilder[Self <: UpdateInstanceCustomHealthStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: ResourceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: ResourceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: CustomHealthStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
