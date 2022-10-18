package typings.callstackReactThemeProvider

import typings.callstackReactThemeProvider.anon.ThemeTheme
import typings.callstackReactThemeProvider.anon.`0`
import typings.callstackReactThemeProvider.anon.`1`
import typings.callstackReactThemeProvider.callstackReactThemeProviderStrings.theme
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@callstack/react-theme-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTheming[Theme](defaultTheme: Theme): ThemingType[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheming")(defaultTheme.asInstanceOf[js.Any]).asInstanceOf[ThemingType[Theme]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? @callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<T[P]>}
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
  
  @js.native
  trait ThemingType[Theme] extends StObject {
    
    var ThemeProvider: ComponentType[`0`[Theme]] = js.native
    
    def useTheme[T](): T = js.native
    def useTheme[T](overrides: DeepPartial[T]): T = js.native
    
    def withTheme[Props /* <: ThemeTheme[Theme] */, C](WrappedComponent: ComponentType[Props] & C): (ComponentType[(Without[Props, theme]) & `1`[Theme]]) & (NonReactStatics[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappedComponent */ Any, 
        js.Object
      ]) = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends any ? std.Pick<T, std.Exclude<keyof T, K>> : never
    }}}
    */
  @js.native
  trait Without[T, K /* <: /* keyof any */ String */] extends StObject
}
