package typings.deleteEmpty

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delete-empty", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(dir: String): js.Promise[js.Array[String]] = js.native
  def apply(
    dir: String,
    cb: js.Function2[/* err */ js.UndefOr[Error | Null], /* deleted */ js.Array[String], Unit]
  ): Unit = js.native
  def sync(dir: String): js.Array[String] = js.native
}

