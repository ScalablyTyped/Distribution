package typings.cesium.anon

import typings.cesium.mod.JulianDate
import typings.cesium.mod.ModelAnimationLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveOnStop extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[ModelAnimationLoop] = js.undefined
  var removeOnStop: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var speedup: js.UndefOr[Double] = js.undefined
  var startTime: js.UndefOr[JulianDate] = js.undefined
  var stopTime: js.UndefOr[JulianDate] = js.undefined
}

object RemoveOnStop {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    loop: ModelAnimationLoop = null,
    removeOnStop: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    speedup: js.UndefOr[Double] = js.undefined,
    startTime: JulianDate = null,
    stopTime: JulianDate = null
  ): RemoveOnStop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOnStop)) __obj.updateDynamic("removeOnStop")(removeOnStop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speedup)) __obj.updateDynamic("speedup")(speedup.get.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (stopTime != null) __obj.updateDynamic("stopTime")(stopTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveOnStop]
  }
}

