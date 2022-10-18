package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import typings.dateFnsTz.mod.OptionsWithTZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFpFormatInTimeZoneWithOptionsIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns-tz/esm/fp/formatInTimeZoneWithOptions/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn4[OptionsWithTZ, String, String, js.Date | String | Double, String] = js.native
    
    type _To = CurriedFn4[OptionsWithTZ, String, String, js.Date | String | Double, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn4[OptionsWithTZ, String, String, js.Date | String | Double, String] = ^
  }
}
