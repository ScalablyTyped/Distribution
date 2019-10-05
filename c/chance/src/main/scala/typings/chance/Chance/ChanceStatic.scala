package typings.chance.Chance

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChanceStatic
  extends Instantiable0[typings.chance.Chance.Chance]
     with Instantiable1[
      (/* generator */ js.Function0[js.Any]) | (/* seed */ Seed), 
      typings.chance.Chance.Chance
    ] {
  def apply(): typings.chance.Chance.Chance = js.native
  def apply(generator: js.Function0[_]): typings.chance.Chance.Chance = js.native
  def apply(seed: Seed): typings.chance.Chance.Chance = js.native
}

