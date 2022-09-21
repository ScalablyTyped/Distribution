package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDataChannelEventMap extends StObject {
  
  var bufferedamountlow: Event
  
  var close: Event
  
  var closing: Event
  
  var error: Event
  
  var message: MessageEvent[Any]
  
  var open: Event
}
object RTCDataChannelEventMap {
  
  inline def apply(
    bufferedamountlow: Event,
    close: Event,
    closing: Event,
    error: Event,
    message: MessageEvent[Any],
    open: Event
  ): RTCDataChannelEventMap = {
    val __obj = js.Dynamic.literal(bufferedamountlow = bufferedamountlow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventMap]
  }
  
  extension [Self <: RTCDataChannelEventMap](x: Self) {
    
    inline def setBufferedamountlow(value: Event): Self = StObject.set(x, "bufferedamountlow", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setClosing(value: Event): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MessageEvent[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
