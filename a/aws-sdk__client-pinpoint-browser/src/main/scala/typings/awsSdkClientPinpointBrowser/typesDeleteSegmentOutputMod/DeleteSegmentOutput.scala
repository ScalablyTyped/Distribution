package typings.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSegmentOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Segment definition.
    */
  var SegmentResponse: UnmarshalledSegmentResponse
}

object DeleteSegmentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): DeleteSegmentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSegmentOutput]
  }
}

