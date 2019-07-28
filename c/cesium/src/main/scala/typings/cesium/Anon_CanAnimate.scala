package typings.cesium

import typings.cesium.cesiumMod.ClockRange
import typings.cesium.cesiumMod.ClockStep
import typings.cesium.cesiumMod.JulianDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanAnimate extends js.Object {
  var canAnimate: js.UndefOr[Boolean] = js.undefined
  var clockRange: js.UndefOr[ClockRange] = js.undefined
  var clockStep: js.UndefOr[ClockStep] = js.undefined
  var currentTime: js.UndefOr[JulianDate] = js.undefined
  var multiplier: js.UndefOr[Double] = js.undefined
  var shouldAnimate: js.UndefOr[Boolean] = js.undefined
  var startTime: js.UndefOr[JulianDate] = js.undefined
  var stopTime: js.UndefOr[JulianDate] = js.undefined
}

object Anon_CanAnimate {
  @scala.inline
  def apply(
    canAnimate: js.UndefOr[Boolean] = js.undefined,
    clockRange: ClockRange = null,
    clockStep: ClockStep = null,
    currentTime: JulianDate = null,
    multiplier: Int | Double = null,
    shouldAnimate: js.UndefOr[Boolean] = js.undefined,
    startTime: JulianDate = null,
    stopTime: JulianDate = null
  ): Anon_CanAnimate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canAnimate)) __obj.updateDynamic("canAnimate")(canAnimate)
    if (clockRange != null) __obj.updateDynamic("clockRange")(clockRange)
    if (clockStep != null) __obj.updateDynamic("clockStep")(clockStep)
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime)
    if (multiplier != null) __obj.updateDynamic("multiplier")(multiplier.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldAnimate)) __obj.updateDynamic("shouldAnimate")(shouldAnimate)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (stopTime != null) __obj.updateDynamic("stopTime")(stopTime)
    __obj.asInstanceOf[Anon_CanAnimate]
  }
}

