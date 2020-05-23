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
    * The current status of the job. Possible value are: CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job might also be cancelled if ownership of an S3 bucket changed while the job was running, and that change affected the job's access to the bucket. COMPLETE - Amazon Macie finished processing all the data specified for the job. IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This value doesn't apply to jobs that occur only once. PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your account. RUNNING - The job is in progress.
    */
  var jobStatus: js.UndefOr[JobStatus] = js.native
  /**
    * The schedule for running the job. Possible value are: ONE_TIME - The job ran or will run only once. SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates the recurrence pattern for the job.
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
    * The recurrence pattern for running the job. If the job is configured to run every day, this value is an empty dailySchedule object. If the job is configured to run only once, this value is null.
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
  def apply(
    clientToken: string = null,
    createdAt: timestampIso8601 = null,
    customDataIdentifierIds: listOfString = null,
    description: string = null,
    initialRun: js.UndefOr[boolean] = js.undefined,
    jobArn: string = null,
    jobId: string = null,
    jobStatus: JobStatus = null,
    jobType: JobType = null,
    lastRunTime: timestampIso8601 = null,
    name: string = null,
    s3JobDefinition: S3JobDefinition = null,
    samplingPercentage: js.UndefOr[integer] = js.undefined,
    scheduleFrequency: JobScheduleFrequency = null,
    statistics: Statistics = null,
    tags: TagMap = null
  ): DescribeClassificationJobResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (customDataIdentifierIds != null) __obj.updateDynamic("customDataIdentifierIds")(customDataIdentifierIds.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(initialRun)) __obj.updateDynamic("initialRun")(initialRun.get.asInstanceOf[js.Any])
    if (jobArn != null) __obj.updateDynamic("jobArn")(jobArn.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (jobStatus != null) __obj.updateDynamic("jobStatus")(jobStatus.asInstanceOf[js.Any])
    if (jobType != null) __obj.updateDynamic("jobType")(jobType.asInstanceOf[js.Any])
    if (lastRunTime != null) __obj.updateDynamic("lastRunTime")(lastRunTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (s3JobDefinition != null) __obj.updateDynamic("s3JobDefinition")(s3JobDefinition.asInstanceOf[js.Any])
    if (!js.isUndefined(samplingPercentage)) __obj.updateDynamic("samplingPercentage")(samplingPercentage.get.asInstanceOf[js.Any])
    if (scheduleFrequency != null) __obj.updateDynamic("scheduleFrequency")(scheduleFrequency.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClassificationJobResponse]
  }
}

