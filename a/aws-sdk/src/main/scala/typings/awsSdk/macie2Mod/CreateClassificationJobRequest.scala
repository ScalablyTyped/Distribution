package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClassificationJobRequest extends StObject {
  
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: string
  
  /**
    * The custom data identifiers to use for data analysis and classification.
    */
  var customDataIdentifierIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A custom description of the job. The description can contain as many as 200 characters.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether to analyze all existing, eligible objects immediately after the job is created.
    */
  var initialRun: js.UndefOr[boolean] = js.undefined
  
  /**
    * The schedule for running the job. Valid values are: ONE_TIME - Run the job only once. If you specify this value, don't specify a value for the scheduleFrequency property. SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the scheduleFrequency property to define the recurrence pattern for the job.
    */
  var jobType: JobType
  
  /**
    * A custom name for the job. The name can contain as many as 500 characters.
    */
  var name: string
  
  /**
    * The S3 buckets that contain the objects to analyze, and the scope of that analysis.
    */
  var s3JobDefinition: S3JobDefinition
  
  /**
    * The sampling depth, as a percentage, to apply when processing objects. This value determines the percentage of eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects the objects to analyze at random, up to the specified percentage, and analyzes all the data in those objects.
    */
  var samplingPercentage: js.UndefOr[integer] = js.undefined
  
  /**
    * The recurrence pattern for running the job. To run the job only once, don't specify a value for this property and set the value for the jobType property to ONE_TIME.
    */
  var scheduleFrequency: js.UndefOr[JobScheduleFrequency] = js.undefined
  
  /**
    * A map of key-value pairs that specifies the tags to associate with the job. A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateClassificationJobRequest {
  
  @scala.inline
  def apply(clientToken: string, jobType: JobType, name: string, s3JobDefinition: S3JobDefinition): CreateClassificationJobRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], jobType = jobType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], s3JobDefinition = s3JobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClassificationJobRequest]
  }
  
  @scala.inline
  implicit class CreateClassificationJobRequestMutableBuilder[Self <: CreateClassificationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: string): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataIdentifierIds(value: listOfString): Self = StObject.set(x, "customDataIdentifierIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataIdentifierIdsUndefined: Self = StObject.set(x, "customDataIdentifierIds", js.undefined)
    
    @scala.inline
    def setCustomDataIdentifierIdsVarargs(value: string*): Self = StObject.set(x, "customDataIdentifierIds", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setInitialRun(value: boolean): Self = StObject.set(x, "initialRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRunUndefined: Self = StObject.set(x, "initialRun", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3JobDefinition(value: S3JobDefinition): Self = StObject.set(x, "s3JobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingPercentage(value: integer): Self = StObject.set(x, "samplingPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingPercentageUndefined: Self = StObject.set(x, "samplingPercentage", js.undefined)
    
    @scala.inline
    def setScheduleFrequency(value: JobScheduleFrequency): Self = StObject.set(x, "scheduleFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleFrequencyUndefined: Self = StObject.set(x, "scheduleFrequency", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
