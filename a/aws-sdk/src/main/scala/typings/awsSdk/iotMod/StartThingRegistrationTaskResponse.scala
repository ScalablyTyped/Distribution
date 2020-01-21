package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartThingRegistrationTaskResponse extends js.Object {
  /**
    * The bulk thing provisioning task ID.
    */
  var taskId: js.UndefOr[TaskId] = js.native
}

object StartThingRegistrationTaskResponse {
  @scala.inline
  def apply(taskId: TaskId = null): StartThingRegistrationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartThingRegistrationTaskResponse]
  }
}

