package typings.bip21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip21", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(uri: String): AnonAddress = js.native
  def encode(address: String): String = js.native
  def encode(address: String, options: js.Any): String = js.native
}

