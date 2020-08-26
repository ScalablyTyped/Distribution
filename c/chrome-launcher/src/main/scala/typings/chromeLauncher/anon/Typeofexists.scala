package typings.chromeLauncher.anon

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofexists extends js.Object {
  def apply(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  /**
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def __promisify__(path: PathLike): js.Promise[Boolean] = js.native
}

