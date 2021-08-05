package typings.dateFns

import typings.dateFns.anon.Inclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAreIntervalsOverlappingMod {
  
  object default {
    
    inline def apply(
      intervalLeft: typings.dateFns.mod.Interval | Interval,
      intervalRight: typings.dateFns.mod.Interval | Interval
    ): Boolean = (^.asInstanceOf[js.Dynamic].apply(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(
      intervalLeft: typings.dateFns.mod.Interval | Interval,
      intervalRight: typings.dateFns.mod.Interval | Interval,
      options: Inclusive
    ): Boolean = (^.asInstanceOf[js.Dynamic].apply(intervalLeft.asInstanceOf[js.Any], intervalRight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/esm/areIntervalsOverlapping", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
