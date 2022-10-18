package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import typings.dateFnsTz.mod.OptionsWithTZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFpUtcToZonedTimeWithOptionsMod extends Shortcut {
  
  @JSImport("date-fns-tz/esm/fp/utcToZonedTimeWithOptions", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, js.Date] = js.native
  
  object default extends Shortcut {
    
    @JSImport("date-fns-tz/esm/fp/utcToZonedTimeWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, js.Date] = js.native
    
    type _To = CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, js.Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, js.Date] = ^
  }
  
  type _To = CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, js.Date]
  
  /* This means you don't have to write `^`, but can instead just say `esmFpUtcToZonedTimeWithOptionsMod.foo` */
  override def _to: CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, js.Date] = ^
}
