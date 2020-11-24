package typings.cavy.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cavy", "hook")
@js.native
object hook extends js.Object {
  
  def apply[P /* <: js.Object */](WrappedComponent: ComponentClass[WithTestHook[P], ComponentState]): ComponentClass[P, ComponentState] = js.native
}
