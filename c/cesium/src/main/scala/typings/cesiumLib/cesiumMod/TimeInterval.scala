package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TimeInterval")
@js.native
class TimeInterval () extends js.Object {
  def this(options: cesiumLib.Anon_Data) = this()
  var data: js.Any = js.native
  var isEmpty: scala.Boolean = js.native
  var isStartIncluded: scala.Boolean = js.native
  var isStopIncluded: scala.Boolean = js.native
  var start: JulianDate = js.native
  var stop: JulianDate = js.native
  def clone(result: TimeInterval): TimeInterval = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: TimeInterval): scala.Boolean = js.native
  def equals(right: TimeInterval, dataComparer: cesiumLib.cesiumMod.TimeIntervalNs.DataComparer): scala.Boolean = js.native
  def equalsEpsilon(right: TimeInterval, epsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(
    right: TimeInterval,
    epsilon: scala.Double,
    dataComparer: cesiumLib.cesiumMod.TimeIntervalNs.DataComparer
  ): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "TimeInterval")
@js.native
object TimeInterval extends js.Object {
  var EMPTY: cesiumLib.cesiumMod.TimeInterval = js.native
  def clone(timeInterval: cesiumLib.cesiumMod.TimeInterval): cesiumLib.cesiumMod.TimeInterval = js.native
  def clone(timeInterval: cesiumLib.cesiumMod.TimeInterval, result: cesiumLib.cesiumMod.TimeInterval): cesiumLib.cesiumMod.TimeInterval = js.native
  def contains(timeInterval: cesiumLib.cesiumMod.TimeInterval, julianDate: cesiumLib.cesiumMod.JulianDate): scala.Boolean = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.TimeInterval): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.TimeInterval, right: cesiumLib.cesiumMod.TimeInterval): scala.Boolean = js.native
  def equals(
    left: cesiumLib.cesiumMod.TimeInterval,
    right: cesiumLib.cesiumMod.TimeInterval,
    dataComparer: cesiumLib.cesiumMod.TimeIntervalNs.DataComparer
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.TimeInterval,
    right: cesiumLib.cesiumMod.TimeInterval,
    epsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.TimeInterval,
    right: cesiumLib.cesiumMod.TimeInterval,
    epsilon: scala.Double,
    dataComparer: cesiumLib.cesiumMod.TimeIntervalNs.DataComparer
  ): scala.Boolean = js.native
  def fromIso8601(options: cesiumLib.Anon_DataIsStartIncluded): cesiumLib.cesiumMod.TimeInterval = js.native
  def fromIso8601(options: cesiumLib.Anon_DataIsStartIncluded, result: cesiumLib.cesiumMod.TimeInterval): cesiumLib.cesiumMod.TimeInterval = js.native
  def intersect(
    left: cesiumLib.cesiumMod.TimeInterval,
    right: cesiumLib.cesiumMod.TimeInterval,
    result: cesiumLib.cesiumMod.TimeInterval
  ): cesiumLib.cesiumMod.TimeInterval = js.native
  def intersect(
    left: cesiumLib.cesiumMod.TimeInterval,
    right: cesiumLib.cesiumMod.TimeInterval,
    result: cesiumLib.cesiumMod.TimeInterval,
    mergeCallback: cesiumLib.cesiumMod.TimeIntervalNs.MergeCallback
  ): cesiumLib.cesiumMod.TimeInterval = js.native
  def toIso8601(timeInterval: cesiumLib.cesiumMod.TimeInterval): java.lang.String = js.native
  def toIso8601(timeInterval: cesiumLib.cesiumMod.TimeInterval, precision: scala.Double): java.lang.String = js.native
}

