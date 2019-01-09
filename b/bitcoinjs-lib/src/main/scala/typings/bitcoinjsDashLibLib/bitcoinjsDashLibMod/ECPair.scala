package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "ECPair")
@js.native
class ECPair () extends js.Object {
  val compressed: scala.Boolean = js.native
  val network: Network = js.native
  val privateKey: nodeLib.Buffer = js.native
  val publicKey: nodeLib.Buffer = js.native
  def sign(hash: nodeLib.Buffer): nodeLib.Buffer = js.native
  def toWIF(): java.lang.String = js.native
  def verify(hash: nodeLib.Buffer, signature: nodeLib.Buffer): scala.Boolean = js.native
}

@JSImport("bitcoinjs-lib", "ECPair")
@js.native
object ECPair extends js.Object {
  def fromPrivateKey(buffer: nodeLib.Buffer): bitcoinjsDashLibLib.bitcoinjsDashLibMod.ECPair = js.native
  def fromPrivateKey(buffer: nodeLib.Buffer, options: bitcoinjsDashLibLib.Anon_Compressed): bitcoinjsDashLibLib.bitcoinjsDashLibMod.ECPair = js.native
  def fromPublicKey(buffer: nodeLib.Buffer): bitcoinjsDashLibLib.bitcoinjsDashLibMod.ECPair = js.native
  def fromPublicKey(buffer: nodeLib.Buffer, options: bitcoinjsDashLibLib.Anon_Compressed): bitcoinjsDashLibLib.bitcoinjsDashLibMod.ECPair = js.native
  def fromWIF(string: java.lang.String): bitcoinjsDashLibLib.bitcoinjsDashLibMod.ECPair = js.native
  def fromWIF(string: java.lang.String, network: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network): bitcoinjsDashLibLib.bitcoinjsDashLibMod.ECPair = js.native
  def makeRandom(): bitcoinjsDashLibLib.bitcoinjsDashLibMod.ECPair = js.native
  def makeRandom(options: bitcoinjsDashLibLib.Anon_CompressedNetwork): bitcoinjsDashLibLib.bitcoinjsDashLibMod.ECPair = js.native
}

