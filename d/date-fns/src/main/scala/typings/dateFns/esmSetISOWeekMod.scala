package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetISOWeekMod {
  
  object default {
    
    inline def apply(date: js.Date, isoWeek: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], isoWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, isoWeek: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], isoWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/esm/setISOWeek", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
