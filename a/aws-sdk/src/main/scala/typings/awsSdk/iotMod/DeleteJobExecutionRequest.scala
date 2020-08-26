package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJobExecutionRequest extends js.Object {
  /**
    * The ID of the job execution to be deleted. The executionNumber refers to the execution of a particular job on a particular device. Note that once a job execution is deleted, the executionNumber may be reused by IoT, so be sure you get and use the correct value here.
    */
  var executionNumber: ExecutionNumber = js.native
  /**
    * (Optional) When true, you can delete a job execution which is "IN_PROGRESS". Otherwise, you can only delete a job execution which is in a terminal state ("SUCCEEDED", "FAILED", "REJECTED", "REMOVED" or "CANCELED") or an exception will occur. The default is false.  Deleting a job execution which is "IN_PROGRESS", will cause the device to be unable to access job information or update the job execution status. Use caution and ensure that the device is able to recover to a valid state. 
    */
  var force: js.UndefOr[ForceFlag] = js.native
  /**
    * The ID of the job whose execution on a particular device will be deleted.
    */
  var jobId: JobId = js.native
  /**
    * The name of the thing whose job execution will be deleted.
    */
  var thingName: ThingName = js.native
}

object DeleteJobExecutionRequest {
  @scala.inline
  def apply(executionNumber: ExecutionNumber, jobId: JobId, thingName: ThingName): DeleteJobExecutionRequest = {
    val __obj = js.Dynamic.literal(executionNumber = executionNumber.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobExecutionRequest]
  }
  @scala.inline
  implicit class DeleteJobExecutionRequestOps[Self <: DeleteJobExecutionRequest] (val x: Self) extends AnyVal {
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
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def setForce(value: ForceFlag): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
  }
  
}

