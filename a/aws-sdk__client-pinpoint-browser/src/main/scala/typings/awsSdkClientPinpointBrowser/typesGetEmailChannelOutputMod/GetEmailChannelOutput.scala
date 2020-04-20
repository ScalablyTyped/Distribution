package typings.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesEmailChannelResponseMod.UnmarshalledEmailChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEmailChannelOutput extends OutputTypesUnion {
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

object GetEmailChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): GetEmailChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailChannelOutput]
  }
}

