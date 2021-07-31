package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetISOWeekIndexMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, isoWeek: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], isoWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, isoWeek: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], isoWeek.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/setISOWeek/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
