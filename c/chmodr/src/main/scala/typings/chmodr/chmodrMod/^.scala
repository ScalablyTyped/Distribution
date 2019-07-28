package typings.chmodr.chmodrMod

import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chmodr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: PathLike, mode: String | Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def sync(path: PathLike, mode: String): Unit = js.native
  def sync(path: PathLike, mode: Double): Unit = js.native
}

