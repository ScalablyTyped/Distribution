package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeThingRegistrationTaskResponse extends js.Object {
  
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
  implicit class DescribeThingRegistrationTaskResponseOps[Self <: DescribeThingRegistrationTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setFailureCount(value: Count): Self = this.set("failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCount: Self = this.set("failureCount", js.undefined)
    
    @scala.inline
    def setInputFileBucket(value: RegistryS3BucketName): Self = this.set("inputFileBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFileBucket: Self = this.set("inputFileBucket", js.undefined)
    
    @scala.inline
    def setInputFileKey(value: RegistryS3KeyName): Self = this.set("inputFileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFileKey: Self = this.set("inputFileKey", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: LastModifiedDate): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setPercentageProgress(value: Percentage): Self = this.set("percentageProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentageProgress: Self = this.set("percentageProgress", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSuccessCount(value: Count): Self = this.set("successCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessCount: Self = this.set("successCount", js.undefined)
    
    @scala.inline
    def setTaskId(value: TaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateBody: Self = this.set("templateBody", js.undefined)
  }
}
