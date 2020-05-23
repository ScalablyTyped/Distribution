package typings.cesium.anon

import typings.cesium.mod.ClockRange
import typings.cesium.mod.ClockStep
import typings.cesium.mod.JulianDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanAnimate extends js.Object {
  var canAnimate: js.UndefOr[Boolean] = js.undefined
  var clockRange: js.UndefOr[ClockRange] = js.undefined
  var clockStep: js.UndefOr[ClockStep] = js.undefined
  var currentTime: js.UndefOr[JulianDate] = js.undefined
  var multiplier: js.UndefOr[Double] = js.undefined
  var shouldAnimate: js.UndefOr[Boolean] = js.undefined
  var startTime: js.UndefOr[JulianDate] = js.undefined
  var stopTime: js.UndefOr[JulianDate] = js.undefined
}

object CanAnimate {
  @scala.inline
  def apply(
    canAnimate: js.UndefOr[Boolean] = js.undefined,
    clockRange: ClockRange = null,
    clockStep: ClockStep = null,
    currentTime: JulianDate = null,
    multiplier: js.UndefOr[Double] = js.undefined,
    shouldAnimate: js.UndefOr[Boolean] = js.undefined,
    startTime: JulianDate = null,
    stopTime: JulianDate = null
  ): CanAnimate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canAnimate)) __obj.updateDynamic("canAnimate")(canAnimate.get.asInstanceOf[js.Any])
    if (clockRange != null) __obj.updateDynamic("clockRange")(clockRange.asInstanceOf[js.Any])
    if (clockStep != null) __obj.updateDynamic("clockStep")(clockStep.asInstanceOf[js.Any])
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplier)) __obj.updateDynamic("multiplier")(multiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldAnimate)) __obj.updateDynamic("shouldAnimate")(shouldAnimate.get.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (stopTime != null) __obj.updateDynamic("stopTime")(stopTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAnimate]
  }
}

