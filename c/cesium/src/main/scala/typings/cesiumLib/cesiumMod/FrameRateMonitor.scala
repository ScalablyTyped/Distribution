package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "FrameRateMonitor")
@js.native
class FrameRateMonitor () extends js.Object {
  def this(options: cesiumLib.Anon_MinimumFrameRateAfterWarmup) = this()
  var lastFramesPerSecond: scala.Double = js.native
  var lowFrameRate: Event[js.Array[_]] = js.native
  var minimumFrameRateAfterWarmup: scala.Double = js.native
  var minimumFrameRateDuringWarmup: scala.Double = js.native
  var nominalFrameRate: Event[js.Array[_]] = js.native
  var quietPeriod: scala.Double = js.native
  var samplingWindow: scala.Double = js.native
  var scene: Scene = js.native
  var warmupPeriod: scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def pause(): scala.Unit = js.native
  def unpause(): scala.Unit = js.native
}

/* static members */
@JSImport("cesium", "FrameRateMonitor")
@js.native
object FrameRateMonitor extends js.Object {
  var defaultSettings: js.Any = js.native
  def fromScene(scene: cesiumLib.cesiumMod.Scene): cesiumLib.cesiumMod.FrameRateMonitor = js.native
}

