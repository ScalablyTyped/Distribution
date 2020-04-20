package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignInstanceRequest extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
  /**
    * The layer ID, which must correspond to a custom layer. You cannot assign a registered instance to a built-in layer.
    */
  var LayerIds: Strings = js.native
}

object AssignInstanceRequest {
  @scala.inline
  def apply(InstanceId: String, LayerIds: Strings): AssignInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], LayerIds = LayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignInstanceRequest]
  }
}

