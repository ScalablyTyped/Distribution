package typings.cfcsCore

import typings.egjsComponent.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveObserverMod {
  
  @JSImport("@cfcs/core/declaration/reactive/Observer", "Observer")
  @js.native
  /**
    *
    */
  open class Observer[Value] () extends StObject {
    def this(value: Value) = this()
    
    /* protected */ var _current: Value = js.native
    
    /* protected */ var _emitter: default[EmitterEvents[Value]] = js.native
    
    /* protected */ def _setCurrent(value: Value): Unit = js.native
    
    /**
      * return the current value.
      */
    def current: Value = js.native
    def current_=(value: Value): Unit = js.native
    
    /**
      * When the current value changes, the callback function is called.
      */
    def subscribe(callback: js.Function2[/* value */ Value, /* prevValue */ Value, Unit]): this.type = js.native
    
    /**
      * Cancel the registered subscription through callback.
      */
    def unsubscribe(): this.type = js.native
    def unsubscribe(callback: js.Function2[/* value */ Value, /* prevValue */ Value, Unit]): this.type = js.native
  }
  
  trait EmitterEvents[Value] extends StObject {
    
    def update(value: Value, prevValue: Value): Unit
  }
  object EmitterEvents {
    
    inline def apply[Value](update: (Value, Value) => Unit): EmitterEvents[Value] = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[EmitterEvents[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmitterEvents[?], Value] (val x: Self & EmitterEvents[Value]) extends AnyVal {
      
      inline def setUpdate(value: (Value, Value) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
