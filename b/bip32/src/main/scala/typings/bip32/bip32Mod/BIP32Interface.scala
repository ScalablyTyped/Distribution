package typings.bip32.bip32Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BIP32Interface extends js.Object {
  
  var chainCode: Buffer = js.native
  
  var depth: Double = js.native
  
  def derive(index: Double): BIP32Interface = js.native
  
  def deriveHardened(index: Double): BIP32Interface = js.native
  
  def derivePath(path: String): BIP32Interface = js.native
  
  var fingerprint: Buffer = js.native
  
  var identifier: Buffer = js.native
  
  var index: Double = js.native
  
  def isNeutered(): Boolean = js.native
  
  var lowR: Boolean = js.native
  
  var network: Network = js.native
  
  def neutered(): BIP32Interface = js.native
  
  var parentFingerprint: Double = js.native
  
  var privateKey: js.UndefOr[Buffer] = js.native
  
  var publicKey: Buffer = js.native
  
  def sign(hash: Buffer): Buffer = js.native
  def sign(hash: Buffer, lowR: Boolean): Buffer = js.native
  
  def toBase58(): String = js.native
  
  def toWIF(): String = js.native
  
  def verify(hash: Buffer, signature: Buffer): Boolean = js.native
}
