package typings.chromeApps.chrome.runtime

import typings.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object which allows two way communication with other pages.
  * @since Chrome 26.
  */
trait Port extends StObject {
  
  def disconnect(): Unit
  
  var name: String
  
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onDisconnect: Event[js.Function1[/* port */ this.type, Unit]]
  
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: Event[js.Function2[/* message */ js.Any, /* port */ this.type, Unit]]
  
  def postMessage(message: js.Object): Unit
  
  /**
    * Optional.
    * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
    */
  var sender: js.UndefOr[MessageSender] = js.undefined
}
object Port {
  
  @scala.inline
  def apply(
    disconnect: () => Unit,
    name: String,
    onDisconnect: Event[js.Function1[Port, Unit]],
    onMessage: Event[js.Function2[/* message */ js.Any, Port, Unit]],
    postMessage: js.Object => Unit
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[Port]
  }
  
  @scala.inline
  implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDisconnect(value: Event[js.Function1[Port, Unit]]): Self = StObject.set(x, "onDisconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMessage(value: Event[js.Function2[/* message */ js.Any, Port, Unit]]): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostMessage(value: js.Object => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSender(value: MessageSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
