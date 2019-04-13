package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "JulianDate")
@js.native
class JulianDate () extends js.Object {
  def this(julianDayNumber: scala.Double) = this()
  def this(julianDayNumber: scala.Double, secondsOfDay: scala.Double) = this()
  def this(julianDayNumber: scala.Double, secondsOfDay: scala.Double, timeStandard: TimeStandard) = this()
  var dayNumber: scala.Double = js.native
  var secondsOfDay: scala.Double = js.native
  def clone(result: JulianDate): JulianDate = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: JulianDate): scala.Boolean = js.native
  def equalsEpsilon(right: JulianDate, epsilon: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "JulianDate")
@js.native
object JulianDate extends js.Object {
  var leapSeconds: js.Array[cesiumLib.cesiumMod.LeapSecond] = js.native
  def addDays(
    julianDate: cesiumLib.cesiumMod.JulianDate,
    days: scala.Double,
    result: cesiumLib.cesiumMod.JulianDate
  ): cesiumLib.cesiumMod.JulianDate = js.native
  def addHours(
    julianDate: cesiumLib.cesiumMod.JulianDate,
    hours: scala.Double,
    result: cesiumLib.cesiumMod.JulianDate
  ): cesiumLib.cesiumMod.JulianDate = js.native
  def addMinutes(
    julianDate: cesiumLib.cesiumMod.JulianDate,
    minutes: scala.Double,
    result: cesiumLib.cesiumMod.JulianDate
  ): cesiumLib.cesiumMod.JulianDate = js.native
  def addSeconds(
    julianDate: cesiumLib.cesiumMod.JulianDate,
    seconds: scala.Double,
    result: cesiumLib.cesiumMod.JulianDate
  ): cesiumLib.cesiumMod.JulianDate = js.native
  def clone(julianDate: cesiumLib.cesiumMod.JulianDate): cesiumLib.cesiumMod.JulianDate = js.native
  def clone(julianDate: cesiumLib.cesiumMod.JulianDate, result: cesiumLib.cesiumMod.JulianDate): cesiumLib.cesiumMod.JulianDate = js.native
  def compare(left: cesiumLib.cesiumMod.JulianDate, right: cesiumLib.cesiumMod.JulianDate): scala.Double = js.native
  def computeTaiMinusUtc(julianDate: cesiumLib.cesiumMod.JulianDate): scala.Double = js.native
  def daysDifference(left: cesiumLib.cesiumMod.JulianDate, right: cesiumLib.cesiumMod.JulianDate): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.JulianDate): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.JulianDate, right: cesiumLib.cesiumMod.JulianDate): scala.Boolean = js.native
  def equalsEpsilon(left: cesiumLib.cesiumMod.JulianDate, right: cesiumLib.cesiumMod.JulianDate, epsilon: scala.Double): scala.Boolean = js.native
  def fromDate(date: stdLib.Date): cesiumLib.cesiumMod.JulianDate = js.native
  def fromDate(date: stdLib.Date, result: cesiumLib.cesiumMod.JulianDate): cesiumLib.cesiumMod.JulianDate = js.native
  def fromIso8601(iso8601String: java.lang.String): cesiumLib.cesiumMod.JulianDate = js.native
  def fromIso8601(iso8601String: java.lang.String, result: cesiumLib.cesiumMod.JulianDate): cesiumLib.cesiumMod.JulianDate = js.native
  def greaterThan(left: cesiumLib.cesiumMod.JulianDate, right: cesiumLib.cesiumMod.JulianDate): scala.Boolean = js.native
  def greaterThanOrEquals(left: cesiumLib.cesiumMod.JulianDate, right: cesiumLib.cesiumMod.JulianDate): scala.Boolean = js.native
  def lessThan(left: cesiumLib.cesiumMod.JulianDate, right: cesiumLib.cesiumMod.JulianDate): scala.Boolean = js.native
  def lessThanOrEquals(left: cesiumLib.cesiumMod.JulianDate, right: cesiumLib.cesiumMod.JulianDate): scala.Boolean = js.native
  def now(): cesiumLib.cesiumMod.JulianDate = js.native
  def now(result: cesiumLib.cesiumMod.JulianDate): cesiumLib.cesiumMod.JulianDate = js.native
  def secondsDifference(left: cesiumLib.cesiumMod.JulianDate, right: cesiumLib.cesiumMod.JulianDate): scala.Double = js.native
  def toDate(julianDate: cesiumLib.cesiumMod.JulianDate): stdLib.Date = js.native
  def toGregorianDate(julianDate: cesiumLib.cesiumMod.JulianDate): cesiumLib.cesiumMod.GregorianDate = js.native
  def toGregorianDate(julianDate: cesiumLib.cesiumMod.JulianDate, result: cesiumLib.cesiumMod.GregorianDate): cesiumLib.cesiumMod.GregorianDate = js.native
  def toIso8601(julianDate: cesiumLib.cesiumMod.JulianDate): java.lang.String = js.native
  def toIso8601(julianDate: cesiumLib.cesiumMod.JulianDate, precision: scala.Double): java.lang.String = js.native
  def totalDays(julianDate: cesiumLib.cesiumMod.JulianDate): scala.Double = js.native
}

