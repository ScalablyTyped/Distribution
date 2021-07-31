package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAddDaysMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/addDays", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
