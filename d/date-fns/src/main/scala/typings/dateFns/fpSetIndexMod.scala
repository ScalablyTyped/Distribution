package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpSetIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/set/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[Date, typings.std.Date | Double, typings.std.Date] = js.native
    
    type _To = CurriedFn2[Date, typings.std.Date | Double, typings.std.Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[Date, typings.std.Date | Double, typings.std.Date] = ^
  }
}
