package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetWeekYearIndexMod {
  
  object default {
    
    inline def apply(date: js.Date, weekYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: js.Date, weekYear: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, weekYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, weekYear: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], weekYear.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/setWeekYear/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
