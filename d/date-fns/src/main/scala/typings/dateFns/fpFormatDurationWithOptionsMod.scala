package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.Zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpFormatDurationWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/formatDurationWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[Zero, Duration, String] = js.native
    
    type _To = CurriedFn2[Zero, Duration, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[Zero, Duration, String] = ^
  }
}
