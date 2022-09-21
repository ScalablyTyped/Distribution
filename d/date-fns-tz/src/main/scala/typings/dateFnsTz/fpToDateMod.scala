package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpToDateMod extends Shortcut {
  
  @JSImport("date-fns-tz/fp/toDate", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn1[js.Date | String | Double, js.Date] = js.native
  
  type _To = CurriedFn1[js.Date | String | Double, js.Date]
  
  /* This means you don't have to write `^`, but can instead just say `fpToDateMod.foo` */
  override def _to: CurriedFn1[js.Date | String | Double, js.Date] = ^
}
