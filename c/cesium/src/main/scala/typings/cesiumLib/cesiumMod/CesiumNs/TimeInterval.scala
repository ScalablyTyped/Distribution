package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeInterval extends js.Object {
  var data: js.Any = js.native
  var isEmpty: scala.Boolean = js.native
  var isStartIncluded: scala.Boolean = js.native
  var isStopIncluded: scala.Boolean = js.native
  var start: JulianDate = js.native
  var stop: JulianDate = js.native
  def clone(result: TimeInterval): TimeInterval = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: TimeInterval): scala.Boolean = js.native
  def equals(right: TimeInterval, dataComparer: cesiumLib.cesiumMod.CesiumNs.TimeIntervalNs.DataComparer): scala.Boolean = js.native
  def equalsEpsilon(right: TimeInterval, epsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(
    right: TimeInterval,
    epsilon: scala.Double,
    dataComparer: cesiumLib.cesiumMod.CesiumNs.TimeIntervalNs.DataComparer
  ): scala.Boolean = js.native
}

