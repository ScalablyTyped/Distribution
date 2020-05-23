package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplunkDestinationConfiguration extends js.Object {
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
  var HECEndpoint: typings.awsSdk.firehoseMod.HECEndpoint = js.native
  /**
    * This type can be either "Raw" or "Event."
    */
  var HECEndpointType: typings.awsSdk.firehoseMod.HECEndpointType = js.native
  /**
    * This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
    */
  var HECToken: typings.awsSdk.firehoseMod.HECToken = js.native
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
    */
  var RetryOptions: js.UndefOr[SplunkRetryOptions] = js.native
  /**
    * Defines how documents should be delivered to Amazon S3. When set to FailedDocumentsOnly, Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to AllDocuments, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents to Amazon S3. Default value is FailedDocumentsOnly. 
    */
  var S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.native
  /**
    * The configuration for the backup Amazon S3 location.
    */
  var S3Configuration: S3DestinationConfiguration = js.native
}

object SplunkDestinationConfiguration {
  @scala.inline
  def apply(
    HECEndpoint: HECEndpoint,
    HECEndpointType: HECEndpointType,
    HECToken: HECToken,
    S3Configuration: S3DestinationConfiguration,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds] = js.undefined,
    ProcessingConfiguration: ProcessingConfiguration = null,
    RetryOptions: SplunkRetryOptions = null,
    S3BackupMode: SplunkS3BackupMode = null
  ): SplunkDestinationConfiguration = {
    val __obj = js.Dynamic.literal(HECEndpoint = HECEndpoint.asInstanceOf[js.Any], HECEndpointType = HECEndpointType.asInstanceOf[js.Any], HECToken = HECToken.asInstanceOf[js.Any], S3Configuration = S3Configuration.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(HECAcknowledgmentTimeoutInSeconds)) __obj.updateDynamic("HECAcknowledgmentTimeoutInSeconds")(HECAcknowledgmentTimeoutInSeconds.get.asInstanceOf[js.Any])
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration.asInstanceOf[js.Any])
    if (RetryOptions != null) __obj.updateDynamic("RetryOptions")(RetryOptions.asInstanceOf[js.Any])
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplunkDestinationConfiguration]
  }
}

