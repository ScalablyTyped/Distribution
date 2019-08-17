package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesPutEventsOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventsResponseMod._UnmarshalledEventsResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Custom messages associated with events.
    */
  var EventsResponse: _UnmarshalledEventsResponse
}

object PutEventsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EventsResponse: _UnmarshalledEventsResponse): PutEventsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, EventsResponse = EventsResponse)
  
    __obj.asInstanceOf[PutEventsOutput]
  }
}

