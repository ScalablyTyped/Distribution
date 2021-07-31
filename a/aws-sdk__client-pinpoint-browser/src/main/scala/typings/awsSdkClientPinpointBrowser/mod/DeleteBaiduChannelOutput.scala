package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesBaiduChannelResponseMod.UnmarshalledBaiduChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBaiduChannelOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput
object DeleteBaiduChannelOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): DeleteBaiduChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBaiduChannelOutput]
  }
}
