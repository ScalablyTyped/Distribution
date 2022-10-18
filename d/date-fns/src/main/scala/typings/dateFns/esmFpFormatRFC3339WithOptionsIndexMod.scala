package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.FractionDigits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFpFormatRFC3339WithOptionsIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/formatRFC3339WithOptions/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[FractionDigits, js.Date | Double, String] = js.native
    
    type _To = CurriedFn2[FractionDigits, js.Date | Double, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[FractionDigits, js.Date | Double, String] = ^
  }
}
