package typings.chance.chanceMod

import typings.chance.ChanceNs.ChanceStatic
import typings.chance.ChanceNs.Seed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedChance extends ChanceStatic {
  @JSName("Chance")
  var Chance_Original: ExportedChance = js.native
  def Chance(): typings.chance.ChanceNs.Chance = js.native
  def Chance(generator: js.Function0[_]): typings.chance.ChanceNs.Chance = js.native
  def Chance(seed: Seed): typings.chance.ChanceNs.Chance = js.native
}

