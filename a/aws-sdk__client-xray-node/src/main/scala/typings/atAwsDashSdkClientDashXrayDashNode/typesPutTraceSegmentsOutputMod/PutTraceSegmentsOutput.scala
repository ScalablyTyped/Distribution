package typings.atAwsDashSdkClientDashXrayDashNode.typesPutTraceSegmentsOutputMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreUnprocessedTraceSegmentMod._UnmarshalledUnprocessedTraceSegment
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutTraceSegmentsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Segments that failed processing.</p>
    */
  var UnprocessedTraceSegments: js.UndefOr[js.Array[_UnmarshalledUnprocessedTraceSegment]] = js.undefined
}

object PutTraceSegmentsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    UnprocessedTraceSegments: js.Array[_UnmarshalledUnprocessedTraceSegment] = null
  ): PutTraceSegmentsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (UnprocessedTraceSegments != null) __obj.updateDynamic("UnprocessedTraceSegments")(UnprocessedTraceSegments)
    __obj.asInstanceOf[PutTraceSegmentsOutput]
  }
}

