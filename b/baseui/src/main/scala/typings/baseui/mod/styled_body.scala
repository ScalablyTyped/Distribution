package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.body
import typings.react.mod.ComponentProps
import typings.std.Exclude
import typings.std.Pick
import typings.styletronReact.mod.StyletronComponent
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", "styled")
@js.native
object styled_body extends js.Object {
  def apply[P /* <: js.Object */, T](component: body, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[body], 
      Exclude[/* keyof react.react.ComponentProps<'body'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: body, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[body], 
      Exclude[/* keyof react.react.ComponentProps<'body'> */ String, ClassName]
    ]) with P
  ] = js.native
}

