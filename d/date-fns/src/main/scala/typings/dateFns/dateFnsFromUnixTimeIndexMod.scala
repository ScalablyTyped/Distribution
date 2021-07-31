package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsFromUnixTimeIndexMod {
  
  object default {
    
    @scala.inline
    def apply(unixTime: Double): Date = ^.asInstanceOf[js.Dynamic].apply(unixTime.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @JSImport("date-fns/fromUnixTime/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
