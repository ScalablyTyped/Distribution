package typings.b64Lite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("b64-lite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def atob(encoded: String): String = js.native
  def btoa(source: String): String = js.native
  def fromBase64(encoded: String): String = js.native
  def toBase64(source: String): String = js.native
}

