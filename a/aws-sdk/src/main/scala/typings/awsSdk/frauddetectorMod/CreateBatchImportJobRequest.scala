package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBatchImportJobRequest extends StObject {
  
  /**
    * The name of the event type.
    */
  var eventTypeName: identifier
  
  /**
    * The ARN of the IAM role created for Amazon S3 bucket that holds your data file. The IAM role must have read and write permissions to both input and output S3 buckets.
    */
  var iamRoleArn: typings.awsSdk.frauddetectorMod.iamRoleArn
  
  /**
    * The URI that points to the Amazon S3 location of your data file.
    */
  var inputPath: s3BucketLocation
  
  /**
    * The ID of the batch import job. The ID cannot be of a past job, unless the job exists in CREATE_FAILED state.
    */
  var jobId: identifier
  
  /**
    * The URI that points to the Amazon S3 location for storing your results. 
    */
  var outputPath: s3BucketLocation
  
  /**
    * A collection of key-value pairs associated with this request. 
    */
  var tags: js.UndefOr[tagList] = js.undefined
}
object CreateBatchImportJobRequest {
  
  inline def apply(
    eventTypeName: identifier,
    iamRoleArn: iamRoleArn,
    inputPath: s3BucketLocation,
    jobId: identifier,
    outputPath: s3BucketLocation
  ): CreateBatchImportJobRequest = {
    val __obj = js.Dynamic.literal(eventTypeName = eventTypeName.asInstanceOf[js.Any], iamRoleArn = iamRoleArn.asInstanceOf[js.Any], inputPath = inputPath.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchImportJobRequest]
  }
  
  extension [Self <: CreateBatchImportJobRequest](x: Self) {
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArn(value: iamRoleArn): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInputPath(value: s3BucketLocation): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: identifier): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setOutputPath(value: s3BucketLocation): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
