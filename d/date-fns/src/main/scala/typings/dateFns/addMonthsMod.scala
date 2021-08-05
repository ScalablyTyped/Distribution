package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addMonthsMod {
  
  object default {
    
    inline def apply(date: Double, amount: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date, amount: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/addMonths", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
