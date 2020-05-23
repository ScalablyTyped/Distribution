package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSummary extends js.Object {
  /**
    * The S3 buckets that the job is configured to analyze.
    */
  var bucketDefinitions: js.UndefOr[listOfS3BucketDefinitionForJob] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.native
  /**
    * The unique identifier for the job.
    */
  var jobId: js.UndefOr[string] = js.native
  /**
    * The current status of the job. Possible value are: CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job might also be cancelled if ownership of an S3 bucket changed while the job was running, and that change affected the job's access to the bucket. COMPLETE - Amazon Macie finished processing all the data specified for the job. IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This value doesn't apply to jobs that occur only once. PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your account. RUNNING - The job is in progress.
    */
  var jobStatus: js.UndefOr[JobStatus] = js.native
  /**
    * The schedule for running the job. Possible value are: ONE_TIME - The job ran or will run only once. SCHEDULED - The job runs on a daily, weekly, or monthly basis.
    */
  var jobType: js.UndefOr[JobType] = js.native
  /**
    * The custom name of the job.
    */
  var name: js.UndefOr[string] = js.native
}

object JobSummary {
  @scala.inline
  def apply(
    bucketDefinitions: listOfS3BucketDefinitionForJob = null,
    createdAt: timestampIso8601 = null,
    jobId: string = null,
    jobStatus: JobStatus = null,
    jobType: JobType = null,
    name: string = null
  ): JobSummary = {
    val __obj = js.Dynamic.literal()
    if (bucketDefinitions != null) __obj.updateDynamic("bucketDefinitions")(bucketDefinitions.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (jobStatus != null) __obj.updateDynamic("jobStatus")(jobStatus.asInstanceOf[js.Any])
    if (jobType != null) __obj.updateDynamic("jobType")(jobType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSummary]
  }
}

