package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImportLabelsTaskRunResponse extends js.Object {
  /**
    * The unique identifier for the task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}

object StartImportLabelsTaskRunResponse {
  @scala.inline
  def apply(): StartImportLabelsTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImportLabelsTaskRunResponse]
  }
  @scala.inline
  implicit class StartImportLabelsTaskRunResponseOps[Self <: StartImportLabelsTaskRunResponse] (val x: Self) extends AnyVal {
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
    def setTaskRunId(value: HashString): Self = this.set("TaskRunId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskRunId: Self = this.set("TaskRunId", js.undefined)
  }
  
}

