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
    val __obj = js.Dynamic.literal(canAnimate = canAnimate, clock = clock, clockRange = clockRange, clockStep = clockStep, currentTime = currentTime, destroy = destroy, isDestroyed = isDestroyed, multiplier = multiplier, shouldAnimate = shouldAnimate, startTime = startTime, stopTime = stopTime, synchronize = synchronize, systemTime = systemTime)
  
    __obj.asInstanceOf[ClockViewModel]
  }
}

