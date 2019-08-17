package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApnsVoipSandboxChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSVoipSandboxChannelResponseMod._UnmarshalledAPNSVoipSandboxChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var APNSVoipSandboxChannelResponse: _UnmarshalledAPNSVoipSandboxChannelResponse
}

object GetApnsVoipSandboxChannelOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    APNSVoipSandboxChannelResponse: _UnmarshalledAPNSVoipSandboxChannelResponse
  ): GetApnsVoipSandboxChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse)
  
    __obj.asInstanceOf[GetApnsVoipSandboxChannelOutput]
  }
}

