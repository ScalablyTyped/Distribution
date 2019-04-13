package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Clock")
@js.native
class Clock protected () extends js.Object {
  def this(options: cesiumLib.Anon_CanAnimate) = this()
  var canAnimate: scala.Boolean = js.native
  var clockRange: ClockRange = js.native
  var clockStep: ClockStep = js.native
  var currentTime: JulianDate = js.native
  var multiplier: scala.Double = js.native
  var onTick: Event[js.Array[Clock]] = js.native
  var shouldAnimate: scala.Boolean = js.native
  var startTime: JulianDate = js.native
  var stopTime: JulianDate = js.native
  def tick(): JulianDate = js.native
}

