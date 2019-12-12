package typings.atAwsDashSdkClientDashKinesisDashBrowser

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

@JSImport("@aws-sdk/client-kinesis-browser/types/EnableEnhancedMonitoringOutput", JSImport.Namespace)
@js.native
object typesEnableEnhancedMonitoringOutputMod extends js.Object {
  @js.native
  trait EnableEnhancedMonitoringOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Represents the current state of the metrics that are in the enhanced state before the operation.</p>
      */
    var CurrentShardLevelMetrics: js.UndefOr[
        js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]
      ] = js.native
    /**
      * <p>Represents the list of all the metrics that would be in the enhanced state after the operation.</p>
      */
    var DesiredShardLevelMetrics: js.UndefOr[
        js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]
      ] = js.native
    /**
      * <p>The name of the Kinesis data stream.</p>
      */
    var StreamName: js.UndefOr[String] = js.native
  }
  
}

