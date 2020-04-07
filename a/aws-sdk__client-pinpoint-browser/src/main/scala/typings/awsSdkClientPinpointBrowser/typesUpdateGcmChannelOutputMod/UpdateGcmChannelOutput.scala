package typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesGcmchannelresponseMod.UnmarshalledGCMChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGcmChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Google Cloud Messaging channel definition
    */
  var GCMChannelResponse: UnmarshalledGCMChannelResponse
}

object UpdateGcmChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): UpdateGcmChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateGcmChannelOutput]
  }
}

