package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reflector extends StObject {
  
  /* private */ var _handleClientMessage: Any
  
  /* private */ var _handleServerMessage: Any
  
  /* private */ var _scene: Any
  
  /* private */ var _webSocket: Any
  
  /**
    * Closes the reflector connection
    */
  def close(): Unit
}
object Reflector {
  
  inline def apply(
    _handleClientMessage: Any,
    _handleServerMessage: Any,
    _scene: Any,
    _webSocket: Any,
    close: () => Unit
  ): Reflector = {
    val __obj = js.Dynamic.literal(_handleClientMessage = _handleClientMessage.asInstanceOf[js.Any], _handleServerMessage = _handleServerMessage.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _webSocket = _webSocket.asInstanceOf[js.Any], close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[Reflector]
  }
  
  extension [Self <: Reflector](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def set_handleClientMessage(value: Any): Self = StObject.set(x, "_handleClientMessage", value.asInstanceOf[js.Any])
    
    inline def set_handleServerMessage(value: Any): Self = StObject.set(x, "_handleServerMessage", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
    
    inline def set_webSocket(value: Any): Self = StObject.set(x, "_webSocket", value.asInstanceOf[js.Any])
  }
}
