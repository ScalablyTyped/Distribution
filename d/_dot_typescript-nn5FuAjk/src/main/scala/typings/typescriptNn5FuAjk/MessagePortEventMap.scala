package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePortEventMap extends StObject {
  
  var message: MessageEvent[Any]
  
  var messageerror: MessageEvent[Any]
}
object MessagePortEventMap {
  
  inline def apply(message: MessageEvent[Any], messageerror: MessageEvent[Any]): MessagePortEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePortEventMap]
  }
  
  extension [Self <: MessagePortEventMap](x: Self) {
    
    inline def setMessage(value: MessageEvent[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageerror(value: MessageEvent[Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
