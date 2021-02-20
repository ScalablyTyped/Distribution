package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpEndpointDestinationDescription extends StObject {
  
  /**
    * Describes buffering options that can be applied to the data before it is delivered to the HTTPS endpoint destination. Kinesis Data Firehose teats these options as hints, and it might choose to use more optimal values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if specify a value for one of them, you must also provide a value for the other. 
    */
  var BufferingHints: js.UndefOr[HttpEndpointBufferingHints] = js.native
  
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  
  /**
    * The configuration of the specified HTTP endpoint destination.
    */
  var EndpointConfiguration: js.UndefOr[HttpEndpointDescription] = js.native
  
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  
  /**
    * The configuration of request sent to the HTTP endpoint specified as the destination.
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
    * Describes the S3 bucket backup options for the data that Kinesis Firehose delivers to the HTTP endpoint destination. You can back up all documents (AllData) or only the documents that Kinesis Data Firehose could not deliver to the specified HTTP endpoint destination (FailedDataOnly).
    */
  var S3BackupMode: js.UndefOr[HttpEndpointS3BackupMode] = js.native
  
  var S3DestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.S3DestinationDescription] = js.native
}
object HttpEndpointDestinationDescription {
  
  @scala.inline
  def apply(): HttpEndpointDestinationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointDestinationDescription]
  }
  
  @scala.inline
  implicit class HttpEndpointDestinationDescriptionMutableBuilder[Self <: HttpEndpointDestinationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferingHints(value: HttpEndpointBufferingHints): Self = StObject.set(x, "BufferingHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferingHintsUndefined: Self = StObject.set(x, "BufferingHints", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setEndpointConfiguration(value: HttpEndpointDescription): Self = StObject.set(x, "EndpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigurationUndefined: Self = StObject.set(x, "EndpointConfiguration", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRequestConfiguration(value: HttpEndpointRequestConfiguration): Self = StObject.set(x, "RequestConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestConfigurationUndefined: Self = StObject.set(x, "RequestConfiguration", js.undefined)
    
    @scala.inline
    def setRetryOptions(value: HttpEndpointRetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: HttpEndpointS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3DestinationDescription(value: S3DestinationDescription): Self = StObject.set(x, "S3DestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationDescriptionUndefined: Self = StObject.set(x, "S3DestinationDescription", js.undefined)
  }
}
