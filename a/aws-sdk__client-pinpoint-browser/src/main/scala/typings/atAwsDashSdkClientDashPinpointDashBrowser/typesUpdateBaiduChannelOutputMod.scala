package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreBaiduChannelResponseMod._UnmarshalledBaiduChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/UpdateBaiduChannelOutput", JSImport.Namespace)
@js.native
object typesUpdateBaiduChannelOutputMod extends js.Object {
  @js.native
  trait UpdateBaiduChannelOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Baidu Cloud Messaging channel definition
      */
    var BaiduChannelResponse: _UnmarshalledBaiduChannelResponse = js.native
  }
  
}

