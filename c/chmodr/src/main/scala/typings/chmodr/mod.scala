package typings.chmodr

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chmodr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(path: PathLike, mode: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: PathLike, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def sync(path: PathLike, mode: String): Unit = js.native
  def sync(path: PathLike, mode: Double): Unit = js.native
  type PathLike = String | Buffer | URL_
}

