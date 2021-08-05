package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetWeekYearIndexMod {
  
  object default {
    
    inline def apply(date: Double, weekYear: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Double, weekYear: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, weekYear: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, weekYear: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/setWeekYear/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
