package typings.awsSdkUtilHexEncoding

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/util-hex-encoding", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def fromHex(encoded: String): Uint8Array = js.native
  def toHex(bytes: Uint8Array): String = js.native
}

