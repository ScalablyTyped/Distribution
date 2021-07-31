package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftDestinationUpdate extends StObject {
  
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.undefined
  
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: js.UndefOr[typings.awsSdk.firehoseMod.ClusterJDBCURL] = js.undefined
  
  /**
    * The COPY command.
    */
  var CopyCommand: js.UndefOr[typings.awsSdk.firehoseMod.CopyCommand] = js.undefined
  
  /**
    * The user password.
    */
  var Password: js.UndefOr[typings.awsSdk.firehoseMod.Password] = js.undefined
  
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.undefined
  
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value is 3600 (60 minutes).
    */
  var RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.firehoseMod.RoleARN] = js.undefined
  
  /**
    * You can update a delivery stream to enable Amazon S3 backup if it is disabled. If backup is enabled, you can't update the delivery stream to disable it. 
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined
  
  /**
    * The Amazon S3 destination for backup.
    */
  var S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined
  
  /**
    * The Amazon S3 destination. The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationUpdate.S3Update because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.
    */
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined
  
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[typings.awsSdk.firehoseMod.Username] = js.undefined
}
object RedshiftDestinationUpdate {
  
  @scala.inline
  def apply(): RedshiftDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftDestinationUpdate]
  }
  
  @scala.inline
  implicit class RedshiftDestinationUpdateMutableBuilder[Self <: RedshiftDestinationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setClusterJDBCURL(value: ClusterJDBCURL): Self = StObject.set(x, "ClusterJDBCURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterJDBCURLUndefined: Self = StObject.set(x, "ClusterJDBCURL", js.undefined)
    
    @scala.inline
    def setCopyCommand(value: CopyCommand): Self = StObject.set(x, "CopyCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyCommandUndefined: Self = StObject.set(x, "CopyCommand", js.undefined)
    
    @scala.inline
    def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryOptions(value: RedshiftRetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: RedshiftS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3BackupUpdate(value: S3DestinationUpdate): Self = StObject.set(x, "S3BackupUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupUpdateUndefined: Self = StObject.set(x, "S3BackupUpdate", js.undefined)
    
    @scala.inline
    def setS3Update(value: S3DestinationUpdate): Self = StObject.set(x, "S3Update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UpdateUndefined: Self = StObject.set(x, "S3Update", js.undefined)
    
    @scala.inline
    def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
