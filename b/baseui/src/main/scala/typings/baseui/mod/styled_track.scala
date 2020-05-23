package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.track
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
object styled_track extends js.Object {
  def apply[P /* <: js.Object */, T](component: track, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[track], 
      Exclude[/* keyof react.react.ComponentProps<'track'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: track, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[track], 
      Exclude[/* keyof react.react.ComponentProps<'track'> */ String, ClassName]
    ]) with P
  ] = js.native
}

