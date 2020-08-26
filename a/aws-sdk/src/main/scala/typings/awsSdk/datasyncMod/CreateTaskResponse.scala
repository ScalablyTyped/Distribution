package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTaskResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var TaskArn: js.UndefOr[typings.awsSdk.datasyncMod.TaskArn] = js.native
}

object CreateTaskResponse {
  @scala.inline
  def apply(): CreateTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTaskResponse]
  }
  @scala.inline
  implicit class CreateTaskResponseOps[Self <: CreateTaskResponse] (val x: Self) extends AnyVal {
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
    def setTaskArn(value: TaskArn): Self = this.set("TaskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskArn: Self = this.set("TaskArn", js.undefined)
  }
  
}

