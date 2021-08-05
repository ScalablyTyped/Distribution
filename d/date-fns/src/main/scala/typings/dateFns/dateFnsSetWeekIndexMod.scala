package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetWeekIndexMod {
  
  object default {
    
    inline def apply(date: Double, week: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Double, week: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, week: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, week: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/setWeek/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
