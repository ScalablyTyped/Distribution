package typings
package bip32Lib.bip32Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromBase58(string: java.lang.String): bip32Lib.bip32Mod.BIP32 = js.native
  def fromBase58(string: java.lang.String, network: bip32Lib.bip32Mod.NetworkType): bip32Lib.bip32Mod.BIP32 = js.native
  def fromPrivateKey(privateKey: nodeLib.Buffer, chainCode: nodeLib.Buffer): bip32Lib.bip32Mod.BIP32 = js.native
  def fromPrivateKey(privateKey: nodeLib.Buffer, chainCode: nodeLib.Buffer, network: bip32Lib.bip32Mod.NetworkType): bip32Lib.bip32Mod.BIP32 = js.native
  def fromPublicKey(publicKey: nodeLib.Buffer, chainCode: nodeLib.Buffer): bip32Lib.bip32Mod.BIP32 = js.native
  def fromPublicKey(publicKey: nodeLib.Buffer, chainCode: nodeLib.Buffer, network: bip32Lib.bip32Mod.NetworkType): bip32Lib.bip32Mod.BIP32 = js.native
  def fromSeed(seed: nodeLib.Buffer): bip32Lib.bip32Mod.BIP32 = js.native
  def fromSeed(seed: nodeLib.Buffer, network: bip32Lib.bip32Mod.NetworkType): bip32Lib.bip32Mod.BIP32 = js.native
}

