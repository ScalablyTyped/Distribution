package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCommandRequest extends js.Object {
  /**
    * Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs. 
    */
  var CloudWatchOutputConfig: js.UndefOr[typings.awsSdk.ssmMod.CloudWatchOutputConfig] = js.native
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[typings.awsSdk.ssmMod.Comment] = js.native
  /**
    * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
    */
  var DocumentHash: js.UndefOr[typings.awsSdk.ssmMod.DocumentHash] = js.native
  /**
    * Sha256 or Sha1.  Sha1 hashes have been deprecated. 
    */
  var DocumentHashType: js.UndefOr[typings.awsSdk.ssmMod.DocumentHashType] = js.native
  /**
    * Required. The name of the Systems Manager document to run. This can be a public document or a custom document.
    */
  var DocumentName: DocumentARN = js.native
  /**
    * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number. If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you specify a version number, then you don't need to use the backslash. For example: --document-version "\$DEFAULT" --document-version "\$LATEST" --document-version "3"
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The IDs of the instances where the command should run. Specifying instance IDs is most useful when you are targeting a limited number of instances, though you can specify up to 50 IDs. To target a larger number of instances, or if you prefer not to list individual instance IDs, we recommend using the Targets option instead. Using Targets, which accepts tag key-value pairs to identify the instances to send commands to, you can a send command to tens, hundreds, or thousands of instances at once. For more information about how to use targets, see Using targets and rate controls to send commands to a fleet in the AWS Systems Manager User Guide.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.native
  /**
    * (Optional) The maximum number of instances that are allowed to run the command at the same time. You can specify a number such as 10 or a percentage such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see Using concurrency controls in the AWS Systems Manager User Guide.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the value of MaxErrors, the systems stops sending the command to additional targets. You can specify a number like 10 or a percentage like 10%. The default value is 0. For more information about how to use MaxErrors, see Using error controls in the AWS Systems Manager User Guide.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * Configurations for sending notifications.
    */
  var NotificationConfig: js.UndefOr[typings.awsSdk.ssmMod.NotificationConfig] = js.native
  /**
    * The name of the S3 bucket where command execution responses should be stored.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * The directory structure within the S3 bucket where the responses should be stored.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.native
  /**
    * The required and optional parameters specified in the document being run.
    */
  var Parameters: js.UndefOr[typings.awsSdk.ssmMod.Parameters] = js.native
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for Run Command commands.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  /**
    * An array of search criteria that targets instances using a Key,Value combination that you specify. Specifying targets is most useful when you want to send a command to a large number of instances at once. Using Targets, which accepts tag key-value pairs to identify instances, you can send a command to tens, hundreds, or thousands of instances at once. To send a command to a smaller number of instances, you can use the InstanceIds option instead. For more information about how to use targets, see Sending commands to a fleet in the AWS Systems Manager User Guide.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
  /**
    * If this time is reached and the command has not already started running, it will not run.
    */
  var TimeoutSeconds: js.UndefOr[typings.awsSdk.ssmMod.TimeoutSeconds] = js.native
}

object SendCommandRequest {
  @scala.inline
  def apply(DocumentName: DocumentARN): SendCommandRequest = {
    val __obj = js.Dynamic.literal(DocumentName = DocumentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCommandRequest]
  }
  @scala.inline
  implicit class SendCommandRequestOps[Self <: SendCommandRequest] (val x: Self) extends AnyVal {
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
    def setDocumentName(value: DocumentARN): Self = this.set("DocumentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudWatchOutputConfig(value: CloudWatchOutputConfig): Self = this.set("CloudWatchOutputConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchOutputConfig: Self = this.set("CloudWatchOutputConfig", js.undefined)
    @scala.inline
    def setComment(value: Comment): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
    @scala.inline
    def setDocumentHash(value: DocumentHash): Self = this.set("DocumentHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentHash: Self = this.set("DocumentHash", js.undefined)
    @scala.inline
    def setDocumentHashType(value: DocumentHashType): Self = this.set("DocumentHashType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentHashType: Self = this.set("DocumentHashType", js.undefined)
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = this.set("DocumentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentVersion: Self = this.set("DocumentVersion", js.undefined)
    @scala.inline
    def setInstanceIdsVarargs(value: InstanceId*): Self = this.set("InstanceIds", js.Array(value :_*))
    @scala.inline
    def setInstanceIds(value: InstanceIdList): Self = this.set("InstanceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceIds: Self = this.set("InstanceIds", js.undefined)
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = this.set("MaxConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("MaxConcurrency", js.undefined)
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = this.set("MaxErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxErrors: Self = this.set("MaxErrors", js.undefined)
    @scala.inline
    def setNotificationConfig(value: NotificationConfig): Self = this.set("NotificationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationConfig: Self = this.set("NotificationConfig", js.undefined)
    @scala.inline
    def setOutputS3BucketName(value: S3BucketName): Self = this.set("OutputS3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputS3BucketName: Self = this.set("OutputS3BucketName", js.undefined)
    @scala.inline
    def setOutputS3KeyPrefix(value: S3KeyPrefix): Self = this.set("OutputS3KeyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputS3KeyPrefix: Self = this.set("OutputS3KeyPrefix", js.undefined)
    @scala.inline
    def setOutputS3Region(value: S3Region): Self = this.set("OutputS3Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputS3Region: Self = this.set("OutputS3Region", js.undefined)
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setServiceRoleArn(value: ServiceRole): Self = this.set("ServiceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("ServiceRoleArn", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
    @scala.inline
    def setTimeoutSeconds(value: TimeoutSeconds): Self = this.set("TimeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("TimeoutSeconds", js.undefined)
  }
  
}

