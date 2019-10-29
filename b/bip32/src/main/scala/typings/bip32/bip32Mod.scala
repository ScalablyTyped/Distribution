package typings.bip32

import typings.bip32.typesBip32Mod.BIP32Interface
import typings.bip32.typesBip32Mod.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32", JSImport.Namespace)
@js.native
object bip32Mod extends js.Object {
  def fromBase58(inString: String): BIP32Interface = js.native
  def fromBase58(inString: String, network: Network): BIP32Interface = js.native
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
  def fromSeed(seed: Buffer): BIP32Interface = js.native
  def fromSeed(seed: Buffer, network: Network): BIP32Interface = js.native
}

