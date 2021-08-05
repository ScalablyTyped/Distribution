package typings.blueprintjsDatetime

import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilsMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areEqual(date1: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEqual")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def areRangesEqual(dateRange1: DateRange, dateRange2: DateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areRangesEqual")(dateRange1.asInstanceOf[js.Any], dateRange2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def areSameDay(date1: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areSameDay")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def areSameMonth(date1: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areSameMonth")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def areSameTime(date1: Date, date2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areSameTime")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clone_(d: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(d.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def convert24HourMeridiem(hour: Double, toPm: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convert24HourMeridiem")(hour.asInstanceOf[js.Any], toPm.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def get12HourFrom24Hour(hour: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get12HourFrom24Hour")(hour.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def get24HourFrom12Hour(hour: Double, isPm: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get24HourFrom12Hour")(hour.asInstanceOf[js.Any], isPm.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDateBetween(dateRange: DateRange): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateBetween")(dateRange.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def getDateNextMonth(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateNextMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def getDateOnlyWithTime(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateOnlyWithTime")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def getDatePreviousMonth(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatePreviousMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def getDateTime(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")().asInstanceOf[Date]
  inline def getDateTime(date: Null, time: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDateTime(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  inline def getDateTime(date: Date, time: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def getIsPmFrom24Hour(hour: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsPmFrom24Hour")(hour.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getTimeInRange(time: Date, minTime: Date, maxTime: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeInRange")(time.asInstanceOf[js.Any], minTime.asInstanceOf[js.Any], maxTime.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def isDateValid(): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateValid")().asInstanceOf[/* is std.Date */ Boolean]
  inline def isDateValid(date: Date): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateValid")(date.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isDateValid_false(date: `false`): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateValid")(date.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isDayInRange(date: Date, dateRange: DateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayInRange")(date.asInstanceOf[js.Any], dateRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isDayInRange(date: Date, dateRange: DateRange, exclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayInRange")(date.asInstanceOf[js.Any], dateRange.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDayRangeInRange(innerRange: DateRange, outerRange: DateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayRangeInRange")(innerRange.asInstanceOf[js.Any], outerRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isMonthInRange(date: Date, dateRange: DateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMonthInRange")(date.asInstanceOf[js.Any], dateRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTimeEqualOrGreaterThan(time: Date, timeToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTimeEqualOrGreaterThan")(time.asInstanceOf[js.Any], timeToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTimeEqualOrSmallerThan(time: Date, timeToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTimeEqualOrSmallerThan")(time.asInstanceOf[js.Any], timeToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTimeInRange(date: Date, minDate: Date, maxDate: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTimeInRange")(date.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTimeSameOrAfter(date: Date, dateToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTimeSameOrAfter")(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isToday(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToday")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
