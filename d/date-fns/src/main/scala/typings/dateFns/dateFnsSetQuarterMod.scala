package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetQuarterMod {
  
  object default {
    
    inline def apply(date: Double, quarter: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], quarter.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, quarter: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], quarter.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/setQuarter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
