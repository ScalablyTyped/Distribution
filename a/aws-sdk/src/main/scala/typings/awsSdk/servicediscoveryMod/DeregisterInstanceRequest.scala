package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterInstanceRequest extends js.Object {
  /**
    * The value that you specified for Id in the RegisterInstance request.
    */
  var InstanceId: ResourceId = js.native
  /**
    * The ID of the service that the instance is associated with.
    */
  var ServiceId: ResourceId = js.native
}

object DeregisterInstanceRequest {
  @scala.inline
  def apply(InstanceId: ResourceId, ServiceId: ResourceId): DeregisterInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterInstanceRequest]
  }
}

