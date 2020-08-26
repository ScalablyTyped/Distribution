package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecution extends js.Object {
  /**
    * The estimated number of seconds that remain before the job execution status will be changed to TIMED_OUT. The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The actual job execution timeout can occur up to 60 seconds later than the estimated duration. This value will not be included if the job execution has reached a terminal status.
    */
  var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.native
  /**
    * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this particular device. It can be used in commands which return or update job execution information. 
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * Will be true if the job execution was canceled with the optional force parameter set to true.
    */
  var forceCanceled: js.UndefOr[Forced] = js.native
  /**
    * The unique identifier you assigned to the job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.native
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
    * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCEEDED, TIMED_OUT, CANCELED, or REJECTED).
    */
  var status: js.UndefOr[JobExecutionStatus] = js.native
  /**
    * A collection of name/value pairs that describe the status of the job execution.
    */
  var statusDetails: js.UndefOr[JobExecutionStatusDetails] = js.native
  /**
    * The ARN of the thing on which the job execution is running.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
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
    def setForceCanceled(value: Forced): Self = this.set("forceCanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceCanceled: Self = this.set("forceCanceled", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
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
    @scala.inline
    def setStatusDetails(value: JobExecutionStatusDetails): Self = this.set("statusDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetails: Self = this.set("statusDetails", js.undefined)
    @scala.inline
    def setThingArn(value: ThingArn): Self = this.set("thingArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingArn: Self = this.set("thingArn", js.undefined)
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = this.set("versionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionNumber: Self = this.set("versionNumber", js.undefined)
  }
  
}

