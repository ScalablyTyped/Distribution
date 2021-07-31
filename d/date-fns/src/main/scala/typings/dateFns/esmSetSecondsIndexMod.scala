package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetSecondsIndexMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, seconds: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, seconds: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/setSeconds/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
