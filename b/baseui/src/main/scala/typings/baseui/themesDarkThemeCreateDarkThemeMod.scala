package typings.baseui

import typings.baseui.anon.PartialPrimitives
import typings.baseui.stylesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesDarkThemeCreateDarkThemeMod {
  
  @JSImport("baseui/themes/dark-theme/create-dark-theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Theme]
  inline def default(primitives: Unit, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  inline def default(primitives: PartialPrimitives): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(primitives.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def default(primitives: PartialPrimitives, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
}
