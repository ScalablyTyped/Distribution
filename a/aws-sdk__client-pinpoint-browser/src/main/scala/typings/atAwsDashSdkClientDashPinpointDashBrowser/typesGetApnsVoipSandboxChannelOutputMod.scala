package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSVoipSandboxChannelResponseMod._UnmarshalledAPNSVoipSandboxChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/GetApnsVoipSandboxChannelOutput", JSImport.Namespace)
@js.native
object typesGetApnsVoipSandboxChannelOutputMod extends js.Object {
  @js.native
  trait GetApnsVoipSandboxChannelOutput extends OutputTypesUnion {
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

