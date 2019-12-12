package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSSandboxChannelResponseMod._UnmarshalledAPNSSandboxChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/GetApnsSandboxChannelOutput", JSImport.Namespace)
@js.native
object typesGetApnsSandboxChannelOutputMod extends js.Object {
  @js.native
  trait GetApnsSandboxChannelOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Apple Development Push Notification Service channel definition.
      */
    var APNSSandboxChannelResponse: _UnmarshalledAPNSSandboxChannelResponse = js.native
  }
  
}

