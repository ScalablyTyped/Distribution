package typings.chromeLauncher.anon

import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffchmod extends js.Object {
  def apply(fd: Double, mode: Mode, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def __promisify__(fd: Double, mode: Mode): js.Promise[Unit] = js.native
}

