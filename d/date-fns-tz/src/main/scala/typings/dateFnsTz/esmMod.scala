package typings.dateFnsTz

import typings.dateFnsTz.mod.OptionsWithTZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ECMAScript Module Functions
object esmMod {
  
  @JSImport("date-fns-tz/esm", JSImport.Namespace)
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
}
