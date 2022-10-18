package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFpFormatMod extends Shortcut {
  
  @JSImport("date-fns-tz/esm/fp/format", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn2[String, js.Date | String | Double, String] = js.native
  
  object default extends Shortcut {
    
    @JSImport("date-fns-tz/esm/fp/format", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[String, js.Date | String | Double, String] = js.native
    
    type _To = CurriedFn2[String, js.Date | String | Double, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[String, js.Date | String | Double, String] = ^
  }
  
  type _To = CurriedFn2[String, js.Date | String | Double, String]
  
  /* This means you don't have to write `^`, but can instead just say `esmFpFormatMod.foo` */
  override def _to: CurriedFn2[String, js.Date | String | Double, String] = ^
}
