package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    creationDate: CreationDate = null,
    failureCount: js.UndefOr[Count] = js.undefined,
    inputFileBucket: RegistryS3BucketName = null,
    inputFileKey: RegistryS3KeyName = null,
    lastModifiedDate: LastModifiedDate = null,
    message: ErrorMessage = null,
    percentageProgress: js.UndefOr[Percentage] = js.undefined,
    roleArn: RoleArn = null,
    status: Status = null,
    successCount: js.UndefOr[Count] = js.undefined,
    taskId: TaskId = null,
    templateBody: TemplateBody = null
  ): DescribeThingRegistrationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(failureCount)) __obj.updateDynamic("failureCount")(failureCount.get.asInstanceOf[js.Any])
    if (inputFileBucket != null) __obj.updateDynamic("inputFileBucket")(inputFileBucket.asInstanceOf[js.Any])
    if (inputFileKey != null) __obj.updateDynamic("inputFileKey")(inputFileKey.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(percentageProgress)) __obj.updateDynamic("percentageProgress")(percentageProgress.get.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(successCount)) __obj.updateDynamic("successCount")(successCount.get.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    if (templateBody != null) __obj.updateDynamic("templateBody")(templateBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingRegistrationTaskResponse]
  }
}

