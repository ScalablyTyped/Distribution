package typings.chromeLauncher.anon

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofchown extends js.Object {
  def apply(path: PathLike, uid: Double, gid: Double, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
}

