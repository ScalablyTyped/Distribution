package typings.baconjs

import typings.baconjs.frombinderMod.EventTransformer
import typings.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/fromevent", JSImport.Namespace)
@js.native
object fromeventMod extends js.Object {
  
  def default[V](target: js.Any, eventSource: String): EventStream[V] = js.native
  def default[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): EventStream[V] = js.native
  def default[V](target: js.Any, eventSource: EventSourceFn): EventStream[V] = js.native
  def default[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): EventStream[V] = js.native
  
  type EventSourceFn = js.Function2[/* binder */ js.Function, /* listener */ js.Function, js.Any]
}
