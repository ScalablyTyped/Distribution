package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobDescriptor extends StObject {
  
  /**
    * Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.
    */
  var ConfirmationRequired: js.UndefOr[typings.awsSdk.s3controlMod.ConfirmationRequired] = js.native
  
  /**
    * A timestamp indicating when this job was created.
    */
  var CreationTime: js.UndefOr[JobCreationTime] = js.native
  
  /**
    * The description for this job, if one was provided in this job's Create Job request.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.native
  
  /**
    * If the specified job failed, this field contains information describing the failure.
    */
  var FailureReasons: js.UndefOr[JobFailureList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for this job.
    */
  var JobArn: js.UndefOr[typings.awsSdk.s3controlMod.JobArn] = js.native
  
  /**
    * The ID for the specified job.
    */
  var JobId: js.UndefOr[typings.awsSdk.s3controlMod.JobId] = js.native
  
  /**
    * The configuration information for the specified job's manifest object.
    */
  var Manifest: js.UndefOr[JobManifest] = js.native
  
  /**
    * The operation that the specified job is configured to run on the objects listed in the manifest.
    */
  var Operation: js.UndefOr[JobOperation] = js.native
  
  /**
    * The priority of the specified job.
    */
  var Priority: js.UndefOr[JobPriority] = js.native
  
  /**
    * Describes the total number of tasks that the specified job has run, the number of tasks that succeeded, and the number of tasks that failed.
    */
  var ProgressSummary: js.UndefOr[JobProgressSummary] = js.native
  
  /**
    * Contains the configuration information for the job-completion report if you requested one in the Create Job request.
    */
  var Report: js.UndefOr[JobReport] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role assigned to run the tasks for this job.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.native
  
  /**
    * The current status of the specified job.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  
  /**
    * The reason for updating the job.
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.native
  
  /**
    * The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3 console. When you create the job, it enters the Suspended state to await confirmation before running. After you confirm the job, it automatically exits the Suspended state.
    */
  var SuspendedCause: js.UndefOr[typings.awsSdk.s3controlMod.SuspendedCause] = js.native
  
  /**
    * The timestamp when this job was suspended, if it has been suspended.
    */
  var SuspendedDate: js.UndefOr[typings.awsSdk.s3controlMod.SuspendedDate] = js.native
  
  /**
    * A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.
    */
  var TerminationDate: js.UndefOr[JobTerminationDate] = js.native
}
object JobDescriptor {
  
  @scala.inline
  def apply(): JobDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDescriptor]
  }
  
  @scala.inline
  implicit class JobDescriptorMutableBuilder[Self <: JobDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmationRequired(value: ConfirmationRequired): Self = StObject.set(x, "ConfirmationRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationRequiredUndefined: Self = StObject.set(x, "ConfirmationRequired", js.undefined)
    
    @scala.inline
    def setCreationTime(value: JobCreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyMaxLength256String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFailureReasons(value: JobFailureList): Self = StObject.set(x, "FailureReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonsUndefined: Self = StObject.set(x, "FailureReasons", js.undefined)
    
    @scala.inline
    def setFailureReasonsVarargs(value: JobFailure*): Self = StObject.set(x, "FailureReasons", js.Array(value :_*))
    
    @scala.inline
    def setJobArn(value: JobArn): Self = StObject.set(x, "JobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobArnUndefined: Self = StObject.set(x, "JobArn", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setManifest(value: JobManifest): Self = StObject.set(x, "Manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "Manifest", js.undefined)
    
    @scala.inline
    def setOperation(value: JobOperation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
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
    def setReport(value: JobReport): Self = StObject.set(x, "Report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportUndefined: Self = StObject.set(x, "Report", js.undefined)
    
    @scala.inline
    def setRoleArn(value: IAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStatusUpdateReason(value: JobStatusUpdateReason): Self = StObject.set(x, "StatusUpdateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUpdateReasonUndefined: Self = StObject.set(x, "StatusUpdateReason", js.undefined)
    
    @scala.inline
    def setSuspendedCause(value: SuspendedCause): Self = StObject.set(x, "SuspendedCause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendedCauseUndefined: Self = StObject.set(x, "SuspendedCause", js.undefined)
    
    @scala.inline
    def setSuspendedDate(value: SuspendedDate): Self = StObject.set(x, "SuspendedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendedDateUndefined: Self = StObject.set(x, "SuspendedDate", js.undefined)
    
    @scala.inline
    def setTerminationDate(value: JobTerminationDate): Self = StObject.set(x, "TerminationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationDateUndefined: Self = StObject.set(x, "TerminationDate", js.undefined)
  }
}
