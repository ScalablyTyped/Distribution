package typings
package d3DashTimerLib.d3DashTimerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-timer", JSImport.Namespace)
@js.native
object d3DashTimerModMembers extends js.Object {
  def interval(callback: js.Function1[/* elapsed */ scala.Double, scala.Unit]): Timer = js.native
  def interval(callback: js.Function1[/* elapsed */ scala.Double, scala.Unit], delay: scala.Double): Timer = js.native
  def interval(
    callback: js.Function1[/* elapsed */ scala.Double, scala.Unit],
    delay: scala.Double,
    time: scala.Double
  ): Timer = js.native
  def now(): scala.Double = js.native
  def timeout(callback: js.Function1[/* elapsed */ scala.Double, scala.Unit]): Timer = js.native
  def timeout(callback: js.Function1[/* elapsed */ scala.Double, scala.Unit], delay: scala.Double): Timer = js.native
  def timeout(
    callback: js.Function1[/* elapsed */ scala.Double, scala.Unit],
    delay: scala.Double,
    time: scala.Double
  ): Timer = js.native
  def timer(callback: js.Function1[/* elapsed */ scala.Double, scala.Unit]): Timer = js.native
  def timer(callback: js.Function1[/* elapsed */ scala.Double, scala.Unit], delay: scala.Double): Timer = js.native
  def timer(
    callback: js.Function1[/* elapsed */ scala.Double, scala.Unit],
    delay: scala.Double,
    time: scala.Double
  ): Timer = js.native
  def timerFlush(): scala.Unit = js.native
}

