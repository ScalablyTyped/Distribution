package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateAdmChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreADMChannelResponseMod._UnmarshalledADMChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAdmChannelOutput extends OutputTypesUnion {
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

object UpdateAdmChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ADMChannelResponse: _UnmarshalledADMChannelResponse): UpdateAdmChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateAdmChannelOutput]
  }
}

