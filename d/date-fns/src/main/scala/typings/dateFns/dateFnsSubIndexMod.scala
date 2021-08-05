package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSubIndexMod {
  
  object default {
    
    inline def apply(date: Double, duration: typings.dateFns.mod.Duration): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, duration: typings.dateFns.mod.Duration): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/sub/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
