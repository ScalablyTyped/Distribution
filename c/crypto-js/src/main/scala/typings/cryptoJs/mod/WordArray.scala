package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArray extends js.Object {
  var ciphertext: String = js.native
  var iv: String = js.native
  var key: js.UndefOr[String] = js.native
  var salt: String = js.native
  def toString(encoder: Encoder): String = js.native
}

