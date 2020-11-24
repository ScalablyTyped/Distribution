package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.area
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
object styled_area extends js.Object {
  
  def apply[P /* <: js.Object */, T](component: area, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[area], 
      Exclude[/* keyof react.react.ComponentProps<'area'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: area, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[area], 
      Exclude[/* keyof react.react.ComponentProps<'area'> */ String, ClassName]
    ]) with P
  ] = js.native
}
