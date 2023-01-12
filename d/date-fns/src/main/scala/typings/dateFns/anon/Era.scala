package typings.dateFns.anon

import typings.dateFns.dateFnsStrings.`2-digit`
import typings.dateFns.dateFnsStrings.`best fit`
import typings.dateFns.dateFnsStrings.basic
import typings.dateFns.dateFnsStrings.long
import typings.dateFns.dateFnsStrings.lookup
import typings.dateFns.dateFnsStrings.narrow
import typings.dateFns.dateFnsStrings.numeric
import typings.dateFns.dateFnsStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Era extends StObject {
  
  var day: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var era: js.UndefOr[narrow | short | long] = js.undefined
  
  var formatMatcher: js.UndefOr[basic | (`best fit`)] = js.undefined
  
  var hour: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var hour12: js.UndefOr[Boolean] = js.undefined
  
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  
  var minute: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var month: js.UndefOr[numeric | `2-digit` | narrow | short | long] = js.undefined
  
  var second: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
  
  var timeZoneName: js.UndefOr[short | long] = js.undefined
  
  var weekday: js.UndefOr[narrow | short | long] = js.undefined
  
  var year: js.UndefOr[numeric | `2-digit`] = js.undefined
}
object Era {
  
  inline def apply(): Era = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Era]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Era] (val x: Self) extends AnyVal {
    
    inline def setDay(value: numeric | `2-digit`): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setEra(value: narrow | short | long): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
    
    inline def setFormatMatcher(value: basic | (`best fit`)): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
    
    inline def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
    
    inline def setHour(value: numeric | `2-digit`): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
    
    inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setMinute(value: numeric | `2-digit`): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: numeric | `2-digit` | narrow | short | long): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setSecond(value: numeric | `2-digit`): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneName(value: short | long): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setWeekday(value: narrow | short | long): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    inline def setYear(value: numeric | `2-digit`): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
