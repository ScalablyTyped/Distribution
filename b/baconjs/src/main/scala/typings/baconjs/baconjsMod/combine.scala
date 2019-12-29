package typings.baconjs.baconjsMod

import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesTypesMod.Function2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "combine")
@js.native
object combine extends js.Object {
  def apply[V, V2, R](left: default[V], right: default[V2], f: Function2[V, V2, R]): typings.baconjs.typesObservableMod.Property[R] = js.native
}

