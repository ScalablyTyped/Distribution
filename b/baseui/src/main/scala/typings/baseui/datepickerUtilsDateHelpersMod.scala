package typings.baseui

import typings.baseui.anon.ExcludeDates
import typings.baseui.anon.Hours
import typings.baseui.anon.IncludeDates
import typings.baseui.anon.IncludeDatesMaxDate
import typings.baseui.anon.MaxDate
import typings.baseui.anon.MaxDateMinDate
import typings.baseui.anon.MinDate
import typings.baseui.datepickerUtilsTypesMod.AdapterOptions
import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import typings.baseui.datepickerUtilsTypesMod.DateInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerUtilsDateHelpersMod {
  
  @JSImport("baseui/datepicker/utils/date-helpers", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with DateHelpers[T] {
    def this(adapter: DateIOAdapter[T]) = this()
  }
  
  @js.native
  trait DateHelpers[T] extends StObject {
    
    var adapter: DateIOAdapter[T] = js.native
    
    def addDays(b: T, a: Double): T = js.native
    
    def addMonths(b: T, a: Double): T = js.native
    
    def addWeeks(b: T, a: Double): T = js.native
    
    def addYears(b: T, a: Double): T = js.native
    
    def applyDateToTime(b: T, a: T): T = js.native
    def applyDateToTime(b: Null, a: T): T = js.native
    def applyDateToTime(b: Unit, a: T): T = js.native
    
    def applyTimeToDate(b: T, a: T): T = js.native
    def applyTimeToDate(b: Null, a: T): T = js.native
    def applyTimeToDate(b: Unit, a: T): T = js.native
    
    def cloneAdapter(b: DateIOAdapter[T]): DateIOAdapter[T] = js.native
    def cloneAdapter(b: DateIOAdapter[T], a: js.Function1[/* a */ AdapterOptions, AdapterOptions]): DateIOAdapter[T] = js.native
    
    def date(a: Unit): T = js.native
    def date(a: DateInput[T]): T = js.native
    
    def dateRangeIncludesDates(b: js.Array[js.UndefOr[T | Null]]): Boolean = js.native
    def dateRangeIncludesDates(b: js.Array[js.UndefOr[T | Null]], a: js.Array[T]): Boolean = js.native
    
    def dateToSeconds(a: T): Double = js.native
    
    def differenceInCalendarMonths(b: T, a: T): Double = js.native
    
    def format(c: T, b: String): String = js.native
    def format(c: T, b: String, a: Any): String = js.native
    
    def formatDate(c: T, b: String): String = js.native
    def formatDate(c: T, b: String, a: Any): String = js.native
    
    def getAdapterWithNewLocale(a: Any): DateIOAdapter[T] = js.native
    
    def getDate(a: T): Double = js.native
    
    def getDay(a: T): Double = js.native
    
    def getEffectiveMaxDate(a: MaxDate[T]): T = js.native
    
    def getEffectiveMinDate(a: IncludeDates[T]): T = js.native
    
    def getEndOfMonth(a: T): T = js.native
    
    def getEndOfWeek(a: T): T = js.native
    
    def getHours(a: T): Double = js.native
    
    def getMinutes(a: T): Double = js.native
    
    def getMonth(a: T): Double = js.native
    
    def getMonthInLocale(b: Double, a: Any): String = js.native
    
    def getQuarter(a: T): Double = js.native
    
    def getQuarterInLocale(b: Double, a: Any): String = js.native
    
    def getStartOfMonth(a: T): T = js.native
    
    def getStartOfWeek(b: T): T = js.native
    def getStartOfWeek(b: T, a: Any): T = js.native
    
    def getWeekdayInLocale(b: T, a: Any): String = js.native
    
    def getWeekdayMinInLocale(b: T, a: Any): String = js.native
    
    def getYear(a: T): Double = js.native
    
    def isAfter(b: T, a: T): Boolean = js.native
    
    def isBefore(b: T, a: T): Boolean = js.native
    
    def isDayDisabled(b: T, a: ExcludeDates[T]): Boolean = js.native
    
    def isDayInRange(c: T, b: T, a: T): Boolean = js.native
    
    def isEndOfMonth(a: T): Boolean = js.native
    
    def isEqual(b: T, a: T): Boolean = js.native
    
    def isOnOrAfterDay(b: T, a: T): Boolean = js.native
    
    def isOnOrBeforeDay(b: T, a: T): Boolean = js.native
    
    def isOutOfBounds(b: T, a: MaxDateMinDate[T]): Boolean = js.native
    
    def isSameDay(): Boolean = js.native
    def isSameDay(b: T): Boolean = js.native
    def isSameDay(b: T, a: T): Boolean = js.native
    def isSameDay(b: Null, a: T): Boolean = js.native
    def isSameDay(b: Unit, a: T): Boolean = js.native
    
    def isSameMonth(): Boolean = js.native
    def isSameMonth(b: T): Boolean = js.native
    def isSameMonth(b: T, a: T): Boolean = js.native
    def isSameMonth(b: Null, a: T): Boolean = js.native
    def isSameMonth(b: Unit, a: T): Boolean = js.native
    
    def isSameYear(): Boolean = js.native
    def isSameYear(b: T): Boolean = js.native
    def isSameYear(b: T, a: T): Boolean = js.native
    def isSameYear(b: Null, a: T): Boolean = js.native
    def isSameYear(b: Unit, a: T): Boolean = js.native
    
    def isStartOfMonth(a: T): Boolean = js.native
    
    def isValid(a: Any): Boolean = js.native
    
    def max(a: js.Array[T]): T = js.native
    
    def min(a: js.Array[T]): T = js.native
    
    def monthDisabledAfter(b: T, a: IncludeDatesMaxDate[T]): Boolean = js.native
    
    def monthDisabledBefore(b: T, a: MinDate[T]): Boolean = js.native
    
    def parse(c: String, b: String): T = js.native
    def parse(c: String, b: String, a: Any): T = js.native
    
    def parseString(c: String, b: String): T = js.native
    def parseString(c: String, b: String, a: Any): T = js.native
    
    def secondsToHourMinute(a: Double): js.Tuple2[Double, Double] = js.native
    
    def set(a: T, values: Hours): T = js.native
    
    def setDate(b: T, a: Double): T = js.native
    
    def setHours(b: T, a: Double): T = js.native
    
    def setMilliseconds(b: T, a: Double): T = js.native
    
    def setMinutes(b: T, a: Double): T = js.native
    
    def setMonth(b: T, a: Double): T = js.native
    
    def setSeconds(b: T, a: Double): T = js.native
    
    def setYear(b: T, a: Double): T = js.native
    
    def subDays(b: T, a: Double): T = js.native
    
    def subMonths(b: T, a: Double): T = js.native
    
    def subWeeks(b: T, a: Double): T = js.native
    
    def subYears(b: T, a: Double): T = js.native
  }
}
