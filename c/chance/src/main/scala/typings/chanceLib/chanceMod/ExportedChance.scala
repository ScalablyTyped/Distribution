package typings
package chanceLib.chanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedChance
  extends chanceLib.ChanceNs.ChanceStatic {
  @JSName("Chance")
  var Chance_Original: ExportedChance = js.native
  def Chance(): chanceLib.ChanceNs.Chance = js.native
  def Chance(generator: js.Function0[_]): chanceLib.ChanceNs.Chance = js.native
  def Chance(seed: chanceLib.ChanceNs.Seed): chanceLib.ChanceNs.Chance = js.native
}

