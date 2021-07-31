package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eachWeekOfIntervalIndexMod {
  
  object default {
    
    @scala.inline
    def apply(interval: typings.dateFns.mod.Interval): js.Array[Date] = ^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
    @scala.inline
    def apply(interval: typings.dateFns.mod.Interval, options: typings.dateFns.anon.Locale): js.Array[Date] = (^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
    
    @JSImport("date-fns/eachWeekOfInterval/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
