package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExportTaskResponse extends js.Object {
  /**
    * The ID of the export task.
    */
  var taskId: js.UndefOr[ExportTaskId] = js.native
}

object CreateExportTaskResponse {
  @scala.inline
  def apply(): CreateExportTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateExportTaskResponse]
  }
  @scala.inline
  implicit class CreateExportTaskResponseOps[Self <: CreateExportTaskResponse] (val x: Self) extends AnyVal {
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
    def setTaskId(value: ExportTaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
  }
  
}

