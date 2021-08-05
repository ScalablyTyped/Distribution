package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetSecondsMod {
  
  object default {
    
    inline def apply(date: Double, seconds: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, seconds: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/setSeconds", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
