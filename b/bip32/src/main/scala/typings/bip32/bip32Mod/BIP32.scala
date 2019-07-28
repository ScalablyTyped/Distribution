package typings.bip32.bip32Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32", "BIP32")
@js.native
class BIP32 protected () extends js.Object {
  protected def this(d: Buffer, Q: Buffer, chainCode: Buffer, network: NetworkType) = this()
  var chainCode: Buffer = js.native
  var depth: Double = js.native
  var fingerprint: Buffer = js.native
  var identifier: Buffer = js.native
  var index: Double = js.native
  var network: NetworkType = js.native
  var parentFingerprint: Double = js.native
  var privateKey: Buffer = js.native
  var publicKey: Buffer = js.native
  def derive(index: Double): BIP32 = js.native
  def deriveHardened(index: Double): BIP32 = js.native
  def derivePath(path: String): BIP32 = js.native
  def isNeutered(): Boolean = js.native
  def neutered(): BIP32 = js.native
  def sign(hash: Buffer): Buffer = js.native
  def toBase58(): String = js.native
  def toWIF(): String = js.native
  def verify(hash: Buffer, signature: Buffer): Boolean = js.native
}

