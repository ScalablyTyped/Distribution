package typings.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesBaiduChannelResponseMod.UnmarshalledBaiduChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBaiduChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Baidu Cloud Messaging channel definition
    */
  var BaiduChannelResponse: UnmarshalledBaiduChannelResponse
}

object GetBaiduChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): GetBaiduChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBaiduChannelOutput]
  }
}

