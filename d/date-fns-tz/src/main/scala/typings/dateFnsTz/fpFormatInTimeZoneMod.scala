package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpFormatInTimeZoneMod extends Shortcut {
  
  @JSImport("date-fns-tz/esm/fp/formatInTimeZone", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn3[String, String, js.Date | String | Double, String] = js.native
  
  object default extends Shortcut {
    
    @JSImport("date-fns-tz/esm/fp/formatInTimeZone", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[String, String, js.Date | String | Double, String] = js.native
    
    type _To = CurriedFn3[String, String, js.Date | String | Double, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[String, String, js.Date | String | Double, String] = ^
  }
  
  type _To = CurriedFn3[String, String, js.Date | String | Double, String]
  
  /* This means you don't have to write `^`, but can instead just say `fpFormatInTimeZoneMod.foo` */
  override def _to: CurriedFn3[String, String, js.Date | String | Double, String] = ^
}
