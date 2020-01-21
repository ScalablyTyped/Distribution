package typings.cesium.mod

import typings.cesium.AnonMinimumFrameRateAfterWarmup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "FrameRateMonitor")
@js.native
class FrameRateMonitor () extends js.Object {
  def this(options: AnonMinimumFrameRateAfterWarmup) = this()
  var lastFramesPerSecond: Double = js.native
  var lowFrameRate: Event[js.Array[_]] = js.native
  var minimumFrameRateAfterWarmup: Double = js.native
  var minimumFrameRateDuringWarmup: Double = js.native
  var nominalFrameRate: Event[js.Array[_]] = js.native
  var quietPeriod: Double = js.native
  var samplingWindow: Double = js.native
  var scene: Scene = js.native
  var warmupPeriod: Double = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def pause(): Unit = js.native
  def unpause(): Unit = js.native
}

/* static members */
@JSImport("cesium", "FrameRateMonitor")
@js.native
object FrameRateMonitor extends js.Object {
  var defaultSettings: js.Any = js.native
  def fromScene(scene: Scene): FrameRateMonitor = js.native
}

