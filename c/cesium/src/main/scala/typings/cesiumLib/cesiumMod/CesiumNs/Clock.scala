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

