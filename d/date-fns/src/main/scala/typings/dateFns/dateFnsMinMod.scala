package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsMinMod {
  
  object default {
    
    inline def apply(datesArray: js.Array[Date | Double]): Date = ^.asInstanceOf[js.Dynamic].apply(datesArray.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @JSImport("date-fns/min", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
