package typings.baseui

import typings.baseui.themesTypesMod.ColorTokens
import typings.baseui.themesTypesMod.ComponentColorTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorComponentTokensMod {
  
  @JSImport("baseui/themes/dark-theme/color-component-tokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ComponentColorTokens = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ComponentColorTokens]
  inline def default(themePrimitives: ColorTokens): ComponentColorTokens = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(themePrimitives.asInstanceOf[js.Any]).asInstanceOf[ComponentColorTokens]
}
