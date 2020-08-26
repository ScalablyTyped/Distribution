package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClassificationJobResponse extends js.Object {
  /**
    * The token that was provided to ensure the idempotency of the request to create the job.
    */
  var clientToken: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.native
  /**
    * The custom data identifiers that the job uses to analyze data.
    */
  var customDataIdentifierIds: js.UndefOr[listOfString] = js.native
  /**
    * The custom description of the job.
    */
  var description: js.UndefOr[string] = js.native
  /**
    * Specifies whether the job has run for the first time.
    */
  var initialRun: js.UndefOr[boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var jobArn: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the job.
    */
  var jobId: js.UndefOr[string] = js.native
  /**
    * The current status of the job. Possible values are: CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job might also be cancelled if ownership of an S3 bucket changed while the job was running, and that change affected the job's access to the bucket. COMPLETE - Amazon Macie finished processing all the data specified for the job. IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This value doesn't apply to jobs that occur only once. PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your account. RUNNING - The job is in progress.
    */
  var jobStatus: js.UndefOr[JobStatus] = js.native
  /**
    * The schedule for running the job. Possible values are: ONE_TIME - The job ran or will run only once. SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates the recurrence pattern for the job.
    */
  var jobType: js.UndefOr[JobType] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job last ran.
    */
  var lastRunTime: js.UndefOr[timestampIso8601] = js.native
  /**
    * The custom name of the job.
    */
  var name: js.UndefOr[string] = js.native
  /**
    * The S3 buckets that the job is configured to analyze, and the scope of that analysis.
    */
  var s3JobDefinition: js.UndefOr[S3JobDefinition] = js.native
  /**
    * The sampling depth, as a percentage, that the job applies when it processes objects.
    */
  var samplingPercentage: js.UndefOr[integer] = js.native
  /**
    * The recurrence pattern for running the job. If the job is configured to run only once, this value is null.
    */
  var scheduleFrequency: js.UndefOr[JobScheduleFrequency] = js.native
  /**
    * The number of times that the job has run and processing statistics for the job's most recent run.
    */
  var statistics: js.UndefOr[Statistics] = js.native
  /**
    * A map of key-value pairs that identifies the tags (keys and values) that are associated with the classification job.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object DescribeClassificationJobResponse {
  @scala.inline
  def apply(): DescribeClassificationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClassificationJobResponse]
  }
  @scala.inline
  implicit class DescribeClassificationJobResponseOps[Self <: DescribeClassificationJobResponse] (val x: Self) extends AnyVal {
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
    def setClientToken(value: string): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setCreatedAt(value: timestampIso8601): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setCustomDataIdentifierIdsVarargs(value: string*): Self = this.set("customDataIdentifierIds", js.Array(value :_*))
    @scala.inline
    def setCustomDataIdentifierIds(value: listOfString): Self = this.set("customDataIdentifierIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDataIdentifierIds: Self = this.set("customDataIdentifierIds", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setInitialRun(value: boolean): Self = this.set("initialRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialRun: Self = this.set("initialRun", js.undefined)
    @scala.inline
    def setJobArn(value: string): Self = this.set("jobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobArn: Self = this.set("jobArn", js.undefined)
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
    def setLastRunTime(value: timestampIso8601): Self = this.set("lastRunTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastRunTime: Self = this.set("lastRunTime", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setS3JobDefinition(value: S3JobDefinition): Self = this.set("s3JobDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3JobDefinition: Self = this.set("s3JobDefinition", js.undefined)
    @scala.inline
    def setSamplingPercentage(value: integer): Self = this.set("samplingPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingPercentage: Self = this.set("samplingPercentage", js.undefined)
    @scala.inline
    def setScheduleFrequency(value: JobScheduleFrequency): Self = this.set("scheduleFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleFrequency: Self = this.set("scheduleFrequency", js.undefined)
    @scala.inline
    def setStatistics(value: Statistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

