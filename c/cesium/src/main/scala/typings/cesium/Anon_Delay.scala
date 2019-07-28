package typings.cesium

import typings.cesium.cesiumMod.JulianDate
import typings.cesium.cesiumMod.ModelAnimationLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[ModelAnimationLoop] = js.undefined
  var name: String
  var removeOnStop: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var speedup: js.UndefOr[Double] = js.undefined
  var startTime: js.UndefOr[JulianDate] = js.undefined
  var stopTime: js.UndefOr[JulianDate] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(
    name: String,
    delay: Int | Double = null,
    loop: ModelAnimationLoop = null,
    removeOnStop: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    speedup: Int | Double = null,
    startTime: JulianDate = null,
    stopTime: JulianDate = null
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal(name = name)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(removeOnStop)) __obj.updateDynamic("removeOnStop")(removeOnStop)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (speedup != null) __obj.updateDynamic("speedup")(speedup.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (stopTime != null) __obj.updateDynamic("stopTime")(stopTime)
    __obj.asInstanceOf[Anon_Delay]
  }
}

