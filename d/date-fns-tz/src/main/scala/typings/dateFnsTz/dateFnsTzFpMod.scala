package typings.dateFnsTz

import typings.dateFnsTz.mod.OptionsWithTZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// FP Functions
object dateFnsTzFpMod {
  
  @JSImport("date-fns-tz/fp", "format")
  @js.native
  val format: CurriedFn2[String, js.Date | String | Double, String] = js.native
  
  @JSImport("date-fns-tz/fp", "formatInTimeZone")
  @js.native
  val formatInTimeZone: CurriedFn3[String, String, js.Date | String | Double, String] = js.native
  
  @JSImport("date-fns-tz/fp", "formatInTimeZoneWithOptions")
  @js.native
  val formatInTimeZoneWithOptions: CurriedFn4[OptionsWithTZ, String, String, js.Date | String | Double, String] = js.native
  
  @JSImport("date-fns-tz/fp", "formatWithOptions")
  @js.native
  val formatWithOptions: CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, String] = js.native
  
  @JSImport("date-fns-tz/fp", "getTimezoneOffset")
  @js.native
  val getTimezoneOffset: CurriedFn2[js.Date | Double, String, Double] = js.native
  
  @JSImport("date-fns-tz/fp", "toDate")
  @js.native
  val toDate: CurriedFn1[js.Date | String | Double, js.Date] = js.native
  
  @JSImport("date-fns-tz/fp", "toDateWithOptions")
  @js.native
  val toDateWithOptions: CurriedFn2[OptionsWithTZ, js.Date | String | Double, js.Date] = js.native
  
  @JSImport("date-fns-tz/fp", "utcToZonedTime")
  @js.native
  val utcToZonedTime: CurriedFn2[String, js.Date | String | Double, js.Date] = js.native
  
  @JSImport("date-fns-tz/fp", "utcToZonedTimeWithOptions")
  @js.native
  val utcToZonedTimeWithOptions: CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, js.Date] = js.native
  
  @JSImport("date-fns-tz/fp", "zonedTimeToUtc")
  @js.native
  val zonedTimeToUtc: CurriedFn2[String, js.Date | String | Double, js.Date] = js.native
  
  @JSImport("date-fns-tz/fp", "zonedTimeToUtcWithOptions")
  @js.native
  val zonedTimeToUtcWithOptions: CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, js.Date] = js.native
}
