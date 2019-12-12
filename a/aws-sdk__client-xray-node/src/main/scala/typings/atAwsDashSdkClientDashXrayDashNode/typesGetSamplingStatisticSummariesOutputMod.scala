package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingStatisticSummaryMod._UnmarshalledSamplingStatisticSummary
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/GetSamplingStatisticSummariesOutput", JSImport.Namespace)
@js.native
object typesGetSamplingStatisticSummariesOutputMod extends js.Object {
  @js.native
  trait GetSamplingStatisticSummariesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Pagination token. Not used.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    /**
      * <p>Information about the number of requests instrumented for each sampling rule.</p>
      */
    var SamplingStatisticSummaries: js.UndefOr[js.Array[_UnmarshalledSamplingStatisticSummary]] = js.native
  }
  
}

