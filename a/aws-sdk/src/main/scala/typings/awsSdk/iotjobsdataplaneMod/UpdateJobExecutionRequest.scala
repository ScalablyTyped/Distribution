package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobExecutionRequest extends StObject {
  
  /**
    * Optional. A number that identifies a particular job execution on a particular device.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
  
  /**
    * Optional. The expected current version of the job execution. Each time you update the job execution, its version is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned. (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job execution status data.)
    */
  var expectedVersion: js.UndefOr[ExpectedVersion] = js.undefined
  
  /**
    * Optional. When set to true, the response contains the job document. The default is false.
    */
  var includeJobDocument: js.UndefOr[IncludeJobDocument] = js.undefined
  
  /**
    * Optional. When included and set to true, the response contains the JobExecutionState data. The default is false.
    */
  var includeJobExecutionState: js.UndefOr[IncludeExecutionState] = js.undefined
  
  /**
    * The unique identifier assigned to this job when it was created.
    */
  var jobId: JobId
  
  /**
    * The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified on every update.
    */
  var status: JobExecutionStatus
  
  /**
    *  Optional. A collection of name/value pairs that describe the status of the job execution. If not specified, the statusDetails are unchanged.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.undefined
  
  /**
    * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not set to a terminal state before this timer expires, or before the timer is reset (by again calling UpdateJobExecution, setting the status to IN_PROGRESS and specifying a new timeout value in this field) the job execution status will be automatically set to TIMED_OUT. Note that setting or resetting this timeout has no effect on that job execution timeout which may have been specified when the job was created (CreateJob using field timeoutConfig).
    */
  var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined
  
  /**
    * The name of the thing associated with the device.
    */
  var thingName: ThingName
}
object UpdateJobExecutionRequest {
  
  @scala.inline
  def apply(jobId: JobId, status: JobExecutionStatus, thingName: ThingName): UpdateJobExecutionRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobExecutionRequest]
  }
  
  @scala.inline
  implicit class UpdateJobExecutionRequestMutableBuilder[Self <: UpdateJobExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionNumber(value: ExecutionNumber): Self = StObject.set(x, "executionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionNumberUndefined: Self = StObject.set(x, "executionNumber", js.undefined)
    
    @scala.inline
    def setExpectedVersion(value: ExpectedVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    @scala.inline
    def setIncludeJobDocument(value: IncludeJobDocument): Self = StObject.set(x, "includeJobDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeJobDocumentUndefined: Self = StObject.set(x, "includeJobDocument", js.undefined)
    
    @scala.inline
    def setIncludeJobExecutionState(value: IncludeExecutionState): Self = StObject.set(x, "includeJobExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeJobExecutionStateUndefined: Self = StObject.set(x, "includeJobExecutionState", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: JobExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
