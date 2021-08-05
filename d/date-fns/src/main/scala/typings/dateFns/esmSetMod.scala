package typings.dateFns

import typings.dateFns.anon.Hours
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetMod {
  
  object default {
    
    inline def apply(date: Double, values: Hours): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, values: Hours): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/set", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
