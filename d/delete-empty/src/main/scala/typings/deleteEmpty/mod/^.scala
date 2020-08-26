package typings.deleteEmpty.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delete-empty", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(dir: String): js.Promise[js.Array[String]] = js.native
  def apply(dir: String, cb: DeleteEmptyCallback): Unit = js.native
  def apply(dir: String, options: Options, cb: DeleteEmptyCallback): Unit = js.native
}

