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
    * A custom description of the job. The description can contain as many as 200 characters.
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
    * A custom name for the job. The name can contain as many as 500 characters.
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
  def apply(clientToken: string, jobType: JobType, name: string, s3JobDefinition: S3JobDefinition): CreateClassificationJobRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], jobType = jobType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], s3JobDefinition = s3JobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClassificationJobRequest]
  }
  @scala.inline
  implicit class CreateClassificationJobRequestOps[Self <: CreateClassificationJobRequest] (val x: Self) extends AnyVal {
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
    def setJobType(value: JobType): Self = this.set("jobType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: string): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3JobDefinition(value: S3JobDefinition): Self = this.set("s3JobDefinition", value.asInstanceOf[js.Any])
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
    def setSamplingPercentage(value: integer): Self = this.set("samplingPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingPercentage: Self = this.set("samplingPercentage", js.undefined)
    @scala.inline
    def setScheduleFrequency(value: JobScheduleFrequency): Self = this.set("scheduleFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleFrequency: Self = this.set("scheduleFrequency", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

