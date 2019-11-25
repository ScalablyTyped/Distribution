package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateBaiduChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreBaiduChannelResponseMod._UnmarshalledBaiduChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBaiduChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Baidu Cloud Messaging channel definition
    */
  var BaiduChannelResponse: _UnmarshalledBaiduChannelResponse
}

object UpdateBaiduChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, BaiduChannelResponse: _UnmarshalledBaiduChannelResponse): UpdateBaiduChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateBaiduChannelOutput]
  }
}

