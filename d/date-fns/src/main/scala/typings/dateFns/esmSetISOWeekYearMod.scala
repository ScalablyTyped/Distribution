package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetISOWeekYearMod {
  
  object default {
    
    inline def apply(date: js.Date, isoWeekYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], isoWeekYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, isoWeekYear: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], isoWeekYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/esm/setISOWeekYear", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
