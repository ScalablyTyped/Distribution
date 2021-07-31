package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetDayOfYearMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, dayOfYear: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, dayOfYear: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/setDayOfYear", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
