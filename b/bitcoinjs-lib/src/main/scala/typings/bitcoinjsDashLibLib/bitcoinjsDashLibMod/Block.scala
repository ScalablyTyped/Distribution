package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "Block")
@js.native
class Block () extends js.Object {
  def byteLength(): scala.Double = js.native
  def byteLength(headersOnly: scala.Boolean): scala.Double = js.native
  def checkMerkleRoot(): js.Any = js.native
  def checkProofOfWork(): js.Any = js.native
  def getHash(): nodeLib.Buffer = js.native
  def getId(): java.lang.String = js.native
  def getUTCDate(): js.Any = js.native
  def toBuffer(): nodeLib.Buffer = js.native
  def toBuffer(headersOnly: scala.Boolean): nodeLib.Buffer = js.native
  def toHex(): java.lang.String = js.native
  def toHex(headersOnly: scala.Boolean): java.lang.String = js.native
}

@JSImport("bitcoinjs-lib", "Block")
@js.native
object Block extends js.Object {
  def calculateMerkleRoot(
    transactions: js.Array[
      bitcoinjsDashLibLib.Anon_GetHash | bitcoinjsDashLibLib.bitcoinjsDashLibMod.Transaction
    ]
  ): nodeLib.Buffer = js.native
  def calculateTarget(bits: scala.Double): nodeLib.Buffer = js.native
  def fromBuffer(buffer: nodeLib.Buffer): bitcoinjsDashLibLib.bitcoinjsDashLibMod.Block = js.native
  def fromHex(hex: java.lang.String): bitcoinjsDashLibLib.bitcoinjsDashLibMod.Block = js.native
}

