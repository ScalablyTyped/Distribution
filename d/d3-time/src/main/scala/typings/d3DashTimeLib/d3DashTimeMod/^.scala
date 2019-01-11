package typings
package d3DashTimeLib.d3DashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-time", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val timeDay: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeFriday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeHour: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeMillisecond: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeMinute: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeMonday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeMonth: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeSaturday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeSecond: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeSunday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeThursday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeTuesday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeWednesday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeWeek: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val timeYear: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcDay: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcFriday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcHour: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcMillisecond: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcMinute: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcMonday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcMonth: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcSaturday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcSecond: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcSunday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcThursday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcTuesday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcWednesday: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcWeek: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  val utcYear: d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  def timeDays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeDays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeFridays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeFridays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeHours(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeHours(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeInterval(
    floor: js.Function1[/* date */ stdLib.Date, scala.Unit],
    offset: js.Function2[/* date */ stdLib.Date, /* step */ scala.Double, scala.Unit]
  ): d3DashTimeLib.d3DashTimeMod.TimeInterval = js.native
  def timeInterval(
    floor: js.Function1[/* date */ stdLib.Date, scala.Unit],
    offset: js.Function2[/* date */ stdLib.Date, /* step */ scala.Double, scala.Unit],
    count: js.Function2[/* start */ stdLib.Date, /* end */ stdLib.Date, scala.Double]
  ): d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  def timeInterval(
    floor: js.Function1[/* date */ stdLib.Date, scala.Unit],
    offset: js.Function2[/* date */ stdLib.Date, /* step */ scala.Double, scala.Unit],
    count: js.Function2[/* start */ stdLib.Date, /* end */ stdLib.Date, scala.Double],
    field: js.Function1[/* date */ stdLib.Date, scala.Double]
  ): d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  def timeMilliseconds(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeMilliseconds(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeMinutes(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeMinutes(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeMondays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeMondays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeMonths(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeMonths(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeSaturdays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeSaturdays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeSeconds(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeSeconds(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeSundays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeSundays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeThursdays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeThursdays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeTuesdays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeTuesdays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeWednesdays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeWednesdays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeWeeks(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeWeeks(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeYears(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeYears(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcDays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcDays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcFridays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcFridays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcHours(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcHours(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcMilliseconds(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcMilliseconds(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcMinutes(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcMinutes(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcMondays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcMondays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcMonths(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcMonths(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcSaturdays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcSaturdays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcSeconds(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcSeconds(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcSundays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcSundays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcThursdays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcThursdays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcTuesdays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcTuesdays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcWednesdays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcWednesdays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcWeeks(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcWeeks(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def utcYears(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def utcYears(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
}

