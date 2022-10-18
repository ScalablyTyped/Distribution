package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerUtilsDateFnsAdapterMod extends Shortcut {
  
  @JSImport("baseui/datepicker/utils/date-fns-adapter", JSImport.Default)
  @js.native
  val default: DateIOAdapter[js.Date] = js.native
  
  type _To = DateIOAdapter[js.Date]
  
  /* This means you don't have to write `default`, but can instead just say `datepickerUtilsDateFnsAdapterMod.foo` */
  override def _to: DateIOAdapter[js.Date] = default
}
