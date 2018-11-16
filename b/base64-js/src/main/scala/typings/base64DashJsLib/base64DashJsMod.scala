package typings
package base64DashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("base64-js", JSImport.Namespace)
@js.native
object base64DashJsMod extends js.Object {
  def byteLength(encoded: java.lang.String): scala.Double = js.native
  def fromByteArray(bytes: stdLib.Uint8Array): java.lang.String = js.native
  def toByteArray(encoded: java.lang.String): stdLib.Uint8Array = js.native
}

