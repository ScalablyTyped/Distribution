package typings.atBlueprintjsDatetime

import typings.atBlueprintjsDatetime.atBlueprintjsDatetimeBooleans.`false`
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", JSImport.Namespace)
@js.native
object libEsmCommonDateUtilsMod extends js.Object {
  def areEqual(date1: Date, date2: Date): Boolean = js.native
  def areRangesEqual(dateRange1: DateRange, dateRange2: DateRange): Boolean = js.native
  def areSameDay(date1: Date, date2: Date): Boolean = js.native
  def areSameMonth(date1: Date, date2: Date): Boolean = js.native
  def areSameTime(date1: Date, date2: Date): Boolean = js.native
  def clone(d: Date): Date = js.native
  def convert24HourMeridiem(hour: Double, toPm: Boolean): Double = js.native
  def get12HourFrom24Hour(hour: Double): Double = js.native
  def get24HourFrom12Hour(hour: Double, isPm: Boolean): Double = js.native
  def getDateBetween(dateRange: DateRange): Date = js.native
  def getDateNextMonth(date: Date): Date = js.native
  def getDateOnlyWithTime(date: Date): Date = js.native
  def getDatePreviousMonth(date: Date): Date = js.native
  def getDateTime(): Date = js.native
  def getDateTime(date: Null, time: Date): Date = js.native
  def getDateTime(date: Date): Date = js.native
  def getDateTime(date: Date, time: Date): Date = js.native
  def getIsPmFrom24Hour(hour: Double): Boolean = js.native
  def getTimeInRange(time: Date, minTime: Date, maxTime: Date): Date = js.native
  def isDateValid(): /* is std.Date */ Boolean = js.native
  def isDateValid(date: Date): /* is std.Date */ Boolean = js.native
  @JSName("isDateValid")
  def isDateValid_false(date: `false`): /* is std.Date */ Boolean = js.native
  def isDayInRange(date: Date, dateRange: DateRange): Boolean = js.native
  def isDayInRange(date: Date, dateRange: DateRange, exclusive: Boolean): Boolean = js.native
  def isDayRangeInRange(innerRange: DateRange, outerRange: DateRange): Boolean = js.native
  def isMonthInRange(date: Date, dateRange: DateRange): Boolean = js.native
  def isTimeEqualOrGreaterThan(time: Date, timeToCompare: Date): Boolean = js.native
  def isTimeEqualOrSmallerThan(time: Date, timeToCompare: Date): Boolean = js.native
  def isTimeInRange(date: Date, minDate: Date, maxDate: Date): Boolean = js.native
  def isTimeSameOrAfter(date: Date, dateToCompare: Date): Boolean = js.native
  type DateRange = js.Tuple2[js.UndefOr[Date], js.UndefOr[Date]]
}

