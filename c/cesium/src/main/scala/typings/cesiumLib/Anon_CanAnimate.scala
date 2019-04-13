package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanAnimate extends js.Object {
  var canAnimate: js.UndefOr[scala.Boolean] = js.undefined
  var clockRange: js.UndefOr[cesiumLib.cesiumMod.ClockRange] = js.undefined
  var clockStep: js.UndefOr[cesiumLib.cesiumMod.ClockStep] = js.undefined
  var currentTime: js.UndefOr[cesiumLib.cesiumMod.JulianDate] = js.undefined
  var multiplier: js.UndefOr[scala.Double] = js.undefined
  var shouldAnimate: js.UndefOr[scala.Boolean] = js.undefined
  var startTime: js.UndefOr[cesiumLib.cesiumMod.JulianDate] = js.undefined
  var stopTime: js.UndefOr[cesiumLib.cesiumMod.JulianDate] = js.undefined
}

object Anon_CanAnimate {
  @scala.inline
  def apply(
    canAnimate: js.UndefOr[scala.Boolean] = js.undefined,
    clockRange: cesiumLib.cesiumMod.ClockRange = null,
    clockStep: cesiumLib.cesiumMod.ClockStep = null,
    currentTime: cesiumLib.cesiumMod.JulianDate = null,
    multiplier: scala.Int | scala.Double = null,
    shouldAnimate: js.UndefOr[scala.Boolean] = js.undefined,
    startTime: cesiumLib.cesiumMod.JulianDate = null,
    stopTime: cesiumLib.cesiumMod.JulianDate = null
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

