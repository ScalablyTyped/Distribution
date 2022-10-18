package typings.baconjs

import typings.baconjs.typesFrombinderMod.EventTransformer
import typings.baconjs.typesObservableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFromeventMod {
  
  @JSImport("baconjs/types/fromevent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](target: Any, eventSource: String): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  inline def default[V](target: Any, eventSource: String, eventTransformer: EventTransformer[V]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  inline def default[V](target: Any, eventSource: EventSourceFn): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  inline def default[V](target: Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  
  type EventSourceFn = js.Function2[/* binder */ js.Function, /* listener */ js.Function, Any]
}
