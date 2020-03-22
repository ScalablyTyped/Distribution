package typings.cesium

import typings.cesium.mod.JulianDate
import typings.cesium.mod.ModelAnimationLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoveOnStop extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[ModelAnimationLoop] = js.undefined
  var removeOnStop: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var speedup: js.UndefOr[Double] = js.undefined
  var startTime: js.UndefOr[JulianDate] = js.undefined
  var stopTime: js.UndefOr[JulianDate] = js.undefined
}

object AnonRemoveOnStop {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    loop: ModelAnimationLoop = null,
    removeOnStop: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    speedup: Int | Double = null,
    startTime: JulianDate = null,
    stopTime: JulianDate = null
  ): AnonRemoveOnStop = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOnStop)) __obj.updateDynamic("removeOnStop")(removeOnStop.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (speedup != null) __obj.updateDynamic("speedup")(speedup.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (stopTime != null) __obj.updateDynamic("stopTime")(stopTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemoveOnStop]
  }
}

