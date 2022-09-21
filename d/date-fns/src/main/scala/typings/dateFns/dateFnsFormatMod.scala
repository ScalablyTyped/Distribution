package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsFormatMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/format", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[String, js.Date | Double, String] = js.native
    
    type _To = CurriedFn2[String, js.Date | Double, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[String, js.Date | Double, String] = ^
  }
}
