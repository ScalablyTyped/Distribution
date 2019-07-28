package typings.blocked.blockedMod

import typings.node.NodeJSNs.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocked", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(callback: js.Function1[/* ms */ Double, Unit]): Timer = js.native
  def apply(callback: js.Function1[/* ms */ Double, Unit], options: Options): Timer = js.native
}

