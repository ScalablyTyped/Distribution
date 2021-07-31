package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.EventStream
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.Unsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frombinderMod {
  
  @JSImport("baconjs/types/frombinder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V](binder: Binder[V]): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(binder.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
  @scala.inline
  def default[V](binder: Binder[V], eventTransformer: EventTransformer[V]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(binder.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  
  type Binder[V] = js.Function1[/* sink */ FlexibleSink[V], Unsub]
  
  type EventLike[V] = V | Event[V] | js.Array[Event[V]]
  
  @js.native
  trait EventTransformer[V] extends StObject {
    
    def apply(args: js.Any*): EventLike[V] = js.native
  }
  
  type FlexibleSink[V] = js.Function1[/* event */ EventLike[V], Reply]
}
