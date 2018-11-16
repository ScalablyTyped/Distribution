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

