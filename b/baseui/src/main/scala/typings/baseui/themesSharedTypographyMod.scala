package typings.baseui

import typings.baseui.themesTypesMod.FontTokens
import typings.baseui.themesTypesMod.Typography
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesSharedTypographyMod {
  
  @JSImport("baseui/themes/shared/typography", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Typography = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Typography]
  inline def default(fontTokens: FontTokens): Typography = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fontTokens.asInstanceOf[js.Any]).asInstanceOf[Typography]
  
  @JSImport("baseui/themes/shared/typography", "defaultFontTokens")
  @js.native
  val defaultFontTokens: FontTokens = js.native
}
