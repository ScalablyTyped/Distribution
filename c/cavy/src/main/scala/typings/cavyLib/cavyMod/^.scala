package typings
package cavyLib.cavyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cavy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hook[T /* <: js.Object */](component: reactLib.reactMod.ComponentClass[WithTestHook[T], reactLib.reactMod.ComponentState]): reactLib.reactMod.ComponentClass[T, reactLib.reactMod.ComponentState] = js.native
}

