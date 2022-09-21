package typings.cfcsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerMod {
  
  @JSImport("@cfcs/core/declaration/reactive/Observer", "Observer")
  @js.native
  open class Observer[Value] () extends StObject {
    def this(value: Value) = this()
    
    /* private */ var _current: Any = js.native
    
    /* private */ var _emitter: Any = js.native
    
    def current: Value = js.native
    def current_=(value: Value): Unit = js.native
    
    def subscribe(callback: js.Function1[/* value */ Value, Unit]): Unit = js.native
    
    def unsubscribe(): Unit = js.native
    def unsubscribe(callback: js.Function1[/* value */ Value, Unit]): Unit = js.native
  }
}
