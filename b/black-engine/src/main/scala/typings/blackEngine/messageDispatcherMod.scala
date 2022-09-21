package typings.blackEngine

import typings.blackEngine.messageBindingMod.MessageBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageDispatcherMod {
  
  @JSImport("black-engine/messages/MessageDispatcher", "MessageDispatcher")
  @js.native
  open class MessageDispatcher () extends StObject {
    def this(checkForStage: Boolean) = this()
    
    /* private */ var __checkPath: Any = js.native
    
    /* private */ var __draftMessage: Any = js.native
    
    /* private */ var __invoke: Any = js.native
    
    /* private */ var __invokeOverheard: Any = js.native
    
    /* private */ var __off: Any = js.native
    
    /* private */ var __on: Any = js.native
    
    /* private */ var __postBubbles: Any = js.native
    
    var checkForStage: Boolean = js.native
    
    def off(names: String*): Unit = js.native
    
    def on(name: String, callback: js.Function1[/* repeated */ Any, Unit]): MessageBinding = js.native
    def on(name: String, callback: js.Function1[/* repeated */ Any, Unit], context: Any): MessageBinding = js.native
    
    def once(name: String, callback: js.Function1[/* repeated */ Any, Unit]): MessageBinding = js.native
    def once(name: String, callback: js.Function1[/* repeated */ Any, Unit], context: Any): MessageBinding = js.native
    
    def parent: MessageDispatcher = js.native
    
    def path: String = js.native
    
    def post(name: String, params: Any*): Unit = js.native
    
    def stage: Any = js.native
  }
  /* static members */
  object MessageDispatcher {
    
    @JSImport("black-engine/messages/MessageDispatcher", "MessageDispatcher")
    @js.native
    val ^ : js.Any = js.native
    
    inline def dispose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")().asInstanceOf[Unit]
  }
}
