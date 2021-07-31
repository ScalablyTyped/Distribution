package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetDayMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, day: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Double, day: Double, options: typings.dateFns.anon.Locale): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Double, day: Double, options: WeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, day: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, day: Double, options: typings.dateFns.anon.Locale): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, day: Double, options: WeekStartsOn): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/setDay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
