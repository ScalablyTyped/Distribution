package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobExecutionSummary extends StObject {
  
  /**
    * A number that identifies a particular job execution on a particular device.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  
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
    * The time, in milliseconds since the epoch, when the job execution started.
    */
  var startedAt: js.UndefOr[StartedAt] = js.native
  
  /**
    * The version of the job execution. Job execution versions are incremented each time AWS IoT Jobs receives an update from a device.
    */
  var versionNumber: js.UndefOr[VersionNumber] = js.native
}
object JobExecutionSummary {
  
  @scala.inline
  def apply(): JobExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSummary]
  }
  
  @scala.inline
  implicit class JobExecutionSummaryMutableBuilder[Self <: JobExecutionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionNumber(value: ExecutionNumber): Self = StObject.set(x, "executionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionNumberUndefined: Self = StObject.set(x, "executionNumber", js.undefined)
    
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
    def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
