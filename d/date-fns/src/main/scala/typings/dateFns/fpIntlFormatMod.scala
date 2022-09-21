package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpIntlFormatMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/intlFormat", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[`0`, typings.dateFns.anon.Day, js.Date | Double, String] = js.native
    
    type _To = CurriedFn3[`0`, typings.dateFns.anon.Day, js.Date | Double, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[`0`, typings.dateFns.anon.Day, js.Date | Double, String] = ^
  }
}
