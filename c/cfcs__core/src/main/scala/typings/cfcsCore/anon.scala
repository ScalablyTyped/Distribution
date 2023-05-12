package typings.cfcsCore

import typings.cfcsCore.declarationReactiveDecoratorsReactiveSubscribeMod.ReactiveSubscribe
import typings.cfcsCore.declarationReactiveTypesMod.ReactiveEventCallback
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Destroy[Events /* <: Record[String, Any] */, State /* <: Record[String, Any] */, Instance /* <: ReactiveSubscribe[Record[String, Any]] */] extends StObject {
    
    def destroy(): Unit
    
    def events(): js.Array[/* keyof Events */ String]
    
    def init(): Unit
    
    def instance(): Instance
    
    def methods(): Any
    
    def mounted(): Unit
    
    def off(eventName: String, listener: ReactiveEventCallback[Any, Any]): Unit
    
    def on(eventName: String, listener: ReactiveEventCallback[Any, Any]): Unit
    
    def state(): State
  }
  object Destroy {
    
    inline def apply[Events /* <: Record[String, Any] */, State /* <: Record[String, Any] */, Instance /* <: ReactiveSubscribe[Record[String, Any]] */](
      destroy: () => Unit,
      events: () => js.Array[/* keyof Events */ String],
      init: () => Unit,
      instance: () => Instance,
      methods: () => Any,
      mounted: () => Unit,
      off: (String, ReactiveEventCallback[Any, Any]) => Unit,
      on: (String, ReactiveEventCallback[Any, Any]) => Unit,
      state: () => State
    ): Destroy[Events, State, Instance] = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = js.Any.fromFunction0(events), init = js.Any.fromFunction0(init), instance = js.Any.fromFunction0(instance), methods = js.Any.fromFunction0(methods), mounted = js.Any.fromFunction0(mounted), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), state = js.Any.fromFunction0(state))
      __obj.asInstanceOf[Destroy[Events, State, Instance]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Destroy[?, ?, ?], Events /* <: Record[String, Any] */, State /* <: Record[String, Any] */, Instance /* <: ReactiveSubscribe[Record[String, Any]] */] (val x: Self & (Destroy[Events, State, Instance])) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setEvents(value: () => js.Array[/* keyof Events */ String]): Self = StObject.set(x, "events", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInstance(value: () => Instance): Self = StObject.set(x, "instance", js.Any.fromFunction0(value))
      
      inline def setMethods(value: () => Any): Self = StObject.set(x, "methods", js.Any.fromFunction0(value))
      
      inline def setMounted(value: () => Unit): Self = StObject.set(x, "mounted", js.Any.fromFunction0(value))
      
      inline def setOff(value: (String, ReactiveEventCallback[Any, Any]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, ReactiveEventCallback[Any, Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setState(value: () => State): Self = StObject.set(x, "state", js.Any.fromFunction0(value))
    }
  }
}
