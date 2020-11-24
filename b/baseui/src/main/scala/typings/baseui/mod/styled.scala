package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.std.Exclude
import typings.std.Pick
import typings.styletronReact.mod.StyletronComponent
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui", "styled")
@js.native
object styled extends js.Object {
  
  def apply[P /* <: js.Object */, C /* <: (ComponentClass[_, ComponentState]) | FunctionComponent[_] */, T](component: C, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[C], 
      Exclude[/* keyof react.react.ComponentProps<C> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, C /* <: (ComponentClass[_, ComponentState]) | FunctionComponent[_] */, T](component: C, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[C], 
      Exclude[/* keyof react.react.ComponentProps<C> */ String, ClassName]
    ]) with P
  ] = js.native
}
