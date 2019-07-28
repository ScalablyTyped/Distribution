package typings.cavy.cavyMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cavy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hook[T /* <: js.Object */](component: ComponentClass[WithTestHook[T], ComponentState]): ComponentClass[T, ComponentState] = js.native
  def useCavy(): TestHookGenerator = js.native
}

