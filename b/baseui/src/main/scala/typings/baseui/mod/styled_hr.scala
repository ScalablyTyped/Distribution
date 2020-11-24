package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.hr_
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
object styled_hr extends js.Object {
  
  def apply[P /* <: js.Object */, T](component: hr_, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[hr_], 
      Exclude[/* keyof react.react.ComponentProps<'hr'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: hr_, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[hr_], 
      Exclude[/* keyof react.react.ComponentProps<'hr'> */ String, ClassName]
    ]) with P
  ] = js.native
}
