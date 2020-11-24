package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpEndpointDestinationConfiguration extends js.Object {
  
  /**
    * The buffering options that can be used before data is delivered to the specified destination. Kinesis Data Firehose treats these options as hints, and it might choose to use more optimal values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if you specify a value for one of them, you must also provide a value for the other. 
    */
  var BufferingHints: js.UndefOr[HttpEndpointBufferingHints] = js.native
  
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  
  /**
    * The configuration of the HTTP endpoint selected as the destination.
    */
  var EndpointConfiguration: HttpEndpointConfiguration = js.native
  
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  
  /**
    * The configuration of the requeste sent to the HTTP endpoint specified as the destination.
    */
  var RequestConfiguration: js.UndefOr[HttpEndpointRequestConfiguration] = js.native
  
  /**
    * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid acknowledgment of receipt from the specified HTTP endpoint destination.
    */
  var RetryOptions: js.UndefOr[HttpEndpointRetryOptions] = js.native
  
  /**
    * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.firehoseMod.RoleARN] = js.native
  
  /**
    * Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to the HTTP endpoint destination. You can back up all documents (AllData) or only the documents that Kinesis Data Firehose could not deliver to the specified HTTP endpoint destination (FailedDataOnly).
    */
  var S3BackupMode: js.UndefOr[HttpEndpointS3BackupMode] = js.native
  
  var S3Configuration: S3DestinationConfiguration = js.native
}
object HttpEndpointDestinationConfiguration {
  
  @scala.inline
  def apply(EndpointConfiguration: HttpEndpointConfiguration, S3Configuration: S3DestinationConfiguration): HttpEndpointDestinationConfiguration = {
    val __obj = js.Dynamic.literal(EndpointConfiguration = EndpointConfiguration.asInstanceOf[js.Any], S3Configuration = S3Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpEndpointDestinationConfiguration]
  }
  
  @scala.inline
  implicit class HttpEndpointDestinationConfigurationOps[Self <: HttpEndpointDestinationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEndpointConfiguration(value: HttpEndpointConfiguration): Self = this.set("EndpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Configuration(value: S3DestinationConfiguration): Self = this.set("S3Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferingHints(value: HttpEndpointBufferingHints): Self = this.set("BufferingHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferingHints: Self = this.set("BufferingHints", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = this.set("CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLoggingOptions: Self = this.set("CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = this.set("ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRequestConfiguration(value: HttpEndpointRequestConfiguration): Self = this.set("RequestConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestConfiguration: Self = this.set("RequestConfiguration", js.undefined)
    
    @scala.inline
    def setRetryOptions(value: HttpEndpointRetryOptions): Self = this.set("RetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryOptions: Self = this.set("RetryOptions", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: HttpEndpointS3BackupMode): Self = this.set("S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BackupMode: Self = this.set("S3BackupMode", js.undefined)
  }
}
