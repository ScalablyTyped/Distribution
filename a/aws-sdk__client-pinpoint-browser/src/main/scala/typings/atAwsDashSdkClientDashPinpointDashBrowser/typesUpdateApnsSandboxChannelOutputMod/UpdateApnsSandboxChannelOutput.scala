package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApnsSandboxChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSSandboxChannelResponseMod._UnmarshalledAPNSSandboxChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApnsSandboxChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Apple Development Push Notification Service channel definition.
    */
  var APNSSandboxChannelResponse: _UnmarshalledAPNSSandboxChannelResponse
}

object UpdateApnsSandboxChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, APNSSandboxChannelResponse: _UnmarshalledAPNSSandboxChannelResponse): UpdateApnsSandboxChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, APNSSandboxChannelResponse = APNSSandboxChannelResponse)
  
    __obj.asInstanceOf[UpdateApnsSandboxChannelOutput]
  }
}

