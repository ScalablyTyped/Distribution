package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecution extends StObject {
  
  /**
    * The estimated number of seconds that remain before the job execution status will be changed to TIMED_OUT.
    */
  var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.undefined
  
  /**
    * A number that identifies a particular job execution on a particular device. It can be used later in commands that return or update job execution information.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
  
  /**
    * The content of the job document.
    */
  var jobDocument: js.UndefOr[JobDocument] = js.undefined
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the job execution was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the job execution was enqueued.
    */
  var queuedAt: js.UndefOr[QueuedAt] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the job execution was started.
    */
  var startedAt: js.UndefOr[StartedAt] = js.undefined
  
  /**
    * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED", "REJECTED", or "REMOVED".
    */
  var status: js.UndefOr[JobExecutionStatus] = js.undefined
  
  /**
    * A collection of name/value pairs that describe the status of the job execution.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.undefined
  
  /**
    * The name of the thing that is executing the job.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
  
  /**
    * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
    */
  var versionNumber: js.UndefOr[VersionNumber] = js.undefined
}
object JobExecution {
  
  @scala.inline
  def apply(): JobExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecution]
  }
  
  @scala.inline
  implicit class JobExecutionMutableBuilder[Self <: JobExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproximateSecondsBeforeTimedOut(value: ApproximateSecondsBeforeTimedOut): Self = StObject.set(x, "approximateSecondsBeforeTimedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproximateSecondsBeforeTimedOutUndefined: Self = StObject.set(x, "approximateSecondsBeforeTimedOut", js.undefined)
    
    @scala.inline
    def setExecutionNumber(value: ExecutionNumber): Self = StObject.set(x, "executionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionNumberUndefined: Self = StObject.set(x, "executionNumber", js.undefined)
    
    @scala.inline
    def setJobDocument(value: JobDocument): Self = StObject.set(x, "jobDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDocumentUndefined: Self = StObject.set(x, "jobDocument", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: LastUpdatedAt): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setQueuedAt(value: QueuedAt): Self = StObject.set(x, "queuedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedAtUndefined: Self = StObject.set(x, "queuedAt", js.undefined)
    
    @scala.inline
    def setStartedAt(value: StartedAt): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    @scala.inline
    def setStatus(value: JobExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetails(value: DetailsMap): Self = StObject.set(x, "statusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailsUndefined: Self = StObject.set(x, "statusDetails", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
