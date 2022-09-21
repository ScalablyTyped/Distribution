package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTimezoneOffsetMod extends Shortcut {
  
  @JSImport("date-fns-tz/esm/fp/getTimezoneOffset", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn2[js.Date | Double, String, Double] = js.native
  
  object default extends Shortcut {
    
    @JSImport("date-fns-tz/esm/fp/getTimezoneOffset", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[js.Date | Double, String, Double] = js.native
    
    type _To = CurriedFn2[js.Date | Double, String, Double]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[js.Date | Double, String, Double] = ^
  }
  
  type _To = CurriedFn2[js.Date | Double, String, Double]
  
  /* This means you don't have to write `^`, but can instead just say `getTimezoneOffsetMod.foo` */
  override def _to: CurriedFn2[js.Date | Double, String, Double] = ^
}
