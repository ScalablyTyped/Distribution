package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChanceStatic
  extends ScalablyTyped.runtime.Instantiable0[Chance]
     with ScalablyTyped.runtime.Instantiable1[(/* seed */ Seed) | (/* generator */ js.Function0[js.Any]), Chance] {
  def apply(): Chance = js.native
  def apply(generator: js.Function0[_]): Chance = js.native
  def apply(seed: Seed): Chance = js.native
}

