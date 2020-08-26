package typings.awsSdkClientXrayNode.typesPutTraceSegmentsOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesUnprocessedTraceSegmentMod.UnmarshalledUnprocessedTraceSegment
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var UnprocessedTraceSegments: js.UndefOr[js.Array[UnmarshalledUnprocessedTraceSegment]] = js.native
}

object PutTraceSegmentsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutTraceSegmentsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTraceSegmentsOutput]
  }
  @scala.inline
  implicit class PutTraceSegmentsOutputOps[Self <: PutTraceSegmentsOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnprocessedTraceSegmentsVarargs(value: UnmarshalledUnprocessedTraceSegment*): Self = this.set("UnprocessedTraceSegments", js.Array(value :_*))
    @scala.inline
    def setUnprocessedTraceSegments(value: js.Array[UnmarshalledUnprocessedTraceSegment]): Self = this.set("UnprocessedTraceSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedTraceSegments: Self = this.set("UnprocessedTraceSegments", js.undefined)
  }
  
}

