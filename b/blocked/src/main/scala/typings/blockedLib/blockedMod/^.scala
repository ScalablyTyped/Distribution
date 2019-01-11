package typings
package blockedLib.blockedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocked", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(callback: js.Function1[/* ms */ scala.Double, scala.Unit]): nodeLib.NodeJSNs.Timer = js.native
  def apply(
    callback: js.Function1[/* ms */ scala.Double, scala.Unit],
    options: blockedLib.blockedMod.BlockedNs.Options
  ): nodeLib.NodeJSNs.Timer = js.native
}

