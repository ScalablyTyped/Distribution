package typings.callstackReactThemeProvider

import org.scalablytyped.runtime.TopLevel
import typings.callstackReactThemeProvider.anon.ThemeTheme
import typings.callstackReactThemeProvider.anon.`0`
import typings.callstackReactThemeProvider.anon.`1`
import typings.callstackReactThemeProvider.callstackReactThemeProviderStrings.$DeepPartial
import typings.callstackReactThemeProvider.callstackReactThemeProviderStrings.theme
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@callstack/react-theme-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTheming[Theme](defaultTheme: Theme): ThemingType[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheming")(defaultTheme.asInstanceOf[js.Any]).asInstanceOf[ThemingType[Theme]]
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<T[P]> * / object}
    */ $DeepPartial & TopLevel[js.Any]
  
  @js.native
  trait ThemingType[Theme] extends StObject {
    
    var ThemeProvider: ComponentType[`0`[Theme]] = js.native
    
    def useTheme(): Theme = js.native
    def useTheme(overrides: DeepPartial[Theme]): Theme = js.native
    
    def withTheme[Props /* <: ThemeTheme[Theme] */, C](WrappedComponent: ComponentType[Props] & C): (ComponentType[(Without[Props, theme]) & `1`[Theme]]) & (NonReactStatics[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappedComponent */ js.Any, 
        js.Object
      ]) = js.native
  }
  
  type Without[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
}
