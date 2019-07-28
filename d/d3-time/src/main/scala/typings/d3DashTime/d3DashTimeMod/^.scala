package typings.d3DashTime.d3DashTimeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-time", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def timeDays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeDays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeFridays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeFridays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeHours(start: Date, stop: Date): js.Array[Date] = js.native
  def timeHours(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeInterval(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit]
  ): TimeInterval = js.native
  def timeInterval(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ Date, /* end */ Date, Double]
  ): CountableTimeInterval = js.native
  def timeInterval(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ Date, /* end */ Date, Double],
    field: js.Function1[/* date */ Date, Double]
  ): CountableTimeInterval = js.native
  def timeMilliseconds(start: Date, stop: Date): js.Array[Date] = js.native
  def timeMilliseconds(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeMinutes(start: Date, stop: Date): js.Array[Date] = js.native
  def timeMinutes(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeMondays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeMondays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeMonths(start: Date, stop: Date): js.Array[Date] = js.native
  def timeMonths(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeSaturdays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeSaturdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeSeconds(start: Date, stop: Date): js.Array[Date] = js.native
  def timeSeconds(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeSundays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeSundays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeThursdays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeThursdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeTuesdays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeTuesdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeWednesdays(start: Date, stop: Date): js.Array[Date] = js.native
  def timeWednesdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeWeeks(start: Date, stop: Date): js.Array[Date] = js.native
  def timeWeeks(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def timeYears(start: Date, stop: Date): js.Array[Date] = js.native
  def timeYears(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcDays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcDays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcFridays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcFridays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcHours(start: Date, stop: Date): js.Array[Date] = js.native
  def utcHours(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcMilliseconds(start: Date, stop: Date): js.Array[Date] = js.native
  def utcMilliseconds(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcMinutes(start: Date, stop: Date): js.Array[Date] = js.native
  def utcMinutes(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcMondays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcMondays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcMonths(start: Date, stop: Date): js.Array[Date] = js.native
  def utcMonths(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcSaturdays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcSaturdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcSeconds(start: Date, stop: Date): js.Array[Date] = js.native
  def utcSeconds(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcSundays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcSundays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcThursdays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcThursdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcTuesdays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcTuesdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcWednesdays(start: Date, stop: Date): js.Array[Date] = js.native
  def utcWednesdays(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcWeeks(start: Date, stop: Date): js.Array[Date] = js.native
  def utcWeeks(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  def utcYears(start: Date, stop: Date): js.Array[Date] = js.native
  def utcYears(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
}

