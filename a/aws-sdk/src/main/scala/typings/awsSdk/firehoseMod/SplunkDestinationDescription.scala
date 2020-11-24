package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplunkDestinationDescription extends js.Object {
  
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  
  /**
    * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends it data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it an error, based on your retry settings.
    */
  var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[typings.awsSdk.firehoseMod.HECAcknowledgmentTimeoutInSeconds] = js.native
  
  /**
    * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
    */
  var HECEndpoint: js.UndefOr[typings.awsSdk.firehoseMod.HECEndpoint] = js.native
  
  /**
    * This type can be either "Raw" or "Event."
    */
  var HECEndpointType: js.UndefOr[typings.awsSdk.firehoseMod.HECEndpointType] = js.native
  
  /**
    * A GUID you obtain from your Splunk cluster when you create a new HEC endpoint.
    */
  var HECToken: js.UndefOr[typings.awsSdk.firehoseMod.HECToken] = js.native
  
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk or if it doesn't receive an acknowledgment of receipt from Splunk.
    */
  var RetryOptions: js.UndefOr[SplunkRetryOptions] = js.native
  
  /**
    * Defines how documents should be delivered to Amazon S3. When set to FailedDocumentsOnly, Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to AllDocuments, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents to Amazon S3. Default value is FailedDocumentsOnly. 
    */
  var S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.native
  
  /**
    * The Amazon S3 destination.&gt;
    */
  var S3DestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.S3DestinationDescription] = js.native
}
object SplunkDestinationDescription {
  
  @scala.inline
  def apply(): SplunkDestinationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplunkDestinationDescription]
  }
  
  @scala.inline
  implicit class SplunkDestinationDescriptionOps[Self <: SplunkDestinationDescription] (val x: Self) extends AnyVal {
    
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
    def setHECAcknowledgmentTimeoutInSeconds(value: HECAcknowledgmentTimeoutInSeconds): Self = this.set("HECAcknowledgmentTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHECAcknowledgmentTimeoutInSeconds: Self = this.set("HECAcknowledgmentTimeoutInSeconds", js.undefined)
    
    @scala.inline
    def setHECEndpoint(value: HECEndpoint): Self = this.set("HECEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHECEndpoint: Self = this.set("HECEndpoint", js.undefined)
    
    @scala.inline
    def setHECEndpointType(value: HECEndpointType): Self = this.set("HECEndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHECEndpointType: Self = this.set("HECEndpointType", js.undefined)
    
    @scala.inline
    def setHECToken(value: HECToken): Self = this.set("HECToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHECToken: Self = this.set("HECToken", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = this.set("ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryOptions(value: SplunkRetryOptions): Self = this.set("RetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryOptions: Self = this.set("RetryOptions", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: SplunkS3BackupMode): Self = this.set("S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BackupMode: Self = this.set("S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3DestinationDescription(value: S3DestinationDescription): Self = this.set("S3DestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3DestinationDescription: Self = this.set("S3DestinationDescription", js.undefined)
  }
}
