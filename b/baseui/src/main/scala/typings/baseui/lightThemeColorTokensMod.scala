package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.themesTypesMod.ColorTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightThemeColorTokensMod extends Shortcut {
  
  @JSImport("baseui/themes/light-theme/color-tokens", JSImport.Default)
  @js.native
  val default: ColorTokens = js.native
  
  type _To = ColorTokens
  
  /* This means you don't have to write `default`, but can instead just say `lightThemeColorTokensMod.foo` */
  override def _to: ColorTokens = default
}
