package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDataChannelEventInit
  extends StObject
     with EventInit {
  
  var channel: RTCDataChannel
}
object RTCDataChannelEventInit {
  
  inline def apply(channel: RTCDataChannel): RTCDataChannelEventInit = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventInit]
  }
  
  extension [Self <: RTCDataChannelEventInit](x: Self) {
    
    inline def setChannel(value: RTCDataChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
