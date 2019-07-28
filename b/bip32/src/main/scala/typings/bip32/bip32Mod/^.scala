package typings.bip32.bip32Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromBase58(string: String): BIP32 = js.native
  def fromBase58(string: String, network: NetworkType): BIP32 = js.native
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer): BIP32 = js.native
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer, network: NetworkType): BIP32 = js.native
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer): BIP32 = js.native
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer, network: NetworkType): BIP32 = js.native
  def fromSeed(seed: Buffer): BIP32 = js.native
  def fromSeed(seed: Buffer, network: NetworkType): BIP32 = js.native
}

