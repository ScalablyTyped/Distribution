package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowRunCommandParameters extends js.Object {
  var CloudWatchOutputConfig: js.UndefOr[typings.awsSdk.ssmMod.CloudWatchOutputConfig] = js.native
  /**
    * Information about the commands to run.
    */
  var Comment: js.UndefOr[typings.awsSdk.ssmMod.Comment] = js.native
  /**
    * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
    */
  var DocumentHash: js.UndefOr[typings.awsSdk.ssmMod.DocumentHash] = js.native
  /**
    * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
    */
  var DocumentHashType: js.UndefOr[typings.awsSdk.ssmMod.DocumentHashType] = js.native
  /**
    * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number. If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you specify a version number, then you don't need to use the backslash. For example: --document-version "\$DEFAULT" --document-version "\$LATEST" --document-version "3"
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * Configurations for sending notifications about command status changes on a per-instance basis.
    */
  var NotificationConfig: js.UndefOr[typings.awsSdk.ssmMod.NotificationConfig] = js.native
  /**
    * The name of the S3 bucket.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * The S3 bucket subfolder.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * The parameters for the RUN_COMMAND task execution.
    */
  var Parameters: js.UndefOr[typings.awsSdk.ssmMod.Parameters] = js.native
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  /**
    * If this time is reached and the command has not already started running, it doesn't run.
    */
  var TimeoutSeconds: js.UndefOr[typings.awsSdk.ssmMod.TimeoutSeconds] = js.native
}

object MaintenanceWindowRunCommandParameters {
  @scala.inline
  def apply(): MaintenanceWindowRunCommandParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowRunCommandParameters]
  }
  @scala.inline
  implicit class MaintenanceWindowRunCommandParametersOps[Self <: MaintenanceWindowRunCommandParameters] (val x: Self) extends AnyVal {
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
    def setParameters(value: Parameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setServiceRoleArn(value: ServiceRole): Self = this.set("ServiceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("ServiceRoleArn", js.undefined)
    @scala.inline
    def setTimeoutSeconds(value: TimeoutSeconds): Self = this.set("TimeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("TimeoutSeconds", js.undefined)
  }
  
}

