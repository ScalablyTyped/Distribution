package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelTaskExecutionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the task execution to cancel.
    */
  var TaskExecutionArn: typings.awsSdk.datasyncMod.TaskExecutionArn = js.native
}

object CancelTaskExecutionRequest {
  @scala.inline
  def apply(TaskExecutionArn: TaskExecutionArn): CancelTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskExecutionArn = TaskExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTaskExecutionRequest]
  }
  @scala.inline
  implicit class CancelTaskExecutionRequestOps[Self <: CancelTaskExecutionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTaskExecutionArn(value: TaskExecutionArn): Self = this.set("TaskExecutionArn", value.asInstanceOf[js.Any])
  }
  
}

