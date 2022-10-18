package typings.baseui

import typings.baseui.stylesStyledMod.StyleFn
import typings.baseui.stylesStyledMod.UseStyletronFn
import typings.baseui.stylesStyledMod.WithStyleFn
import typings.baseui.stylesThemeProviderMod.ThemeProviderProps
import typings.baseui.stylesTypesMod.Theme
import typings.baseui.themesTypesMod.Border
import typings.react.mod.Consumer
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.styletronReact.libTypesMod.StyletronComponent
import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("baseui/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/styles", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[Theme] = js.native
  
  @JSImport("baseui/styles", "ThemeProvider")
  @js.native
  val ThemeProvider: FC[ThemeProviderProps] = js.native
  
  inline def createThemedStyled[Theme](): StyleFn[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemedStyled")().asInstanceOf[StyleFn[Theme]]
  
  inline def createThemedUseStyletron[Theme](): UseStyletronFn[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemedUseStyletron")().asInstanceOf[UseStyletronFn[Theme]]
  
  inline def createThemedWithStyle[Theme](): WithStyleFn[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemedWithStyle")().asInstanceOf[WithStyleFn[Theme]]
  
  inline def expandBorderStyles(borderStyles: Border): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("expandBorderStyles")(borderStyles.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  
  inline def hexToRgb(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")().asInstanceOf[String]
  inline def hexToRgb(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexToRgb(hex: String, alpha: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexToRgb(hex: Unit, alpha: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("baseui/styles", "styled")
  @js.native
  val styled: StyleFn[Theme] = js.native
  
  @JSImport("baseui/styles", "useStyletron")
  @js.native
  val useStyletron: UseStyletronFn[Theme] = js.native
  
  @JSImport("baseui/styles", "withStyle")
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
