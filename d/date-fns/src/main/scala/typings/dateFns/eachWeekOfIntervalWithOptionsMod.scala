package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.LocaleWeekStartsOn
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eachWeekOfIntervalWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/eachWeekOfIntervalWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[LocaleWeekStartsOn, Interval, js.Array[Date]] = js.native
    
    type _To = CurriedFn2[LocaleWeekStartsOn, Interval, js.Array[Date]]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[LocaleWeekStartsOn, Interval, js.Array[Date]] = ^
  }
}
