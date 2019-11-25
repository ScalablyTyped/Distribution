package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentVersionsOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentsResponseMod._UnmarshalledSegmentsResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSegmentVersionsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Segments in your account.
    */
  var SegmentsResponse: _UnmarshalledSegmentsResponse
}

object GetSegmentVersionsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SegmentsResponse: _UnmarshalledSegmentsResponse): GetSegmentVersionsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSegmentVersionsOutput]
  }
}

