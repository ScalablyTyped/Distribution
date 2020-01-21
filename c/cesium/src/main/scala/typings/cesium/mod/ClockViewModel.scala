package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ClockViewModel")
@js.native
class ClockViewModel () extends js.Object {
  def this(clock: Clock) = this()
  var canAnimate: Boolean = js.native
  var clock: Clock = js.native
  var clockRange: ClockRange = js.native
  var clockStep: ClockStep = js.native
  var currentTime: JulianDate = js.native
  var multiplier: Double = js.native
  var shouldAnimate: Boolean = js.native
  var startTime: JulianDate = js.native
  var stopTime: JulianDate = js.native
  var systemTime: JulianDate = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def synchronize(): Unit = js.native
}

