package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetGcmChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGCMChannelResponseMod._UnmarshalledGCMChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGcmChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Google Cloud Messaging channel definition
    */
  var GCMChannelResponse: _UnmarshalledGCMChannelResponse
}

object GetGcmChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, GCMChannelResponse: _UnmarshalledGCMChannelResponse): GetGcmChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGcmChannelOutput]
  }
}

