package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmClampMod {
  
  object default {
    
    inline def apply(date: js.Date, interval: typings.dateFns.mod.Interval | Interval): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, interval: typings.dateFns.mod.Interval | Interval): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/esm/clamp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
