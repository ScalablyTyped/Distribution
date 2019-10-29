package typings.bip32.typesBip32Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32/types/bip32", "fromBase58")
@js.native
object fromBase58 extends js.Object {
  def apply(inString: String): BIP32Interface = js.native
  def apply(inString: String, network: Network): BIP32Interface = js.native
}

