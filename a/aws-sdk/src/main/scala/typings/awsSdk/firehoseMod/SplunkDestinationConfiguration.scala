package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplunkDestinationConfiguration extends StObject {
  
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.undefined
  
  /**
    * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends it data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it an error, based on your retry settings.
    */
  var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[typings.awsSdk.firehoseMod.HECAcknowledgmentTimeoutInSeconds] = js.undefined
  
  /**
    * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
    */
  var HECEndpoint: typings.awsSdk.firehoseMod.HECEndpoint
  
  /**
    * This type can be either "Raw" or "Event."
    */
  var HECEndpointType: typings.awsSdk.firehoseMod.HECEndpointType
  
  /**
    * This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
    */
  var HECToken: typings.awsSdk.firehoseMod.HECToken
  
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.undefined
  
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
    */
  var RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined
  
  /**
    * Defines how documents should be delivered to Amazon S3. When set to FailedEventsOnly, Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to AllEvents, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents to Amazon S3. The default value is FailedEventsOnly. You can update this backup mode from FailedEventsOnly to AllEvents. You can't update it from AllEvents to FailedEventsOnly.
    */
  var S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined
  
  /**
    * The configuration for the backup Amazon S3 location.
    */
  var S3Configuration: S3DestinationConfiguration
}
object SplunkDestinationConfiguration {
  
  @scala.inline
  def apply(
    HECEndpoint: HECEndpoint,
    HECEndpointType: HECEndpointType,
    HECToken: HECToken,
    S3Configuration: S3DestinationConfiguration
  ): SplunkDestinationConfiguration = {
    val __obj = js.Dynamic.literal(HECEndpoint = HECEndpoint.asInstanceOf[js.Any], HECEndpointType = HECEndpointType.asInstanceOf[js.Any], HECToken = HECToken.asInstanceOf[js.Any], S3Configuration = S3Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplunkDestinationConfiguration]
  }
  
  @scala.inline
  implicit class SplunkDestinationConfigurationMutableBuilder[Self <: SplunkDestinationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setHECAcknowledgmentTimeoutInSeconds(value: HECAcknowledgmentTimeoutInSeconds): Self = StObject.set(x, "HECAcknowledgmentTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHECAcknowledgmentTimeoutInSecondsUndefined: Self = StObject.set(x, "HECAcknowledgmentTimeoutInSeconds", js.undefined)
    
    @scala.inline
    def setHECEndpoint(value: HECEndpoint): Self = StObject.set(x, "HECEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHECEndpointType(value: HECEndpointType): Self = StObject.set(x, "HECEndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHECToken(value: HECToken): Self = StObject.set(x, "HECToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryOptions(value: SplunkRetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: SplunkS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3Configuration(value: S3DestinationConfiguration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
  }
}
