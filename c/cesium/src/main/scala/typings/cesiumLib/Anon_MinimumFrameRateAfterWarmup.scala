package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinimumFrameRateAfterWarmup extends js.Object {
  var minimumFrameRateAfterWarmup: js.UndefOr[scala.Double] = js.undefined
  var minimumFrameRateDuringWarmup: js.UndefOr[scala.Double] = js.undefined
  var quietPeriod: js.UndefOr[scala.Double] = js.undefined
  var samplingWindow: js.UndefOr[scala.Double] = js.undefined
  var scene: cesiumLib.cesiumMod.Scene
  var warmupPeriod: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MinimumFrameRateAfterWarmup {
  @scala.inline
  def apply(
    scene: cesiumLib.cesiumMod.Scene,
    minimumFrameRateAfterWarmup: scala.Int | scala.Double = null,
    minimumFrameRateDuringWarmup: scala.Int | scala.Double = null,
    quietPeriod: scala.Int | scala.Double = null,
    samplingWindow: scala.Int | scala.Double = null,
    warmupPeriod: scala.Int | scala.Double = null
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

