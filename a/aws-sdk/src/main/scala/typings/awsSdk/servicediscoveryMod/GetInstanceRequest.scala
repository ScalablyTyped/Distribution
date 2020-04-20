package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceRequest extends js.Object {
  /**
    * The ID of the instance that you want to get information about.
    */
  var InstanceId: ResourceId = js.native
  /**
    * The ID of the service that the instance is associated with.
    */
  var ServiceId: ResourceId = js.native
}

object GetInstanceRequest {
  @scala.inline
  def apply(InstanceId: ResourceId, ServiceId: ResourceId): GetInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceRequest]
  }
}

