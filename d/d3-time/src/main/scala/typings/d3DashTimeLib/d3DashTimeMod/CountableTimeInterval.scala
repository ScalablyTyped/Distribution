package typings
package d3DashTimeLib.d3DashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountableTimeInterval extends TimeInterval {
  /**
    * Returns the number of interval boundaries after start (exclusive) and before or equal to end (inclusive).
    *
    * Note that this behavior is slightly different than interval.range,
    * because its purpose is to return the zero-based number of the specified end date relative to the specified start date.
    *
    * @param start A start date object.
    * @param end An end date object.
    */
  def count(start: stdLib.Date, end: stdLib.Date): scala.Double = js.native
  /**
    * Returns a filtered view of this interval representing every stepth date.
    *
    * The meaning of step is dependent on this interval’s parent interval as defined by the field function.
    *
    * For example, timeMinute.every(15) returns an interval representing every fifteen minutes,
    * starting on the hour: :00, :15, :30, :45, etc. Note that for some intervals,
    * the resulting dates may not be uniformly-spaced;
    * timeDay’s parent interval is timeMonth, and thus the interval number resets at the start of each month.
    *
    * If step is not valid, returns null. If step is one, returns this interval.
    *
    * This method can be used in conjunction with interval.range to ensure that two overlapping ranges are consistent.
    *
    * The returned filtered interval does not support interval.count. See also interval.filter.
    *
    * @param step Number of steps.
    */
  def every(step: scala.Double): TimeInterval | scala.Null = js.native
}

