package typings
package atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def areEqual(date1: stdLib.Date, date2: stdLib.Date): scala.Boolean = js.native
  def areRangesEqual(dateRange1: DateRange, dateRange2: DateRange): scala.Boolean = js.native
  def areSameDay(date1: stdLib.Date, date2: stdLib.Date): scala.Boolean = js.native
  def areSameMonth(date1: stdLib.Date, date2: stdLib.Date): scala.Boolean = js.native
  def areSameTime(date1: stdLib.Date, date2: stdLib.Date): scala.Boolean = js.native
  def clone(d: stdLib.Date): stdLib.Date = js.native
  def convert24HourMeridiem(hour: scala.Double, toPm: scala.Boolean): scala.Double = js.native
  def get12HourFrom24Hour(hour: scala.Double): scala.Double = js.native
  def get24HourFrom12Hour(hour: scala.Double, isPm: scala.Boolean): scala.Double = js.native
  def getDateBetween(dateRange: DateRange): stdLib.Date = js.native
  def getDateNextMonth(date: stdLib.Date): stdLib.Date = js.native
  def getDateOnlyWithTime(date: stdLib.Date): stdLib.Date = js.native
  def getDatePreviousMonth(date: stdLib.Date): stdLib.Date = js.native
  def getDateTime(): stdLib.Date = js.native
  def getDateTime(date: scala.Null, time: stdLib.Date): stdLib.Date = js.native
  def getDateTime(date: stdLib.Date): stdLib.Date = js.native
  def getDateTime(date: stdLib.Date, time: stdLib.Date): stdLib.Date = js.native
  def getIsPmFrom24Hour(hour: scala.Double): scala.Boolean = js.native
  def getTimeInRange(time: stdLib.Date, minTime: stdLib.Date, maxTime: stdLib.Date): stdLib.Date = js.native
  def isDateValid(): /* is std.Date */ scala.Boolean = js.native
  def isDateValid(date: stdLib.Date): /* is std.Date */ scala.Boolean = js.native
  @JSName("isDateValid")
  def isDateValid_false(date: atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibNumbers.`false`): /* is std.Date */ scala.Boolean = js.native
  def isDayInRange(date: stdLib.Date, dateRange: DateRange): scala.Boolean = js.native
  def isDayInRange(date: stdLib.Date, dateRange: DateRange, exclusive: scala.Boolean): scala.Boolean = js.native
  def isDayRangeInRange(innerRange: DateRange, outerRange: DateRange): scala.Boolean = js.native
  def isMonthInRange(date: stdLib.Date, dateRange: DateRange): scala.Boolean = js.native
  def isTimeEqualOrGreaterThan(time: stdLib.Date, timeToCompare: stdLib.Date): scala.Boolean = js.native
  def isTimeEqualOrSmallerThan(time: stdLib.Date, timeToCompare: stdLib.Date): scala.Boolean = js.native
  def isTimeInRange(date: stdLib.Date, minDate: stdLib.Date, maxDate: stdLib.Date): scala.Boolean = js.native
  def isTimeSameOrAfter(date: stdLib.Date, dateToCompare: stdLib.Date): scala.Boolean = js.native
}

