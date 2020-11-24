package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends js.Object {
  
  /**
    * Configuration for criteria to abort the job.
    */
  var abortConfig: js.UndefOr[AbortConfig] = js.native
  
  /**
    * If the job was updated, describes the reason for the update.
    */
  var comment: js.UndefOr[Comment] = js.native
  
  /**
    * The time, in seconds since the epoch, when the job was completed.
    */
  var completedAt: js.UndefOr[DateType] = js.native
  
  /**
    * The time, in seconds since the epoch, when the job was created.
    */
  var createdAt: js.UndefOr[DateType] = js.native
  
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.native
  
  /**
    * Will be true if the job was canceled with the optional force parameter set to true.
    */
  var forceCanceled: js.UndefOr[Forced] = js.native
  
  /**
    * An ARN identifying the job with format "arn:aws:iot:region:account:job/jobId".
    */
  var jobArn: js.UndefOr[JobArn] = js.native
  
  /**
    * Allows you to create a staged rollout of a job.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.native
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.native
  
  /**
    * Details about the job process.
    */
  var jobProcessDetails: js.UndefOr[JobProcessDetails] = js.native
  
  /**
    * The time, in seconds since the epoch, when the job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  
  /**
    * The namespace used to indicate that a job is a customer-managed job. When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that contain the value in the following format.  $aws/things/THING_NAME/jobs/JOB_ID/notify-namespace-NAMESPACE_ID/   The namespaceId feature is in public preview. 
    */
  var namespaceId: js.UndefOr[NamespaceId] = js.native
  
  /**
    * Configuration for pre-signed S3 URLs.
    */
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.native
  
  /**
    * If the job was updated, provides the reason code for the update.
    */
  var reasonCode: js.UndefOr[ReasonCode] = js.native
  
  /**
    * The status of the job, one of IN_PROGRESS, CANCELED, DELETION_IN_PROGRESS or COMPLETED. 
    */
  var status: js.UndefOr[JobStatus] = js.native
  
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a device when the thing representing the device is added to a target group, even after the job was completed by all things originally in the group. 
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  
  /**
    * A list of IoT things and thing groups to which the job should be sent.
    */
  var targets: js.UndefOr[JobTargets] = js.native
  
  /**
    * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to TIMED_OUT.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
}
object Job {
  
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    
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
    def setAbortConfig(value: AbortConfig): Self = this.set("abortConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortConfig: Self = this.set("abortConfig", js.undefined)
    
    @scala.inline
    def setComment(value: Comment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCompletedAt(value: DateType): Self = this.set("completedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedAt: Self = this.set("completedAt", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: DateType): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setDescription(value: JobDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setForceCanceled(value: Forced): Self = this.set("forceCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceCanceled: Self = this.set("forceCanceled", js.undefined)
    
    @scala.inline
    def setJobArn(value: JobArn): Self = this.set("jobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobArn: Self = this.set("jobArn", js.undefined)
    
    @scala.inline
    def setJobExecutionsRolloutConfig(value: JobExecutionsRolloutConfig): Self = this.set("jobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobExecutionsRolloutConfig: Self = this.set("jobExecutionsRolloutConfig", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setJobProcessDetails(value: JobProcessDetails): Self = this.set("jobProcessDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobProcessDetails: Self = this.set("jobProcessDetails", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: DateType): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setNamespaceId(value: NamespaceId): Self = this.set("namespaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceId: Self = this.set("namespaceId", js.undefined)
    
    @scala.inline
    def setPresignedUrlConfig(value: PresignedUrlConfig): Self = this.set("presignedUrlConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresignedUrlConfig: Self = this.set("presignedUrlConfig", js.undefined)
    
    @scala.inline
    def setReasonCode(value: ReasonCode): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTargetSelection(value: TargetSelection): Self = this.set("targetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSelection: Self = this.set("targetSelection", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: TargetArn*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: JobTargets): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    
    @scala.inline
    def setTimeoutConfig(value: TimeoutConfig): Self = this.set("timeoutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutConfig: Self = this.set("timeoutConfig", js.undefined)
  }
}
