package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.blockquote
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
object styled_blockquote extends js.Object {
  
  def apply[P /* <: js.Object */, T](component: blockquote, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[blockquote], 
      Exclude[/* keyof react.react.ComponentProps<'blockquote'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: blockquote, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[blockquote], 
      Exclude[/* keyof react.react.ComponentProps<'blockquote'> */ String, ClassName]
    ]) with P
  ] = js.native
}
