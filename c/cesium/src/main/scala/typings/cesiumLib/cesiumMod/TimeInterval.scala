package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TimeInterval")
@js.native
class TimeInterval ()
  extends cesiumLib.cesiumMod.CesiumNs.TimeInterval {
  def this(options: cesiumLib.Anon_IsStopIncluded) = this()
}

@JSImport("cesium", "TimeInterval")
@js.native
object TimeInterval extends js.Object {
  var EMPTY: cesiumLib.cesiumMod.CesiumNs.TimeInterval = js.native
  def clone(timeInterval: cesiumLib.cesiumMod.CesiumNs.TimeInterval): cesiumLib.cesiumMod.CesiumNs.TimeInterval = js.native
  def clone(
    timeInterval: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    result: cesiumLib.cesiumMod.CesiumNs.TimeInterval
  ): cesiumLib.cesiumMod.CesiumNs.TimeInterval = js.native
  def contains(
    timeInterval: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate
  ): scala.Boolean = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.TimeInterval): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.TimeInterval, right: cesiumLib.cesiumMod.CesiumNs.TimeInterval): scala.Boolean = js.native
  def equals(
    left: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    right: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    dataComparer: cesiumLib.cesiumMod.CesiumNs.TimeIntervalNs.DataComparer
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    right: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    epsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    right: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    epsilon: scala.Double,
    dataComparer: cesiumLib.cesiumMod.CesiumNs.TimeIntervalNs.DataComparer
  ): scala.Boolean = js.native
  def fromIso8601(options: cesiumLib.Anon_Data): cesiumLib.cesiumMod.CesiumNs.TimeInterval = js.native
  def fromIso8601(options: cesiumLib.Anon_Data, result: cesiumLib.cesiumMod.CesiumNs.TimeInterval): cesiumLib.cesiumMod.CesiumNs.TimeInterval = js.native
  def intersect(
    left: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    right: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    result: cesiumLib.cesiumMod.CesiumNs.TimeInterval
  ): cesiumLib.cesiumMod.CesiumNs.TimeInterval = js.native
  def intersect(
    left: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    right: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    result: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    mergeCallback: cesiumLib.cesiumMod.CesiumNs.TimeIntervalNs.MergeCallback
  ): cesiumLib.cesiumMod.CesiumNs.TimeInterval = js.native
  def toIso8601(timeInterval: cesiumLib.cesiumMod.CesiumNs.TimeInterval): java.lang.String = js.native
  def toIso8601(timeInterval: cesiumLib.cesiumMod.CesiumNs.TimeInterval, precision: scala.Double): java.lang.String = js.native
}

