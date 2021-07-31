package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesChannelsResponseMod.UnmarshalledChannelsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelsOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput
object GetChannelsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, ChannelsResponse: UnmarshalledChannelsResponse): GetChannelsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ChannelsResponse = ChannelsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelsOutput]
  }
}
