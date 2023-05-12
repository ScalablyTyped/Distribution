package typings.bindEventListener

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait Binding[TTarget /* <: EventTarget */, TType /* <: String */] extends StObject {
    
    var listener: Listener[TTarget, TType]
    
    var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.undefined
    
    var `type`: TType
  }
  object Binding {
    
    inline def apply[TTarget /* <: EventTarget */, TType /* <: String */](listener: Listener[TTarget, TType], `type`: TType): Binding[TTarget, TType] = {
      val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Binding[TTarget, TType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Binding[?, ?], TTarget /* <: EventTarget */, TType /* <: String */] (val x: Self & (Binding[TTarget, TType])) extends AnyVal {
      
      inline def setListener(value: Listener[TTarget, TType]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Boolean | AddEventListenerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    / * template literal string: on${TType} * / string extends keyof TTarget ? std.Parameters<std.Extract<TTarget[/ * template literal string: on${TType} * / string], bind-event-listener.bind-event-listener/dist/types.UnknownFunction>>[0] : std.Event
    }}}
    */
  type InferEvent[TTarget, TType /* <: String */] = Event
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    TTarget extends {addEventListener (type : infer P, args : any): void, addEventListener (type : infer P2, args : any): void} ? P & string : never
    }}}
    */
  @js.native
  trait InferEventType[TTarget] extends StObject
  
  type Listener[TTarget /* <: EventTarget */, TType /* <: String */] = (ListenerObject[InferEvent[TTarget, TType]]) | (js.ThisFunction1[/* this */ TTarget, /* ev */ InferEvent[TTarget, TType], Unit])
  
  trait ListenerObject[TEvent /* <: Event */] extends StObject {
    
    def handleEvent(event: TEvent): Unit
  }
  object ListenerObject {
    
    inline def apply[TEvent /* <: Event */](handleEvent: TEvent => Unit): ListenerObject[TEvent] = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[ListenerObject[TEvent]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListenerObject[?], TEvent /* <: Event */] (val x: Self & ListenerObject[TEvent]) extends AnyVal {
      
      inline def setHandleEvent(value: TEvent => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  type UnbindFn = js.Function0[Unit]
  
  @js.native
  trait UnknownFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
}
