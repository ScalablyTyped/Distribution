package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.sub
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
object styled_sub extends js.Object {
  def apply[P /* <: js.Object */, T](component: sub, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[sub], 
      Exclude[/* keyof react.react.ComponentProps<'sub'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: sub, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[sub], 
      Exclude[/* keyof react.react.ComponentProps<'sub'> */ String, ClassName]
    ]) with P
  ] = js.native
}

