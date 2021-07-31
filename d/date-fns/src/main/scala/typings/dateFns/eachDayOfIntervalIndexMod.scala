package typings.dateFns

import typings.dateFns.anon.Step
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eachDayOfIntervalIndexMod {
  
  object default {
    
    @scala.inline
    def apply(interval: typings.dateFns.mod.Interval): js.Array[Date] = ^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
    @scala.inline
    def apply(interval: typings.dateFns.mod.Interval, options: Step): js.Array[Date] = (^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
    
    @JSImport("date-fns/eachDayOfInterval/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
