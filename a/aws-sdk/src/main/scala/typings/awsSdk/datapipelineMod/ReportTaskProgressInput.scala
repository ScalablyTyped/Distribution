package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportTaskProgressInput extends js.Object {
  /**
    * Key-value pairs that define the properties of the ReportTaskProgressInput object.
    */
  var fields: js.UndefOr[fieldList] = js.native
  /**
    * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
    */
  var taskId: typings.awsSdk.datapipelineMod.taskId = js.native
}

object ReportTaskProgressInput {
  @scala.inline
  def apply(taskId: taskId): ReportTaskProgressInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskProgressInput]
  }
  @scala.inline
  implicit class ReportTaskProgressInputOps[Self <: ReportTaskProgressInput] (val x: Self) extends AnyVal {
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
    def setTaskId(value: taskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: fieldList): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

