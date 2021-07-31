package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.FirstWeekContainsDateLocale
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getWeekYearWithOptionsIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/getWeekYearWithOptions/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[FirstWeekContainsDateLocale, Date | Double, Double] = js.native
    
    type _To = CurriedFn2[FirstWeekContainsDateLocale, Date | Double, Double]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[FirstWeekContainsDateLocale, Date | Double, Double] = ^
  }
}
