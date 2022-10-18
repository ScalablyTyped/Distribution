package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmIsThisWeekMod {
  
  object default {
    
    inline def apply(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def apply(date: js.Date, options: typings.dateFns.anon.Locale): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(date: js.Date, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def apply(date: Double, options: typings.dateFns.anon.Locale): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(date: Double, options: WeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/esm/isThisWeek", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
