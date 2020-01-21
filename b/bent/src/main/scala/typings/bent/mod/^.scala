package typings.bent.mod

import typings.bent.bentStrings.buffer
import typings.bent.bentStrings.json
import typings.bent.bentStrings.string
import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(args: Options*): RequestFunction[ValidResponse] = js.native
  def apply(baseUrl: String, args: Options*): RequestFunction[ValidResponse] = js.native
  def apply(baseUrl: String, `type`: buffer, args: Options*): RequestFunction[Buffer | ArrayBuffer] = js.native
  def apply(baseUrl: String, `type`: json, args: Options*): RequestFunction[Json] = js.native
  // Method or url first
  def apply(baseUrl: String, `type`: string, args: Options*): RequestFunction[String] = js.native
  def apply(`type`: buffer, args: Options*): RequestFunction[Buffer | ArrayBuffer] = js.native
  def apply(`type`: json, args: Options*): RequestFunction[Json] = js.native
  // Type first
  def apply(`type`: string, args: Options*): RequestFunction[String] = js.native
}

