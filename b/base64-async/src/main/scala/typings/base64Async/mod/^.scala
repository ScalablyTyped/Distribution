package typings.base64Async.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("base64-async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: String): js.Promise[Buffer] = js.native
  def apply(input: String, options: Options): js.Promise[Buffer] = js.native
  def apply(input: Buffer): js.Promise[String] = js.native
  def apply(input: Buffer, options: Options): js.Promise[String] = js.native
}

