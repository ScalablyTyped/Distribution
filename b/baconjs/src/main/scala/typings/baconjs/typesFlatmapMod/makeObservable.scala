package typings.baconjs.typesFlatmapMod

import typings.baconjs.eventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmap_", "makeObservable")
@js.native
object makeObservable extends js.Object {
  def apply[V](x: V): typings.baconjs.observableMod.default[V] = js.native
  def apply[V](x: Event[V]): typings.baconjs.observableMod.default[V] = js.native
  def apply[V](x: typings.baconjs.observableMod.default[V]): typings.baconjs.observableMod.default[V] = js.native
}

