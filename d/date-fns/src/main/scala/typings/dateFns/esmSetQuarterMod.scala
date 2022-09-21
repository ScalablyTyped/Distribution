package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetQuarterMod {
  
  object default {
    
    inline def apply(date: js.Date, quarter: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], quarter.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, quarter: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], quarter.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/esm/setQuarter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
