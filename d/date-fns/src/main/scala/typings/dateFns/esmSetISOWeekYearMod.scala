package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetISOWeekYearMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, isoWeekYear: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], isoWeekYear.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, isoWeekYear: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], isoWeekYear.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/setISOWeekYear", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
