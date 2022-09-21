package typings.baseui

import typings.baseui.anon.PartialPrimitives
import typings.baseui.stylesTypesMod.Theme
import typings.baseui.themesTypesMod.Primitives
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesMod {
  
  @JSImport("baseui/themes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/themes", "DarkTheme")
  @js.native
  val DarkTheme: Theme = js.native
  
  @JSImport("baseui/themes", "DarkThemeMove")
  @js.native
  val DarkThemeMove: Theme = js.native
  
  @JSImport("baseui/themes", "LightTheme")
  @js.native
  val LightTheme: Theme = js.native
  
  @JSImport("baseui/themes", "LightThemeMove")
  @js.native
  val LightThemeMove: Theme = js.native
  
  inline def createDarkTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createDarkTheme")().asInstanceOf[Theme]
  inline def createDarkTheme(primitives: Unit, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createDarkTheme")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  inline def createDarkTheme(primitives: PartialPrimitives): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createDarkTheme")(primitives.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def createDarkTheme(primitives: PartialPrimitives, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createDarkTheme")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  inline def createLightTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createLightTheme")().asInstanceOf[Theme]
  inline def createLightTheme(primitives: Unit, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createLightTheme")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  inline def createLightTheme(primitives: PartialPrimitives): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createLightTheme")(primitives.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def createLightTheme(primitives: PartialPrimitives, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createLightTheme")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  inline def createTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")().asInstanceOf[Theme]
  inline def createTheme(primitives: Unit, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  inline def createTheme(primitives: PartialPrimitives): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(primitives.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def createTheme(primitives: PartialPrimitives, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  @JSImport("baseui/themes", "darkThemeOverrides")
  @js.native
  val darkThemeOverrides: Theme = js.native
  
  @JSImport("baseui/themes", "darkThemePrimitives")
  @js.native
  val darkThemePrimitives: Primitives = js.native
  
  @JSImport("baseui/themes", "lightThemePrimitives")
  @js.native
  val lightThemePrimitives: Primitives = js.native
  
  type Colors = typings.baseui.stylesTypesMod.Colors
  
  type ThemePrimitives = Primitives
}
