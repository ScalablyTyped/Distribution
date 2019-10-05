package typings.cavy.cavyMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cavy", "hook")
@js.native
object hook extends js.Object {
  def apply[T /* <: js.Object */](component: ComponentClass[WithTestHook[T], ComponentState]): ComponentClass[T, ComponentState] = js.native
}

