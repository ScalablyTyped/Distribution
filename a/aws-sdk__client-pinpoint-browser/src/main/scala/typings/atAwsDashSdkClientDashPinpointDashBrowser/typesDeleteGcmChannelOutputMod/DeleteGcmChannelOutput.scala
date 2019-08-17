package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteGcmChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGCMChannelResponseMod._UnmarshalledGCMChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGcmChannelOutput extends OutputTypesUnion {
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

object DeleteGcmChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, GCMChannelResponse: _UnmarshalledGCMChannelResponse): DeleteGcmChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, GCMChannelResponse = GCMChannelResponse)
  
    __obj.asInstanceOf[DeleteGcmChannelOutput]
  }
}

