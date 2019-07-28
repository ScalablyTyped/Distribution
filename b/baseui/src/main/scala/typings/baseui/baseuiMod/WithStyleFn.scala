package typings.baseui.baseuiMod

import typings.baseui.Anon_Theme
import typings.react.reactMod.ComponentProps
import typings.styletronDashReact.styletronDashReactMod.StyletronComponent
import typings.styletronDashStandard.styletronDashStandardMod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStyleFn extends js.Object {
  def apply[C /* <: StyletronComponent[_] */](component: C, style: StyleObject): StyletronComponent[ComponentProps[C]] = js.native
  def apply[C /* <: StyletronComponent[_] */, P /* <: js.Object */](component: C, style: js.Function1[/* props */ P with Anon_Theme, StyleObject]): StyletronComponent[ComponentProps[C] with P] = js.native
}

