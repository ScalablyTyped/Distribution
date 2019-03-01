package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelayLoop extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var loop: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.ModelAnimationLoop] = js.undefined
  var removeOnStop: js.UndefOr[scala.Boolean] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var speedup: js.UndefOr[scala.Double] = js.undefined
  var startTime: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.JulianDate] = js.undefined
  var stopTime: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.JulianDate] = js.undefined
}

object Anon_DelayLoop {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    loop: cesiumLib.cesiumMod.CesiumNs.ModelAnimationLoop = null,
    removeOnStop: js.UndefOr[scala.Boolean] = js.undefined,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    speedup: scala.Int | scala.Double = null,
    startTime: cesiumLib.cesiumMod.CesiumNs.JulianDate = null,
    stopTime: cesiumLib.cesiumMod.CesiumNs.JulianDate = null
  ): Anon_DelayLoop = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(removeOnStop)) __obj.updateDynamic("removeOnStop")(removeOnStop)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (speedup != null) __obj.updateDynamic("speedup")(speedup.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (stopTime != null) __obj.updateDynamic("stopTime")(stopTime)
    __obj.asInstanceOf[Anon_DelayLoop]
  }
}

