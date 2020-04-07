package typings.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesAdmchannelresponseMod.UnmarshalledADMChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAdmChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Amazon Device Messaging channel definition.
    */
  var ADMChannelResponse: UnmarshalledADMChannelResponse
}

object DeleteAdmChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): DeleteAdmChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAdmChannelOutput]
  }
}

