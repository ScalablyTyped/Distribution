package typings
package baseuiLib.baseuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BaseProvider: reactLib.reactMod.FC[BaseProviderProps] = js.native
  val DarkTheme: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
  val DarkThemeMove: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
  val LightTheme: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
  val LightThemeMove: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
  val LocaleProvider: reactLib.reactMod.FC[LocaleProviderProps] = js.native
  val ThemeProvider: reactLib.reactMod.FC[ThemeProviderProps] = js.native
  val darkThemePrimitives: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ThemePrimitives */ js.Any = js.native
  val lightThemePrimitives: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ThemePrimitives */ js.Any = js.native
  val useStyletron: UseStyletronFn[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Theme */ js.Any
  ] = js.native
  val withStyle: WithStyleFn = js.native
  def createTheme(
    primitives: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ThemePrimitives */ js.Any
  ): js.Any = js.native
  def createTheme(
    primitives: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ThemePrimitives */ js.Any,
    overrides: js.Object
  ): js.Any = js.native
  def createThemedUseStyletron[Theme](): UseStyletronFn[Theme] = js.native
  def mergeOverrides[T](): js.Any = js.native
  def mergeOverrides[T](
    target: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Overrides<T> */ js.Any
  ): js.Any = js.native
  def mergeOverrides[T](
    target: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Overrides<T> */ js.Any,
    source: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Overrides<T> */ js.Any
  ): js.Any = js.native
  def styled[P /* <: js.Object */, C /* <: (reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState]) | reactLib.reactMod.FunctionComponent[_] */](
    component: C,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[C], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  def styled[P /* <: js.Object */, C /* <: (reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState]) | reactLib.reactMod.FunctionComponent[_] */](component: C, styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[C], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_a[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.a,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.a], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_a[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.a,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.a], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_abbr[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.abbr,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.abbr], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_abbr[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.abbr,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.abbr], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_address[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.address,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.address], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_address[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.address,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.address], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_animate[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.animate,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.animate], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_animate[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.animate,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.animate], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_animateMotion[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.animateMotion,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.animateMotion], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_animateMotion[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.animateMotion,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.animateMotion], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_animateTransform[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.animateTransform,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.animateTransform], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_animateTransform[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.animateTransform,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.animateTransform], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_area[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.area,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.area], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_area[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.area,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.area], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_article[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.article,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.article], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_article[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.article,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.article], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_aside[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.aside,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.aside], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_aside[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.aside,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.aside], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_audio[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.audio,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.audio], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_audio[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.audio,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.audio], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_b[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.b,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.b], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_b[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.b,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.b], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_base[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.base,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.base], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_base[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.base,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.base], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_bdi[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.bdi,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.bdi], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_bdi[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.bdi,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.bdi], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_bdo[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.bdo,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.bdo], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_bdo[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.bdo,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.bdo], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_big[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.big,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.big], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_big[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.big,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.big], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_blockquote[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.blockquote,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.blockquote], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_blockquote[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.blockquote,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.blockquote], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_body[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.body,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.body], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_body[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.body,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.body], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_br[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.br,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.br], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_br[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.br,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.br], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_button[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.button,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.button], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_button[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.button,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.button], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_canvas[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.canvas,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.canvas], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_canvas[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.canvas,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.canvas], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_caption[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.caption,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.caption], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_caption[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.caption,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.caption], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_circle[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.circle,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.circle], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_circle[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.circle,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.circle], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_cite[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.cite,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.cite], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_cite[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.cite,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.cite], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_clipPath[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.clipPath,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.clipPath], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_clipPath[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.clipPath,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.clipPath], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_code[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.code,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.code], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_code[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.code,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.code], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_col[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.col,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.col], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_col[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.col,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.col], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_colgroup[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.colgroup,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.colgroup], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_colgroup[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.colgroup,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.colgroup], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_data[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.data,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.data], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_data[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.data,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.data], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_datalist[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.datalist,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.datalist], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_datalist[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.datalist,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.datalist], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_dd[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.dd,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.dd], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_dd[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.dd,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.dd], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_defs[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.defs,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.defs], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_defs[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.defs,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.defs], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_del[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.del,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.del], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_del[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.del,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.del], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_desc[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.desc,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.desc], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_desc[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.desc,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.desc], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_details[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.details,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.details], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_details[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.details,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.details], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_dfn[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.dfn,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.dfn], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_dfn[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.dfn,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.dfn], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_dialog[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.dialog,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.dialog], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_dialog[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.dialog,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.dialog], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_div[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.div,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.div], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_div[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.div,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.div], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_dl[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.dl,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.dl], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_dl[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.dl,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.dl], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_dt[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.dt,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.dt], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_dt[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.dt,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.dt], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_ellipse[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.ellipse,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.ellipse], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_ellipse[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.ellipse,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.ellipse], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_em[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.em,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.em], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_em[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.em,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.em], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_embed[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.embed,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.embed], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_embed[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.embed,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.embed], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feBlend[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feBlend,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feBlend], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feBlend[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feBlend,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feBlend], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feColorMatrix[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feColorMatrix,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feColorMatrix], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feColorMatrix[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feColorMatrix,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feColorMatrix], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feComponentTransfer[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feComponentTransfer,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feComponentTransfer], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feComponentTransfer[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feComponentTransfer,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feComponentTransfer], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feComposite[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feComposite,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feComposite], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feComposite[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feComposite,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feComposite], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feConvolveMatrix[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feConvolveMatrix,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feConvolveMatrix], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feConvolveMatrix[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feConvolveMatrix,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feConvolveMatrix], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feDiffuseLighting[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feDiffuseLighting,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feDiffuseLighting], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feDiffuseLighting[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feDiffuseLighting,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feDiffuseLighting], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feDisplacementMap[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feDisplacementMap,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feDisplacementMap], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feDisplacementMap[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feDisplacementMap,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feDisplacementMap], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feDistantLight[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feDistantLight,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feDistantLight], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feDistantLight[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feDistantLight,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feDistantLight], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feDropShadow[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feDropShadow,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feDropShadow], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feDropShadow[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feDropShadow,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feDropShadow], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feFlood[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feFlood,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feFlood], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feFlood[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feFlood,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feFlood], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feFuncA[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feFuncA,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feFuncA], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feFuncA[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feFuncA,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feFuncA], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feFuncB[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feFuncB,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feFuncB], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feFuncB[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feFuncB,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feFuncB], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feFuncG[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feFuncG,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feFuncG], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feFuncG[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feFuncG,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feFuncG], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feFuncR[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feFuncR,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feFuncR], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feFuncR[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feFuncR,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feFuncR], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feGaussianBlur[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feGaussianBlur,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feGaussianBlur], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feGaussianBlur[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feGaussianBlur,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feGaussianBlur], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feImage[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feImage,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feImage], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feImage[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feImage,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feImage], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feMerge[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feMerge,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feMerge], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feMerge[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feMerge,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feMerge], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feMergeNode[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feMergeNode,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feMergeNode], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feMergeNode[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feMergeNode,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feMergeNode], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feMorphology[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feMorphology,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feMorphology], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feMorphology[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feMorphology,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feMorphology], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feOffset[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feOffset,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feOffset], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feOffset[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feOffset,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feOffset], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_fePointLight[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.fePointLight,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.fePointLight], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_fePointLight[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.fePointLight,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.fePointLight], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feSpecularLighting[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feSpecularLighting,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feSpecularLighting], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feSpecularLighting[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feSpecularLighting,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feSpecularLighting], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feSpotLight[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feSpotLight,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feSpotLight], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feSpotLight[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feSpotLight,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feSpotLight], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feTile[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feTile,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feTile], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feTile[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feTile,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feTile], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feTurbulence[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feTurbulence,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feTurbulence], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_feTurbulence[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.feTurbulence,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.feTurbulence], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_fieldset[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.fieldset,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.fieldset], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_fieldset[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.fieldset,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.fieldset], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_figcaption[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.figcaption,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.figcaption], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_figcaption[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.figcaption,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.figcaption], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_figure[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.figure,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.figure], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_figure[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.figure,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.figure], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_filter[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.filter,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.filter], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_filter[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.filter,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.filter], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_footer[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.footer,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.footer], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_footer[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.footer,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.footer], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_foreignObject[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.foreignObject,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.foreignObject], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_foreignObject[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.foreignObject,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.foreignObject], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_form[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.form,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.form], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_form[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.form,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.form], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_g[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.g,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.g], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_g[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.g,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.g], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h1[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h1,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h1], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h1[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h1,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h1], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h2[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h2,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h2], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h2[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h2,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h2], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h3[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h3,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h3], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h3[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h3,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h3], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h4[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h4,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h4], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h4[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h4,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h4], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h5[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h5,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h5], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h5[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h5,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h5], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h6[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h6,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h6], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_h6[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.h6,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.h6], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_head[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.head,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.head], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_head[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.head,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.head], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_header[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.header,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.header], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_header[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.header,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.header], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_hgroup[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.hgroup,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.hgroup], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_hgroup[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.hgroup,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.hgroup], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_hr[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.hr,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.hr], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_hr[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.hr,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.hr], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_html[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.html,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.html], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_html[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.html,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.html], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_i[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.i,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.i], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_i[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.i,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.i], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_iframe[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.iframe,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.iframe], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_iframe[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.iframe,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.iframe], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_image[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.image,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.image], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_image[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.image,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.image], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_img[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.img,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.img], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_img[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.img,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.img], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_input[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.input,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.input], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_input[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.input,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.input], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_ins[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.ins,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.ins], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_ins[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.ins,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.ins], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_kbd[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.kbd,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.kbd], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_kbd[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.kbd,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.kbd], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_keygen[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.keygen,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.keygen], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_keygen[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.keygen,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.keygen], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_label[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.label,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.label], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_label[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.label,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.label], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_legend[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.legend,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.legend], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_legend[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.legend,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.legend], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_li[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.li,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.li], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_li[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.li,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.li], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_line[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.line,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.line], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_line[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.line,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.line], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_linearGradient[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.linearGradient,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.linearGradient], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_linearGradient[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.linearGradient,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.linearGradient], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_link[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.link,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.link], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_link[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.link,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.link], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_main[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.main,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.main], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_main[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.main,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.main], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_map[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.map,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.map], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_map[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.map,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.map], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_mark[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.mark,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.mark], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_mark[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.mark,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.mark], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_marker[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.marker,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.marker], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_marker[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.marker,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.marker], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_mask[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.mask,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.mask], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_mask[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.mask,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.mask], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_menu[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.menu,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.menu], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_menu[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.menu,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.menu], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_menuitem[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.menuitem,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.menuitem], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_menuitem[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.menuitem,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.menuitem], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_meta[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.meta,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.meta], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_meta[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.meta,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.meta], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_metadata[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.metadata,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.metadata], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_metadata[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.metadata,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.metadata], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_meter[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.meter,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.meter], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_meter[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.meter,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.meter], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_mpath[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.mpath,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.mpath], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_mpath[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.mpath,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.mpath], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_nav[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.nav,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.nav], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_nav[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.nav,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.nav], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_noindex[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.noindex,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.noindex], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_noindex[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.noindex,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.noindex], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_noscript[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.noscript,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.noscript], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_noscript[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.noscript,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.noscript], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_object[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.`object`,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.`object`], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_object[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.`object`,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.`object`], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_ol[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.ol,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.ol], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_ol[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.ol,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.ol], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_optgroup[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.optgroup,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.optgroup], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_optgroup[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.optgroup,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.optgroup], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_option[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.option,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.option], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_option[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.option,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.option], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_output[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.output,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.output], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_output[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.output,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.output], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_p[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.p,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.p], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_p[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.p,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.p], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_param[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.param,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.param], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_param[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.param,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.param], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_path[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.path,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.path], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_path[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.path,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.path], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_pattern[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.pattern,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.pattern], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_pattern[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.pattern,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.pattern], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_picture[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.picture,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.picture], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_picture[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.picture,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.picture], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_polygon[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.polygon,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.polygon], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_polygon[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.polygon,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.polygon], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_polyline[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.polyline,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.polyline], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_polyline[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.polyline,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.polyline], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_pre[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.pre,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.pre], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_pre[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.pre,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.pre], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_progress[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.progress,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.progress], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_progress[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.progress,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.progress], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_q[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.q,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.q], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_q[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.q,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.q], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_radialGradient[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.radialGradient,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.radialGradient], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_radialGradient[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.radialGradient,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.radialGradient], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_rect[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.rect,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.rect], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_rect[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.rect,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.rect], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_rp[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.rp,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.rp], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_rp[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.rp,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.rp], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_rt[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.rt,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.rt], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_rt[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.rt,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.rt], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_ruby[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.ruby,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.ruby], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_ruby[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.ruby,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.ruby], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_s[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.s,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.s], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_s[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.s,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.s], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_samp[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.samp,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.samp], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_samp[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.samp,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.samp], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_script[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.script,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.script], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_script[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.script,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.script], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_section[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.section,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.section], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_section[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.section,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.section], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_select[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.select,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.select], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_select[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.select,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.select], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_small[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.small,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.small], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_small[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.small,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.small], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_source[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.source,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.source], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_source[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.source,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.source], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_span[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.span,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.span], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_span[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.span,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.span], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_stop[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.stop,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.stop], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_stop[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.stop,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.stop], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_strong[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.strong,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.strong], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_strong[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.strong,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.strong], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_style[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.style,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.style], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_style[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.style,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.style], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_sub[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.sub,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.sub], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_sub[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.sub,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.sub], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_summary[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.summary,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.summary], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_summary[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.summary,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.summary], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_sup[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.sup,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.sup], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_sup[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.sup,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.sup], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_svg[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.svg,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.svg], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_svg[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.svg,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.svg], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_switch[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.switch,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.switch], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_switch[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.switch,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.switch], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_symbol[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.symbol,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.symbol], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_symbol[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.symbol,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.symbol], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_table[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.table,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.table], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_table[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.table,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.table], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_tbody[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.tbody,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.tbody], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_tbody[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.tbody,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.tbody], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_td[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.td,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.td], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_td[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.td,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.td], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_template[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.template,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.template], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_template[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.template,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.template], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_text[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.text,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.text], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_text[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.text,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.text], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_textPath[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.textPath,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.textPath], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_textPath[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.textPath,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.textPath], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_textarea[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.textarea,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.textarea], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_textarea[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.textarea,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.textarea], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_tfoot[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.tfoot,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.tfoot], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_tfoot[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.tfoot,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.tfoot], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_th[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.th,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.th], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_th[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.th,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.th], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_thead[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.thead,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.thead], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_thead[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.thead,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.thead], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_time[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.time,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.time], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_time[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.time,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.time], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_title[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.title,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.title], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_title[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.title,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.title], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_tr[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.tr,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.tr], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_tr[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.tr,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.tr], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_track[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.track,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.track], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_track[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.track,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.track], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_tspan[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.tspan,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.tspan], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_tspan[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.tspan,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.tspan], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_u[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.u,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.u], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_u[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.u,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.u], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_ul[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.ul,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.ul], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_ul[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.ul,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.ul], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_use[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.use,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.use], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_use[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.use,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.use], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_var[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.`var`,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.`var`], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_var[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.`var`,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.`var`], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_video[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.video,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.video], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_video[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.video,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.video], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_view[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.view,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.view], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_view[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.view,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.view], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_wbr[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.wbr,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.wbr], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_wbr[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.wbr,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.wbr], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_webview[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.webview,
    styledFn: js.Function1[
      /* props */ baseuiLib.Anon_Theme with P, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.webview], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  @JSName("styled")
  def styled_webview[P /* <: js.Object */](
    component: baseuiLib.baseuiLibStrings.webview,
    styledFn: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[
    (stdLib.Pick[
      reactLib.reactMod.ComponentProps[baseuiLib.baseuiLibStrings.webview], 
      stdLib.Exclude[java.lang.String, baseuiLib.Anon_ClassName]
    ]) with P
  ] = js.native
  def withProps(Component: reactLib.reactMod.ComponentType[js.Object]): js.Function1[/* props */ js.Object, _] = js.native
  def withProps(Component: reactLib.reactMod.ComponentType[js.Object], customProps: js.Object): js.Function1[/* props */ js.Object, _] = js.native
}

