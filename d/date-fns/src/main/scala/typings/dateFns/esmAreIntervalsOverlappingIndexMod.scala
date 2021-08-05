package typings.dateFns

import typings.dateFns.anon.Inclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAreIntervalsOverlappingIndexMod {
  
  object default {
    
    inline def apply(intervalLeft: Interval, intervalRight: Interval): Boolean = (^.asInstanceOf[js.Dynamic].apply(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(intervalLeft: Interval, intervalRight: Interval, options: Inclusive): Boolean = (^.asInstanceOf[js.Dynamic].apply(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/esm/areIntervalsOverlapping/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
