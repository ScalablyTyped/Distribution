package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetHoursMod {
  
  object default {
    
    inline def apply(date: js.Date, hours: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, hours: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/esm/setHours", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
