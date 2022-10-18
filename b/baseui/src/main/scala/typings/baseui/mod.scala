package typings.baseui

import typings.baseui.anon.PartialPrimitives
import typings.baseui.helpersOverridesMod.Overrides
import typings.baseui.helpersTypesMod.BaseProviderProps
import typings.baseui.localeMod.LocaleProviderProps
import typings.baseui.stylesStyledMod.StyleFn
import typings.baseui.stylesStyledMod.UseStyletronFn
import typings.baseui.stylesStyledMod.WithStyleFn
import typings.baseui.stylesTypesMod.Theme
import typings.baseui.themesTypesMod.Primitives
import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("baseui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BaseProvider(props: BaseProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BaseProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui", "DarkTheme")
  @js.native
  val DarkTheme: Theme = js.native
  
  @JSImport("baseui", "DarkThemeMove")
  @js.native
  val DarkThemeMove: Theme = js.native
  
  @JSImport("baseui", "LightTheme")
  @js.native
  val LightTheme: Theme = js.native
  
  @JSImport("baseui", "LightThemeMove")
  @js.native
  val LightThemeMove: Theme = js.native
  
  @JSImport("baseui", "LocaleProvider")
  @js.native
  val LocaleProvider: FC[LocaleProviderProps] = js.native
  
  @JSImport("baseui", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[Theme] = js.native
  
  inline def createDarkTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createDarkTheme")().asInstanceOf[Theme]
  inline def createDarkTheme(primitives: Unit, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createDarkTheme")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  inline def createDarkTheme(primitives: PartialPrimitives): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createDarkTheme")(primitives.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def createDarkTheme(primitives: PartialPrimitives, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createDarkTheme")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  inline def createLightTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createLightTheme")().asInstanceOf[Theme]
  inline def createLightTheme(primitives: Unit, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createLightTheme")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  inline def createLightTheme(primitives: PartialPrimitives): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createLightTheme")(primitives.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def createLightTheme(primitives: PartialPrimitives, overrides: js.Object): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createLightTheme")(primitives.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  inline def createThemedStyled[Theme](): StyleFn[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemedStyled")().asInstanceOf[StyleFn[Theme]]
  
  inline def createThemedUseStyletron[Theme](): UseStyletronFn[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemedUseStyletron")().asInstanceOf[UseStyletronFn[Theme]]
  
  inline def createThemedWithStyle[Theme](): WithStyleFn[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemedWithStyle")().asInstanceOf[WithStyleFn[Theme]]
  
  @JSImport("baseui", "darkThemePrimitives")
  @js.native
  val darkThemePrimitives: Primitives = js.native
  
  inline def getOverrides[T](_override: Any, defaultComponent: ComponentType[Any]): js.Tuple2[ComponentType[Any], T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverrides")(_override.asInstanceOf[js.Any], defaultComponent.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ComponentType[Any], T]]
  
  @JSImport("baseui", "lightThemePrimitives")
  @js.native
  val lightThemePrimitives: Primitives = js.native
  
  inline def mergeOverrides(): Overrides[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOverrides")().asInstanceOf[Overrides[Any]]
  inline def mergeOverrides(target: Unit, source: Overrides[Any]): Overrides[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOverrides")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Overrides[Any]]
  inline def mergeOverrides(target: Overrides[Any]): Overrides[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOverrides")(target.asInstanceOf[js.Any]).asInstanceOf[Overrides[Any]]
  inline def mergeOverrides(target: Overrides[Any], source: Overrides[Any]): Overrides[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOverrides")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Overrides[Any]]
  
  @JSImport("baseui", "styled")
  @js.native
  val styled: StyleFn[Theme] = js.native
  
  @JSImport("baseui", "useStyletron")
  @js.native
  val useStyletron: UseStyletronFn[Theme] = js.native
  
  @JSImport("baseui", "withStyle")
  @js.native
  val withStyle: WithStyleFn[Theme] = js.native
  
  inline def withWrapper[C /* <: StyletronComponent[Any, Any] */, Props](
    StyledElement: C,
    wrapperFn: js.Function1[
      /* component */ C, 
      js.Function1[
        /* props */ Props & (/* import warning: importer.ImportType#apply Failed type conversion: C extends styletron-react.styletron-react/lib/types.StyletronComponent<any, infer CP> ? CP : never */ js.Any), 
        ReactElement
      ]
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: C extends styletron-react.styletron-react/lib/types.StyletronComponent<infer D, infer P> ? styletron-react.styletron-react/lib/types.StyletronComponent<D, P & Props> : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("withWrapper")(StyledElement.asInstanceOf[js.Any], wrapperFn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends styletron-react.styletron-react/lib/types.StyletronComponent<infer D, infer P> ? styletron-react.styletron-react/lib/types.StyletronComponent<D, P & Props> : never */ js.Any]
}
