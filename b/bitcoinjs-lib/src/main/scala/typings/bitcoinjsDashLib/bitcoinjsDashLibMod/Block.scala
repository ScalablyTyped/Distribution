package typings.bitcoinjsDashLib.bitcoinjsDashLibMod

import typings.bitcoinjsDashLib.Anon_GetHash
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "Block")
@js.native
class Block () extends js.Object {
  def byteLength(): Double = js.native
  def byteLength(headersOnly: Boolean): Double = js.native
  def checkMerkleRoot(): js.Any = js.native
  def checkProofOfWork(): js.Any = js.native
  def getHash(): Buffer = js.native
  def getId(): String = js.native
  def getUTCDate(): js.Any = js.native
  def toBuffer(): Buffer = js.native
  def toBuffer(headersOnly: Boolean): Buffer = js.native
  def toHex(): String = js.native
  def toHex(headersOnly: Boolean): String = js.native
}

/* static members */
@JSImport("bitcoinjs-lib", "Block")
@js.native
object Block extends js.Object {
  def calculateMerkleRoot(transactions: js.Array[Anon_GetHash | Transaction]): Buffer = js.native
  def calculateTarget(bits: Double): Buffer = js.native
  def fromBuffer(buffer: Buffer): Block = js.native
  def fromHex(hex: String): Block = js.native
}

