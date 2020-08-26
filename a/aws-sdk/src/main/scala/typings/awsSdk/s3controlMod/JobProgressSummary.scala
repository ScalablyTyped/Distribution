package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobProgressSummary extends js.Object {
  /**
    * 
    */
  var NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed] = js.native
  /**
    * 
    */
  var NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded] = js.native
  /**
    * 
    */
  var TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks] = js.native
}

object JobProgressSummary {
  @scala.inline
  def apply(): JobProgressSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobProgressSummary]
  }
  @scala.inline
  implicit class JobProgressSummaryOps[Self <: JobProgressSummary] (val x: Self) extends AnyVal {
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
    def setNumberOfTasksFailed(value: JobNumberOfTasksFailed): Self = this.set("NumberOfTasksFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfTasksFailed: Self = this.set("NumberOfTasksFailed", js.undefined)
    @scala.inline
    def setNumberOfTasksSucceeded(value: JobNumberOfTasksSucceeded): Self = this.set("NumberOfTasksSucceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfTasksSucceeded: Self = this.set("NumberOfTasksSucceeded", js.undefined)
    @scala.inline
    def setTotalNumberOfTasks(value: JobTotalNumberOfTasks): Self = this.set("TotalNumberOfTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalNumberOfTasks: Self = this.set("TotalNumberOfTasks", js.undefined)
  }
  
}

