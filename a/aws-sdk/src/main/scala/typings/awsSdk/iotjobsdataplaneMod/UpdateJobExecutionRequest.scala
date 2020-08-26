package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobExecutionRequest extends js.Object {
  /**
    * Optional. A number that identifies a particular job execution on a particular device.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * Optional. The expected current version of the job execution. Each time you update the job execution, its version is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned. (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job execution status data.)
    */
  var expectedVersion: js.UndefOr[ExpectedVersion] = js.native
  /**
    * Optional. When set to true, the response contains the job document. The default is false.
    */
  var includeJobDocument: js.UndefOr[IncludeJobDocument] = js.native
  /**
    * Optional. When included and set to true, the response contains the JobExecutionState data. The default is false.
    */
  var includeJobExecutionState: js.UndefOr[IncludeExecutionState] = js.native
  /**
    * The unique identifier assigned to this job when it was created.
    */
  var jobId: JobId = js.native
  /**
    * The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified on every update.
    */
  var status: JobExecutionStatus = js.native
  /**
    *  Optional. A collection of name/value pairs that describe the status of the job execution. If not specified, the statusDetails are unchanged.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.native
  /**
    * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not set to a terminal state before this timer expires, or before the timer is reset (by again calling UpdateJobExecution, setting the status to IN_PROGRESS and specifying a new timeout value in this field) the job execution status will be automatically set to TIMED_OUT. Note that setting or resetting this timeout has no effect on that job execution timeout which may have been specified when the job was created (CreateJob using field timeoutConfig).
    */
  var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.native
  /**
    * The name of the thing associated with the device.
    */
  var thingName: ThingName = js.native
}

object UpdateJobExecutionRequest {
  @scala.inline
  def apply(jobId: JobId, status: JobExecutionStatus, thingName: ThingName): UpdateJobExecutionRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobExecutionRequest]
  }
  @scala.inline
  implicit class UpdateJobExecutionRequestOps[Self <: UpdateJobExecutionRequest] (val x: Self) extends AnyVal {
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
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: JobExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionNumber(value: ExecutionNumber): Self = this.set("executionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionNumber: Self = this.set("executionNumber", js.undefined)
    @scala.inline
    def setExpectedVersion(value: ExpectedVersion): Self = this.set("expectedVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedVersion: Self = this.set("expectedVersion", js.undefined)
    @scala.inline
    def setIncludeJobDocument(value: IncludeJobDocument): Self = this.set("includeJobDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeJobDocument: Self = this.set("includeJobDocument", js.undefined)
    @scala.inline
    def setIncludeJobExecutionState(value: IncludeExecutionState): Self = this.set("includeJobExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeJobExecutionState: Self = this.set("includeJobExecutionState", js.undefined)
    @scala.inline
    def setStatusDetails(value: DetailsMap): Self = this.set("statusDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetails: Self = this.set("statusDetails", js.undefined)
    @scala.inline
    def setStepTimeoutInMinutes(value: StepTimeoutInMinutes): Self = this.set("stepTimeoutInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepTimeoutInMinutes: Self = this.set("stepTimeoutInMinutes", js.undefined)
  }
  
}

