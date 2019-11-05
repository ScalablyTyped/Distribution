package typings.baconjs

import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesTypesMod.Function2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/combine", JSImport.Namespace)
@js.native
object typesCombineMod extends js.Object {
  def combine[V, V2, R](left: default[V], right: default[V2], f: Function2[V, V2, R]): Property[R] = js.native
  def combineAsArray[V](streams: (default[V] | js.Array[default[V]])*): Property[js.Array[V]] = js.native
  def combineWith[Out](f: js.Function1[/* repeated */ js.Any, Out], streams: default[_]*): Property[Out] = js.native
}

