package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.IsStartIncluded
import typings.cesiumEngine.anon.IsStopIncluded
import typings.cesiumEngine.mod.TimeInterval.DataComparer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "TimeInterval")
@js.native
open class TimeInterval () extends StObject {
  def this(options: IsStartIncluded) = this()
  
  def clone(result: TimeInterval): TimeInterval = js.native
  
  /**
    * Gets or sets the data associated with this interval.
    */
  var data: Any = js.native
  
  /**
    * Compares this instance against the provided instance componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The right hand side interval.
    * @param [dataComparer] - A function which compares the data of the two intervals.  If omitted, reference equality is used.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(right: Unit, dataComparer: DataComparer): Boolean = js.native
  def equals(right: TimeInterval): Boolean = js.native
  def equals(right: TimeInterval, dataComparer: DataComparer): Boolean = js.native
  
  /**
    * Compares this instance against the provided instance componentwise and returns
    * <code>true</code> if they are within the provided epsilon,
    * <code>false</code> otherwise.
    * @param [right] - The right hand side interval.
    * @param [epsilon = 0] - The epsilon to use for equality testing.
    * @param [dataComparer] - A function which compares the data of the two intervals.  If omitted, reference equality is used.
    * @returns <code>true</code> if they are within the provided epsilon, <code>false</code> otherwise.
    */
  def equalsEpsilon(): Boolean = js.native
  def equalsEpsilon(right: Unit, epsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Unit, epsilon: Double, dataComparer: DataComparer): Boolean = js.native
  def equalsEpsilon(right: Unit, epsilon: Unit, dataComparer: DataComparer): Boolean = js.native
  def equalsEpsilon(right: TimeInterval): Boolean = js.native
  def equalsEpsilon(right: TimeInterval, epsilon: Double): Boolean = js.native
  def equalsEpsilon(right: TimeInterval, epsilon: Double, dataComparer: DataComparer): Boolean = js.native
  def equalsEpsilon(right: TimeInterval, epsilon: Unit, dataComparer: DataComparer): Boolean = js.native
  
  /**
    * Gets whether or not this interval is empty.
    */
  val isEmpty: Boolean = js.native
  
  /**
    * Gets or sets whether or not the start time is included in this interval.
    */
  var isStartIncluded: Boolean = js.native
  
  /**
    * Gets or sets whether or not the stop time is included in this interval.
    */
  var isStopIncluded: Boolean = js.native
  
  /**
    * Gets or sets the start time of this interval.
    */
  var start: JulianDate = js.native
  
  /**
    * Gets or sets the stop time of this interval.
    */
  var stop: JulianDate = js.native
}
/* static members */
object TimeInterval {
  
  @JSImport("@cesium/engine", "TimeInterval")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An immutable empty interval.
    */
  @JSImport("@cesium/engine", "TimeInterval.EMPTY")
  @js.native
  val EMPTY: TimeInterval = js.native
  
  inline def clone(timeInterval: Unit, result: TimeInterval): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(timeInterval.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  inline def clone(timeInterval: TimeInterval): TimeInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(timeInterval.asInstanceOf[js.Any]).asInstanceOf[TimeInterval]
  inline def clone(timeInterval: TimeInterval, result: TimeInterval): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(timeInterval.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  
  /**
    * Checks if the specified date is inside the provided interval.
    * @param timeInterval - The interval.
    * @param julianDate - The date to check.
    * @returns <code>true</code> if the interval contains the specified date, <code>false</code> otherwise.
    */
  inline def contains(timeInterval: TimeInterval, julianDate: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(timeInterval.asInstanceOf[js.Any], julianDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares two instances and returns <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [left] - The first instance.
    * @param [right] - The second instance.
    * @param [dataComparer] - A function which compares the data of the two intervals.  If omitted, reference equality is used.
    * @returns <code>true</code> if the dates are equal; otherwise, <code>false</code>.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(left: Unit, right: Unit, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: Unit, right: TimeInterval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: Unit, right: TimeInterval, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: TimeInterval): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(left: TimeInterval, right: Unit, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: TimeInterval, right: TimeInterval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: TimeInterval, right: TimeInterval, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares two instances and returns <code>true</code> if they are within <code>epsilon</code> seconds of
    * each other.  That is, in order for the dates to be considered equal (and for
    * this function to return <code>true</code>), the absolute value of the difference between them, in
    * seconds, must be less than <code>epsilon</code>.
    * @param [left] - The first instance.
    * @param [right] - The second instance.
    * @param [epsilon = 0] - The maximum number of seconds that should separate the two instances.
    * @param [dataComparer] - A function which compares the data of the two intervals.  If omitted, reference equality is used.
    * @returns <code>true</code> if the two dates are within <code>epsilon</code> seconds of each other; otherwise <code>false</code>.
    */
  inline def equalsEpsilon(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")().asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, epsilon: Double, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, epsilon: Unit, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: TimeInterval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: TimeInterval, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: TimeInterval, epsilon: Double, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: TimeInterval, epsilon: Unit, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: TimeInterval): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: TimeInterval, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: TimeInterval, right: Unit, epsilon: Double, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: TimeInterval, right: Unit, epsilon: Unit, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: TimeInterval, right: TimeInterval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: TimeInterval, right: TimeInterval, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: TimeInterval, right: TimeInterval, epsilon: Double, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: TimeInterval, right: TimeInterval, epsilon: Unit, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Creates a new instance from a {@link http://en.wikipedia.org/wiki/ISO_8601|ISO 8601} interval.
    * @param options - Object with the following properties:
    * @param options.iso8601 - An ISO 8601 interval.
    * @param [options.isStartIncluded = true] - <code>true</code> if <code>options.start</code> is included in the interval, <code>false</code> otherwise.
    * @param [options.isStopIncluded = true] - <code>true</code> if <code>options.stop</code> is included in the interval, <code>false</code> otherwise.
    * @param [options.data] - Arbitrary data associated with this interval.
    * @param [result] - An existing instance to use for the result.
    * @returns The modified result parameter or a new instance if none was provided.
    */
  inline def fromIso8601(options: IsStopIncluded): TimeInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(options.asInstanceOf[js.Any]).asInstanceOf[TimeInterval]
  inline def fromIso8601(options: IsStopIncluded, result: TimeInterval): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  
  /**
    * Computes the intersection of two intervals, optionally merging their data.
    * @param left - The first interval.
    * @param [right] - The second interval.
    * @param [result] - An existing instance to use for the result.
    * @param [mergeCallback] - A function which merges the data of the two intervals. If omitted, the data from the left interval will be used.
    * @returns The modified result parameter.
    */
  inline def intersect(left: TimeInterval): TimeInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any]).asInstanceOf[TimeInterval]
  inline def intersect(left: TimeInterval, right: Unit, result: Unit, mergeCallback: MergeCallback): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any], mergeCallback.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  inline def intersect(left: TimeInterval, right: Unit, result: TimeInterval): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  inline def intersect(left: TimeInterval, right: Unit, result: TimeInterval, mergeCallback: MergeCallback): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any], mergeCallback.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  inline def intersect(left: TimeInterval, right: TimeInterval): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  inline def intersect(left: TimeInterval, right: TimeInterval, result: Unit, mergeCallback: MergeCallback): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any], mergeCallback.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  inline def intersect(left: TimeInterval, right: TimeInterval, result: TimeInterval): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  inline def intersect(left: TimeInterval, right: TimeInterval, result: TimeInterval, mergeCallback: MergeCallback): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any], mergeCallback.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  
  /**
    * Creates an ISO8601 representation of the provided interval.
    * @param timeInterval - The interval to be converted.
    * @param [precision] - The number of fractional digits used to represent the seconds component.  By default, the most precise representation is used.
    * @returns The ISO8601 representation of the provided interval.
    */
  inline def toIso8601(timeInterval: TimeInterval): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(timeInterval.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toIso8601(timeInterval: TimeInterval, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(timeInterval.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Function interface for comparing interval data.
    * @param leftData - The first data instance.
    * @param rightData - The second data instance.
    */
  type DataComparer = js.Function2[/* leftData */ Any, /* rightData */ Any, Boolean]
  
  /**
    * Function interface for merging interval data.
    * @param leftData - The first data instance.
    * @param rightData - The second data instance.
    */
  type MergeCallback = js.Function2[/* leftData */ Any, /* rightData */ Any, Any]
}
