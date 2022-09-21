package typings.dateFns

import typings.dateFns.anon.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eachMinuteOfIntervalIndexMod {
  
  object default {
    
    inline def apply(interval: typings.dateFns.mod.Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
    inline def apply(interval: typings.dateFns.mod.Interval, options: Step): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
    
    @JSImport("date-fns/eachMinuteOfInterval/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
