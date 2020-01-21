package typings.base64Arraybuffer

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("base64-arraybuffer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(base64: String): ArrayBuffer = js.native
  def encode(arraybuffer: ArrayBuffer): String = js.native
}

