package typings.blackEngine

import typings.blackEngine.messagesBindingTypeMod.BindingType
import typings.blackEngine.messagesMessageDispatcherMod.MessageDispatcher
import typings.blackEngine.utilsGlobMod.Glob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMessageBindingMod {
  
  @JSImport("black-engine/messages/MessageBinding", "MessageBinding")
  @js.native
  open class MessageBinding protected () extends StObject {
    def this(
      owner: MessageDispatcher,
      name: String,
      callback: js.Function1[/* repeated */ Any, Unit],
      isOnce: Boolean
    ) = this()
    def this(
      owner: MessageDispatcher,
      name: String,
      callback: js.Function1[/* repeated */ Any, Unit],
      isOnce: Boolean,
      context: Any
    ) = this()
    def this(
      owner: MessageDispatcher,
      name: String,
      callback: js.Function1[/* repeated */ Any, Unit],
      isOnce: Boolean,
      context: Any,
      `type`: BindingType
    ) = this()
    def this(
      owner: MessageDispatcher,
      name: String,
      callback: js.Function1[/* repeated */ Any, Unit],
      isOnce: Boolean,
      context: Unit,
      `type`: BindingType
    ) = this()
    def this(
      owner: MessageDispatcher,
      name: String,
      callback: js.Function1[/* repeated */ Any, Unit],
      isOnce: Boolean,
      context: Any,
      `type`: Unit,
      pathPattern: String
    ) = this()
    def this(
      owner: MessageDispatcher,
      name: String,
      callback: js.Function1[/* repeated */ Any, Unit],
      isOnce: Boolean,
      context: Any,
      `type`: BindingType,
      pathPattern: String
    ) = this()
    def this(
      owner: MessageDispatcher,
      name: String,
      callback: js.Function1[/* repeated */ Any, Unit],
      isOnce: Boolean,
      context: Unit,
      `type`: Unit,
      pathPattern: String
    ) = this()
    def this(
      owner: MessageDispatcher,
      name: String,
      callback: js.Function1[/* repeated */ Any, Unit],
      isOnce: Boolean,
      context: Unit,
      `type`: BindingType,
      pathPattern: String
    ) = this()
    
    def __reset(): MessageBinding = js.native
    
    def callback(params: Any*): Unit = js.native
    
    var context: Any = js.native
    
    var glob: Glob | Null = js.native
    
    var isOnce: Boolean = js.native
    
    var name: String = js.native
    
    def off(): Unit = js.native
    
    var owner: MessageDispatcher = js.native
    
    var pathPattern: String | Null = js.native
    
    var `type`: BindingType = js.native
  }
}
