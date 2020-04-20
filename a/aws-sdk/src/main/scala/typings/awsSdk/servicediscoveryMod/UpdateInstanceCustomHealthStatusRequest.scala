package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

