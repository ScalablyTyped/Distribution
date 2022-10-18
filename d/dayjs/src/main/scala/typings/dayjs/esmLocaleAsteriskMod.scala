package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmLocaleAsteriskMod extends Shortcut {
  
  @JSImport("dayjs/esm/locale/*", JSImport.Namespace)
  @js.native
  val ^ : Locale = js.native
  
  type Locale = ILocale
  
  type _To = Locale
  
  /* This means you don't have to write `^`, but can instead just say `esmLocaleAsteriskMod.foo` */
  override def _to: Locale = ^
}
