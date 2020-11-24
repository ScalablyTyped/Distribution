package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.div
import typings.react.mod.ComponentProps
import typings.std.Exclude
import typings.std.Pick
import typings.styletronReact.mod.StyletronComponent
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui", "styled")
@js.native
object styled_div extends js.Object {
  
  def apply[P /* <: js.Object */, T](component: div, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[div], 
      Exclude[/* keyof react.react.ComponentProps<'div'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: div, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[div], 
      Exclude[/* keyof react.react.ComponentProps<'div'> */ String, ClassName]
    ]) with P
  ] = js.native
}
