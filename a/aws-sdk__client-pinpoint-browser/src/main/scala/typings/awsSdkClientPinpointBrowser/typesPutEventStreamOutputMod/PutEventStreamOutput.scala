package typings.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesEventStreamMod.UnmarshalledEventStream
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventStreamOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Model for an event publishing subscription export.
    */
  var EventStream: UnmarshalledEventStream
}

object PutEventStreamOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): PutEventStreamOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutEventStreamOutput]
  }
}

