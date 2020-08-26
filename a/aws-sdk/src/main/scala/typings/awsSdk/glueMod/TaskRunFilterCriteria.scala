package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRunFilterCriteria extends js.Object {
  /**
    * Filter on task runs started after this date.
    */
  var StartedAfter: js.UndefOr[Timestamp] = js.native
  /**
    * Filter on task runs started before this date.
    */
  var StartedBefore: js.UndefOr[Timestamp] = js.native
  /**
    * The current status of the task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  /**
    * The type of task run.
    */
  var TaskRunType: js.UndefOr[TaskType] = js.native
}

object TaskRunFilterCriteria {
  @scala.inline
  def apply(): TaskRunFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRunFilterCriteria]
  }
  @scala.inline
  implicit class TaskRunFilterCriteriaOps[Self <: TaskRunFilterCriteria] (val x: Self) extends AnyVal {
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
    def setStartedAfter(value: Timestamp): Self = this.set("StartedAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAfter: Self = this.set("StartedAfter", js.undefined)
    @scala.inline
    def setStartedBefore(value: Timestamp): Self = this.set("StartedBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedBefore: Self = this.set("StartedBefore", js.undefined)
    @scala.inline
    def setStatus(value: TaskStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTaskRunType(value: TaskType): Self = this.set("TaskRunType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskRunType: Self = this.set("TaskRunType", js.undefined)
  }
  
}

