package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClockViewModel extends js.Object {
  var canAnimate: scala.Boolean
  var clock: Clock
  var clockRange: ClockRange
  var clockStep: ClockStep
  var currentTime: JulianDate
  var multiplier: scala.Double
  var shouldAnimate: scala.Boolean
  var startTime: JulianDate
  var stopTime: JulianDate
  var systemTime: JulianDate
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def synchronize(): scala.Unit
}

object ClockViewModel {
  @scala.inline
  def apply(
    canAnimate: scala.Boolean,
    clock: Clock,
    clockRange: ClockRange,
    clockStep: ClockStep,
    currentTime: JulianDate,
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    multiplier: scala.Double,
    shouldAnimate: scala.Boolean,
    startTime: JulianDate,
    stopTime: JulianDate,
    synchronize: js.Function0[scala.Unit],
    systemTime: JulianDate
  ): ClockViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canAnimate")(canAnimate)
    __obj.updateDynamic("clock")(clock)
    __obj.updateDynamic("clockRange")(clockRange)
    __obj.updateDynamic("clockStep")(clockStep)
    __obj.updateDynamic("currentTime")(currentTime)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("multiplier")(multiplier)
    __obj.updateDynamic("shouldAnimate")(shouldAnimate)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("stopTime")(stopTime)
    __obj.updateDynamic("synchronize")(synchronize)
    __obj.updateDynamic("systemTime")(systemTime)
    __obj.asInstanceOf[ClockViewModel]
  }
}

