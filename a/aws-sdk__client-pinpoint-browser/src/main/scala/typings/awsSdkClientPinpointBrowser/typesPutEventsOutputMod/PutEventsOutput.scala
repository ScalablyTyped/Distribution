package typings.awsSdkClientPinpointBrowser.typesPutEventsOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesEventsResponseMod.UnmarshalledEventsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var EventsResponse: UnmarshalledEventsResponse
}

object PutEventsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EventsResponse: UnmarshalledEventsResponse): PutEventsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventsResponse = EventsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutEventsOutput]
  }
}

