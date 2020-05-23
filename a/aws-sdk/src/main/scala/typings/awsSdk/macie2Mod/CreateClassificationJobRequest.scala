package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClassificationJobRequest extends js.Object {
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: string = js.native
  /**
    * The custom data identifiers to use for data analysis and classification.
    */
  var customDataIdentifierIds: js.UndefOr[listOfString] = js.native
  /**
    * A custom description of the job. The description can contain as many as 512 characters.
    */
  var description: js.UndefOr[string] = js.native
  /**
    * Specifies whether to run the job immediately, after it's created.
    */
  var initialRun: js.UndefOr[boolean] = js.native
  /**
    * The schedule for running the job. Valid values are: ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the scheduleFrequency property. SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the scheduleFrequency property to define the recurrence pattern for the job.
    */
  var jobType: JobType = js.native
  /**
    * A custom name for the job. The name must contain at least 3 characters and can contain as many as 64 characters.
    */
  var name: string = js.native
  /**
    * The S3 buckets that contain the objects to analyze, and the scope of that analysis.
    */
  var s3JobDefinition: S3JobDefinition = js.native
  /**
    * The sampling depth, as a percentage, to apply when processing objects. This value determines the percentage of eligible objects that the job analyzes. If the value is less than 100, Amazon Macie randomly selects the objects to analyze, up to the specified percentage.
    */
  var samplingPercentage: js.UndefOr[integer] = js.native
  /**
    * The recurrence pattern for running the job. To run the job only once, don't specify a value for this property and set the value of the jobType property to ONE_TIME.
    */
  var scheduleFrequency: js.UndefOr[JobScheduleFrequency] = js.native
  /**
    * A map of key-value pairs that specifies the tags to associate with the job. A job can have a maximum of 50 tags. Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateClassificationJobRequest {
  @scala.inline
  def apply(
    clientToken: string,
    jobType: JobType,
    name: string,
    s3JobDefinition: S3JobDefinition,
    customDataIdentifierIds: listOfString = null,
    description: string = null,
    initialRun: js.UndefOr[boolean] = js.undefined,
    samplingPercentage: js.UndefOr[integer] = js.undefined,
    scheduleFrequency: JobScheduleFrequency = null,
    tags: TagMap = null
  ): CreateClassificationJobRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], jobType = jobType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], s3JobDefinition = s3JobDefinition.asInstanceOf[js.Any])
    if (customDataIdentifierIds != null) __obj.updateDynamic("customDataIdentifierIds")(customDataIdentifierIds.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(initialRun)) __obj.updateDynamic("initialRun")(initialRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(samplingPercentage)) __obj.updateDynamic("samplingPercentage")(samplingPercentage.get.asInstanceOf[js.Any])
    if (scheduleFrequency != null) __obj.updateDynamic("scheduleFrequency")(scheduleFrequency.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClassificationJobRequest]
  }
}

