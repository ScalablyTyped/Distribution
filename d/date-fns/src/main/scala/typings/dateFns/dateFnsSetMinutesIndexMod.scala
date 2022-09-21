package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetMinutesIndexMod {
  
  object default {
    
    inline def apply(date: js.Date, minutes: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, minutes: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/setMinutes/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
