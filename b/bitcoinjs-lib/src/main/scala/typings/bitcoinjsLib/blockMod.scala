package typings.bitcoinjsLib

import typings.bitcoinjsLib.transactionMod.Transaction
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/block", JSImport.Namespace)
@js.native
object blockMod extends js.Object {
  @js.native
  class Block () extends js.Object {
    var __checkMerkleRoot: js.Any = js.native
    var __checkWitnessCommit: js.Any = js.native
    var bits: Double = js.native
    var merkleRoot: js.UndefOr[Buffer] = js.native
    var nonce: Double = js.native
    var prevHash: js.UndefOr[Buffer] = js.native
    var timestamp: Double = js.native
    var transactions: js.UndefOr[js.Array[Transaction]] = js.native
    var version: Double = js.native
    var witnessCommit: js.UndefOr[Buffer] = js.native
    def byteLength(): Double = js.native
    def byteLength(headersOnly: js.UndefOr[scala.Nothing], allowWitness: Boolean): Double = js.native
    def byteLength(headersOnly: Boolean): Double = js.native
    def byteLength(headersOnly: Boolean, allowWitness: Boolean): Double = js.native
    def checkProofOfWork(): Boolean = js.native
    def checkTxRoots(): Boolean = js.native
    def getHash(): Buffer = js.native
    def getId(): String = js.native
    def getUTCDate(): Date = js.native
    def getWitnessCommit(): Buffer | Null = js.native
    def hasWitness(): Boolean = js.native
    def hasWitnessCommit(): Boolean = js.native
    def toBuffer(): Buffer = js.native
    def toBuffer(headersOnly: Boolean): Buffer = js.native
    def toHex(): String = js.native
    def toHex(headersOnly: Boolean): String = js.native
    def weight(): Double = js.native
  }
  
  /* static members */
  @js.native
  object Block extends js.Object {
    def calculateMerkleRoot(transactions: js.Array[Transaction]): Buffer = js.native
    def calculateMerkleRoot(transactions: js.Array[Transaction], forWitness: Boolean): Buffer = js.native
    def calculateTarget(bits: Double): Buffer = js.native
    def fromBuffer(buffer: Buffer): Block = js.native
    def fromHex(hex: String): Block = js.native
  }
  
}

