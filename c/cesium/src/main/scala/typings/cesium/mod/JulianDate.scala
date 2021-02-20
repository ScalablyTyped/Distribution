package typings.cesium.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "JulianDate")
@js.native
class JulianDate () extends StObject {
  def this(julianDayNumber: Double) = this()
  def this(julianDayNumber: js.UndefOr[scala.Nothing], secondsOfDay: Double) = this()
  def this(julianDayNumber: Double, secondsOfDay: Double) = this()
  def this(
    julianDayNumber: js.UndefOr[scala.Nothing],
    secondsOfDay: js.UndefOr[scala.Nothing],
    timeStandard: TimeStandard
  ) = this()
  def this(julianDayNumber: js.UndefOr[scala.Nothing], secondsOfDay: Double, timeStandard: TimeStandard) = this()
  def this(julianDayNumber: Double, secondsOfDay: js.UndefOr[scala.Nothing], timeStandard: TimeStandard) = this()
  def this(julianDayNumber: Double, secondsOfDay: Double, timeStandard: TimeStandard) = this()
  
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
  @JSImport("cesium", "JulianDate.addDays")
  @js.native
  def addDays(julianDate: JulianDate, days: Double, result: JulianDate): JulianDate = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.addHours")
  @js.native
  def addHours(julianDate: JulianDate, hours: Double, result: JulianDate): JulianDate = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.addMinutes")
  @js.native
  def addMinutes(julianDate: JulianDate, minutes: Double, result: JulianDate): JulianDate = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.addSeconds")
  @js.native
  def addSeconds(julianDate: JulianDate, seconds: Double, result: JulianDate): JulianDate = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.clone")
  @js.native
  def clone_(julianDate: JulianDate): JulianDate = js.native
  @JSImport("cesium", "JulianDate.clone")
  @js.native
  def clone_(julianDate: JulianDate, result: JulianDate): JulianDate = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.compare")
  @js.native
  def compare(left: JulianDate, right: JulianDate): Double = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.computeTaiMinusUtc")
  @js.native
  def computeTaiMinusUtc(julianDate: JulianDate): Double = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.daysDifference")
  @js.native
  def daysDifference(left: JulianDate, right: JulianDate): Double = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: JulianDate, right: JulianDate, epsilon: Double): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.equals")
  @js.native
  def equals_(): Boolean = js.native
  @JSImport("cesium", "JulianDate.equals")
  @js.native
  def equals_(left: js.UndefOr[scala.Nothing], right: JulianDate): Boolean = js.native
  @JSImport("cesium", "JulianDate.equals")
  @js.native
  def equals_(left: JulianDate): Boolean = js.native
  @JSImport("cesium", "JulianDate.equals")
  @js.native
  def equals_(left: JulianDate, right: JulianDate): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.fromDate")
  @js.native
  def fromDate(date: Date): JulianDate = js.native
  @JSImport("cesium", "JulianDate.fromDate")
  @js.native
  def fromDate(date: Date, result: JulianDate): JulianDate = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.fromIso8601")
  @js.native
  def fromIso8601(iso8601String: String): JulianDate = js.native
  @JSImport("cesium", "JulianDate.fromIso8601")
  @js.native
  def fromIso8601(iso8601String: String, result: JulianDate): JulianDate = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.greaterThan")
  @js.native
  def greaterThan(left: JulianDate, right: JulianDate): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.greaterThanOrEquals")
  @js.native
  def greaterThanOrEquals(left: JulianDate, right: JulianDate): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.leapSeconds")
  @js.native
  def leapSeconds: js.Array[LeapSecond] = js.native
  @scala.inline
  def leapSeconds_=(x: js.Array[LeapSecond]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leapSeconds")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "JulianDate.lessThan")
  @js.native
  def lessThan(left: JulianDate, right: JulianDate): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.lessThanOrEquals")
  @js.native
  def lessThanOrEquals(left: JulianDate, right: JulianDate): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.now")
  @js.native
  def now(): JulianDate = js.native
  @JSImport("cesium", "JulianDate.now")
  @js.native
  def now(result: JulianDate): JulianDate = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.secondsDifference")
  @js.native
  def secondsDifference(left: JulianDate, right: JulianDate): Double = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.toDate")
  @js.native
  def toDate(julianDate: JulianDate): Date = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.toGregorianDate")
  @js.native
  def toGregorianDate(julianDate: JulianDate): GregorianDate = js.native
  @JSImport("cesium", "JulianDate.toGregorianDate")
  @js.native
  def toGregorianDate(julianDate: JulianDate, result: GregorianDate): GregorianDate = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.toIso8601")
  @js.native
  def toIso8601(julianDate: JulianDate): String = js.native
  @JSImport("cesium", "JulianDate.toIso8601")
  @js.native
  def toIso8601(julianDate: JulianDate, precision: Double): String = js.native
  
  /* static member */
  @JSImport("cesium", "JulianDate.totalDays")
  @js.native
  def totalDays(julianDate: JulianDate): Double = js.native
}
