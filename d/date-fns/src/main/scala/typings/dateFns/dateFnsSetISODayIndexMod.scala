package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetISODayIndexMod {
  
  object default {
    
    inline def apply(date: Double, day: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, day: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/setISODay/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
