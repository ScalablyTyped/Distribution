package typings.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesMessageBodyMod.UnmarshalledMessageBody
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var MessageBody: UnmarshalledMessageBody
}

object UpdateEndpointOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, MessageBody: UnmarshalledMessageBody): UpdateEndpointOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEndpointOutput]
  }
}

