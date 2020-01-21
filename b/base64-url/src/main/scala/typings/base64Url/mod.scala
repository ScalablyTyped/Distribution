package typings.base64Url

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("base64-url", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(value: String): String = js.native
  def decode(value: String, encoding: String): String = js.native
  def encode(value: String): String = js.native
  def encode(value: String, encoding: String): String = js.native
  def escape(value: String): String = js.native
  def unescape(value: String): String = js.native
}

