package typings.baconjs.mod

import typings.baconjs.frombinderMod.EventTransformer
import typings.baconjs.fromeventMod.EventSourceFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "fromEventTarget")
@js.native
object fromEventTarget extends js.Object {
  
  def apply[V](target: js.Any, eventSource: String): typings.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): typings.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: EventSourceFn): typings.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): typings.baconjs.observableMod.EventStream[V] = js.native
}
