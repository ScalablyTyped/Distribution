package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreUnprocessedTraceSegmentMod._UnmarshalledUnprocessedTraceSegment
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/PutTraceSegmentsOutput", JSImport.Namespace)
@js.native
object typesPutTraceSegmentsOutputMod extends js.Object {
  @js.native
  trait PutTraceSegmentsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Segments that failed processing.</p>
      */
    var UnprocessedTraceSegments: js.UndefOr[js.Array[_UnmarshalledUnprocessedTraceSegment]] = js.native
  }
  
}

