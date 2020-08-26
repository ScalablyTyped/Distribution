package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecution extends js.Object {
  /**
    * The estimated number of seconds that remain before the job execution status will be changed to TIMED_OUT.
    */
  var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.native
  /**
    * A number that identifies a particular job execution on a particular device. It can be used later in commands that return or update job execution information.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * The content of the job document.
    */
  var jobDocument: js.UndefOr[JobDocument] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution was enqueued.
    */
  var queuedAt: js.UndefOr[QueuedAt] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution was started.
    */
  var startedAt: js.UndefOr[StartedAt] = js.native
  /**
    * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED", "REJECTED", or "REMOVED".
    */
  var status: js.UndefOr[JobExecutionStatus] = js.native
  /**
    * A collection of name/value pairs that describe the status of the job execution.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.native
  /**
    * The name of the thing that is executing the job.
    */
  var thingName: js.UndefOr[ThingName] = js.native
  /**
    * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
    */
  var versionNumber: js.UndefOr[VersionNumber] = js.native
}

object JobExecution {
  @scala.inline
  def apply(): JobExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecution]
  }
  @scala.inline
  implicit class JobExecutionOps[Self <: JobExecution] (val x: Self) extends AnyVal {
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
    def setApproximateSecondsBeforeTimedOut(value: ApproximateSecondsBeforeTimedOut): Self = this.set("approximateSecondsBeforeTimedOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproximateSecondsBeforeTimedOut: Self = this.set("approximateSecondsBeforeTimedOut", js.undefined)
    @scala.inline
    def setExecutionNumber(value: ExecutionNumber): Self = this.set("executionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionNumber: Self = this.set("executionNumber", js.undefined)
    @scala.inline
    def setJobDocument(value: JobDocument): Self = this.set("jobDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobDocument: Self = this.set("jobDocument", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: LastUpdatedAt): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    @scala.inline
    def setQueuedAt(value: QueuedAt): Self = this.set("queuedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueuedAt: Self = this.set("queuedAt", js.undefined)
    @scala.inline
    def setStartedAt(value: StartedAt): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAt: Self = this.set("startedAt", js.undefined)
    @scala.inline
    def setStatus(value: JobExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusDetails(value: DetailsMap): Self = this.set("statusDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetails: Self = this.set("statusDetails", js.undefined)
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = this.set("versionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionNumber: Self = this.set("versionNumber", js.undefined)
  }
  
}

