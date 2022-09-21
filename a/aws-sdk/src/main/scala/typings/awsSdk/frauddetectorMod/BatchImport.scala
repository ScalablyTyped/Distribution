package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchImport extends StObject {
  
  /**
    * The ARN of the batch import job.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * Timestamp of when batch import job completed.
    */
  var completionTime: js.UndefOr[time] = js.undefined
  
  /**
    * The name of the event type.
    */
  var eventTypeName: js.UndefOr[identifier] = js.undefined
  
  /**
    * The number of records that failed to import. 
    */
  var failedRecordsCount: js.UndefOr[Integer_] = js.undefined
  
  /**
    * The reason batch import job failed.
    */
  var failureReason: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role to use for this job request.
    */
  var iamRoleArn: js.UndefOr[typings.awsSdk.frauddetectorMod.iamRoleArn] = js.undefined
  
  /**
    * The Amazon S3 location of your data file for batch import.
    */
  var inputPath: js.UndefOr[s3BucketLocation] = js.undefined
  
  /**
    * The ID of the batch import job. 
    */
  var jobId: js.UndefOr[identifier] = js.undefined
  
  /**
    * The Amazon S3 location of your output file.
    */
  var outputPath: js.UndefOr[s3BucketLocation] = js.undefined
  
  /**
    * The number of records processed by batch import job.
    */
  var processedRecordsCount: js.UndefOr[Integer_] = js.undefined
  
  /**
    * Timestamp of when the batch import job started.
    */
  var startTime: js.UndefOr[time] = js.undefined
  
  /**
    * The status of the batch import job.
    */
  var status: js.UndefOr[AsyncJobStatus] = js.undefined
  
  /**
    * The total number of records in the batch import job.
    */
  var totalRecordsCount: js.UndefOr[Integer_] = js.undefined
}
object BatchImport {
  
  inline def apply(): BatchImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchImport]
  }
  
  extension [Self <: BatchImport](x: Self) {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCompletionTime(value: time): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    inline def setFailedRecordsCount(value: Integer_): Self = StObject.set(x, "failedRecordsCount", value.asInstanceOf[js.Any])
    
    inline def setFailedRecordsCountUndefined: Self = StObject.set(x, "failedRecordsCount", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setIamRoleArn(value: iamRoleArn): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
    
    inline def setInputPath(value: s3BucketLocation): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
    
    inline def setInputPathUndefined: Self = StObject.set(x, "inputPath", js.undefined)
    
    inline def setJobId(value: identifier): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setOutputPath(value: s3BucketLocation): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setProcessedRecordsCount(value: Integer_): Self = StObject.set(x, "processedRecordsCount", value.asInstanceOf[js.Any])
    
    inline def setProcessedRecordsCountUndefined: Self = StObject.set(x, "processedRecordsCount", js.undefined)
    
    inline def setStartTime(value: time): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: AsyncJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotalRecordsCount(value: Integer_): Self = StObject.set(x, "totalRecordsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalRecordsCountUndefined: Self = StObject.set(x, "totalRecordsCount", js.undefined)
  }
}
