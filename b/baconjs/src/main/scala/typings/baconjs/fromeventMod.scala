package typings.baconjs

import typings.baconjs.frombinderMod.EventTransformer
import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromeventMod {
  
  @JSImport("baconjs/types/fromevent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V](target: js.Any, eventSource: String): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  @scala.inline
  def default[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  @scala.inline
  def default[V](target: js.Any, eventSource: EventSourceFn): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  @scala.inline
  def default[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  
  type EventSourceFn = js.Function2[/* binder */ js.Function, /* listener */ js.Function, js.Any]
}
