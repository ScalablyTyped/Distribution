package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterManagedInstanceRequest extends js.Object {
  /**
    * The ID assigned to the managed instance when you registered it using the activation process. 
    */
  var InstanceId: ManagedInstanceId = js.native
}

object DeregisterManagedInstanceRequest {
  @scala.inline
  def apply(InstanceId: ManagedInstanceId): DeregisterManagedInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeregisterManagedInstanceRequest]
  }
}

