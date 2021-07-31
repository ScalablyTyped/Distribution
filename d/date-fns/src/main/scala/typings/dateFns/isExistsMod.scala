package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isExistsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/isExists", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[Double, Double, Double, Boolean] = js.native
    
    type _To = CurriedFn3[Double, Double, Double, Boolean]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[Double, Double, Double, Boolean] = ^
  }
}
