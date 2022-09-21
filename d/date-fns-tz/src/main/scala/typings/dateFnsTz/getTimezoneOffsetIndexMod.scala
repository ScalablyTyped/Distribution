package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTimezoneOffsetIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns-tz/esm/fp/getTimezoneOffset/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[js.Date | Double, String, Double] = js.native
    
    type _To = CurriedFn2[js.Date | Double, String, Double]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[js.Date | Double, String, Double] = ^
  }
}
