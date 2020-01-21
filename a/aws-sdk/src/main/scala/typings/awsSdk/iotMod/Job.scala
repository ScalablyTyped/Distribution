package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    abortConfig: AbortConfig = null,
    comment: Comment = null,
    completedAt: DateType = null,
    createdAt: DateType = null,
    description: JobDescription = null,
    forceCanceled: js.UndefOr[scala.Boolean] = js.undefined,
    jobArn: JobArn = null,
    jobExecutionsRolloutConfig: JobExecutionsRolloutConfig = null,
    jobId: JobId = null,
    jobProcessDetails: JobProcessDetails = null,
    lastUpdatedAt: DateType = null,
    presignedUrlConfig: PresignedUrlConfig = null,
    reasonCode: ReasonCode = null,
    status: JobStatus = null,
    targetSelection: TargetSelection = null,
    targets: JobTargets = null,
    timeoutConfig: TimeoutConfig = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (abortConfig != null) __obj.updateDynamic("abortConfig")(abortConfig.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (completedAt != null) __obj.updateDynamic("completedAt")(completedAt.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCanceled)) __obj.updateDynamic("forceCanceled")(forceCanceled.asInstanceOf[js.Any])
    if (jobArn != null) __obj.updateDynamic("jobArn")(jobArn.asInstanceOf[js.Any])
    if (jobExecutionsRolloutConfig != null) __obj.updateDynamic("jobExecutionsRolloutConfig")(jobExecutionsRolloutConfig.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (jobProcessDetails != null) __obj.updateDynamic("jobProcessDetails")(jobProcessDetails.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (presignedUrlConfig != null) __obj.updateDynamic("presignedUrlConfig")(presignedUrlConfig.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (timeoutConfig != null) __obj.updateDynamic("timeoutConfig")(timeoutConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

