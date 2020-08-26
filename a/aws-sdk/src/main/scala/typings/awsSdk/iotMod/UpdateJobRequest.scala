package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobRequest extends js.Object {
  /**
    * Allows you to create criteria to abort a job.
    */
  var abortConfig: js.UndefOr[AbortConfig] = js.native
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.native
  /**
    * Allows you to create a staged rollout of the job.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.native
  /**
    * The ID of the job to be updated.
    */
  var jobId: JobId = js.native
  /**
    * Configuration information for pre-signed S3 URLs.
    */
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.native
  /**
    * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the time expires, it will be automatically set to TIMED_OUT. 
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
}

object UpdateJobRequest {
  @scala.inline
  def apply(jobId: JobId): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobRequest]
  }
  @scala.inline
  implicit class UpdateJobRequestOps[Self <: UpdateJobRequest] (val x: Self) extends AnyVal {
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
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbortConfig(value: AbortConfig): Self = this.set("abortConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortConfig: Self = this.set("abortConfig", js.undefined)
    @scala.inline
    def setDescription(value: JobDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setJobExecutionsRolloutConfig(value: JobExecutionsRolloutConfig): Self = this.set("jobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobExecutionsRolloutConfig: Self = this.set("jobExecutionsRolloutConfig", js.undefined)
    @scala.inline
    def setPresignedUrlConfig(value: PresignedUrlConfig): Self = this.set("presignedUrlConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresignedUrlConfig: Self = this.set("presignedUrlConfig", js.undefined)
    @scala.inline
    def setTimeoutConfig(value: TimeoutConfig): Self = this.set("timeoutConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutConfig: Self = this.set("timeoutConfig", js.undefined)
  }
  
}

