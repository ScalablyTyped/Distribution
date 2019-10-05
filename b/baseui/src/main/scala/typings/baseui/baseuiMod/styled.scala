package typings.baseui.baseuiMod

import typings.baseui.Anon_ClassName
import typings.baseui.Anon_Theme
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentProps
import typings.react.reactMod.ComponentState
import typings.react.reactMod.FunctionComponent
import typings.std.Exclude
import typings.std.Pick
import typings.styletronDashReact.styletronDashReactMod.StyletronComponent
import typings.styletronDashStandard.styletronDashStandardMod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", "styled")
@js.native
object styled extends js.Object {
  def apply[P /* <: js.Object */, C /* <: (ComponentClass[_, ComponentState]) | FunctionComponent[_] */, T](component: C, styledFn: js.Function1[/* props */ Anon_Theme[T] with P, StyleObject]): StyletronComponent[(Pick[ComponentProps[C], Exclude[String, Anon_ClassName]]) with P] = js.native
  def apply[P /* <: js.Object */, C /* <: (ComponentClass[_, ComponentState]) | FunctionComponent[_] */, T](component: C, styledFn: StyleObject): StyletronComponent[(Pick[ComponentProps[C], Exclude[String, Anon_ClassName]]) with P] = js.native
}

