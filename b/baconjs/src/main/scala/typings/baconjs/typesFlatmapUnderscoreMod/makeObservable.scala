package typings.baconjs.typesFlatmapUnderscoreMod

import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmap_", "makeObservable")
@js.native
object makeObservable extends js.Object {
  def apply[V](x: V): default[V] = js.native
  def apply[V](x: Event[V]): default[V] = js.native
  def apply[V](x: default[V]): default[V] = js.native
}

