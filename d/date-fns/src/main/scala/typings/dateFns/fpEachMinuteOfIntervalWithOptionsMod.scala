package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpEachMinuteOfIntervalWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/eachMinuteOfIntervalWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[Step, Interval, js.Array[js.Date]] = js.native
    
    type _To = CurriedFn2[Step, Interval, js.Array[js.Date]]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[Step, Interval, js.Array[js.Date]] = ^
  }
}
