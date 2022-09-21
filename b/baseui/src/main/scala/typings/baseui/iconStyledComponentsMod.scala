package typings.baseui

import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.svg
import typings.baseui.iconTypesMod.StyledComponentArgs
import typings.styletronReact.typesMod.StyletronComponent
import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconStyledComponentsMod {
  
  @JSImport("baseui/icon/styled-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/icon/styled-components", "Svg")
  @js.native
  val Svg: StyletronComponent[svg, StyledComponentArgs] = js.native
  
  inline def getSvgStyles(hasDollarthemeDollarsizeDollarcolor: Theme): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getSvgStyles")(hasDollarthemeDollarsizeDollarcolor.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
}
