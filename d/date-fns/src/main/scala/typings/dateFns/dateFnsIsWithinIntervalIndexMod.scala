package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsIsWithinIntervalIndexMod {
  
  object default {
    
    inline def apply(date: Double, interval: typings.dateFns.mod.Interval): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(date: Date, interval: typings.dateFns.mod.Interval): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/isWithinInterval/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
