package typings.cesium

import typings.cesium.cesiumMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinimumFrameRateAfterWarmup extends js.Object {
  var minimumFrameRateAfterWarmup: js.UndefOr[Double] = js.undefined
  var minimumFrameRateDuringWarmup: js.UndefOr[Double] = js.undefined
  var quietPeriod: js.UndefOr[Double] = js.undefined
  var samplingWindow: js.UndefOr[Double] = js.undefined
  var scene: Scene
  var warmupPeriod: js.UndefOr[Double] = js.undefined
}

object Anon_MinimumFrameRateAfterWarmup {
  @scala.inline
  def apply(
    scene: Scene,
    minimumFrameRateAfterWarmup: Int | Double = null,
    minimumFrameRateDuringWarmup: Int | Double = null,
    quietPeriod: Int | Double = null,
    samplingWindow: Int | Double = null,
    warmupPeriod: Int | Double = null
  ): Anon_MinimumFrameRateAfterWarmup = {
    val __obj = js.Dynamic.literal(scene = scene)
    if (minimumFrameRateAfterWarmup != null) __obj.updateDynamic("minimumFrameRateAfterWarmup")(minimumFrameRateAfterWarmup.asInstanceOf[js.Any])
    if (minimumFrameRateDuringWarmup != null) __obj.updateDynamic("minimumFrameRateDuringWarmup")(minimumFrameRateDuringWarmup.asInstanceOf[js.Any])
    if (quietPeriod != null) __obj.updateDynamic("quietPeriod")(quietPeriod.asInstanceOf[js.Any])
    if (samplingWindow != null) __obj.updateDynamic("samplingWindow")(samplingWindow.asInstanceOf[js.Any])
    if (warmupPeriod != null) __obj.updateDynamic("warmupPeriod")(warmupPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MinimumFrameRateAfterWarmup]
  }
}

