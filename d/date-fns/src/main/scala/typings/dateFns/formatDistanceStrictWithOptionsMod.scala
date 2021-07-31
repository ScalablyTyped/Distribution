package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.AddSuffixLocale
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatDistanceStrictWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/formatDistanceStrictWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[AddSuffixLocale, Date | Double, Date | Double, String] = js.native
    
    type _To = CurriedFn3[AddSuffixLocale, Date | Double, Date | Double, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[AddSuffixLocale, Date | Double, Date | Double, String] = ^
  }
}
