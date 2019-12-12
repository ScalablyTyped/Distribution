package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSVoipChannelResponseMod._UnmarshalledAPNSVoipChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/DeleteApnsVoipChannelOutput", JSImport.Namespace)
@js.native
object typesDeleteApnsVoipChannelOutputMod extends js.Object {
  @js.native
  trait DeleteApnsVoipChannelOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Apple VoIP Push Notification Service channel definition.
      */
    var APNSVoipChannelResponse: _UnmarshalledAPNSVoipChannelResponse = js.native
  }
  
}

