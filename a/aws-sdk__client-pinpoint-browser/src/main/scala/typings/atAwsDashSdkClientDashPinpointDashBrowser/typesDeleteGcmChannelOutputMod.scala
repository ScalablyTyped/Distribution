package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGCMChannelResponseMod._UnmarshalledGCMChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/DeleteGcmChannelOutput", JSImport.Namespace)
@js.native
object typesDeleteGcmChannelOutputMod extends js.Object {
  @js.native
  trait DeleteGcmChannelOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Google Cloud Messaging channel definition
      */
    var GCMChannelResponse: _UnmarshalledGCMChannelResponse = js.native
  }
  
}

