package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setYearMod {
  
  object default {
    
    inline def apply(date: js.Date, year: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, year: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/setYear", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
