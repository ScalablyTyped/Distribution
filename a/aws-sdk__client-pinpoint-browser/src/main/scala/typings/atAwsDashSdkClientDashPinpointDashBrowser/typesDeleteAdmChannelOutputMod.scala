package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreADMChannelResponseMod._UnmarshalledADMChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/DeleteAdmChannelOutput", JSImport.Namespace)
@js.native
object typesDeleteAdmChannelOutputMod extends js.Object {
  @js.native
  trait DeleteAdmChannelOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Amazon Device Messaging channel definition.
      */
    var ADMChannelResponse: _UnmarshalledADMChannelResponse = js.native
  }
  
}

