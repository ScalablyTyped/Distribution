package typings.chance.ChanceNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChanceStatic
  extends Instantiable0[Chance]
     with Instantiable1[(/* generator */ js.Function0[js.Any]) | (/* seed */ Seed), Chance] {
  def apply(): Chance = js.native
  def apply(generator: js.Function0[_]): Chance = js.native
  def apply(seed: Seed): Chance = js.native
}

