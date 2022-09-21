package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketEventMap extends StObject {
  
  var close: CloseEvent
  
  var error: Event
  
  var message: MessageEvent[Any]
  
  var open: Event
}
object WebSocketEventMap {
  
  inline def apply(close: CloseEvent, error: Event, message: MessageEvent[Any], open: Event): WebSocketEventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketEventMap]
  }
  
  extension [Self <: WebSocketEventMap](x: Self) {
    
    inline def setClose(value: CloseEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MessageEvent[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
