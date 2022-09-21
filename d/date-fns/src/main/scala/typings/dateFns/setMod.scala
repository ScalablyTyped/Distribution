package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/set", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[Date, js.Date | Double, js.Date] = js.native
    
    type _To = CurriedFn2[Date, js.Date | Double, js.Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[Date, js.Date | Double, js.Date] = ^
  }
}
