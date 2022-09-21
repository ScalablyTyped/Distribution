package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "JulianDate")
@js.native
open class JulianDate () extends StObject {
  def this(julianDayNumber: Double) = this()
  def this(julianDayNumber: Double, secondsOfDay: Double) = this()
  def this(julianDayNumber: Unit, secondsOfDay: Double) = this()
  def this(julianDayNumber: Double, secondsOfDay: Double, timeStandard: TimeStandard) = this()
  def this(julianDayNumber: Double, secondsOfDay: Unit, timeStandard: TimeStandard) = this()
  def this(julianDayNumber: Unit, secondsOfDay: Double, timeStandard: TimeStandard) = this()
  def this(julianDayNumber: Unit, secondsOfDay: Unit, timeStandard: TimeStandard) = this()
  
  def clone(result: JulianDate): JulianDate = js.native
  
  /**
    * Gets or sets the number of whole days.
    */
  var dayNumber: Double = js.native
  
  /**
    * Compares this and the provided instance and returns <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The second instance.
    * @returns <code>true</code> if the dates are equal; otherwise, <code>false</code>.
    */
  def equals(): Boolean = js.native
  def equals(right: JulianDate): Boolean = js.native
  
  /**
    * Compares this and the provided instance and returns <code>true</code> if they are within <code>epsilon</code> seconds of
    * each other.  That is, in order for the dates to be considered equal (and for
    * this function to return <code>true</code>), the absolute value of the difference between them, in
    * seconds, must be less than <code>epsilon</code>.
    * @param [right] - The second instance.
    * @param [epsilon = 0] - The maximum number of seconds that should separate the two instances.
    * @returns <code>true</code> if the two dates are within <code>epsilon</code> seconds of each other; otherwise <code>false</code>.
    */
  def equalsEpsilon(): Boolean = js.native
  def equalsEpsilon(right: Unit, epsilon: Double): Boolean = js.native
  def equalsEpsilon(right: JulianDate): Boolean = js.native
  def equalsEpsilon(right: JulianDate, epsilon: Double): Boolean = js.native
  
  /**
    * Gets or sets the number of seconds into the current day.
    */
  var secondsOfDay: Double = js.native
}
/* static members */
object JulianDate {
  
  @JSImport("cesium", "JulianDate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the provided number of days to the provided date instance.
    * @param julianDate - The date.
    * @param days - The number of days to add or subtract.
    * @param result - An existing instance to use for the result.
    * @returns The modified result parameter.
    */
  inline def addDays(julianDate: JulianDate, days: Double, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(julianDate.asInstanceOf[js.Any], days.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /**
    * Adds the provided number of hours to the provided date instance.
    * @param julianDate - The date.
    * @param hours - The number of hours to add or subtract.
    * @param result - An existing instance to use for the result.
    * @returns The modified result parameter.
    */
  inline def addHours(julianDate: JulianDate, hours: Double, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addHours")(julianDate.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /**
    * Adds the provided number of minutes to the provided date instance.
    * @param julianDate - The date.
    * @param minutes - The number of minutes to add or subtract.
    * @param result - An existing instance to use for the result.
    * @returns The modified result parameter.
    */
  inline def addMinutes(julianDate: JulianDate, minutes: Double, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addMinutes")(julianDate.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /**
    * Adds the provided number of seconds to the provided date instance.
    * @param julianDate - The date.
    * @param seconds - The number of seconds to add or subtract.
    * @param result - An existing instance to use for the result.
    * @returns The modified result parameter.
    */
  inline def addSeconds(julianDate: JulianDate, seconds: Double, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addSeconds")(julianDate.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /**
    * Duplicates a JulianDate instance.
    * @param julianDate - The date to duplicate.
    * @param [result] - An existing instance to use for the result.
    * @returns The modified result parameter or a new instance if none was provided. Returns undefined if julianDate is undefined.
    */
  inline def clone(julianDate: JulianDate): JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(julianDate.asInstanceOf[js.Any]).asInstanceOf[JulianDate]
  inline def clone(julianDate: JulianDate, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /**
    * Compares two instances.
    * @param left - The first instance.
    * @param right - The second instance.
    * @returns A negative value if left is less than right, a positive value if left is greater than right, or zero if left and right are equal.
    */
  inline def compare(left: JulianDate, right: JulianDate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Computes the number of seconds the provided instance is ahead of UTC.
    * @param julianDate - The date.
    * @returns The number of seconds the provided instance is ahead of UTC
    */
  inline def computeTaiMinusUtc(julianDate: JulianDate): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTaiMinusUtc")(julianDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Computes the difference in days between the provided instance.
    * @param left - The first instance.
    * @param right - The second instance.
    * @returns The difference, in days, when subtracting <code>right</code> from <code>left</code>.
    */
  inline def daysDifference(left: JulianDate, right: JulianDate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysDifference")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Compares two instances and returns <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [left] - The first instance.
    * @param [right] - The second instance.
    * @returns <code>true</code> if the dates are equal; otherwise, <code>false</code>.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(left: Unit, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: JulianDate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(left: JulianDate, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares two instances and returns <code>true</code> if they are within <code>epsilon</code> seconds of
    * each other.  That is, in order for the dates to be considered equal (and for
    * this function to return <code>true</code>), the absolute value of the difference between them, in
    * seconds, must be less than <code>epsilon</code>.
    * @param [left] - The first instance.
    * @param [right] - The second instance.
    * @param [epsilon = 0] - The maximum number of seconds that should separate the two instances.
    * @returns <code>true</code> if the two dates are within <code>epsilon</code> seconds of each other; otherwise <code>false</code>.
    */
  inline def equalsEpsilon(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")().asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: JulianDate, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: JulianDate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: JulianDate, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: JulianDate, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: JulianDate, right: JulianDate, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Creates a new instance from a JavaScript Date.
    * @param date - A JavaScript Date.
    * @param [result] - An existing instance to use for the result.
    * @returns The modified result parameter or a new instance if none was provided.
    */
  inline def fromDate(date: js.Date): JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[JulianDate]
  inline def fromDate(date: js.Date, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /**
    * Creates a new instance from a GregorianDate.
    * @param date - A GregorianDate.
    * @param [result] - An existing instance to use for the result.
    * @returns The modified result parameter or a new instance if none was provided.
    */
  inline def fromGregorianDate(date: GregorianDate): JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGregorianDate")(date.asInstanceOf[js.Any]).asInstanceOf[JulianDate]
  inline def fromGregorianDate(date: GregorianDate, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGregorianDate")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /**
    * Creates a new instance from a from an {@link http://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date.
    * This method is superior to <code>Date.parse</code> because it will handle all valid formats defined by the ISO 8601
    * specification, including leap seconds and sub-millisecond times, which discarded by most JavaScript implementations.
    * @param iso8601String - An ISO 8601 date.
    * @param [result] - An existing instance to use for the result.
    * @returns The modified result parameter or a new instance if none was provided.
    */
  inline def fromIso8601(iso8601String: String): JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(iso8601String.asInstanceOf[js.Any]).asInstanceOf[JulianDate]
  inline def fromIso8601(iso8601String: String, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(iso8601String.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /**
    * Compares the provided instances and returns <code>true</code> if <code>left</code> is later than <code>right</code>, <code>false</code> otherwise.
    * @param left - The first instance.
    * @param right - The second instance.
    * @returns <code>true</code> if <code>left</code> is later than <code>right</code>, <code>false</code> otherwise.
    */
  inline def greaterThan(left: JulianDate, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares the provided instances and returns <code>true</code> if <code>left</code> is later than or equal to <code>right</code>, <code>false</code> otherwise.
    * @param left - The first instance.
    * @param right - The second instance.
    * @returns <code>true</code> if <code>left</code> is later than or equal to <code>right</code>, <code>false</code> otherwise.
    */
  inline def greaterThanOrEquals(left: JulianDate, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Gets or sets the list of leap seconds used throughout Cesium.
    */
  @JSImport("cesium", "JulianDate.leapSeconds")
  @js.native
  def leapSeconds: js.Array[LeapSecond] = js.native
  inline def leapSeconds_=(x: js.Array[LeapSecond]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leapSeconds")(x.asInstanceOf[js.Any])
  
  /**
    * Compares the provided instances and returns <code>true</code> if <code>left</code> is earlier than <code>right</code>, <code>false</code> otherwise.
    * @param left - The first instance.
    * @param right - The second instance.
    * @returns <code>true</code> if <code>left</code> is earlier than <code>right</code>, <code>false</code> otherwise.
    */
  inline def lessThan(left: JulianDate, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares the provided instances and returns <code>true</code> if <code>left</code> is earlier than or equal to <code>right</code>, <code>false</code> otherwise.
    * @param left - The first instance.
    * @param right - The second instance.
    * @returns <code>true</code> if <code>left</code> is earlier than or equal to <code>right</code>, <code>false</code> otherwise.
    */
  inline def lessThanOrEquals(left: JulianDate, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Creates a new instance that represents the current system time.
    * This is equivalent to calling <code>JulianDate.fromDate(new Date());</code>.
    * @param [result] - An existing instance to use for the result.
    * @returns The modified result parameter or a new instance if none was provided.
    */
  inline def now(): JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[JulianDate]
  inline def now(result: JulianDate): JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(result.asInstanceOf[js.Any]).asInstanceOf[JulianDate]
  
  /**
    * Computes the difference in seconds between the provided instance.
    * @param left - The first instance.
    * @param right - The second instance.
    * @returns The difference, in seconds, when subtracting <code>right</code> from <code>left</code>.
    */
  inline def secondsDifference(left: JulianDate, right: JulianDate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("secondsDifference")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Creates a JavaScript Date from the provided instance.
    * Since JavaScript dates are only accurate to the nearest millisecond and
    * cannot represent a leap second, consider using {@link JulianDate.toGregorianDate} instead.
    * If the provided JulianDate is during a leap second, the previous second is used.
    * @param julianDate - The date to be converted.
    * @returns A new instance representing the provided date.
    */
  inline def toDate(julianDate: JulianDate): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(julianDate.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /**
    * Creates a {@link GregorianDate} from the provided instance.
    * @param julianDate - The date to be converted.
    * @param [result] - An existing instance to use for the result.
    * @returns The modified result parameter or a new instance if none was provided.
    */
  inline def toGregorianDate(julianDate: JulianDate): GregorianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toGregorianDate")(julianDate.asInstanceOf[js.Any]).asInstanceOf[GregorianDate]
  inline def toGregorianDate(julianDate: JulianDate, result: GregorianDate): GregorianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("toGregorianDate")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[GregorianDate]
  
  /**
    * Creates an ISO8601 representation of the provided date.
    * @param julianDate - The date to be converted.
    * @param [precision] - The number of fractional digits used to represent the seconds component.  By default, the most precise representation is used.
    * @returns The ISO8601 representation of the provided date.
    */
  inline def toIso8601(julianDate: JulianDate): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(julianDate.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toIso8601(julianDate: JulianDate, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(julianDate.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Computes the total number of whole and fractional days represented by the provided instance.
    * @param julianDate - The date.
    * @returns The Julian date as single floating point number.
    */
  inline def totalDays(julianDate: JulianDate): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("totalDays")(julianDate.asInstanceOf[js.Any]).asInstanceOf[Double]
}
