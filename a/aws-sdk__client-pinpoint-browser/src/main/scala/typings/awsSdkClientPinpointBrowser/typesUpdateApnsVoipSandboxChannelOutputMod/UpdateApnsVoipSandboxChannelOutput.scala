package typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnsvoipsandboxchannelresponseMod.UnmarshalledAPNSVoipSandboxChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
}

object UpdateApnsVoipSandboxChannelOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
  ): UpdateApnsVoipSandboxChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateApnsVoipSandboxChannelOutput]
  }
}

