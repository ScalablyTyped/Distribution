package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteEventStreamOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventStreamMod._UnmarshalledEventStream
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEventStreamOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Model for an event publishing subscription export.
    */
  var EventStream: _UnmarshalledEventStream
}

object DeleteEventStreamOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EventStream: _UnmarshalledEventStream): DeleteEventStreamOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, EventStream = EventStream)
  
    __obj.asInstanceOf[DeleteEventStreamOutput]
  }
}

