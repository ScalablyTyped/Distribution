package typings.baconjs.mod

import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "zipWith")
@js.native
object zipWith extends js.Object {
  def apply[Out](f: js.Function1[/* repeated */ js.Any, Out], streams: default[_]*): typings.baconjs.observableMod.EventStream[Out] = js.native
}

