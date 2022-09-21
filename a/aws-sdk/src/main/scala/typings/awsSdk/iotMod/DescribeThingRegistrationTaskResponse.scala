package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThingRegistrationTaskResponse extends StObject {
  
  /**
    * The task creation date.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of things that failed to be provisioned.
    */
  var failureCount: js.UndefOr[Count] = js.undefined
  
  /**
    * The S3 bucket that contains the input file.
    */
  var inputFileBucket: js.UndefOr[RegistryS3BucketName] = js.undefined
  
  /**
    * The input file key.
    */
  var inputFileKey: js.UndefOr[RegistryS3KeyName] = js.undefined
  
  /**
    * The date when the task was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The message.
    */
  var message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The progress of the bulk provisioning task expressed as a percentage.
    */
  var percentageProgress: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The role ARN that grants access to the input file bucket.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The status of the bulk thing provisioning task.
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The number of things successfully provisioned.
    */
  var successCount: js.UndefOr[Count] = js.undefined
  
  /**
    * The task ID.
    */
  var taskId: js.UndefOr[TaskId] = js.undefined
  
  /**
    * The task's template.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.undefined
}
object DescribeThingRegistrationTaskResponse {
  
  inline def apply(): DescribeThingRegistrationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThingRegistrationTaskResponse]
  }
  
  extension [Self <: DescribeThingRegistrationTaskResponse](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setFailureCount(value: Count): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    inline def setFailureCountUndefined: Self = StObject.set(x, "failureCount", js.undefined)
    
    inline def setInputFileBucket(value: RegistryS3BucketName): Self = StObject.set(x, "inputFileBucket", value.asInstanceOf[js.Any])
    
    inline def setInputFileBucketUndefined: Self = StObject.set(x, "inputFileBucket", js.undefined)
    
    inline def setInputFileKey(value: RegistryS3KeyName): Self = StObject.set(x, "inputFileKey", value.asInstanceOf[js.Any])
    
    inline def setInputFileKeyUndefined: Self = StObject.set(x, "inputFileKey", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPercentageProgress(value: Percentage): Self = StObject.set(x, "percentageProgress", value.asInstanceOf[js.Any])
    
    inline def setPercentageProgressUndefined: Self = StObject.set(x, "percentageProgress", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuccessCount(value: Count): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
  }
}
