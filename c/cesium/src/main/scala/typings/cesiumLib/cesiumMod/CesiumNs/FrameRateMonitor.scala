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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("lastFramesPerSecond")(lastFramesPerSecond)
    __obj.updateDynamic("lowFrameRate")(lowFrameRate)
    __obj.updateDynamic("minimumFrameRateAfterWarmup")(minimumFrameRateAfterWarmup)
    __obj.updateDynamic("minimumFrameRateDuringWarmup")(minimumFrameRateDuringWarmup)
    __obj.updateDynamic("nominalFrameRate")(nominalFrameRate)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("quietPeriod")(quietPeriod)
    __obj.updateDynamic("samplingWindow")(samplingWindow)
    __obj.updateDynamic("scene")(scene)
    __obj.updateDynamic("unpause")(unpause)
    __obj.updateDynamic("warmupPeriod")(warmupPeriod)
    __obj.asInstanceOf[FrameRateMonitor]
  }
}

