package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import typings.dateFnsTz.mod.OptionsWithTZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpFormatInTimeZoneWithOptionsIndexMod extends Shortcut {
  
  @JSImport("date-fns-tz/fp/formatInTimeZoneWithOptions/index", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn4[OptionsWithTZ, String, String, js.Date | String | Double, String] = js.native
  
  type _To = CurriedFn4[OptionsWithTZ, String, String, js.Date | String | Double, String]
  
  /* This means you don't have to write `^`, but can instead just say `fpFormatInTimeZoneWithOptionsIndexMod.foo` */
  override def _to: CurriedFn4[OptionsWithTZ, String, String, js.Date | String | Double, String] = ^
}
