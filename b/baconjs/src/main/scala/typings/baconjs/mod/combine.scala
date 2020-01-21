package typings.baconjs.mod

import typings.baconjs.observableMod.default
import typings.baconjs.typesMod.Function2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "combine")
@js.native
object combine extends js.Object {
  def apply[V, V2, R](left: default[V], right: default[V2], f: Function2[V, V2, R]): typings.baconjs.observableMod.Property[R] = js.native
}

