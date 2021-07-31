package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOverlappingDaysInIntervalsIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/getOverlappingDaysInIntervals/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[Interval, Interval, Double] = js.native
    
    type _To = CurriedFn2[Interval, Interval, Double]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[Interval, Interval, Double] = ^
  }
}
