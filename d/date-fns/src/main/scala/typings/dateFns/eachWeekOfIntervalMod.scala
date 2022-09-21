package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eachWeekOfIntervalMod {
  
  object default {
    
    inline def apply(interval: typings.dateFns.mod.Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
    inline def apply(interval: typings.dateFns.mod.Interval, options: typings.dateFns.anon.Locale): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
    
    @JSImport("date-fns/eachWeekOfInterval", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
