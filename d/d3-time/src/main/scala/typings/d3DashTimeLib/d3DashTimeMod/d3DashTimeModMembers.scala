package typings
package d3DashTimeLib.d3DashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-time", JSImport.Namespace)
@js.native
object d3DashTimeModMembers extends js.Object {
  val timeDay: CountableTimeInterval = js.native
  val timeFriday: CountableTimeInterval = js.native
  val timeHour: CountableTimeInterval = js.native
  val timeMillisecond: CountableTimeInterval = js.native
  val timeMinute: CountableTimeInterval = js.native
  val timeMonday: CountableTimeInterval = js.native
  val timeMonth: CountableTimeInterval = js.native
  val timeSaturday: CountableTimeInterval = js.native
  val timeSecond: CountableTimeInterval = js.native
  val timeSunday: CountableTimeInterval = js.native
  val timeThursday: CountableTimeInterval = js.native
  val timeTuesday: CountableTimeInterval = js.native
  val timeWednesday: CountableTimeInterval = js.native
  val timeWeek: CountableTimeInterval = js.native
  val timeYear: CountableTimeInterval = js.native
  val utcDay: CountableTimeInterval = js.native
  val utcFriday: CountableTimeInterval = js.native
  val utcHour: CountableTimeInterval = js.native
  val utcMillisecond: CountableTimeInterval = js.native
  val utcMinute: CountableTimeInterval = js.native
  val utcMonday: CountableTimeInterval = js.native
  val utcMonth: CountableTimeInterval = js.native
  val utcSaturday: CountableTimeInterval = js.native
  val utcSecond: CountableTimeInterval = js.native
  val utcSunday: CountableTimeInterval = js.native
  val utcThursday: CountableTimeInterval = js.native
  val utcTuesday: CountableTimeInterval = js.native
  val utcWednesday: CountableTimeInterval = js.native
  val utcWeek: CountableTimeInterval = js.native
  val utcYear: CountableTimeInterval = js.native
  def timeDays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeDays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeFridays(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeFridays(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeHours(start: stdLib.Date, stop: stdLib.Date): js.Array[stdLib.Date] = js.native
  def timeHours(start: stdLib.Date, stop: stdLib.Date, step: scala.Double): js.Array[stdLib.Date] = js.native
  def timeInterval(
    floor: js.Function1[/* date */ stdLib.Date, scala.Unit],
    offset: js.Function2[/* date */ stdLib.Date, /* step */ scala.Double, scala.Unit]
  ): TimeInterval = js.native
  def timeInterval(
    floor: js.Function1[/* date */ stdLib.Date, scala.Unit],
    offset: js.Function2[/* date */ stdLib.Date, /* step */ scala.Double, scala.Unit],
    count: js.Function2[/* start */ stdLib.Date, /* end */ stdLib.Date, scala.Double]
  ): CountableTimeInterval = js.native
  def timeInterval(
    floor: js.Function1[/* date */ stdLib.Date, scala.Unit],
    offset: js.Function2[/* date */ stdLib.Date, /* step */ scala.Double, scala.Unit],
    count: js.Function2[/* start */ stdLib.Date, /* end */ stdLib.Date, scala.Double],
    field: js.Function1[/* date */ stdLib.Date, scala.Double]
  ): CountableTimeInterval = js.native
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

