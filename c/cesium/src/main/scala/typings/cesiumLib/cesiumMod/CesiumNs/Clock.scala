package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clock extends js.Object {
  var canAnimate: scala.Boolean
  var clockRange: ClockRange
  var clockStep: ClockStep
  var currentTime: JulianDate
  var multiplier: scala.Double
  var onTick: Event
  var shouldAnimate: scala.Boolean
  var startTime: JulianDate
  var stopTime: JulianDate
  def tick(): JulianDate
}

object Clock {
  @scala.inline
  def apply(
    canAnimate: scala.Boolean,
    clockRange: ClockRange,
    clockStep: ClockStep,
    currentTime: JulianDate,
    multiplier: scala.Double,
    onTick: Event,
    shouldAnimate: scala.Boolean,
    startTime: JulianDate,
    stopTime: JulianDate,
    tick: js.Function0[JulianDate]
  ): Clock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canAnimate")(canAnimate)
    __obj.updateDynamic("clockRange")(clockRange)
    __obj.updateDynamic("clockStep")(clockStep)
    __obj.updateDynamic("currentTime")(currentTime)
    __obj.updateDynamic("multiplier")(multiplier)
    __obj.updateDynamic("onTick")(onTick)
    __obj.updateDynamic("shouldAnimate")(shouldAnimate)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("stopTime")(stopTime)
    __obj.updateDynamic("tick")(tick)
    __obj.asInstanceOf[Clock]
  }
}

