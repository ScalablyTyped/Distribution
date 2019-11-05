package typings.baconjs.typesInternalSourceMod

import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/source", "ConsumingSource")
@js.native
class ConsumingSource[V] protected () extends Source[V, V] {
  def this(obs: default[V], sync: Boolean) = this()
  var queue: js.Array[Event[V]] = js.native
}

