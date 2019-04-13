package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TimeIntervalCollection")
@js.native
class TimeIntervalCollection () extends js.Object {
  def this(intervals: js.Array[TimeInterval]) = this()
  val changedEvent: Event[js.Array[TimeIntervalCollection]] = js.native
  val isEmpty: scala.Boolean = js.native
  val isStartIncluded: scala.Boolean = js.native
  val isStopIncluded: scala.Boolean = js.native
  val length: scala.Double = js.native
  val start: JulianDate = js.native
  val stop: JulianDate = js.native
  def addInterval(interval: TimeInterval): scala.Unit = js.native
  def addInterval(interval: TimeInterval, dataComparer: cesiumLib.cesiumMod.TimeIntervalNs.DataComparer): scala.Unit = js.native
  def contains(julianDate: JulianDate): scala.Boolean = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: TimeIntervalCollection): scala.Boolean = js.native
  def equals(right: TimeIntervalCollection, dataComparer: cesiumLib.cesiumMod.TimeIntervalNs.DataComparer): scala.Boolean = js.native
  def findDataForIntervalContainingDate(date: JulianDate): js.Any = js.native
  def findInterval(): TimeInterval = js.native
  def findInterval(options: cesiumLib.Anon_IsStartIncluded): TimeInterval = js.native
  def findIntervalContainingDate(date: JulianDate): js.UndefOr[TimeInterval] = js.native
  def get(index: scala.Double): TimeInterval = js.native
  def indexOf(date: JulianDate): scala.Double = js.native
  def intersect(other: TimeIntervalCollection): TimeIntervalCollection = js.native
  def intersect(other: TimeIntervalCollection, dataComparer: cesiumLib.cesiumMod.TimeIntervalNs.DataComparer): TimeIntervalCollection = js.native
  def intersect(
    other: TimeIntervalCollection,
    dataComparer: cesiumLib.cesiumMod.TimeIntervalNs.DataComparer,
    mergeCallback: cesiumLib.cesiumMod.TimeIntervalNs.MergeCallback
  ): TimeIntervalCollection = js.native
  def removeAll(): scala.Unit = js.native
  def removeInterval(interval: TimeInterval): scala.Unit = js.native
}

