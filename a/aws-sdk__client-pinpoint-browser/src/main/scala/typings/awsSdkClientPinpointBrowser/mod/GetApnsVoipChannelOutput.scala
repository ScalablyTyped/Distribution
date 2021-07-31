package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesApnsvoipchannelresponseMod.UnmarshalledAPNSVoipChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApnsVoipChannelOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput
object GetApnsVoipChannelOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): GetApnsVoipChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApnsVoipChannelOutput]
  }
}
