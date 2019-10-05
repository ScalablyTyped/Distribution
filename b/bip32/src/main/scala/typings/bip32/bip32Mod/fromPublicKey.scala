package typings.bip32.bip32Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32", "fromPublicKey")
@js.native
object fromPublicKey extends js.Object {
  def apply(publicKey: Buffer, chainCode: Buffer): BIP32 = js.native
  def apply(publicKey: Buffer, chainCode: Buffer, network: NetworkType): BIP32 = js.native
}

