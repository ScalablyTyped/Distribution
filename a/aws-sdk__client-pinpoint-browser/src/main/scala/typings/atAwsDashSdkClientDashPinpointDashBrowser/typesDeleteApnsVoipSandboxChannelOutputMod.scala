package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSVoipSandboxChannelResponseMod._UnmarshalledAPNSVoipSandboxChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/DeleteApnsVoipSandboxChannelOutput", JSImport.Namespace)
@js.native
object typesDeleteApnsVoipSandboxChannelOutputMod extends js.Object {
  @js.native
  trait DeleteApnsVoipSandboxChannelOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Apple VoIP Developer Push Notification Service channel definition.
      */
    var APNSVoipSandboxChannelResponse: _UnmarshalledAPNSVoipSandboxChannelResponse = js.native
  }
  
}

