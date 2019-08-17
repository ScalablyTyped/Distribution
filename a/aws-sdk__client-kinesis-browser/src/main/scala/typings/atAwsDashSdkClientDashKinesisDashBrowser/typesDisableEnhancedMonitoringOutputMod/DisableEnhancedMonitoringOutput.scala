package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDisableEnhancedMonitoringOutputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ALL
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.IncomingBytes
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.IncomingRecords
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.IteratorAgeMilliseconds
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.OutgoingBytes
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.OutgoingRecords
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ReadProvisionedThroughputExceeded
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.WriteProvisionedThroughputExceeded
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableEnhancedMonitoringOutput extends OutputTypesUnion {
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

object DisableEnhancedMonitoringOutput {
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
  ): DisableEnhancedMonitoringOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (CurrentShardLevelMetrics != null) __obj.updateDynamic("CurrentShardLevelMetrics")(CurrentShardLevelMetrics)
    if (DesiredShardLevelMetrics != null) __obj.updateDynamic("DesiredShardLevelMetrics")(DesiredShardLevelMetrics)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[DisableEnhancedMonitoringOutput]
  }
}

