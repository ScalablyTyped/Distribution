package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplunkDestinationUpdate extends StObject {
  
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.undefined
  
  /**
    * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it an error, based on your retry settings.
    */
  var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[typings.awsSdk.firehoseMod.HECAcknowledgmentTimeoutInSeconds] = js.undefined
  
  /**
    * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
    */
  var HECEndpoint: js.UndefOr[typings.awsSdk.firehoseMod.HECEndpoint] = js.undefined
  
  /**
    * This type can be either "Raw" or "Event."
    */
  var HECEndpointType: js.UndefOr[typings.awsSdk.firehoseMod.HECEndpointType] = js.undefined
  
  /**
    * A GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
    */
  var HECToken: js.UndefOr[typings.awsSdk.firehoseMod.HECToken] = js.undefined
  
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.undefined
  
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk or if it doesn't receive an acknowledgment of receipt from Splunk.
    */
  var RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined
  
  /**
    * Specifies how you want Kinesis Data Firehose to back up documents to Amazon S3. When set to FailedDocumentsOnly, Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to AllEvents, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents to Amazon S3. The default value is FailedEventsOnly. You can update this backup mode from FailedEventsOnly to AllEvents. You can't update it from AllEvents to FailedEventsOnly.
    */
  var S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined
  
  /**
    * Your update to the configuration of the backup Amazon S3 location.
    */
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined
}
object SplunkDestinationUpdate {
  
  @scala.inline
  def apply(): SplunkDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplunkDestinationUpdate]
  }
  
  @scala.inline
  implicit class SplunkDestinationUpdateMutableBuilder[Self <: SplunkDestinationUpdate] (val x: Self) extends AnyVal {
    
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
    def setHECEndpointTypeUndefined: Self = StObject.set(x, "HECEndpointType", js.undefined)
    
    @scala.inline
    def setHECEndpointUndefined: Self = StObject.set(x, "HECEndpoint", js.undefined)
    
    @scala.inline
    def setHECToken(value: HECToken): Self = StObject.set(x, "HECToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHECTokenUndefined: Self = StObject.set(x, "HECToken", js.undefined)
    
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
    def setS3Update(value: S3DestinationUpdate): Self = StObject.set(x, "S3Update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UpdateUndefined: Self = StObject.set(x, "S3Update", js.undefined)
  }
}
