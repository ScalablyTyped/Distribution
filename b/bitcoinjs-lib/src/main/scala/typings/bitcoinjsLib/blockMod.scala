package typings.bitcoinjsLib

import typings.bitcoinjsLib.transactionMod.Transaction
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockMod {
  
  @JSImport("bitcoinjs-lib/types/block", "Block")
  @js.native
  class Block () extends StObject {
    
    /* private */ var __checkMerkleRoot: js.Any = js.native
    
    /* private */ var __checkWitnessCommit: js.Any = js.native
    
    var bits: Double = js.native
    
    def byteLength(): Double = js.native
    def byteLength(headersOnly: Boolean): Double = js.native
    def byteLength(headersOnly: Boolean, allowWitness: Boolean): Double = js.native
    def byteLength(headersOnly: Unit, allowWitness: Boolean): Double = js.native
    
    def checkProofOfWork(): Boolean = js.native
    
    def checkTxRoots(): Boolean = js.native
    
    def getHash(): Buffer = js.native
    
    def getId(): String = js.native
    
    def getUTCDate(): Date = js.native
    
    def getWitnessCommit(): Buffer | Null = js.native
    
    def hasWitness(): Boolean = js.native
    
    def hasWitnessCommit(): Boolean = js.native
    
    var merkleRoot: js.UndefOr[Buffer] = js.native
    
    var nonce: Double = js.native
    
    var prevHash: js.UndefOr[Buffer] = js.native
    
    var timestamp: Double = js.native
    
    def toBuffer(): Buffer = js.native
    def toBuffer(headersOnly: Boolean): Buffer = js.native
    
    def toHex(): String = js.native
    def toHex(headersOnly: Boolean): String = js.native
    
    var transactions: js.UndefOr[js.Array[Transaction]] = js.native
    
    var version: Double = js.native
    
    def weight(): Double = js.native
    
    var witnessCommit: js.UndefOr[Buffer] = js.native
  }
  /* static members */
  object Block {
    
    @JSImport("bitcoinjs-lib/types/block", "Block")
    @js.native
    val ^ : js.Any = js.native
    
    inline def calculateMerkleRoot(transactions: js.Array[Transaction]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMerkleRoot")(transactions.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def calculateMerkleRoot(transactions: js.Array[Transaction], forWitness: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateMerkleRoot")(transactions.asInstanceOf[js.Any], forWitness.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def calculateTarget(bits: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateTarget")(bits.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def fromBuffer(buffer: Buffer): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Block]
    
    inline def fromHex(hex: String): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[Block]
  }
}
