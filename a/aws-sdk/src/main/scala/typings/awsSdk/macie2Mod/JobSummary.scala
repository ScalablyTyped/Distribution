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
    * The current status of the job. Possible values are: CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job might also be cancelled if ownership of an S3 bucket changed while the job was running, and that change affected the job's access to the bucket. COMPLETE - Amazon Macie finished processing all the data specified for the job. IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This value doesn't apply to jobs that occur only once. PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your account. RUNNING - The job is in progress.
    */
  var jobStatus: js.UndefOr[JobStatus] = js.native
  /**
    * The schedule for running the job. Possible values are: ONE_TIME - The job ran or will run only once. SCHEDULED - The job runs on a daily, weekly, or monthly basis.
    */
  var jobType: js.UndefOr[JobType] = js.native
  /**
    * The custom name of the job.
    */
  var name: js.UndefOr[string] = js.native
}

object JobSummary {
  @scala.inline
  def apply(): JobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSummary]
  }
  @scala.inline
  implicit class JobSummaryOps[Self <: JobSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketDefinitionsVarargs(value: S3BucketDefinitionForJob*): Self = this.set("bucketDefinitions", js.Array(value :_*))
    @scala.inline
    def setBucketDefinitions(value: listOfS3BucketDefinitionForJob): Self = this.set("bucketDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketDefinitions: Self = this.set("bucketDefinitions", js.undefined)
    @scala.inline
    def setCreatedAt(value: timestampIso8601): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setJobId(value: string): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("jobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobStatus: Self = this.set("jobStatus", js.undefined)
    @scala.inline
    def setJobType(value: JobType): Self = this.set("jobType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobType: Self = this.set("jobType", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

