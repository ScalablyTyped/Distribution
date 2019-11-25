package typings.baconjs.typesFlatmapUnderscoreMod

import typings.baconjs.typesEventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmap_", "makeObservable")
@js.native
object makeObservable extends js.Object {
  def apply[V](x: V): typings.baconjs.typesObservableMod.default[V] = js.native
  def apply[V](x: Event[V]): typings.baconjs.typesObservableMod.default[V] = js.native
  def apply[V](x: typings.baconjs.typesObservableMod.default[V]): typings.baconjs.typesObservableMod.default[V] = js.native
}

