package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobListDescriptor extends StObject {
  
  /**
    * A timestamp indicating when the specified job was created.
    */
  var CreationTime: js.UndefOr[JobCreationTime] = js.undefined
  
  /**
    * The user-specified description that was included in the specified job's Create Job request.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.undefined
  
  /**
    * The ID for the specified job.
    */
  var JobId: js.UndefOr[typings.awsSdk.s3controlMod.JobId] = js.undefined
  
  /**
    * The operation that the specified job is configured to run on each object listed in the manifest.
    */
  var Operation: js.UndefOr[OperationName] = js.undefined
  
  /**
    * The current priority for the specified job.
    */
  var Priority: js.UndefOr[JobPriority] = js.undefined
  
  /**
    * Describes the total number of tasks that the specified job has run, the number of tasks that succeeded, and the number of tasks that failed.
    */
  var ProgressSummary: js.UndefOr[JobProgressSummary] = js.undefined
  
  /**
    * The specified job's current status.
    */
  var Status: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.
    */
  var TerminationDate: js.UndefOr[JobTerminationDate] = js.undefined
}
object JobListDescriptor {
  
  @scala.inline
  def apply(): JobListDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobListDescriptor]
  }
  
  @scala.inline
  implicit class JobListDescriptorMutableBuilder[Self <: JobListDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: JobCreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyMaxLength256String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setOperation(value: OperationName): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
    
    @scala.inline
    def setPriority(value: JobPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setProgressSummary(value: JobProgressSummary): Self = StObject.set(x, "ProgressSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressSummaryUndefined: Self = StObject.set(x, "ProgressSummary", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTerminationDate(value: JobTerminationDate): Self = StObject.set(x, "TerminationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationDateUndefined: Self = StObject.set(x, "TerminationDate", js.undefined)
  }
}
