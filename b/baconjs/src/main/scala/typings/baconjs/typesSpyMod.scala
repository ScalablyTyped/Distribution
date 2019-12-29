package typings.baconjs

import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/spy", JSImport.Namespace)
@js.native
object typesSpyMod extends js.Object {
  def default(spy: Spy): Double = js.native
  def registerObs(obs: default[_]): Unit = js.native
  def spy(spy: Spy): Double = js.native
  type Spy = js.Function1[/* obs */ default[js.Any], js.Any]
}

