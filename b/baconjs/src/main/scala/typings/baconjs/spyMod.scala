package typings.baconjs

import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/spy", JSImport.Namespace)
@js.native
object spyMod extends js.Object {
  def default(spy: Spy_): Double = js.native
  def registerObs(obs: default[_]): Unit = js.native
  def spy(spy: Spy_): Double = js.native
  type Spy_ = js.Function1[/* obs */ default[js.Any], js.Any]
}

