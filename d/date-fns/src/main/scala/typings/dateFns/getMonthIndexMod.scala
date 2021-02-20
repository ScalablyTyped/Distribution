package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMonthIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/getMonth/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn1[Date | Double, Double] = js.native
    
    type _To = CurriedFn1[Date | Double, Double]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn1[Date | Double, Double] = ^
  }
}
