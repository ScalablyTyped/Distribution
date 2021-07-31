package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelRequest extends StObject {
  
  /**
    * The name of the channel to delete.
    */
  var channelName: ChannelName
}
object DeleteChannelRequest {
  
  @scala.inline
  def apply(channelName: ChannelName): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelRequest]
  }
  
  @scala.inline
  implicit class DeleteChannelRequestMutableBuilder[Self <: DeleteChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
  }
}
