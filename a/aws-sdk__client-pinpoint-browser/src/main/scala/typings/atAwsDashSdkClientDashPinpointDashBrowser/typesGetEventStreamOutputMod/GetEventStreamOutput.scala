package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetEventStreamOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventStreamMod._UnmarshalledEventStream
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEventStreamOutput extends OutputTypesUnion {
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

object GetEventStreamOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EventStream: _UnmarshalledEventStream): GetEventStreamOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, EventStream = EventStream)
  
    __obj.asInstanceOf[GetEventStreamOutput]
  }
}

