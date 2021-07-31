package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartNextPendingJobExecutionRequest extends StObject {
  
  /**
    * A collection of name/value pairs that describe the status of the job execution. If not specified, the statusDetails are unchanged.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.undefined
  
  /**
    * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not set to a terminal state before this timer expires, or before the timer is reset (by calling UpdateJobExecution, setting the status to IN_PROGRESS and specifying a new timeout value in field stepTimeoutInMinutes) the job execution status will be automatically set to TIMED_OUT. Note that setting this timeout has no effect on that job execution timeout which may have been specified when the job was created (CreateJob using field timeoutConfig).
    */
  var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined
  
  /**
    * The name of the thing associated with the device.
    */
  var thingName: ThingName
}
object StartNextPendingJobExecutionRequest {
  
  @scala.inline
  def apply(thingName: ThingName): StartNextPendingJobExecutionRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartNextPendingJobExecutionRequest]
  }
  
  @scala.inline
  implicit class StartNextPendingJobExecutionRequestMutableBuilder[Self <: StartNextPendingJobExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusDetails(value: DetailsMap): Self = StObject.set(x, "statusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailsUndefined: Self = StObject.set(x, "statusDetails", js.undefined)
    
    @scala.inline
    def setStepTimeoutInMinutes(value: StepTimeoutInMinutes): Self = StObject.set(x, "stepTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepTimeoutInMinutesUndefined: Self = StObject.set(x, "stepTimeoutInMinutes", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
