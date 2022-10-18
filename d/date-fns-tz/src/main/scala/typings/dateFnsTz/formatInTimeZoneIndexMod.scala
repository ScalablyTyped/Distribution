package typings.dateFnsTz

import typings.dateFnsTz.mod.OptionsWithTZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatInTimeZoneIndexMod {
  
  inline def apply(date: String, timeZone: String, formatStr: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(date: String, timeZone: String, formatStr: String, options: OptionsWithTZ): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(date: js.Date, timeZone: String, formatStr: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(date: js.Date, timeZone: String, formatStr: String, options: OptionsWithTZ): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(date: Double, timeZone: String, formatStr: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(date: Double, timeZone: String, formatStr: String, options: OptionsWithTZ): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], formatStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("date-fns-tz/formatInTimeZone/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
