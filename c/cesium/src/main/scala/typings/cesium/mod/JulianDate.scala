package typings.cesium.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "JulianDate")
@js.native
class JulianDate () extends StObject {
  def this(julianDayNumber: Double) = this()
  def this(julianDayNumber: Double, secondsOfDay: Double) = this()
  def this(julianDayNumber: Unit, secondsOfDay: Double) = this()
  def this(julianDayNumber: Double, secondsOfDay: Double, timeStandard: TimeStandard) = this()
  def this(julianDayNumber: Double, secondsOfDay: Unit, timeStandard: TimeStandard) = this()
  def this(julianDayNumber: Unit, secondsOfDay: Double, timeStandard: TimeStandard) = this()
  def this(julianDayNumber: Unit, secondsOfDay: Unit, timeStandard: TimeStandard) = this()
  
  def clone(result: JulianDate): JulianDate = js.native
  
  var dayNumber: Double = js.native
  
  def equals(): Boolean = js.native
  def equals(right: JulianDate): Boolean = js.native
  
  def equalsEpsilon(right: JulianDate, epsilon: Double): Boolean = js.native
  
  var secondsOfDay: Double = js.native
}
object JulianDate {
  
  @JSImport("cesium", "JulianDate")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def addDays(julianDate: JulianDate, days: Double, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(julianDate.asInstanceOf[js.Any], days.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /* static member */
  @scala.inline
  def addHours(julianDate: JulianDate, hours: Double, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addHours")(julianDate.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /* static member */
  @scala.inline
  def addMinutes(julianDate: JulianDate, minutes: Double, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addMinutes")(julianDate.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /* static member */
  @scala.inline
  def addSeconds(julianDate: JulianDate, seconds: Double, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addSeconds")(julianDate.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /* static member */
  @scala.inline
  def clone_(julianDate: JulianDate): JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(julianDate.asInstanceOf[js.Any]).asInstanceOf[JulianDate]
  @scala.inline
  def clone_(julianDate: JulianDate, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /* static member */
  @scala.inline
  def compare(left: JulianDate, right: JulianDate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def computeTaiMinusUtc(julianDate: JulianDate): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTaiMinusUtc")(julianDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def daysDifference(left: JulianDate, right: JulianDate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysDifference")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def equalsEpsilon(left: JulianDate, right: JulianDate, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: JulianDate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: JulianDate, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def fromDate(date: Date): JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[JulianDate]
  @scala.inline
  def fromDate(date: Date, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /* static member */
  @scala.inline
  def fromIso8601(iso8601String: String): JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(iso8601String.asInstanceOf[js.Any]).asInstanceOf[JulianDate]
  @scala.inline
  def fromIso8601(iso8601String: String, result: JulianDate): JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(iso8601String.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[JulianDate]
  
  /* static member */
  @scala.inline
  def greaterThan(left: JulianDate, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def greaterThanOrEquals(left: JulianDate, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @JSImport("cesium", "JulianDate.leapSeconds")
  @js.native
  def leapSeconds: js.Array[LeapSecond] = js.native
  @scala.inline
  def leapSeconds_=(x: js.Array[LeapSecond]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leapSeconds")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def lessThan(left: JulianDate, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def lessThanOrEquals(left: JulianDate, right: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def now(): JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[JulianDate]
  @scala.inline
  def now(result: JulianDate): JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(result.asInstanceOf[js.Any]).asInstanceOf[JulianDate]
  
  /* static member */
  @scala.inline
  def secondsDifference(left: JulianDate, right: JulianDate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("secondsDifference")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def toDate(julianDate: JulianDate): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(julianDate.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  /* static member */
  @scala.inline
  def toGregorianDate(julianDate: JulianDate): GregorianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toGregorianDate")(julianDate.asInstanceOf[js.Any]).asInstanceOf[GregorianDate]
  @scala.inline
  def toGregorianDate(julianDate: JulianDate, result: GregorianDate): GregorianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("toGregorianDate")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[GregorianDate]
  
  /* static member */
  @scala.inline
  def toIso8601(julianDate: JulianDate): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(julianDate.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toIso8601(julianDate: JulianDate, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(julianDate.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  @scala.inline
  def totalDays(julianDate: JulianDate): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("totalDays")(julianDate.asInstanceOf[js.Any]).asInstanceOf[Double]
}
