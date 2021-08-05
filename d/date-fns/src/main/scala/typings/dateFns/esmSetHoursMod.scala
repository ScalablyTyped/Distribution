package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetHoursMod {
  
  object default {
    
    inline def apply(date: Double, hours: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, hours: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/setHours", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
