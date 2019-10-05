package typings.cesium.cesiumMod

import typings.cesium.Anon_Data
import typings.cesium.Anon_DataIsStartIncluded
import typings.cesium.cesiumMod.TimeInterval.DataComparer
import typings.cesium.cesiumMod.TimeInterval.MergeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TimeInterval")
@js.native
class TimeInterval () extends js.Object {
  def this(options: Anon_Data) = this()
  var data: js.Any = js.native
  var isEmpty: Boolean = js.native
  var isStartIncluded: Boolean = js.native
  var isStopIncluded: Boolean = js.native
  var start: JulianDate = js.native
  var stop: JulianDate = js.native
  def clone(result: TimeInterval): TimeInterval = js.native
  def equals(): Boolean = js.native
  def equals(right: TimeInterval): Boolean = js.native
  def equals(right: TimeInterval, dataComparer: DataComparer): Boolean = js.native
  def equalsEpsilon(right: TimeInterval, epsilon: Double): Boolean = js.native
  def equalsEpsilon(right: TimeInterval, epsilon: Double, dataComparer: DataComparer): Boolean = js.native
}

/* static members */
@JSImport("cesium", "TimeInterval")
@js.native
object TimeInterval extends js.Object {
  var EMPTY: TimeInterval = js.native
  def clone(timeInterval: TimeInterval): TimeInterval = js.native
  def clone(timeInterval: TimeInterval, result: TimeInterval): TimeInterval = js.native
  def contains(timeInterval: TimeInterval, julianDate: JulianDate): Boolean = js.native
  def equals(): Boolean = js.native
  def equals(left: TimeInterval): Boolean = js.native
  def equals(left: TimeInterval, right: TimeInterval): Boolean = js.native
  def equals(left: TimeInterval, right: TimeInterval, dataComparer: DataComparer): Boolean = js.native
  def equalsEpsilon(left: TimeInterval, right: TimeInterval, epsilon: Double): Boolean = js.native
  def equalsEpsilon(left: TimeInterval, right: TimeInterval, epsilon: Double, dataComparer: DataComparer): Boolean = js.native
  def fromIso8601(options: Anon_DataIsStartIncluded): TimeInterval = js.native
  def fromIso8601(options: Anon_DataIsStartIncluded, result: TimeInterval): TimeInterval = js.native
  def intersect(left: TimeInterval, right: TimeInterval, result: TimeInterval): TimeInterval = js.native
  def intersect(left: TimeInterval, right: TimeInterval, result: TimeInterval, mergeCallback: MergeCallback): TimeInterval = js.native
  def toIso8601(timeInterval: TimeInterval): String = js.native
  def toIso8601(timeInterval: TimeInterval, precision: Double): String = js.native
  type DataComparer = js.Function2[/* leftData */ js.Any, /* rightData */ js.Any, Boolean]
  type MergeCallback = js.Function2[/* leftData */ js.Any, /* rightData */ js.Any, js.Any]
}

