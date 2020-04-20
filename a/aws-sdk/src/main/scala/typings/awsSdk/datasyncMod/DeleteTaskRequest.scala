package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTaskRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the task to delete.
    */
  var TaskArn: typings.awsSdk.datasyncMod.TaskArn = js.native
}

object DeleteTaskRequest {
  @scala.inline
  def apply(TaskArn: TaskArn): DeleteTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTaskRequest]
  }
}

