package typings.bip32.bip32Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32", "fromSeed")
@js.native
object fromSeed extends js.Object {
  def apply(seed: Buffer): BIP32 = js.native
  def apply(seed: Buffer, network: NetworkType): BIP32 = js.native
}

