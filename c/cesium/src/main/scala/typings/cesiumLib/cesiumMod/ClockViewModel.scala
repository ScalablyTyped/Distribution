package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ClockViewModel")
@js.native
class ClockViewModel ()
  extends cesiumLib.cesiumMod.CesiumNs.ClockViewModel {
  def this(clock: cesiumLib.cesiumMod.CesiumNs.Clock) = this()
  /* CompleteClass */
  override var canAnimate: scala.Boolean = js.native
  /* CompleteClass */
  override var clock: cesiumLib.cesiumMod.CesiumNs.Clock = js.native
  /* CompleteClass */
  override var clockRange: cesiumLib.cesiumMod.CesiumNs.ClockRange = js.native
  /* CompleteClass */
  override var clockStep: cesiumLib.cesiumMod.CesiumNs.ClockStep = js.native
  /* CompleteClass */
  override var currentTime: cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  /* CompleteClass */
  override var multiplier: scala.Double = js.native
  /* CompleteClass */
  override var shouldAnimate: scala.Boolean = js.native
  /* CompleteClass */
  override var startTime: cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  /* CompleteClass */
  override var stopTime: cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  /* CompleteClass */
  override var systemTime: cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def synchronize(): scala.Unit = js.native
}

