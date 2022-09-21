package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import typings.dateFnsTz.mod.OptionsWithTZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpFormatWithOptionsMod extends Shortcut {
  
  @JSImport("date-fns-tz/fp/formatWithOptions", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, String] = js.native
  
  type _To = CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, String]
  
  /* This means you don't have to write `^`, but can instead just say `fpFormatWithOptionsMod.foo` */
  override def _to: CurriedFn3[OptionsWithTZ, String, js.Date | String | Double, String] = ^
}
