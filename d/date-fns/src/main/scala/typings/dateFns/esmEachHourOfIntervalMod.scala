package typings.dateFns

import typings.dateFns.anon.Step
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmEachHourOfIntervalMod {
  
  object default {
    
    inline def apply(interval: typings.dateFns.mod.Interval | Interval): js.Array[Date] = ^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
    inline def apply(interval: typings.dateFns.mod.Interval | Interval, options: Step): js.Array[Date] = (^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
    
    @JSImport("date-fns/esm/eachHourOfInterval", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
