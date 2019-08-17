package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesSendMessagesOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageResponseMod._UnmarshalledMessageResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessagesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Send message response.
    */
  var MessageResponse: _UnmarshalledMessageResponse
}

object SendMessagesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, MessageResponse: _UnmarshalledMessageResponse): SendMessagesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, MessageResponse = MessageResponse)
  
    __obj.asInstanceOf[SendMessagesOutput]
  }
}

