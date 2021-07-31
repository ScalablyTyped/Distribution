package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.LocaleWeekStartsOn
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatRelativeWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/formatRelativeWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[LocaleWeekStartsOn, Date | Double, Date | Double, String] = js.native
    
    type _To = CurriedFn3[LocaleWeekStartsOn, Date | Double, Date | Double, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[LocaleWeekStartsOn, Date | Double, Date | Double, String] = ^
  }
}
