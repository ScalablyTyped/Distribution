package typings.chrome.chrome.platformKeys

import typings.std.ArrayBuffer
import typings.std.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.platformKeys.getKeyPair")
@js.native
object getKeyPair extends js.Object {
  def apply(
    certificate: ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit = js.native
}

