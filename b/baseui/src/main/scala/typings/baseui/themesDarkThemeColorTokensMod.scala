package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.themesTypesMod.ColorTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesDarkThemeColorTokensMod extends Shortcut {
  
  @JSImport("baseui/themes/dark-theme/color-tokens", JSImport.Default)
  @js.native
  val default: ColorTokens = js.native
  
  @JSImport("baseui/themes/dark-theme/color-tokens", "darkColorTokens")
  @js.native
  val darkColorTokens: ColorTokens = js.native
  
  type _To = ColorTokens
  
  /* This means you don't have to write `default`, but can instead just say `themesDarkThemeColorTokensMod.foo` */
  override def _to: ColorTokens = default
}
