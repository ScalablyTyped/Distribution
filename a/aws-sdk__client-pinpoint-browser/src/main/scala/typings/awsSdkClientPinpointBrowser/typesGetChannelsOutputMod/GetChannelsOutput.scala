package typings.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesChannelsResponseMod.UnmarshalledChannelsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetChannelsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Get channels definition
    */
  var ChannelsResponse: UnmarshalledChannelsResponse
}

object GetChannelsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ChannelsResponse: UnmarshalledChannelsResponse): GetChannelsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ChannelsResponse = ChannelsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetChannelsOutput]
  }
}

