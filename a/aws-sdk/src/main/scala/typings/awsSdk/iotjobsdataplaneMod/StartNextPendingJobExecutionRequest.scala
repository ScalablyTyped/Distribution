package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartNextPendingJobExecutionRequest extends js.Object {
  
  /**
    * A collection of name/value pairs that describe the status of the job execution. If not specified, the statusDetails are unchanged.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.native
  
  /**
    * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not set to a terminal state before this timer expires, or before the timer is reset (by calling UpdateJobExecution, setting the status to IN_PROGRESS and specifying a new timeout value in field stepTimeoutInMinutes) the job execution status will be automatically set to TIMED_OUT. Note that setting this timeout has no effect on that job execution timeout which may have been specified when the job was created (CreateJob using field timeoutConfig).
    */
  var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.native
  
  /**
    * The name of the thing associated with the device.
    */
  var thingName: ThingName = js.native
}
object StartNextPendingJobExecutionRequest {
  
  @scala.inline
  def apply(thingName: ThingName): StartNextPendingJobExecutionRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartNextPendingJobExecutionRequest]
  }
  
  @scala.inline
  implicit class StartNextPendingJobExecutionRequestOps[Self <: StartNextPendingJobExecutionRequest] (val x: Self) extends AnyVal {
    
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
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    
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
