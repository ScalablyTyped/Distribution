package typings.baseui

import typings.baseui.anon.FilterDate
import typings.baseui.anon.IncludeDatesMinDate
import typings.baseui.anon.`11`
import typings.baseui.anon.`12`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerUtilsMod {
  
  @JSImport("baseui/datepicker/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDays(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addMonths(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addWeeks(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeeks")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addYears(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def applyDateToTime(b: js.Date, a: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("applyDateToTime")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def applyTimeToDate(b: js.Date, a: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTimeToDate")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def format(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(date: js.Date, format: String, locale: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDate(c: js.Date, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(c.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDate(c: js.Date, b: String, a: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(c.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDate(dirtyDate: DirtyDate): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(dirtyDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getEffectiveMaxDate(a: `11`): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveMaxDate")(a.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getEffectiveMinDate(a: IncludeDatesMinDate): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveMinDate")(a.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getEndOfMonth(a: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndOfMonth")(a.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getEndOfWeek(a: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndOfWeek")(a.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getHours(dirtyDate: DirtyDate): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHours")(dirtyDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMinutes(dirtyDate: DirtyDate): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinutes")(dirtyDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMonth(dirtyDate: DirtyDate): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonth")(dirtyDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMonthInLocale(b: Double, a: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthInLocale")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getQuarterInLocale(b: Double, a: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getQuarterInLocale")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStartOfMonth(a: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getStartOfMonth")(a.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getStartOfWeek(b: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getStartOfWeek")(b.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getStartOfWeek(b: js.Date, a: Any): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getStartOfWeek")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getWeekdayInLocale(b: js.Date, a: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekdayInLocale")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWeekdayMinInLocale(b: js.Date, a: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekdayMinInLocale")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getYear(dirtyDate: DirtyDate): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getYear")(dirtyDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isAfter(fromDirty: DirtyDate, toDirty: DirtyDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(fromDirty.asInstanceOf[js.Any], toDirty.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isBefore(fromDirty: DirtyDate, toDirty: DirtyDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(fromDirty.asInstanceOf[js.Any], toDirty.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDayDisabled(b: js.Date, a: FilterDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayDisabled")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDayInRange(c: js.Date, b: js.Date, a: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayInRange")(c.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEndOfMonth(a: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEndOfMonth")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isOutOfBounds(b: js.Date, a: `12`): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOutOfBounds")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameDay(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")().asInstanceOf[Boolean]
  inline def isSameDay(b: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(b.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSameDay(b: js.Date, a: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameDay(b: Unit, a: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameMonth(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")().asInstanceOf[Boolean]
  inline def isSameMonth(b: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(b.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSameMonth(b: js.Date, a: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameMonth(b: Unit, a: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameYear(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")().asInstanceOf[Boolean]
  inline def isSameYear(b: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(b.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSameYear(b: js.Date, a: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSameYear(b: Unit, a: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameYear")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isStartOfMonth(a: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStartOfMonth")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def monthDisabledAfter(b: js.Date, a: `11`): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("monthDisabledAfter")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def monthDisabledBefore(b: js.Date, a: IncludeDatesMinDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("monthDisabledBefore")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setHours(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setHours")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setMinutes(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMinutes")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setMonth(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonth")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setSeconds(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setSeconds")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setYear(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setYear")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subDays(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subDays")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subMonths(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subMonths")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subWeeks(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subWeeks")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subYears(dirtyDate: DirtyDate, number: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subYears")(dirtyDate.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  type DirtyDate = js.Date | Double
}
