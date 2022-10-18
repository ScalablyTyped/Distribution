package typings.blackEngine

import typings.blackEngine.messagesMessageDispatcherMod.MessageDispatcher
import typings.blackEngine.messagesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMessageMod {
  
  @JSImport("black-engine/messages/Message", "Message")
  @js.native
  open class Message () extends StObject {
    
    def __reset(): Message = js.native
    
    def cancel(): Unit = js.native
    
    var canceled: Boolean = js.native
    
    var name: String = js.native
    
    var origin: Any = js.native
    
    var sender: MessageDispatcher = js.native
    
    var target: Any = js.native
    
    var `type`: MessageType = js.native
  }
}
