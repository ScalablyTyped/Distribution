package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import typings.dateFnsTz.mod.OptionsWithTZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpToDateWithOptionsMod extends Shortcut {
  
  @JSImport("date-fns-tz/fp/toDateWithOptions", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn2[OptionsWithTZ, js.Date | String | Double, js.Date] = js.native
  
  type _To = CurriedFn2[OptionsWithTZ, js.Date | String | Double, js.Date]
  
  /* This means you don't have to write `^`, but can instead just say `fpToDateWithOptionsMod.foo` */
  override def _to: CurriedFn2[OptionsWithTZ, js.Date | String | Double, js.Date] = ^
}
