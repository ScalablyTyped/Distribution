package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpFormatMod extends Shortcut {
  
  @JSImport("date-fns-tz/fp/format", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn2[String, js.Date | String | Double, String] = js.native
  
  type _To = CurriedFn2[String, js.Date | String | Double, String]
  
  /* This means you don't have to write `^`, but can instead just say `fpFormatMod.foo` */
  override def _to: CurriedFn2[String, js.Date | String | Double, String] = ^
}
