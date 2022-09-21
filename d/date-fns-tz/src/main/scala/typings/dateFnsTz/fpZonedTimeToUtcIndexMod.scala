package typings.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpZonedTimeToUtcIndexMod extends Shortcut {
  
  @JSImport("date-fns-tz/fp/zonedTimeToUtc/index", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn2[String, js.Date | String | Double, js.Date] = js.native
  
  type _To = CurriedFn2[String, js.Date | String | Double, js.Date]
  
  /* This means you don't have to write `^`, but can instead just say `fpZonedTimeToUtcIndexMod.foo` */
  override def _to: CurriedFn2[String, js.Date | String | Double, js.Date] = ^
}
