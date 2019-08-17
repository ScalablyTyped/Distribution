package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateSegmentOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentResponseMod._UnmarshalledSegmentResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSegmentOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Segment definition.
    */
  var SegmentResponse: _UnmarshalledSegmentResponse
}

object UpdateSegmentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SegmentResponse: _UnmarshalledSegmentResponse): UpdateSegmentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, SegmentResponse = SegmentResponse)
  
    __obj.asInstanceOf[UpdateSegmentOutput]
  }
}

