package typings.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnsvoipsandboxchannelresponseMod.UnmarshalledAPNSVoipSandboxChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApnsVoipSandboxChannelOutput extends OutputTypesUnion {
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

object GetApnsVoipSandboxChannelOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
  ): GetApnsVoipSandboxChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApnsVoipSandboxChannelOutput]
  }
}

