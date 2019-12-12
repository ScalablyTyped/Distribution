package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSChannelResponseMod._UnmarshalledAPNSChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/DeleteApnsChannelOutput", JSImport.Namespace)
@js.native
object typesDeleteApnsChannelOutputMod extends js.Object {
  @js.native
  trait DeleteApnsChannelOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Apple Distribution Push Notification Service channel definition.
      */
    var APNSChannelResponse: _UnmarshalledAPNSChannelResponse = js.native
  }
  
}

