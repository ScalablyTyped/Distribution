package typings.dateFns

import typings.dateFns.anon.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmEachMinuteOfIntervalIndexMod {
  
  object default {
    
    inline def apply(interval: Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
    inline def apply(interval: Interval, options: Step): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
    
    @JSImport("date-fns/esm/eachMinuteOfInterval/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
