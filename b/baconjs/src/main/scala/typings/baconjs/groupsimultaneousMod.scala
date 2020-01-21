package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.EventStreamOptions
import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/groupsimultaneous", JSImport.Namespace)
@js.native
object groupsimultaneousMod extends js.Object {
  def default[V](
    streams: (typings.baconjs.observableMod.default[V] | js.Array[typings.baconjs.observableMod.default[V]])*
  ): EventStream[js.Array[js.Array[V]]] = js.native
  @JSName("groupSimultaneous_")
  def groupSimultaneous[V](streams: js.Array[default[V]]): EventStream[js.Array[js.Array[V]]] = js.native
  @JSName("groupSimultaneous_")
  def groupSimultaneous[V](streams: js.Array[default[V]], options: EventStreamOptions): EventStream[js.Array[js.Array[V]]] = js.native
}

