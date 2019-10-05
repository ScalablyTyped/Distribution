package typings.bip32.bip32Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32", "fromBase58")
@js.native
object fromBase58 extends js.Object {
  def apply(string: String): BIP32 = js.native
  def apply(string: String, network: NetworkType): BIP32 = js.native
}

