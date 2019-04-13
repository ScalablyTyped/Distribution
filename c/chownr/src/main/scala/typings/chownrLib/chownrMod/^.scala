package typings
package chownrLib.chownrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chownr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    path: PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def sync(path: PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
}

