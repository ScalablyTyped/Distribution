package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftDestinationDescription extends js.Object {
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: typings.awsSdk.firehoseMod.ClusterJDBCURL = js.native
  /**
    * The COPY command.
    */
  var CopyCommand: typings.awsSdk.firehoseMod.CopyCommand = js.native
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value is 3600 (60 minutes).
    */
  var RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: typings.awsSdk.firehoseMod.RoleARN = js.native
  /**
    * The configuration for backup in Amazon S3.
    */
  var S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.native
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.native
  /**
    * The Amazon S3 destination.
    */
  var S3DestinationDescription: typings.awsSdk.firehoseMod.S3DestinationDescription = js.native
  /**
    * The name of the user.
    */
  var Username: typings.awsSdk.firehoseMod.Username = js.native
}

object RedshiftDestinationDescription {
  @scala.inline
  def apply(
    ClusterJDBCURL: ClusterJDBCURL,
    CopyCommand: CopyCommand,
    RoleARN: RoleARN,
    S3DestinationDescription: S3DestinationDescription,
    Username: Username
  ): RedshiftDestinationDescription = {
    val __obj = js.Dynamic.literal(ClusterJDBCURL = ClusterJDBCURL.asInstanceOf[js.Any], CopyCommand = CopyCommand.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], S3DestinationDescription = S3DestinationDescription.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationDescription]
  }
  @scala.inline
  implicit class RedshiftDestinationDescriptionOps[Self <: RedshiftDestinationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterJDBCURL(value: ClusterJDBCURL): Self = this.set("ClusterJDBCURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopyCommand(value: CopyCommand): Self = this.set("CopyCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3DestinationDescription(value: S3DestinationDescription): Self = this.set("S3DestinationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: Username): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = this.set("CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLoggingOptions: Self = this.set("CloudWatchLoggingOptions", js.undefined)
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = this.set("ProcessingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("ProcessingConfiguration", js.undefined)
    @scala.inline
    def setRetryOptions(value: RedshiftRetryOptions): Self = this.set("RetryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryOptions: Self = this.set("RetryOptions", js.undefined)
    @scala.inline
    def setS3BackupDescription(value: S3DestinationDescription): Self = this.set("S3BackupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BackupDescription: Self = this.set("S3BackupDescription", js.undefined)
    @scala.inline
    def setS3BackupMode(value: RedshiftS3BackupMode): Self = this.set("S3BackupMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BackupMode: Self = this.set("S3BackupMode", js.undefined)
  }
  
}

