package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Clock")
@js.native
class Clock protected ()
  extends cesiumLib.cesiumMod.CesiumNs.Clock {
  def this(options: cesiumLib.Anon_CanAnimate) = this()
  /* CompleteClass */
  override var canAnimate: scala.Boolean = js.native
  /* CompleteClass */
  override var clockRange: cesiumLib.cesiumMod.CesiumNs.ClockRange = js.native
  /* CompleteClass */
  override var clockStep: cesiumLib.cesiumMod.CesiumNs.ClockStep = js.native
  /* CompleteClass */
  override var currentTime: cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  /* CompleteClass */
  override var multiplier: scala.Double = js.native
  /* CompleteClass */
  override var onTick: cesiumLib.cesiumMod.CesiumNs.Event[js.Array[cesiumLib.cesiumMod.CesiumNs.Clock]] = js.native
  /* CompleteClass */
  override var shouldAnimate: scala.Boolean = js.native
  /* CompleteClass */
  override var startTime: cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  /* CompleteClass */
  override var stopTime: cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  /* CompleteClass */
  override def tick(): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
}

