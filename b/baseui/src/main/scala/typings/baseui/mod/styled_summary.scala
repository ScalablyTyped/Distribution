package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.summary
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
object styled_summary extends js.Object {
  def apply[P /* <: js.Object */, T](component: summary, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[summary], 
      Exclude[/* keyof react.react.ComponentProps<'summary'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: summary, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[summary], 
      Exclude[/* keyof react.react.ComponentProps<'summary'> */ String, ClassName]
    ]) with P
  ] = js.native
}

