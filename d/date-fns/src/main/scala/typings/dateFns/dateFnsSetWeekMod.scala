package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetWeekMod {
  
  object default {
    
    inline def apply(date: js.Date, week: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: js.Date, week: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, week: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, week: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], week.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/setWeek", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
