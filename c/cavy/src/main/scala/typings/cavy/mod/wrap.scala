package typings.cavy.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cavy", "wrap")
@js.native
object wrap extends js.Object {
  
  def apply[P /* <: js.Object */](WrappedComponent: js.Object): ComponentClass[P, ComponentState] = js.native
  def apply[P /* <: js.Object */](WrappedComponent: FunctionComponent[P]): ComponentClass[P, ComponentState] = js.native
}
