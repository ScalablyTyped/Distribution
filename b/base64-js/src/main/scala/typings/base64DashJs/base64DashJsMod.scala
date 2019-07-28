package typings.base64DashJs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("base64-js", JSImport.Namespace)
@js.native
object base64DashJsMod extends js.Object {
  def byteLength(encoded: String): Double = js.native
  def fromByteArray(bytes: Uint8Array): String = js.native
  def toByteArray(encoded: String): Uint8Array = js.native
}

