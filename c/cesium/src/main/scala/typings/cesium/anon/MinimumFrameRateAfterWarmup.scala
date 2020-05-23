package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimumFrameRateAfterWarmup extends js.Object {
  var minimumFrameRateAfterWarmup: js.UndefOr[Double] = js.undefined
  var minimumFrameRateDuringWarmup: js.UndefOr[Double] = js.undefined
  var quietPeriod: js.UndefOr[Double] = js.undefined
  var samplingWindow: js.UndefOr[Double] = js.undefined
  var scene: typings.cesium.mod.Scene
  var warmupPeriod: js.UndefOr[Double] = js.undefined
}

object MinimumFrameRateAfterWarmup {
  @scala.inline
  def apply(
    scene: typings.cesium.mod.Scene,
    minimumFrameRateAfterWarmup: js.UndefOr[Double] = js.undefined,
    minimumFrameRateDuringWarmup: js.UndefOr[Double] = js.undefined,
    quietPeriod: js.UndefOr[Double] = js.undefined,
    samplingWindow: js.UndefOr[Double] = js.undefined,
    warmupPeriod: js.UndefOr[Double] = js.undefined
  ): MinimumFrameRateAfterWarmup = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumFrameRateAfterWarmup)) __obj.updateDynamic("minimumFrameRateAfterWarmup")(minimumFrameRateAfterWarmup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumFrameRateDuringWarmup)) __obj.updateDynamic("minimumFrameRateDuringWarmup")(minimumFrameRateDuringWarmup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quietPeriod)) __obj.updateDynamic("quietPeriod")(quietPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(samplingWindow)) __obj.updateDynamic("samplingWindow")(samplingWindow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warmupPeriod)) __obj.updateDynamic("warmupPeriod")(warmupPeriod.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimumFrameRateAfterWarmup]
  }
}

