package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import typings.baconjs.typesMod.Unsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object busMod {
  
  @JSImport("baconjs/types/bus", JSImport.Default)
  @js.native
  class default[V] () extends Bus[V]
  
  @js.native
  trait Bus[V] extends EventStream[V] {
    
    /**
      Ends the stream. Sends an [End](end.html) event to all subscribers.
      After this call, there'll be no more events to the subscribers.
      Also, the [`push`](#push), [`error`](#error) and [`plug`](#plug) methods have no effect.
      */
    def end(): Reply = js.native
    
    /** @hidden */
    var ended: Boolean = js.native
    
    /**
      * Pushes an error to this stream.
      */
    def error(error: js.Any): Reply = js.native
    
    /** @hidden */
    def guardedSink(input: typings.baconjs.observableMod.default[V]): EventSink[V] = js.native
    
    /**
      Plugs the given stream as an input to the Bus. All events from
      the given stream will be delivered to the subscribers of the Bus.
      Returns a function that can be used to unplug the same stream.
      
      The plug method practically allows you to merge in other streams after
      the creation of the Bus.
      
      * @returns a function that can be called to "unplug" the source from Bus.
      */
    def plug[V2 /* <: V */](input: typings.baconjs.observableMod.default[V2]): js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Pushes a new value to the stream.
      */
    def push(value: V): Reply = js.native
    
    /** @hidden */
    var pushQueue: js.UndefOr[js.Array[V]] = js.native
    
    /** @hidden */
    var pushing: Boolean = js.native
    
    /** @hidden */
    var sink: js.UndefOr[EventSink[V]] = js.native
    
    /** @hidden */
    def subscribeAll(newSink: EventSink[V]): js.Function0[Unit] = js.native
    
    /** @hidden */
    def subscribeInput(subscription: Subscription[V]): Unsub = js.native
    
    /** @hidden */
    var subscriptions: js.Array[Subscription[V]] = js.native
    
    /** @hidden */
    def unsubAll(): Unit = js.native
    
    /** @hidden */
    def unsubscribeInput(input: typings.baconjs.observableMod.default[js.Any]): Unit = js.native
  }
  
  trait Subscription[V] extends StObject {
    
    var input: typings.baconjs.observableMod.default[V]
    
    var unsub: js.UndefOr[Unsub] = js.undefined
  }
  object Subscription {
    
    inline def apply[V](input: typings.baconjs.observableMod.default[V]): Subscription[V] = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription[V]]
    }
    
    extension [Self <: Subscription[?], V](x: Self & Subscription[V]) {
      
      inline def setInput(value: typings.baconjs.observableMod.default[V]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setUnsub(value: () => Unit): Self = StObject.set(x, "unsub", js.Any.fromFunction0(value))
      
      inline def setUnsubUndefined: Self = StObject.set(x, "unsub", js.undefined)
    }
  }
}
