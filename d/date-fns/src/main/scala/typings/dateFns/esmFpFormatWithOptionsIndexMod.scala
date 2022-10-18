package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.UseAdditionalWeekYearTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFpFormatWithOptionsIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/formatWithOptions/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[UseAdditionalWeekYearTokens, String, js.Date | Double, String] = js.native
    
    type _To = CurriedFn3[UseAdditionalWeekYearTokens, String, js.Date | Double, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[UseAdditionalWeekYearTokens, String, js.Date | Double, String] = ^
  }
}
