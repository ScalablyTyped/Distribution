package typings.blueprintjsDatetime

import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilsMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "areEqual")
  @js.native
  def areEqual(date1: Date, date2: Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "areRangesEqual")
  @js.native
  def areRangesEqual(dateRange1: DateRange, dateRange2: DateRange): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "areSameDay")
  @js.native
  def areSameDay(date1: Date, date2: Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "areSameMonth")
  @js.native
  def areSameMonth(date1: Date, date2: Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "areSameTime")
  @js.native
  def areSameTime(date1: Date, date2: Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "clone")
  @js.native
  def clone_(d: Date): Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "convert24HourMeridiem")
  @js.native
  def convert24HourMeridiem(hour: Double, toPm: Boolean): Double = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "get12HourFrom24Hour")
  @js.native
  def get12HourFrom24Hour(hour: Double): Double = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "get24HourFrom12Hour")
  @js.native
  def get24HourFrom12Hour(hour: Double, isPm: Boolean): Double = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateBetween")
  @js.native
  def getDateBetween(dateRange: DateRange): Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateNextMonth")
  @js.native
  def getDateNextMonth(date: Date): Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateOnlyWithTime")
  @js.native
  def getDateOnlyWithTime(date: Date): Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDatePreviousMonth")
  @js.native
  def getDatePreviousMonth(date: Date): Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateTime")
  @js.native
  def getDateTime(): Date = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateTime")
  @js.native
  def getDateTime(date: Null, time: Date): Date = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateTime")
  @js.native
  def getDateTime(date: Date): Date = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateTime")
  @js.native
  def getDateTime(date: Date, time: Date): Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getIsPmFrom24Hour")
  @js.native
  def getIsPmFrom24Hour(hour: Double): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getTimeInRange")
  @js.native
  def getTimeInRange(time: Date, minTime: Date, maxTime: Date): Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDateValid")
  @js.native
  def isDateValid(): /* is std.Date */ Boolean = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDateValid")
  @js.native
  def isDateValid(date: Date): /* is std.Date */ Boolean = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDateValid")
  @js.native
  def isDateValid_false(date: `false`): /* is std.Date */ Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDayInRange")
  @js.native
  def isDayInRange(date: Date, dateRange: DateRange): Boolean = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDayInRange")
  @js.native
  def isDayInRange(date: Date, dateRange: DateRange, exclusive: Boolean): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDayRangeInRange")
  @js.native
  def isDayRangeInRange(innerRange: DateRange, outerRange: DateRange): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isMonthInRange")
  @js.native
  def isMonthInRange(date: Date, dateRange: DateRange): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isTimeEqualOrGreaterThan")
  @js.native
  def isTimeEqualOrGreaterThan(time: Date, timeToCompare: Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isTimeEqualOrSmallerThan")
  @js.native
  def isTimeEqualOrSmallerThan(time: Date, timeToCompare: Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isTimeInRange")
  @js.native
  def isTimeInRange(date: Date, minDate: Date, maxDate: Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isTimeSameOrAfter")
  @js.native
  def isTimeSameOrAfter(date: Date, dateToCompare: Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isToday")
  @js.native
  def isToday(date: Date): Boolean = js.native
}
