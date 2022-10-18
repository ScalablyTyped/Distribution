package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFpIsSameYearIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/isSameYear/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = js.native
    
    type _To = CurriedFn2[js.Date | Double, js.Date | Double, Boolean]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[js.Date | Double, js.Date | Double, Boolean] = ^
  }
}
