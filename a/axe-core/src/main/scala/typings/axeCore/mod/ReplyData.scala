package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplyData extends StObject {
  
  var channelId: String
  
  var keepalive: Boolean
  
  var message: Any
}
object ReplyData {
  
  inline def apply(channelId: String, keepalive: Boolean, message: Any): ReplyData = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], keepalive = keepalive.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyData]
  }
  
  extension [Self <: ReplyData](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
