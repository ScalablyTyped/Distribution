package typings.d3DashTimer.d3DashTimerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-timer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def interval(callback: js.Function1[/* elapsed */ Double, Unit]): Timer = js.native
  def interval(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer = js.native
  def interval(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer = js.native
  def now(): Double = js.native
  def timeout(callback: js.Function1[/* elapsed */ Double, Unit]): Timer = js.native
  def timeout(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer = js.native
  def timeout(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer = js.native
  def timer(callback: js.Function1[/* elapsed */ Double, Unit]): Timer = js.native
  def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer = js.native
  def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer = js.native
  def timerFlush(): Unit = js.native
}

