package typings.cesium.global.Cesium

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.JulianDate")
@js.native
class JulianDate ()
  extends typings.cesium.mod.JulianDate {
  def this(julianDayNumber: Double) = this()
  def this(julianDayNumber: Double, secondsOfDay: Double) = this()
  def this(julianDayNumber: Unit, secondsOfDay: Double) = this()
  def this(julianDayNumber: Double, secondsOfDay: Double, timeStandard: typings.cesium.mod.TimeStandard) = this()
  def this(julianDayNumber: Double, secondsOfDay: Unit, timeStandard: typings.cesium.mod.TimeStandard) = this()
  def this(julianDayNumber: Unit, secondsOfDay: Double, timeStandard: typings.cesium.mod.TimeStandard) = this()
  def this(julianDayNumber: Unit, secondsOfDay: Unit, timeStandard: typings.cesium.mod.TimeStandard) = this()
}
object JulianDate {
  
  @JSGlobal("Cesium.JulianDate")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def addDays(julianDate: typings.cesium.mod.JulianDate, days: Double, result: typings.cesium.mod.JulianDate): typings.cesium.mod.JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(julianDate.asInstanceOf[js.Any], days.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.JulianDate]
  
  /* static member */
  inline def addHours(julianDate: typings.cesium.mod.JulianDate, hours: Double, result: typings.cesium.mod.JulianDate): typings.cesium.mod.JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addHours")(julianDate.asInstanceOf[js.Any], hours.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.JulianDate]
  
  /* static member */
  inline def addMinutes(julianDate: typings.cesium.mod.JulianDate, minutes: Double, result: typings.cesium.mod.JulianDate): typings.cesium.mod.JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addMinutes")(julianDate.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.JulianDate]
  
  /* static member */
  inline def addSeconds(julianDate: typings.cesium.mod.JulianDate, seconds: Double, result: typings.cesium.mod.JulianDate): typings.cesium.mod.JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("addSeconds")(julianDate.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.JulianDate]
  
  /* static member */
  inline def clone_(julianDate: typings.cesium.mod.JulianDate): typings.cesium.mod.JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(julianDate.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.JulianDate]
  inline def clone_(julianDate: typings.cesium.mod.JulianDate, result: typings.cesium.mod.JulianDate): typings.cesium.mod.JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.JulianDate]
  
  /* static member */
  inline def compare(left: typings.cesium.mod.JulianDate, right: typings.cesium.mod.JulianDate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def computeTaiMinusUtc(julianDate: typings.cesium.mod.JulianDate): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTaiMinusUtc")(julianDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def daysDifference(left: typings.cesium.mod.JulianDate, right: typings.cesium.mod.JulianDate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysDifference")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def equalsEpsilon(left: typings.cesium.mod.JulianDate, right: typings.cesium.mod.JulianDate, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.JulianDate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.JulianDate, right: typings.cesium.mod.JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromDate(date: Date): typings.cesium.mod.JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.JulianDate]
  inline def fromDate(date: Date, result: typings.cesium.mod.JulianDate): typings.cesium.mod.JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.JulianDate]
  
  /* static member */
  inline def fromIso8601(iso8601String: String): typings.cesium.mod.JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(iso8601String.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.JulianDate]
  inline def fromIso8601(iso8601String: String, result: typings.cesium.mod.JulianDate): typings.cesium.mod.JulianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(iso8601String.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.JulianDate]
  
  /* static member */
  inline def greaterThan(left: typings.cesium.mod.JulianDate, right: typings.cesium.mod.JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def greaterThanOrEquals(left: typings.cesium.mod.JulianDate, right: typings.cesium.mod.JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @JSGlobal("Cesium.JulianDate.leapSeconds")
  @js.native
  def leapSeconds: js.Array[typings.cesium.mod.LeapSecond] = js.native
  inline def leapSeconds_=(x: js.Array[typings.cesium.mod.LeapSecond]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leapSeconds")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def lessThan(left: typings.cesium.mod.JulianDate, right: typings.cesium.mod.JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def lessThanOrEquals(left: typings.cesium.mod.JulianDate, right: typings.cesium.mod.JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def now(): typings.cesium.mod.JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.cesium.mod.JulianDate]
  inline def now(result: typings.cesium.mod.JulianDate): typings.cesium.mod.JulianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(result.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.JulianDate]
  
  /* static member */
  inline def secondsDifference(left: typings.cesium.mod.JulianDate, right: typings.cesium.mod.JulianDate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("secondsDifference")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def toDate(julianDate: typings.cesium.mod.JulianDate): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(julianDate.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  /* static member */
  inline def toGregorianDate(julianDate: typings.cesium.mod.JulianDate): typings.cesium.mod.GregorianDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toGregorianDate")(julianDate.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.GregorianDate]
  inline def toGregorianDate(julianDate: typings.cesium.mod.JulianDate, result: typings.cesium.mod.GregorianDate): typings.cesium.mod.GregorianDate = (^.asInstanceOf[js.Dynamic].applyDynamic("toGregorianDate")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.GregorianDate]
  
  /* static member */
  inline def toIso8601(julianDate: typings.cesium.mod.JulianDate): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(julianDate.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toIso8601(julianDate: typings.cesium.mod.JulianDate, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(julianDate.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def totalDays(julianDate: typings.cesium.mod.JulianDate): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("totalDays")(julianDate.asInstanceOf[js.Any]).asInstanceOf[Double]
}
