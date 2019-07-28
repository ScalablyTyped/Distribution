package typings.bitcoinjsDashLib.bitcoinjsDashLibMod

import typings.bitcoinjsDashLib.Anon_Compressed
import typings.bitcoinjsDashLib.Anon_CompressedNetwork
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "ECPair")
@js.native
class ECPair () extends js.Object {
  val compressed: Boolean = js.native
  val network: Network = js.native
  val privateKey: Buffer = js.native
  val publicKey: Buffer = js.native
  def sign(hash: Buffer): Buffer = js.native
  def toWIF(): String = js.native
  def verify(hash: Buffer, signature: Buffer): Boolean = js.native
}

/* static members */
@JSImport("bitcoinjs-lib", "ECPair")
@js.native
object ECPair extends js.Object {
  def fromPrivateKey(buffer: Buffer): ECPair = js.native
  def fromPrivateKey(buffer: Buffer, options: Anon_Compressed): ECPair = js.native
  def fromPublicKey(buffer: Buffer): ECPair = js.native
  def fromPublicKey(buffer: Buffer, options: Anon_Compressed): ECPair = js.native
  def fromWIF(string: String): ECPair = js.native
  def fromWIF(string: String, network: Network): ECPair = js.native
  def makeRandom(): ECPair = js.native
  def makeRandom(options: Anon_CompressedNetwork): ECPair = js.native
}

