package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addISOWeekYearsMod {
  
  object default {
    
    inline def apply(date: js.Date, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, amount: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/addISOWeekYears", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
