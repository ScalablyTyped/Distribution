package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetMinutesIndexMod {
  
  object default {
    
    inline def apply(date: Double, minutes: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, minutes: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/setMinutes/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
