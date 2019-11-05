package typings.cavy.cavyMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cavy", "wrap")
@js.native
object wrap extends js.Object {
  def apply[P /* <: js.Object */](WrappedComponent: js.Object): ComponentClass[P, ComponentState] = js.native
  def apply[P /* <: js.Object */](WrappedComponent: FunctionComponent[P]): ComponentClass[P, ComponentState] = js.native
}

