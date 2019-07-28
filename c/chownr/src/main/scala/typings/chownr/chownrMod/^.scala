package typings.chownr.chownrMod

import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chownr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: PathLike, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def sync(path: PathLike, uid: Double, gid: Double): Unit = js.native
}

