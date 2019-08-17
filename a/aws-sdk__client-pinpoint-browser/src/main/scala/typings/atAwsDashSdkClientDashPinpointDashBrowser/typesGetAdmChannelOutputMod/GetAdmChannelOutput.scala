package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetAdmChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreADMChannelResponseMod._UnmarshalledADMChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAdmChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Amazon Device Messaging channel definition.
    */
  var ADMChannelResponse: _UnmarshalledADMChannelResponse
}

object GetAdmChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ADMChannelResponse: _UnmarshalledADMChannelResponse): GetAdmChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, ADMChannelResponse = ADMChannelResponse)
  
    __obj.asInstanceOf[GetAdmChannelOutput]
  }
}

