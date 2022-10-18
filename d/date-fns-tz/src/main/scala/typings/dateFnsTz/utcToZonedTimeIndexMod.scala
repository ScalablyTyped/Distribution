package typings.dateFnsTz

import typings.dateFnsTz.mod.OptionsWithTZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utcToZonedTimeIndexMod {
  
  inline def apply(date: String, timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def apply(date: String, timeZone: String, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def apply(date: js.Date, timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def apply(date: js.Date, timeZone: String, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def apply(date: Double, timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def apply(date: Double, timeZone: String, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  @JSImport("date-fns-tz/utcToZonedTime/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
