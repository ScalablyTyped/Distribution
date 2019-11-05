package typings.baconjs.typesInternalSourceMod

import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/source", "fromObservable")
@js.native
object fromObservable extends js.Object {
  def apply[V](s: Source[V, V]): Source[V, V] = js.native
  def apply[V](s: default[V]): Source[V, V] = js.native
}

