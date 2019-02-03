package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "FrameRateMonitor")
@js.native
class FrameRateMonitor ()
  extends cesiumLib.cesiumMod.CesiumNs.FrameRateMonitor {
  def this(options: cesiumLib.Anon_MinimumFrameRateAfterWarmup) = this()
  /* CompleteClass */
  override var lastFramesPerSecond: scala.Double = js.native
  /* CompleteClass */
  override var lowFrameRate: cesiumLib.cesiumMod.CesiumNs.Event = js.native
  /* CompleteClass */
  override var minimumFrameRateAfterWarmup: scala.Double = js.native
  /* CompleteClass */
  override var minimumFrameRateDuringWarmup: scala.Double = js.native
  /* CompleteClass */
  override var nominalFrameRate: cesiumLib.cesiumMod.CesiumNs.Event = js.native
  /* CompleteClass */
  override var quietPeriod: scala.Double = js.native
  /* CompleteClass */
  override var samplingWindow: scala.Double = js.native
  /* CompleteClass */
  override var scene: cesiumLib.cesiumMod.CesiumNs.Scene = js.native
  /* CompleteClass */
  override var warmupPeriod: scala.Double = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def pause(): scala.Unit = js.native
  /* CompleteClass */
  override def unpause(): scala.Unit = js.native
}

/* static members */
@JSImport("cesium", "FrameRateMonitor")
@js.native
object FrameRateMonitor extends js.Object {
  var defaultSettings: js.Any = js.native
  def fromScene(scene: cesiumLib.cesiumMod.CesiumNs.Scene): cesiumLib.cesiumMod.CesiumNs.FrameRateMonitor = js.native
}

