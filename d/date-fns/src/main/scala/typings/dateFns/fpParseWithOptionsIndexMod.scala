package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.LocaleUseAdditionalDayOfYearTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpParseWithOptionsIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/parseWithOptions/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn4[LocaleUseAdditionalDayOfYearTokens, js.Date | Double, String, String, js.Date] = js.native
    
    type _To = CurriedFn4[LocaleUseAdditionalDayOfYearTokens, js.Date | Double, String, String, js.Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn4[LocaleUseAdditionalDayOfYearTokens, js.Date | Double, String, String, js.Date] = ^
  }
}
