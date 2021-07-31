package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetDateMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, dayOfMonth: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, dayOfMonth: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/setDate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
