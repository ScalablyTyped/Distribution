package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /**
    * Indication of the percentage completion of the task.
    */
  var ProgressPercent: js.UndefOr[typings.awsSdk.migrationhubMod.ProgressPercent] = js.native
  /**
    * Status of the task - Not Started, In-Progress, Complete.
    */
  var Status: typings.awsSdk.migrationhubMod.Status = js.native
  /**
    * Details of task status as notified by a migration tool. A tool might use this field to provide clarifying information about the status that is unique to that tool or that explains an error state.
    */
  var StatusDetail: js.UndefOr[typings.awsSdk.migrationhubMod.StatusDetail] = js.native
}

object Task {
  @scala.inline
  def apply(Status: Status): Task = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
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
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgressPercent(value: ProgressPercent): Self = this.set("ProgressPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressPercent: Self = this.set("ProgressPercent", js.undefined)
    @scala.inline
    def setStatusDetail(value: StatusDetail): Self = this.set("StatusDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetail: Self = this.set("StatusDetail", js.undefined)
  }
  
}

