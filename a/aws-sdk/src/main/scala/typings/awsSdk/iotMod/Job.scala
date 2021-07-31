package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  /**
    * Configuration for criteria to abort the job.
    */
  var abortConfig: js.UndefOr[AbortConfig] = js.undefined
  
  /**
    * If the job was updated, describes the reason for the update.
    */
  var comment: js.UndefOr[Comment] = js.undefined
  
  /**
    * The time, in seconds since the epoch, when the job was completed.
    */
  var completedAt: js.UndefOr[DateType] = js.undefined
  
  /**
    * The time, in seconds since the epoch, when the job was created.
    */
  var createdAt: js.UndefOr[DateType] = js.undefined
  
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  
  /**
    * Will be true if the job was canceled with the optional force parameter set to true.
    */
  var forceCanceled: js.UndefOr[Forced] = js.undefined
  
  /**
    * An ARN identifying the job with format "arn:aws:iot:region:account:job/jobId".
    */
  var jobArn: js.UndefOr[JobArn] = js.undefined
  
  /**
    * Allows you to create a staged rollout of a job.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  
  /**
    * Details about the job process.
    */
  var jobProcessDetails: js.UndefOr[JobProcessDetails] = js.undefined
  
  /**
    * The time, in seconds since the epoch, when the job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
  
  /**
    * The namespace used to indicate that a job is a customer-managed job. When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that contain the value in the following format.  $aws/things/THING_NAME/jobs/JOB_ID/notify-namespace-NAMESPACE_ID/   The namespaceId feature is in public preview. 
    */
  var namespaceId: js.UndefOr[NamespaceId] = js.undefined
  
  /**
    * Configuration for pre-signed S3 URLs.
    */
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined
  
  /**
    * If the job was updated, provides the reason code for the update.
    */
  var reasonCode: js.UndefOr[ReasonCode] = js.undefined
  
  /**
    * The status of the job, one of IN_PROGRESS, CANCELED, DELETION_IN_PROGRESS or COMPLETED. 
    */
  var status: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a device when the thing representing the device is added to a target group, even after the job was completed by all things originally in the group. 
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.undefined
  
  /**
    * A list of IoT things and thing groups to which the job should be sent.
    */
  var targets: js.UndefOr[JobTargets] = js.undefined
  
  /**
    * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to TIMED_OUT.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
}
object Job {
  
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortConfig(value: AbortConfig): Self = StObject.set(x, "abortConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortConfigUndefined: Self = StObject.set(x, "abortConfig", js.undefined)
    
    @scala.inline
    def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCompletedAt(value: DateType): Self = StObject.set(x, "completedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedAtUndefined: Self = StObject.set(x, "completedAt", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: DateType): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setForceCanceled(value: Forced): Self = StObject.set(x, "forceCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceCanceledUndefined: Self = StObject.set(x, "forceCanceled", js.undefined)
    
    @scala.inline
    def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    @scala.inline
    def setJobExecutionsRolloutConfig(value: JobExecutionsRolloutConfig): Self = StObject.set(x, "jobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobExecutionsRolloutConfigUndefined: Self = StObject.set(x, "jobExecutionsRolloutConfig", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setJobProcessDetails(value: JobProcessDetails): Self = StObject.set(x, "jobProcessDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobProcessDetailsUndefined: Self = StObject.set(x, "jobProcessDetails", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: DateType): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setNamespaceId(value: NamespaceId): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    @scala.inline
    def setPresignedUrlConfig(value: PresignedUrlConfig): Self = StObject.set(x, "presignedUrlConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresignedUrlConfigUndefined: Self = StObject.set(x, "presignedUrlConfig", js.undefined)
    
    @scala.inline
    def setReasonCode(value: ReasonCode): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTargetSelection(value: TargetSelection): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSelectionUndefined: Self = StObject.set(x, "targetSelection", js.undefined)
    
    @scala.inline
    def setTargets(value: JobTargets): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: TargetArn*): Self = StObject.set(x, "targets", js.Array(value :_*))
    
    @scala.inline
    def setTimeoutConfig(value: TimeoutConfig): Self = StObject.set(x, "timeoutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutConfigUndefined: Self = StObject.set(x, "timeoutConfig", js.undefined)
  }
}
