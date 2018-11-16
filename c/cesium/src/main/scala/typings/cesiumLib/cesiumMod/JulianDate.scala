package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "JulianDate")
@js.native
class JulianDate ()
  extends cesiumLib.cesiumMod.CesiumNs.JulianDate {
  def this(julianDayNumber: scala.Double) = this()
  def this(julianDayNumber: scala.Double, secondsOfDay: scala.Double) = this()
  def this(julianDayNumber: scala.Double, secondsOfDay: scala.Double, timeStandard: cesiumLib.cesiumMod.CesiumNs.TimeStandard) = this()
}

@JSImport("cesium", "JulianDate")
@js.native
object JulianDate extends js.Object {
  var leapSeconds: js.Array[cesiumLib.cesiumMod.CesiumNs.LeapSecond] = js.native
  def addDays(
    julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate,
    days: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.JulianDate
  ): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def addHours(
    julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate,
    hours: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.JulianDate
  ): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def addMinutes(
    julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate,
    minutes: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.JulianDate
  ): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def addSeconds(
    julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate,
    seconds: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.JulianDate
  ): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def clone(julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def clone(
    julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate,
    result: cesiumLib.cesiumMod.CesiumNs.JulianDate
  ): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def compare(left: cesiumLib.cesiumMod.CesiumNs.JulianDate, right: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Double = js.native
  def computeTaiMinusUtc(julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Double = js.native
  def daysDifference(left: cesiumLib.cesiumMod.CesiumNs.JulianDate, right: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.JulianDate, right: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.CesiumNs.JulianDate,
    right: cesiumLib.cesiumMod.CesiumNs.JulianDate,
    epsilon: scala.Double
  ): scala.Boolean = js.native
  def fromDate(date: stdLib.Date): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def fromDate(date: stdLib.Date, result: cesiumLib.cesiumMod.CesiumNs.JulianDate): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def fromIso8601(iso8601String: java.lang.String): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def fromIso8601(iso8601String: java.lang.String, result: cesiumLib.cesiumMod.CesiumNs.JulianDate): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def greaterThan(left: cesiumLib.cesiumMod.CesiumNs.JulianDate, right: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
  def greaterThanOrEquals(left: cesiumLib.cesiumMod.CesiumNs.JulianDate, right: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
  def lessThan(left: cesiumLib.cesiumMod.CesiumNs.JulianDate, right: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
  def lessThanOrEquals(left: cesiumLib.cesiumMod.CesiumNs.JulianDate, right: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
  def now(): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def now(result: cesiumLib.cesiumMod.CesiumNs.JulianDate): cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  def secondsDifference(left: cesiumLib.cesiumMod.CesiumNs.JulianDate, right: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Double = js.native
  def toDate(julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate): stdLib.Date = js.native
  def toGregorianDate(julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate): cesiumLib.cesiumMod.CesiumNs.GregorianDate = js.native
  def toGregorianDate(
    julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate,
    result: cesiumLib.cesiumMod.CesiumNs.GregorianDate
  ): cesiumLib.cesiumMod.CesiumNs.GregorianDate = js.native
  def toIso8601(julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate): java.lang.String = js.native
  def toIso8601(julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate, precision: scala.Double): java.lang.String = js.native
  def totalDays(julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Double = js.native
}

