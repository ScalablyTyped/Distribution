package typings.typescriptNn5FuAjk.Intl

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkNumbers.`0`
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkNumbers.`1`
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkNumbers.`2`
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkNumbers.`3`
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.`best fit`
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.basic
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.full
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.h11
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.h12
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.h23
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.h24
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.long
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.medium
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.narrow
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedDateTimeFormatOptions extends StObject {
  
  var calendar: String
  
  var dateStyle: js.UndefOr[full | long | medium | short] = js.undefined
  
  var day: js.UndefOr[String] = js.undefined
  
  var dayPeriod: js.UndefOr[narrow | short | long] = js.undefined
  
  var era: js.UndefOr[String] = js.undefined
  
  var formatMatcher: js.UndefOr[basic | (`best fit`)] = js.undefined
  
  var fractionalSecondDigits: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
  
  var hour: js.UndefOr[String] = js.undefined
  
  var hour12: js.UndefOr[Boolean] = js.undefined
  
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.undefined
  
  var locale: String
  
  var minute: js.UndefOr[String] = js.undefined
  
  var month: js.UndefOr[String] = js.undefined
  
  var numberingSystem: String
  
  var second: js.UndefOr[String] = js.undefined
  
  var timeStyle: js.UndefOr[full | long | medium | short] = js.undefined
  
  var timeZone: String
  
  var timeZoneName: js.UndefOr[String] = js.undefined
  
  var weekday: js.UndefOr[String] = js.undefined
  
  var year: js.UndefOr[String] = js.undefined
}
object ResolvedDateTimeFormatOptions {
  
  inline def apply(calendar: String, locale: String, numberingSystem: String, timeZone: String): ResolvedDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
  }
  
  extension [Self <: ResolvedDateTimeFormatOptions](x: Self) {
    
    inline def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setDateStyle(value: full | long | medium | short): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
    
    inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayPeriod(value: narrow | short | long): Self = StObject.set(x, "dayPeriod", value.asInstanceOf[js.Any])
    
    inline def setDayPeriodUndefined: Self = StObject.set(x, "dayPeriod", js.undefined)
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setEra(value: String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
    
    inline def setFormatMatcher(value: basic | (`best fit`)): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
    
    inline def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
    
    inline def setFractionalSecondDigits(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "fractionalSecondDigits", value.asInstanceOf[js.Any])
    
    inline def setFractionalSecondDigitsUndefined: Self = StObject.set(x, "fractionalSecondDigits", js.undefined)
    
    inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
    
    inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
    
    inline def setHourCycle(value: h11 | h12 | h23 | h24): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
    
    inline def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setTimeStyle(value: full | long | medium | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
    
    inline def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneName(value: String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
    
    inline def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
