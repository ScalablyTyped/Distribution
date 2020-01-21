package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopThingRegistrationTaskRequest extends js.Object {
  /**
    * The bulk thing provisioning task ID.
    */
  var taskId: TaskId = js.native
}

object StopThingRegistrationTaskRequest {
  @scala.inline
  def apply(taskId: TaskId): StopThingRegistrationTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopThingRegistrationTaskRequest]
  }
}

