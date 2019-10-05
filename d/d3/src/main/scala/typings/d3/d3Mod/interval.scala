package typings.d3.d3Mod

import typings.d3DashTimer.d3DashTimerMod.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "interval")
@js.native
object interval extends js.Object {
  def apply(callback: js.Function1[/* elapsed */ Double, Unit]): Timer = js.native
  def apply(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer = js.native
  def apply(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer = js.native
}

