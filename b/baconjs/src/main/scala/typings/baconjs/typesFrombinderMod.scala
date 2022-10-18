package typings.baconjs

import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesReplyMod.Reply
import typings.baconjs.typesTypesMod.Unsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFrombinderMod {
  
  @JSImport("baconjs/types/frombinder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](binder: Binder[V]): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(binder.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
  inline def default[V](binder: Binder[V], eventTransformer: EventTransformer[V]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(binder.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  
  type Binder[V] = js.Function1[/* sink */ FlexibleSink[V], Unsub]
  
  type EventLike[V] = V | Event[V] | js.Array[Event[V]]
  
  @js.native
  trait EventTransformer[V] extends StObject {
    
    def apply(args: Any*): EventLike[V] = js.native
  }
  
  type FlexibleSink[V] = js.Function1[/* event */ EventLike[V], Reply]
}
