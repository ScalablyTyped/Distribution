package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApnsVoipSandboxChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSVoipSandboxChannelResponseMod._UnmarshalledAPNSVoipSandboxChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApnsVoipSandboxChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Apple VoIP Developer Push Notification Service channel definition.
    */
  var APNSVoipSandboxChannelResponse: _UnmarshalledAPNSVoipSandboxChannelResponse
}

object UpdateApnsVoipSandboxChannelOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    APNSVoipSandboxChannelResponse: _UnmarshalledAPNSVoipSandboxChannelResponse
  ): UpdateApnsVoipSandboxChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateApnsVoipSandboxChannelOutput]
  }
}

