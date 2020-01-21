package typings.baconjs.mod

import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "combineWith")
@js.native
object combineWith extends js.Object {
  def apply[Out](f: js.Function1[/* repeated */ js.Any, Out], streams: default[_]*): typings.baconjs.observableMod.Property[Out] = js.native
}

