package typings.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesEmailChannelResponseMod.UnmarshalledEmailChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEmailChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Email Channel Response.
    */
  var EmailChannelResponse: UnmarshalledEmailChannelResponse
}

object DeleteEmailChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): DeleteEmailChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEmailChannelOutput]
  }
}

