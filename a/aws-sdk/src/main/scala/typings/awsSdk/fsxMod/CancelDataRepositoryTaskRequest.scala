package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelDataRepositoryTaskRequest extends js.Object {
  /**
    * Specifies the data repository task to cancel.
    */
  var TaskId: typings.awsSdk.fsxMod.TaskId = js.native
}

object CancelDataRepositoryTaskRequest {
  @scala.inline
  def apply(TaskId: TaskId): CancelDataRepositoryTaskRequest = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDataRepositoryTaskRequest]
  }
}

