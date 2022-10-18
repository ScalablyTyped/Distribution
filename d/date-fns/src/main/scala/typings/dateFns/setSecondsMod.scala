package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setSecondsMod {
  
  object default {
    
    inline def apply(date: js.Date, seconds: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, seconds: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/setSeconds", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
