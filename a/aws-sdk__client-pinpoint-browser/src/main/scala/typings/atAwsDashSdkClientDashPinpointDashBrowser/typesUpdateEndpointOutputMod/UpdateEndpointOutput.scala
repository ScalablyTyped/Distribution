package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateEndpointOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageBodyMod._UnmarshalledMessageBody
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEndpointOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Simple message object.
    */
  var MessageBody: _UnmarshalledMessageBody
}

object UpdateEndpointOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, MessageBody: _UnmarshalledMessageBody): UpdateEndpointOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, MessageBody = MessageBody)
  
    __obj.asInstanceOf[UpdateEndpointOutput]
  }
}

