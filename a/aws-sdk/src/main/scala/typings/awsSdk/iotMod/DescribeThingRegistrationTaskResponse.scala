package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeThingRegistrationTaskResponse extends StObject {
  
  /**
    * The task creation date.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  
  /**
    * The number of things that failed to be provisioned.
    */
  var failureCount: js.UndefOr[Count] = js.native
  
  /**
    * The S3 bucket that contains the input file.
    */
  var inputFileBucket: js.UndefOr[RegistryS3BucketName] = js.native
  
  /**
    * The input file key.
    */
  var inputFileKey: js.UndefOr[RegistryS3KeyName] = js.native
  
  /**
    * The date when the task was last modified.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.native
  
  /**
    * The message.
    */
  var message: js.UndefOr[ErrorMessage] = js.native
  
  /**
    * The progress of the bulk provisioning task expressed as a percentage.
    */
  var percentageProgress: js.UndefOr[Percentage] = js.native
  
  /**
    * The role ARN that grants access to the input file bucket.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * The status of the bulk thing provisioning task.
    */
  var status: js.UndefOr[Status] = js.native
  
  /**
    * The number of things successfully provisioned.
    */
  var successCount: js.UndefOr[Count] = js.native
  
  /**
    * The task ID.
    */
  var taskId: js.UndefOr[TaskId] = js.native
  
  /**
    * The task's template.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.native
}
object DescribeThingRegistrationTaskResponse {
  
  @scala.inline
  def apply(): DescribeThingRegistrationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThingRegistrationTaskResponse]
  }
  
  @scala.inline
  implicit class DescribeThingRegistrationTaskResponseMutableBuilder[Self <: DescribeThingRegistrationTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setFailureCount(value: Count): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCountUndefined: Self = StObject.set(x, "failureCount", js.undefined)
    
    @scala.inline
    def setInputFileBucket(value: RegistryS3BucketName): Self = StObject.set(x, "inputFileBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFileBucketUndefined: Self = StObject.set(x, "inputFileBucket", js.undefined)
    
    @scala.inline
    def setInputFileKey(value: RegistryS3KeyName): Self = StObject.set(x, "inputFileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFileKeyUndefined: Self = StObject.set(x, "inputFileKey", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: LastModifiedDate): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPercentageProgress(value: Percentage): Self = StObject.set(x, "percentageProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageProgressUndefined: Self = StObject.set(x, "percentageProgress", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSuccessCount(value: Count): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
    
    @scala.inline
    def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
  }
}
