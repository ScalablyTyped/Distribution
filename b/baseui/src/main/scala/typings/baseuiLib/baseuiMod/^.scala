package typings
package baseuiLib.baseuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BaseProvider: reactLib.reactMod.FC[BaseProviderProps] = js.native
  val DarkTheme: baseuiLib.Theme = js.native
  val DarkThemeMove: baseuiLib.Theme = js.native
  val LightTheme: baseuiLib.Theme = js.native
  val LightThemeMove: baseuiLib.Theme = js.native
  val LightThemePrimitives: baseuiLib.ThemePrimitives = js.native
  val LocaleProvider: reactLib.reactMod.FC[LocaleProviderProps] = js.native
  val ThemeProvider: reactLib.reactMod.FC[ThemeProviderProps] = js.native
  def createTheme(primitives: baseuiLib.ThemePrimitives): baseuiLib.Theme = js.native
  def createTheme(primitives: baseuiLib.ThemePrimitives, overrides: js.Object): baseuiLib.Theme = js.native
  def mergeOverrides[T](): baseuiLib.Overrides[T] = js.native
  def mergeOverrides[T](target: baseuiLib.Overrides[T]): baseuiLib.Overrides[T] = js.native
  def mergeOverrides[T](target: baseuiLib.Overrides[T], source: baseuiLib.Overrides[T]): baseuiLib.Overrides[T] = js.native
  def styled(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): styletronDashReactLib.styletronDashReactMod.StyledFn = js.native
  def withProps(Component: reactLib.reactMod.ComponentType[js.Object]): js.Function1[/* props */ js.Object, _] = js.native
  def withProps(Component: reactLib.reactMod.ComponentType[js.Object], customProps: js.Object): js.Function1[/* props */ js.Object, _] = js.native
}

