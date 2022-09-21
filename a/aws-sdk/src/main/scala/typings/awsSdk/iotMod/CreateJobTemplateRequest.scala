package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobTemplateRequest extends StObject {
  
  var abortConfig: js.UndefOr[AbortConfig] = js.undefined
  
  /**
    * A description of the job document.
    */
  var description: JobDescription
  
  /**
    * The job document. Required if you don't specify a value for documentSource.
    */
  var document: js.UndefOr[JobDocument] = js.undefined
  
  /**
    * An S3 link to the job document to use in the template. Required if you don't specify a value for document.  If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document. The placeholder link is of the following form:  ${aws:iot:s3-presigned-url:https://s3.amazonaws.com/bucket/key}  where bucket is your bucket name and key is the object in the bucket to which you are linking. 
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.undefined
  
  /**
    * The ARN of the job to use as the basis for the job template.
    */
  var jobArn: js.UndefOr[JobArn] = js.undefined
  
  /**
    * Allows you to create the criteria to retry a job.
    */
  var jobExecutionsRetryConfig: js.UndefOr[JobExecutionsRetryConfig] = js.undefined
  
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined
  
  /**
    * A unique identifier for the job template. We recommend using a UUID. Alpha-numeric characters, "-", and "_" are valid for use here.
    */
  var jobTemplateId: JobTemplateId
  
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined
  
  /**
    * Metadata that can be used to manage the job template.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
}
object CreateJobTemplateRequest {
  
  inline def apply(description: JobDescription, jobTemplateId: JobTemplateId): CreateJobTemplateRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], jobTemplateId = jobTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobTemplateRequest]
  }
  
  extension [Self <: CreateJobTemplateRequest](x: Self) {
    
    inline def setAbortConfig(value: AbortConfig): Self = StObject.set(x, "abortConfig", value.asInstanceOf[js.Any])
    
    inline def setAbortConfigUndefined: Self = StObject.set(x, "abortConfig", js.undefined)
    
    inline def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: JobDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentSource(value: JobDocumentSource): Self = StObject.set(x, "documentSource", value.asInstanceOf[js.Any])
    
    inline def setDocumentSourceUndefined: Self = StObject.set(x, "documentSource", js.undefined)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    inline def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    inline def setJobExecutionsRetryConfig(value: JobExecutionsRetryConfig): Self = StObject.set(x, "jobExecutionsRetryConfig", value.asInstanceOf[js.Any])
    
    inline def setJobExecutionsRetryConfigUndefined: Self = StObject.set(x, "jobExecutionsRetryConfig", js.undefined)
    
    inline def setJobExecutionsRolloutConfig(value: JobExecutionsRolloutConfig): Self = StObject.set(x, "jobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    inline def setJobExecutionsRolloutConfigUndefined: Self = StObject.set(x, "jobExecutionsRolloutConfig", js.undefined)
    
    inline def setJobTemplateId(value: JobTemplateId): Self = StObject.set(x, "jobTemplateId", value.asInstanceOf[js.Any])
    
    inline def setPresignedUrlConfig(value: PresignedUrlConfig): Self = StObject.set(x, "presignedUrlConfig", value.asInstanceOf[js.Any])
    
    inline def setPresignedUrlConfigUndefined: Self = StObject.set(x, "presignedUrlConfig", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimeoutConfig(value: TimeoutConfig): Self = StObject.set(x, "timeoutConfig", value.asInstanceOf[js.Any])
    
    inline def setTimeoutConfigUndefined: Self = StObject.set(x, "timeoutConfig", js.undefined)
  }
}
