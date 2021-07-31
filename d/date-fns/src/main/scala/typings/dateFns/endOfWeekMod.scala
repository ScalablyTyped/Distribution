package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endOfWeekMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double): Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    @scala.inline
    def apply(date: Double, options: typings.dateFns.anon.Locale): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date): Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, options: typings.dateFns.anon.Locale): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/endOfWeek", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
