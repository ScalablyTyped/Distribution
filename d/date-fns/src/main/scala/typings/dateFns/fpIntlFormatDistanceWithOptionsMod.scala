package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.LocaleMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpIntlFormatDistanceWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/intlFormatDistanceWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[LocaleMatcher, js.Date | Double, js.Date | Double, String] = js.native
    
    type _To = CurriedFn3[LocaleMatcher, js.Date | Double, js.Date | Double, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[LocaleMatcher, js.Date | Double, js.Date | Double, String] = ^
  }
}
