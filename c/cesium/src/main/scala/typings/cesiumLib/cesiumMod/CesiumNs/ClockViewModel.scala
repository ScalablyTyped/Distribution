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
    destroy: () => scala.Unit,
    isDestroyed: () => scala.Boolean,
    multiplier: scala.Double,
    shouldAnimate: scala.Boolean,
    startTime: JulianDate,
    stopTime: JulianDate,
    synchronize: () => scala.Unit,
    systemTime: JulianDate
  ): ClockViewModel = {
    val __obj = js.Dynamic.literal(canAnimate = canAnimate, clock = clock, clockRange = clockRange, clockStep = clockStep, currentTime = currentTime, destroy = js.Any.fromFunction0(destroy), isDestroyed = js.Any.fromFunction0(isDestroyed), multiplier = multiplier, shouldAnimate = shouldAnimate, startTime = startTime, stopTime = stopTime, synchronize = js.Any.fromFunction0(synchronize), systemTime = systemTime)
  
    __obj.asInstanceOf[ClockViewModel]
  }
}

