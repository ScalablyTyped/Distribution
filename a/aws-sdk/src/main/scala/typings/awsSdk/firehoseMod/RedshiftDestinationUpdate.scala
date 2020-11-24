package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftDestinationUpdate extends js.Object {
  
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: js.UndefOr[typings.awsSdk.firehoseMod.ClusterJDBCURL] = js.native
  
  /**
    * The COPY command.
    */
  var CopyCommand: js.UndefOr[typings.awsSdk.firehoseMod.CopyCommand] = js.native
  
  /**
    * The user password.
    */
  var Password: js.UndefOr[typings.awsSdk.firehoseMod.Password] = js.native
  
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
  var RoleARN: js.UndefOr[typings.awsSdk.firehoseMod.RoleARN] = js.native
  
  /**
    * You can update a delivery stream to enable Amazon S3 backup if it is disabled. If backup is enabled, you can't update the delivery stream to disable it. 
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.native
  
  /**
    * The Amazon S3 destination for backup.
    */
  var S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.native
  
  /**
    * The Amazon S3 destination. The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationUpdate.S3Update because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.
    */
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.native
  
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[typings.awsSdk.firehoseMod.Username] = js.native
}
object RedshiftDestinationUpdate {
  
  @scala.inline
  def apply(): RedshiftDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftDestinationUpdate]
  }
  
  @scala.inline
  implicit class RedshiftDestinationUpdateOps[Self <: RedshiftDestinationUpdate] (val x: Self) extends AnyVal {
    
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
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = this.set("CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLoggingOptions: Self = this.set("CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setClusterJDBCURL(value: ClusterJDBCURL): Self = this.set("ClusterJDBCURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterJDBCURL: Self = this.set("ClusterJDBCURL", js.undefined)
    
    @scala.inline
    def setCopyCommand(value: CopyCommand): Self = this.set("CopyCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyCommand: Self = this.set("CopyCommand", js.undefined)
    
    @scala.inline
    def setPassword(value: Password): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = this.set("ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryOptions(value: RedshiftRetryOptions): Self = this.set("RetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryOptions: Self = this.set("RetryOptions", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: RedshiftS3BackupMode): Self = this.set("S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BackupMode: Self = this.set("S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3BackupUpdate(value: S3DestinationUpdate): Self = this.set("S3BackupUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BackupUpdate: Self = this.set("S3BackupUpdate", js.undefined)
    
    @scala.inline
    def setS3Update(value: S3DestinationUpdate): Self = this.set("S3Update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Update: Self = this.set("S3Update", js.undefined)
    
    @scala.inline
    def setUsername(value: Username): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
