package typings.bip32.bip32Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32", "fromPrivateKey")
@js.native
object fromPrivateKey extends js.Object {
  def apply(privateKey: Buffer, chainCode: Buffer): BIP32 = js.native
  def apply(privateKey: Buffer, chainCode: Buffer, network: NetworkType): BIP32 = js.native
}

