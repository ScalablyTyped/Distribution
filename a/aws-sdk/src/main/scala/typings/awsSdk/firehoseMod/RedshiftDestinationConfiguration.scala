package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftDestinationConfiguration extends StObject {
  
  /**
    * The CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.undefined
  
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: typings.awsSdk.firehoseMod.ClusterJDBCURL
  
  /**
    * The COPY command.
    */
  var CopyCommand: typings.awsSdk.firehoseMod.CopyCommand
  
  /**
    * The user password.
    */
  var Password: typings.awsSdk.firehoseMod.Password
  
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
  var RoleARN: typings.awsSdk.firehoseMod.RoleARN
  
  /**
    * The configuration for backup in Amazon S3.
    */
  var S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined
  
  /**
    * The Amazon S3 backup mode. After you create a delivery stream, you can update it to enable Amazon S3 backup if it is disabled. If backup is enabled, you can't update the delivery stream to disable it. 
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined
  
  /**
    * The configuration for the intermediate Amazon S3 location from which Amazon Redshift obtains data. Restrictions are described in the topic for CreateDeliveryStream. The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationConfiguration.S3Configuration because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.
    */
  var S3Configuration: S3DestinationConfiguration
  
  /**
    * The name of the user.
    */
  var Username: typings.awsSdk.firehoseMod.Username
}
object RedshiftDestinationConfiguration {
  
  @scala.inline
  def apply(
    ClusterJDBCURL: ClusterJDBCURL,
    CopyCommand: CopyCommand,
    Password: Password,
    RoleARN: RoleARN,
    S3Configuration: S3DestinationConfiguration,
    Username: Username
  ): RedshiftDestinationConfiguration = {
    val __obj = js.Dynamic.literal(ClusterJDBCURL = ClusterJDBCURL.asInstanceOf[js.Any], CopyCommand = CopyCommand.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], S3Configuration = S3Configuration.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationConfiguration]
  }
  
  @scala.inline
  implicit class RedshiftDestinationConfigurationMutableBuilder[Self <: RedshiftDestinationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setClusterJDBCURL(value: ClusterJDBCURL): Self = StObject.set(x, "ClusterJDBCURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyCommand(value: CopyCommand): Self = StObject.set(x, "CopyCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
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
    def setS3BackupConfiguration(value: S3DestinationConfiguration): Self = StObject.set(x, "S3BackupConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupConfigurationUndefined: Self = StObject.set(x, "S3BackupConfiguration", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: RedshiftS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3Configuration(value: S3DestinationConfiguration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
