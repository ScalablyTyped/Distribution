package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJobExecutionRequest extends js.Object {
  /**
    * (Optional) The expected current version of the job execution. Each time you update the job execution, its version is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned. (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job execution status data.)
    */
  var expectedVersion: js.UndefOr[ExpectedVersion] = js.native
  /**
    * (Optional) If true the job execution will be canceled if it has status IN_PROGRESS or QUEUED, otherwise the job execution will be canceled only if it has status QUEUED. If you attempt to cancel a job execution that is IN_PROGRESS, and you do not set force to true, then an InvalidStateTransitionException will be thrown. The default is false. Canceling a job execution which is "IN_PROGRESS", will cause the device to be unable to update the job execution status. Use caution and ensure that the device is able to recover to a valid state.
    */
  var force: js.UndefOr[ForceFlag] = js.native
  /**
    * The ID of the job to be canceled.
    */
  var jobId: JobId = js.native
  /**
    * A collection of name/value pairs that describe the status of the job execution. If not specified, the statusDetails are unchanged. You can specify at most 10 name/value pairs.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.native
  /**
    * The name of the thing whose execution of the job will be canceled.
    */
  var thingName: ThingName = js.native
}

object CancelJobExecutionRequest {
  @scala.inline
  def apply(jobId: JobId, thingName: ThingName): CancelJobExecutionRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobExecutionRequest]
  }
  @scala.inline
  implicit class CancelJobExecutionRequestOps[Self <: CancelJobExecutionRequest] (val x: Self) extends AnyVal {
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
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpectedVersion(value: ExpectedVersion): Self = this.set("expectedVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedVersion: Self = this.set("expectedVersion", js.undefined)
    @scala.inline
    def setForce(value: ForceFlag): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setStatusDetails(value: DetailsMap): Self = this.set("statusDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetails: Self = this.set("statusDetails", js.undefined)
  }
  
}

