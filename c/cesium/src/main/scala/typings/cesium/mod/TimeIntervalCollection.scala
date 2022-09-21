package typings.cesium.mod

import typings.cesium.anon.DataCallback
import typings.cesium.anon.Epoch
import typings.cesium.anon.Iso8601Dates
import typings.cesium.anon.Start
import typings.cesium.mod.TimeInterval.DataComparer
import typings.cesium.mod.TimeInterval.MergeCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TimeIntervalCollection")
@js.native
open class TimeIntervalCollection () extends StObject {
  def this(intervals: js.Array[TimeInterval]) = this()
  
  /**
    * Adds an interval to the collection, merging intervals that contain the same data and
    * splitting intervals of different data as needed in order to maintain a non-overlapping collection.
    * The data in the new interval takes precedence over any existing intervals in the collection.
    * @param interval - The interval to add.
    * @param [dataComparer] - A function which compares the data of the two intervals.  If omitted, reference equality is used.
    */
  def addInterval(interval: TimeInterval): Unit = js.native
  def addInterval(interval: TimeInterval, dataComparer: DataComparer): Unit = js.native
  
  /**
    * Gets an event that is raised whenever the collection of intervals change.
    */
  val changedEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Checks if the specified date is inside this collection.
    * @param julianDate - The date to check.
    * @returns <code>true</code> if the collection contains the specified date, <code>false</code> otherwise.
    */
  def contains(julianDate: JulianDate): Boolean = js.native
  
  /**
    * Compares this instance against the provided instance componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The right hand side collection.
    * @param [dataComparer] - A function which compares the data of the two intervals.  If omitted, reference equality is used.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(right: Unit, dataComparer: DataComparer): Boolean = js.native
  def equals(right: TimeIntervalCollection): Boolean = js.native
  def equals(right: TimeIntervalCollection, dataComparer: DataComparer): Boolean = js.native
  
  /**
    * Finds and returns the data for the interval that contains the specified date.
    * @param date - The date to search for.
    * @returns The data for the interval containing the specified date, or <code>undefined</code> if no such interval exists.
    */
  def findDataForIntervalContainingDate(date: JulianDate): Any = js.native
  
  /**
    * Returns the first interval in the collection that matches the specified parameters.
    * All parameters are optional and <code>undefined</code> parameters are treated as a don't care condition.
    * @param [options] - Object with the following properties:
    * @param [options.start] - The start time of the interval.
    * @param [options.stop] - The stop time of the interval.
    * @param [options.isStartIncluded] - <code>true</code> if <code>options.start</code> is included in the interval, <code>false</code> otherwise.
    * @param [options.isStopIncluded] - <code>true</code> if <code>options.stop</code> is included in the interval, <code>false</code> otherwise.
    * @returns The first interval in the collection that matches the specified parameters.
    */
  def findInterval(): js.UndefOr[TimeInterval] = js.native
  def findInterval(options: Start): js.UndefOr[TimeInterval] = js.native
  
  /**
    * Finds and returns the interval that contains the specified date.
    * @param date - The date to search for.
    * @returns The interval containing the specified date, <code>undefined</code> if no such interval exists.
    */
  def findIntervalContainingDate(date: JulianDate): js.UndefOr[TimeInterval] = js.native
  
  /**
    * Gets the interval at the specified index.
    * @param index - The index of the interval to retrieve.
    * @returns The interval at the specified index, or <code>undefined</code> if no interval exists as that index.
    */
  def get(index: Double): js.UndefOr[TimeInterval] = js.native
  
  /**
    * Finds and returns the index of the interval in the collection that contains the specified date.
    * @param date - The date to search for.
    * @returns The index of the interval that contains the specified date, if no such interval exists,
    * it returns a negative number which is the bitwise complement of the index of the next interval that
    * starts after the date, or if no interval starts after the specified date, the bitwise complement of
    * the length of the collection.
    */
  def indexOf(date: JulianDate): Double = js.native
  
  /**
    * Creates a new instance that is the intersection of this collection and the provided collection.
    * @param other - The collection to intersect with.
    * @param [dataComparer] - A function which compares the data of the two intervals.  If omitted, reference equality is used.
    * @param [mergeCallback] - A function which merges the data of the two intervals. If omitted, the data from the left interval will be used.
    * @returns A new TimeIntervalCollection which is the intersection of this collection and the provided collection.
    */
  def intersect(other: TimeIntervalCollection): TimeIntervalCollection = js.native
  def intersect(other: TimeIntervalCollection, dataComparer: Unit, mergeCallback: MergeCallback): TimeIntervalCollection = js.native
  def intersect(other: TimeIntervalCollection, dataComparer: DataComparer): TimeIntervalCollection = js.native
  def intersect(other: TimeIntervalCollection, dataComparer: DataComparer, mergeCallback: MergeCallback): TimeIntervalCollection = js.native
  
  /**
    * Gets whether or not the collection is empty.
    */
  val isEmpty: Boolean = js.native
  
  /**
    * Gets whether or not the start time is included in the collection.
    */
  val isStartIncluded: Boolean = js.native
  
  /**
    * Gets whether or not the stop time is included in the collection.
    */
  val isStopIncluded: Boolean = js.native
  
  /**
    * Gets the number of intervals in the collection.
    */
  val length: Double = js.native
  
  /**
    * Removes all intervals from the collection.
    */
  def removeAll(): Unit = js.native
  
  /**
    * Removes the specified interval from this interval collection, creating a hole over the specified interval.
    * The data property of the input interval is ignored.
    * @param interval - The interval to remove.
    * @returns <code>true</code> if the interval was removed, <code>false</code> if no part of the interval was in the collection.
    */
  def removeInterval(interval: TimeInterval): Boolean = js.native
  
  /**
    * Gets the start time of the collection.
    */
  val start: JulianDate = js.native
  
  /**
    * Gets the stop time of the collection.
    */
  val stop: JulianDate = js.native
}
/* static members */
object TimeIntervalCollection {
  
  @JSImport("cesium", "TimeIntervalCollection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance from an {@link http://en.wikipedia.org/wiki/ISO_8601|ISO 8601} time interval (start/end/duration).
    * @param options - Object with the following properties:
    * @param options.iso8601 - An ISO 8601 interval.
    * @param [options.isStartIncluded = true] - <code>true</code> if start time is included in the interval, <code>false</code> otherwise.
    * @param [options.isStopIncluded = true] - <code>true</code> if stop time is included in the interval, <code>false</code> otherwise.
    * @param [options.leadingInterval = false] - <code>true</code> if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  <code>false</code> otherwise.
    * @param [options.trailingInterval = false] - <code>true</code> if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  <code>false</code> otherwise.
    * @param [options.dataCallback] - A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
    * @param [result] - An existing instance to use for the result.
    * @returns The modified result parameter or a new instance if none was provided.
    */
  inline def fromIso8601(options: typings.cesium.anon.Iso8601): TimeIntervalCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(options.asInstanceOf[js.Any]).asInstanceOf[TimeIntervalCollection]
  inline def fromIso8601(options: typings.cesium.anon.Iso8601, result: TimeIntervalCollection): TimeIntervalCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeIntervalCollection]
  
  /**
    * Creates a new instance from a {@link http://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date array.
    * @param options - Object with the following properties:
    * @param options.iso8601Dates - An array of ISO 8601 dates.
    * @param [options.isStartIncluded = true] - <code>true</code> if start time is included in the interval, <code>false</code> otherwise.
    * @param [options.isStopIncluded = true] - <code>true</code> if stop time is included in the interval, <code>false</code> otherwise.
    * @param [options.leadingInterval = false] - <code>true</code> if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  <code>false</code> otherwise.
    * @param [options.trailingInterval = false] - <code>true</code> if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  <code>false</code> otherwise.
    * @param [options.dataCallback] - A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
    * @param [result] - An existing instance to use for the result.
    * @returns The modified result parameter or a new instance if none was provided.
    */
  inline def fromIso8601DateArray(options: Iso8601Dates): TimeIntervalCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601DateArray")(options.asInstanceOf[js.Any]).asInstanceOf[TimeIntervalCollection]
  inline def fromIso8601DateArray(options: Iso8601Dates, result: TimeIntervalCollection): TimeIntervalCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601DateArray")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeIntervalCollection]
  
  /**
    * Creates a new instance from a {@link http://en.wikipedia.org/wiki/ISO_8601|ISO 8601} duration array.
    * @param options - Object with the following properties:
    * @param options.epoch - An date that the durations are relative to.
    * @param options.iso8601Durations - An array of ISO 8601 durations.
    * @param [options.relativeToPrevious = false] - <code>true</code> if durations are relative to previous date, <code>false</code> if always relative to the epoch.
    * @param [options.isStartIncluded = true] - <code>true</code> if start time is included in the interval, <code>false</code> otherwise.
    * @param [options.isStopIncluded = true] - <code>true</code> if stop time is included in the interval, <code>false</code> otherwise.
    * @param [options.leadingInterval = false] - <code>true</code> if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  <code>false</code> otherwise.
    * @param [options.trailingInterval = false] - <code>true</code> if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  <code>false</code> otherwise.
    * @param [options.dataCallback] - A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
    * @param [result] - An existing instance to use for the result.
    * @returns The modified result parameter or a new instance if none was provided.
    */
  inline def fromIso8601DurationArray(options: Epoch): TimeIntervalCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601DurationArray")(options.asInstanceOf[js.Any]).asInstanceOf[TimeIntervalCollection]
  inline def fromIso8601DurationArray(options: Epoch, result: TimeIntervalCollection): TimeIntervalCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601DurationArray")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeIntervalCollection]
  
  /**
    * Creates a new instance from a JulianDate array.
    * @param options - Object with the following properties:
    * @param options.julianDates - An array of ISO 8601 dates.
    * @param [options.isStartIncluded = true] - <code>true</code> if start time is included in the interval, <code>false</code> otherwise.
    * @param [options.isStopIncluded = true] - <code>true</code> if stop time is included in the interval, <code>false</code> otherwise.
    * @param [options.leadingInterval = false] - <code>true</code> if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  <code>false</code> otherwise.
    * @param [options.trailingInterval = false] - <code>true</code> if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  <code>false</code> otherwise.
    * @param [options.dataCallback] - A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
    * @param [result] - An existing instance to use for the result.
    * @returns The modified result parameter or a new instance if none was provided.
    */
  inline def fromJulianDateArray(options: DataCallback): TimeIntervalCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJulianDateArray")(options.asInstanceOf[js.Any]).asInstanceOf[TimeIntervalCollection]
  inline def fromJulianDateArray(options: DataCallback, result: TimeIntervalCollection): TimeIntervalCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJulianDateArray")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeIntervalCollection]
}
