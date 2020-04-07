package typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod.UnmarshalledSendUsersMessageResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendUsersMessagesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * User send message response.
    */
  var SendUsersMessageResponse: UnmarshalledSendUsersMessageResponse
}

object SendUsersMessagesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SendUsersMessageResponse: UnmarshalledSendUsersMessageResponse): SendUsersMessagesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SendUsersMessageResponse = SendUsersMessageResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendUsersMessagesOutput]
  }
}

