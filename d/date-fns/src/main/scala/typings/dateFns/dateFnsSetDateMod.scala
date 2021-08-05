package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetDateMod {
  
  object default {
    
    inline def apply(date: Double, dayOfMonth: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, dayOfMonth: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/setDate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
