package typings.baconjs

import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesTypesMod.Function2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/diff", JSImport.Namespace)
@js.native
object typesDiffMod extends js.Object {
  def diff[V, V2](src: default[V], start: V, f: Differ[V, V2]): Property[V2] = js.native
  type Differ[V, V2] = Function2[V, V, V2]
}

