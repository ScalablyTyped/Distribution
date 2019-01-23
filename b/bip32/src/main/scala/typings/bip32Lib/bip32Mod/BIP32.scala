package typings
package bip32Lib.bip32Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32", "BIP32")
@js.native
class BIP32 protected () extends js.Object {
  protected def this(d: nodeLib.Buffer, Q: nodeLib.Buffer, chainCode: nodeLib.Buffer, network: NetworkType) = this()
  var chainCode: nodeLib.Buffer = js.native
  var depth: scala.Double = js.native
  var fingerprint: nodeLib.Buffer = js.native
  var identifier: nodeLib.Buffer = js.native
  var index: scala.Double = js.native
  var network: NetworkType = js.native
  var parentFingerprint: scala.Double = js.native
  var privateKey: nodeLib.Buffer = js.native
  var publicKey: nodeLib.Buffer = js.native
  def derive(index: scala.Double): BIP32 = js.native
  def deriveHardened(index: scala.Double): BIP32 = js.native
  def derivePath(path: java.lang.String): BIP32 = js.native
  def isNeutered(): scala.Boolean = js.native
  def neutered(): BIP32 = js.native
  def sign(hash: nodeLib.Buffer): nodeLib.Buffer = js.native
  def toBase58(): java.lang.String = js.native
  def toWIF(): java.lang.String = js.native
  def verify(hash: nodeLib.Buffer, signature: nodeLib.Buffer): scala.Boolean = js.native
}

