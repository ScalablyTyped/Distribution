package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import typings.dateFnsTz.mod.OptionsWithTZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpZonedTimeToUtcWithOptionsMod extends Shortcut {
  
  @JSImport("date-fns-tz/fp/zonedTimeToUtcWithOptions", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, js.Date] = js.native
  
  type _To = CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, js.Date]
  
  /* This means you don't have to write `^`, but can instead just say `fpZonedTimeToUtcWithOptionsMod.foo` */
  override def _to: CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, js.Date] = ^
}
