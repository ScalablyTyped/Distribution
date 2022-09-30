package typings.dateFnsTz

import typings.dateFns.mod.Locale
import typings.dateFnsTz.dateFnsTzInts.`0`
import typings.dateFnsTz.dateFnsTzInts.`1`
import typings.dateFnsTz.dateFnsTzInts.`2`
import typings.dateFnsTz.dateFnsTzInts.`3`
import typings.dateFnsTz.dateFnsTzInts.`4`
import typings.dateFnsTz.dateFnsTzInts.`5`
import typings.dateFnsTz.dateFnsTzInts.`6`
import typings.dateFnsTz.dateFnsTzInts.`7`
import typings.dateFnsTz.dateFnsTzStrings.ceil
import typings.dateFnsTz.dateFnsTzStrings.day
import typings.dateFnsTz.dateFnsTzStrings.floor
import typings.dateFnsTz.dateFnsTzStrings.hour
import typings.dateFnsTz.dateFnsTzStrings.minute
import typings.dateFnsTz.dateFnsTzStrings.month
import typings.dateFnsTz.dateFnsTzStrings.round
import typings.dateFnsTz.dateFnsTzStrings.second
import typings.dateFnsTz.dateFnsTzStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Regular Functions
object mod {
  
  @JSImport("date-fns-tz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(date: String, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(date: String, format: String, options: OptionsWithTZ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(date: js.Date, format: String, options: OptionsWithTZ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(date: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(date: Double, format: String, options: OptionsWithTZ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatInTimeZone(date: String, timeZone: String, formatStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatInTimeZone")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatInTimeZone(date: String, timeZone: String, formatStr: String, options: OptionsWithTZ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatInTimeZone")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatInTimeZone(date: js.Date, timeZone: String, formatStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatInTimeZone")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatInTimeZone(date: js.Date, timeZone: String, formatStr: String, options: OptionsWithTZ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatInTimeZone")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatInTimeZone(date: Double, timeZone: String, formatStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatInTimeZone")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatInTimeZone(date: Double, timeZone: String, formatStr: String, options: OptionsWithTZ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatInTimeZone")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTimezoneOffset(timeZone: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezoneOffset")(timeZone.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTimezoneOffset(timeZone: String, date: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimezoneOffset")(timeZone.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getTimezoneOffset(timeZone: String, date: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimezoneOffset")(timeZone.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toDate(argument: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def toDate(argument: String, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def toDate(argument: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def toDate(argument: js.Date, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def toDate(argument: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def toDate(argument: Double, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def utcToZonedTime(date: String, timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("utcToZonedTime")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def utcToZonedTime(date: String, timeZone: String, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("utcToZonedTime")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def utcToZonedTime(date: js.Date, timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("utcToZonedTime")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def utcToZonedTime(date: js.Date, timeZone: String, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("utcToZonedTime")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def utcToZonedTime(date: Double, timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("utcToZonedTime")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def utcToZonedTime(date: Double, timeZone: String, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("utcToZonedTime")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def zonedTimeToUtc(date: String, timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("zonedTimeToUtc")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def zonedTimeToUtc(date: String, timeZone: String, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("zonedTimeToUtc")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def zonedTimeToUtc(date: js.Date, timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("zonedTimeToUtc")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def zonedTimeToUtc(date: js.Date, timeZone: String, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("zonedTimeToUtc")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def zonedTimeToUtc(date: Double, timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("zonedTimeToUtc")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def zonedTimeToUtc(date: Double, timeZone: String, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("zonedTimeToUtc")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  trait OptionsWithTZ extends StObject {
    
    var addSuffix: js.UndefOr[Boolean] = js.undefined
    
    var additionalDigits: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    var awareOfUnicodeTokens: js.UndefOr[Boolean] = js.undefined
    
    var firstWeekContainsDate: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
    
    var includeSeconds: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[Locale] = js.undefined
    
    var roundingMethod: js.UndefOr[floor | ceil | round] = js.undefined
    
    var timeZone: js.UndefOr[String] = js.undefined
    
    var unit: js.UndefOr[second | minute | hour | day | month | year] = js.undefined
    
    var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  }
  object OptionsWithTZ {
    
    inline def apply(): OptionsWithTZ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsWithTZ]
    }
    
    extension [Self <: OptionsWithTZ](x: Self) {
      
      inline def setAddSuffix(value: Boolean): Self = StObject.set(x, "addSuffix", value.asInstanceOf[js.Any])
      
      inline def setAddSuffixUndefined: Self = StObject.set(x, "addSuffix", js.undefined)
      
      inline def setAdditionalDigits(value: `0` | `1` | `2`): Self = StObject.set(x, "additionalDigits", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDigitsUndefined: Self = StObject.set(x, "additionalDigits", js.undefined)
      
      inline def setAwareOfUnicodeTokens(value: Boolean): Self = StObject.set(x, "awareOfUnicodeTokens", value.asInstanceOf[js.Any])
      
      inline def setAwareOfUnicodeTokensUndefined: Self = StObject.set(x, "awareOfUnicodeTokens", js.undefined)
      
      inline def setFirstWeekContainsDate(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
      
      inline def setFirstWeekContainsDateUndefined: Self = StObject.set(x, "firstWeekContainsDate", js.undefined)
      
      inline def setIncludeSeconds(value: Boolean): Self = StObject.set(x, "includeSeconds", value.asInstanceOf[js.Any])
      
      inline def setIncludeSecondsUndefined: Self = StObject.set(x, "includeSeconds", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setRoundingMethod(value: floor | ceil | round): Self = StObject.set(x, "roundingMethod", value.asInstanceOf[js.Any])
      
      inline def setRoundingMethodUndefined: Self = StObject.set(x, "roundingMethod", js.undefined)
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      inline def setUnit(value: second | minute | hour | day | month | year): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setWeekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
      
      inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
    }
  }
}
