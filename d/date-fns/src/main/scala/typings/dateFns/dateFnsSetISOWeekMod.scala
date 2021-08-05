package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetISOWeekMod {
  
  object default {
    
    inline def apply(date: Double, isoWeek: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], isoWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, isoWeek: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], isoWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/setISOWeek", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
