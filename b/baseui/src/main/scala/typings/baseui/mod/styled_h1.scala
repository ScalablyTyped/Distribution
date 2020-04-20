package typings.baseui.mod

import typings.baseui.AnonClassName
import typings.baseui.AnonTheme
import typings.baseui.baseuiStrings.h1
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
object styled_h1 extends js.Object {
  def apply[P /* <: js.Object */, T](component: h1, styledFn: js.Function1[/* props */ AnonTheme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[h1], 
      Exclude[/* keyof react.react.ComponentProps<'h1'> */ String, AnonClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: h1, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[h1], 
      Exclude[/* keyof react.react.ComponentProps<'h1'> */ String, AnonClassName]
    ]) with P
  ] = js.native
}

