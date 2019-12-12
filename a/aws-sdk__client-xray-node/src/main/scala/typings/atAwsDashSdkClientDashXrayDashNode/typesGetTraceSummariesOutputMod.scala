package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreTraceSummaryMod._UnmarshalledTraceSummary
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/GetTraceSummariesOutput", JSImport.Namespace)
@js.native
object typesGetTraceSummariesOutputMod extends js.Object {
  @js.native
  trait GetTraceSummariesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The start time of this page of results.</p>
      */
    var ApproximateTime: js.UndefOr[Date] = js.native
    /**
      * <p>If the requested time frame contained more than one page of results, you can use this token to retrieve the next page. The first page contains the most most recent results, closest to the end of the time frame.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    /**
      * <p>Trace IDs and metadata for traces that were found in the specified time frame.</p>
      */
    var TraceSummaries: js.UndefOr[js.Array[_UnmarshalledTraceSummary]] = js.native
    /**
      * <p>The total number of traces processed, including traces that did not match the specified filter expression.</p>
      */
    var TracesProcessedCount: js.UndefOr[Double] = js.native
  }
  
}

