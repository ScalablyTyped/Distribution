package typings.baseui

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.baseuiStrings.am_
import typings.baseui.baseuiStrings.pm_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerUtilsTypesMod {
  
  trait AdapterOptions extends StObject {
    
    var formats: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var instance: js.UndefOr[Any] = js.undefined
    
    var locale: js.UndefOr[Any] = js.undefined
  }
  object AdapterOptions {
    
    inline def apply(): AdapterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdapterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdapterOptions] (val x: Self) extends AnyVal {
      
      inline def setFormats(value: StringDictionary[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  type Comparison[T] = js.Function2[/* value */ T, /* comparing */ T, Boolean]
  
  type DateFunc[T] = js.Function1[/* a */ DateInput[T] | Unit, T]
  
  @js.native
  trait DateIOAdapter[T] extends StObject {
    
    def addDays(value: T, count: Double): T = js.native
    
    def addMonths(value: T, count: Double): T = js.native
    
    var date: DateFunc[T] = js.native
    
    var endOfDay: DateInDateOut[T] = js.native
    
    var endOfMonth: DateInDateOut[T] = js.native
    
    def endOfWeek(value: T): T = js.native
    
    def format(value: T, formatKey: String): String = js.native
    
    def formatByString(value: T, formatString: String): String = js.native
    
    def formatNumber(numberToFormat: String): String = js.native
    
    var formats: StringDictionary[String] = js.native
    
    def getCurrentLocaleCode(): String = js.native
    
    def getDiff(from: T, to: T): Double = js.native
    
    def getHours(value: T): Double = js.native
    
    /** Allow to customize displaying "am/pm" strings */
    def getMeridiemText(ampm: am_ | pm_): String = js.native
    
    def getMinutes(value: T): Double = js.native
    
    def getMonth(value: T): Double = js.native
    
    def getMonthArray(value: T): js.Array[T] = js.native
    
    var getNextMonth: DateInDateOut[T] = js.native
    
    var getPreviousMonth: DateInDateOut[T] = js.native
    
    def getSeconds(value: T): Double = js.native
    
    def getWeekArray(date: T): js.Array[js.Array[T]] = js.native
    
    def getWeekdays(): js.Array[String] = js.native
    
    def getYear(value: T): Double = js.native
    
    def getYearRange(start: T, end: T): js.Array[T] = js.native
    
    def is12HourCycleInCurrentLocale(): Boolean = js.native
    
    var isAfter: Comparison[T] = js.native
    
    var isAfterDay: Comparison[T] = js.native
    
    var isAfterYear: Comparison[T] = js.native
    
    var isBefore: Comparison[T] = js.native
    
    var isBeforeDay: Comparison[T] = js.native
    
    var isBeforeYear: Comparison[T] = js.native
    
    var isEqual: Comparison[T] = js.native
    
    def isNull(): Boolean = js.native
    def isNull(value: T): Boolean = js.native
    
    var isSameDay: Comparison[T] = js.native
    
    var isSameHour: Comparison[T] = js.native
    
    var isSameMonth: Comparison[T] = js.native
    
    var isSameYear: Comparison[T] = js.native
    
    def isValid(value: Any): Boolean = js.native
    
    def isWithinRange(value: T, range: js.Array[T]): Boolean = js.native
    
    var locale: js.UndefOr[Any] = js.native
    
    def mergeDateAndTime(date: T, time: T): T = js.native
    
    def parse(value: String, format: String): T = js.native
    
    def setHours(value: T, count: Double): T = js.native
    
    def setMinutes(value: T, count: Double): T = js.native
    
    def setMonth(value: T, count: Double): T = js.native
    
    def setSeconds(value: T, count: Double): T = js.native
    
    def setYear(value: T, count: Double): T = js.native
    
    var startOfDay: DateInDateOut[T] = js.native
    
    var startOfMonth: DateInDateOut[T] = js.native
    
    var startOfWeek: DateInDateOut[T] = js.native
    
    def toJsDate(value: DateInput[T]): js.Date = js.native
  }
  
  type DateInDateOut[T] = js.Function1[/* value */ T, T]
  
  type DateInput[T] = DateValues[T]
  
  type DateValues[T] = T | String | Double
}
