package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpParseIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/parse/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[js.Date | Double, String, String, js.Date] = js.native
    
    type _To = CurriedFn3[js.Date | Double, String, String, js.Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[js.Date | Double, String, String, js.Date] = ^
  }
}
