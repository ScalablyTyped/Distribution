package typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringOutputMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ALL
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingBytes
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingRecords
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IteratorAgeMilliseconds
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingBytes
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingRecords
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ReadProvisionedThroughputExceeded
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.WriteProvisionedThroughputExceeded
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableEnhancedMonitoringOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Represents the current state of the metrics that are in the enhanced state before the operation.</p>
    */
  var CurrentShardLevelMetrics: js.UndefOr[
    js.Array[
      IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
    ]
  ] = js.undefined
  /**
    * <p>Represents the list of all the metrics that would be in the enhanced state after the operation.</p>
    */
  var DesiredShardLevelMetrics: js.UndefOr[
    js.Array[
      IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
    ]
  ] = js.undefined
  /**
    * <p>The name of the Kinesis data stream.</p>
    */
  var StreamName: js.UndefOr[String] = js.undefined
}

object EnableEnhancedMonitoringOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CurrentShardLevelMetrics: js.Array[
      IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
    ] = null,
    DesiredShardLevelMetrics: js.Array[
      IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
    ] = null,
    StreamName: String = null
  ): EnableEnhancedMonitoringOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CurrentShardLevelMetrics != null) __obj.updateDynamic("CurrentShardLevelMetrics")(CurrentShardLevelMetrics.asInstanceOf[js.Any])
    if (DesiredShardLevelMetrics != null) __obj.updateDynamic("DesiredShardLevelMetrics")(DesiredShardLevelMetrics.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableEnhancedMonitoringOutput]
  }
}

