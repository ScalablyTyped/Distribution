package typings
package bip32Lib.bip32Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromBase58(string: java.lang.String): BIP32 = js.native
  def fromBase58(string: java.lang.String, network: NetworkType): BIP32 = js.native
  def fromPrivateKey(privateKey: nodeLib.Buffer, chainCode: nodeLib.Buffer): BIP32 = js.native
  def fromPrivateKey(privateKey: nodeLib.Buffer, chainCode: nodeLib.Buffer, network: NetworkType): BIP32 = js.native
  def fromPublicKey(publicKey: nodeLib.Buffer, chainCode: nodeLib.Buffer): BIP32 = js.native
  def fromPublicKey(publicKey: nodeLib.Buffer, chainCode: nodeLib.Buffer, network: NetworkType): BIP32 = js.native
  def fromSeed(seed: nodeLib.Buffer): BIP32 = js.native
  def fromSeed(seed: nodeLib.Buffer, network: NetworkType): BIP32 = js.native
}

