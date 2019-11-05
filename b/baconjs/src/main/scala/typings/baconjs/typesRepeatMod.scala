package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/repeat", JSImport.Namespace)
@js.native
object typesRepeatMod extends js.Object {
  def default[V](
    generator: js.Function1[/* iteration */ Double, js.UndefOr[typings.baconjs.typesObservableMod.default[V]]]
  ): EventStream[V] = js.native
}

