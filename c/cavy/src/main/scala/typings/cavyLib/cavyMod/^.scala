package typings
package cavyLib.cavyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cavy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hook[T /* <: js.Object */](
    component: reactLib.reactMod.ReactNs.ComponentClass[cavyLib.cavyMod.WithTestHook[T], reactLib.reactMod.ReactNs.ComponentState]
  ): reactLib.reactMod.ReactNs.ComponentClass[T, reactLib.reactMod.ReactNs.ComponentState] = js.native
}

