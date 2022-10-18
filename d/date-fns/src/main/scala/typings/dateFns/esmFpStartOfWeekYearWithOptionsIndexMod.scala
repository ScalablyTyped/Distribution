package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.FirstWeekContainsDateLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFpStartOfWeekYearWithOptionsIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/startOfWeekYearWithOptions/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, js.Date] = js.native
    
    type _To = CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, js.Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, js.Date] = ^
  }
}
