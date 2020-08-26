package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTaskResponse extends js.Object {
  /**
    * The task that was stopped.
    */
  var task: js.UndefOr[Task] = js.native
}

object StopTaskResponse {
  @scala.inline
  def apply(): StopTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTaskResponse]
  }
  @scala.inline
  implicit class StopTaskResponseOps[Self <: StopTaskResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTask(value: Task): Self = this.set("task", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTask: Self = this.set("task", js.undefined)
  }
  
}

