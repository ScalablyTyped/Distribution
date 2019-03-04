package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameRateMonitor extends js.Object {
  var lastFramesPerSecond: scala.Double
  var lowFrameRate: Event
  var minimumFrameRateAfterWarmup: scala.Double
  var minimumFrameRateDuringWarmup: scala.Double
  var nominalFrameRate: Event
  var quietPeriod: scala.Double
  var samplingWindow: scala.Double
  var scene: Scene
  var warmupPeriod: scala.Double
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def pause(): scala.Unit
  def unpause(): scala.Unit
}

object FrameRateMonitor {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    lastFramesPerSecond: scala.Double,
    lowFrameRate: Event,
    minimumFrameRateAfterWarmup: scala.Double,
    minimumFrameRateDuringWarmup: scala.Double,
    nominalFrameRate: Event,
    pause: js.Function0[scala.Unit],
    quietPeriod: scala.Double,
    samplingWindow: scala.Double,
    scene: Scene,
    unpause: js.Function0[scala.Unit],
    warmupPeriod: scala.Double
  ): FrameRateMonitor = {
    val __obj = js.Dynamic.literal(destroy = destroy, isDestroyed = isDestroyed, lastFramesPerSecond = lastFramesPerSecond, lowFrameRate = lowFrameRate, minimumFrameRateAfterWarmup = minimumFrameRateAfterWarmup, minimumFrameRateDuringWarmup = minimumFrameRateDuringWarmup, nominalFrameRate = nominalFrameRate, pause = pause, quietPeriod = quietPeriod, samplingWindow = samplingWindow, scene = scene, unpause = unpause, warmupPeriod = warmupPeriod)
  
    __obj.asInstanceOf[FrameRateMonitor]
  }
}

