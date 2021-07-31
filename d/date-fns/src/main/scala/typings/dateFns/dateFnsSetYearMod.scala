package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetYearMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, year: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, year: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/setYear", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
