package typings.chownr

import typings.chownr.chownrMod.PathLike
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chownr", JSImport.Namespace)
@js.native
object chownrMod extends js.Object {
  def apply(path: PathLike, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def sync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  type PathLike = String | Buffer | URL
}

