package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionSummary extends js.Object {
  /**
    * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this particular device. It can be used later in commands which return or update job execution information.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * The time, in seconds since the epoch, when the job execution was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  /**
    * The time, in seconds since the epoch, when the job execution was queued.
    */
  var queuedAt: js.UndefOr[DateType] = js.native
  /**
    * The time, in seconds since the epoch, when the job execution started.
    */
  var startedAt: js.UndefOr[DateType] = js.native
  /**
    * The status of the job execution.
    */
  var status: js.UndefOr[JobExecutionStatus] = js.native
}

object JobExecutionSummary {
  @scala.inline
  def apply(): JobExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSummary]
  }
  @scala.inline
  implicit class JobExecutionSummaryOps[Self <: JobExecutionSummary] (val x: Self) extends AnyVal {
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
    def setExecutionNumber(value: ExecutionNumber): Self = this.set("executionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionNumber: Self = this.set("executionNumber", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: DateType): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    @scala.inline
    def setQueuedAt(value: DateType): Self = this.set("queuedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueuedAt: Self = this.set("queuedAt", js.undefined)
    @scala.inline
    def setStartedAt(value: DateType): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAt: Self = this.set("startedAt", js.undefined)
    @scala.inline
    def setStatus(value: JobExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

