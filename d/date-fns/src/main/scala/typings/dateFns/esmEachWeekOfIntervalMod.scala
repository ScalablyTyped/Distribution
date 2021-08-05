package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmEachWeekOfIntervalMod {
  
  object default {
    
    inline def apply(interval: typings.dateFns.mod.Interval | Interval): js.Array[Date] = ^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
    inline def apply(interval: Interval, options: WeekStartsOn): js.Array[Date] = (^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
    inline def apply(interval: typings.dateFns.mod.Interval, options: typings.dateFns.anon.Locale): js.Array[Date] = (^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
    
    @JSImport("date-fns/esm/eachWeekOfInterval", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
