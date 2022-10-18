package typings.bitcoinjsLib

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransactionMod {
  
  @JSImport("bitcoinjs-lib/src/transaction", "Transaction")
  @js.native
  open class Transaction () extends StObject {
    
    /* private */ var __toBuffer: Any = js.native
    
    def addInput(hash: Buffer, index: Double): Double = js.native
    def addInput(hash: Buffer, index: Double, sequence: Double): Double = js.native
    def addInput(hash: Buffer, index: Double, sequence: Double, scriptSig: Buffer): Double = js.native
    def addInput(hash: Buffer, index: Double, sequence: Unit, scriptSig: Buffer): Double = js.native
    
    def addOutput(scriptPubKey: Buffer, value: Double): Double = js.native
    
    def byteLength(): Double = js.native
    def byteLength(_ALLOW_WITNESS: Boolean): Double = js.native
    
    def getHash(): Buffer = js.native
    def getHash(forWitness: Boolean): Buffer = js.native
    
    def getId(): String = js.native
    
    def hasWitnesses(): Boolean = js.native
    
    /**
      * Hash transaction for signing a specific input.
      *
      * Bitcoin uses a different hash for each signed transaction input.
      * This method copies the transaction, makes the necessary changes based on the
      * hashType, and then hashes the result.
      * This hash can then be used to sign the provided transaction input.
      */
    def hashForSignature(inIndex: Double, prevOutScript: Buffer, hashType: Double): Buffer = js.native
    
    def hashForWitnessV0(inIndex: Double, prevOutScript: Buffer, value: Double, hashType: Double): Buffer = js.native
    
    def hashForWitnessV1(inIndex: Double, prevOutScripts: js.Array[Buffer], values: js.Array[Double], hashType: Double): Buffer = js.native
    def hashForWitnessV1(
      inIndex: Double,
      prevOutScripts: js.Array[Buffer],
      values: js.Array[Double],
      hashType: Double,
      leafHash: Unit,
      annex: Buffer
    ): Buffer = js.native
    def hashForWitnessV1(
      inIndex: Double,
      prevOutScripts: js.Array[Buffer],
      values: js.Array[Double],
      hashType: Double,
      leafHash: Buffer
    ): Buffer = js.native
    def hashForWitnessV1(
      inIndex: Double,
      prevOutScripts: js.Array[Buffer],
      values: js.Array[Double],
      hashType: Double,
      leafHash: Buffer,
      annex: Buffer
    ): Buffer = js.native
    
    var ins: js.Array[Input] = js.native
    
    def isCoinbase(): Boolean = js.native
    
    var locktime: Double = js.native
    
    var outs: js.Array[Output] = js.native
    
    def setInputScript(index: Double, scriptSig: Buffer): Unit = js.native
    
    def setWitness(index: Double, witness: js.Array[Buffer]): Unit = js.native
    
    def toBuffer(): Buffer = js.native
    def toBuffer(buffer: Unit, initialOffset: Double): Buffer = js.native
    def toBuffer(buffer: Buffer): Buffer = js.native
    def toBuffer(buffer: Buffer, initialOffset: Double): Buffer = js.native
    
    def toHex(): String = js.native
    
    var version: Double = js.native
    
    def virtualSize(): Double = js.native
    
    def weight(): Double = js.native
  }
  /* static members */
  object Transaction {
    
    @JSImport("bitcoinjs-lib/src/transaction", "Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcoinjs-lib/src/transaction", "Transaction.ADVANCED_TRANSACTION_FLAG")
    @js.native
    val ADVANCED_TRANSACTION_FLAG: /* 1 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/src/transaction", "Transaction.ADVANCED_TRANSACTION_MARKER")
    @js.native
    val ADVANCED_TRANSACTION_MARKER: /* 0 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/src/transaction", "Transaction.DEFAULT_SEQUENCE")
    @js.native
    val DEFAULT_SEQUENCE: /* 4294967295.0 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/src/transaction", "Transaction.SIGHASH_ALL")
    @js.native
    val SIGHASH_ALL: /* 1 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/src/transaction", "Transaction.SIGHASH_ANYONECANPAY")
    @js.native
    val SIGHASH_ANYONECANPAY: /* 128 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/src/transaction", "Transaction.SIGHASH_DEFAULT")
    @js.native
    val SIGHASH_DEFAULT: /* 0 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/src/transaction", "Transaction.SIGHASH_INPUT_MASK")
    @js.native
    val SIGHASH_INPUT_MASK: /* 128 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/src/transaction", "Transaction.SIGHASH_NONE")
    @js.native
    val SIGHASH_NONE: /* 2 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/src/transaction", "Transaction.SIGHASH_OUTPUT_MASK")
    @js.native
    val SIGHASH_OUTPUT_MASK: /* 3 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/src/transaction", "Transaction.SIGHASH_SINGLE")
    @js.native
    val SIGHASH_SINGLE: /* 3 */ Double = js.native
    
    inline def fromBuffer(buffer: Buffer): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Transaction]
    inline def fromBuffer(buffer: Buffer, _NO_STRICT: Boolean): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], _NO_STRICT.asInstanceOf[js.Any])).asInstanceOf[Transaction]
    
    inline def fromHex(hex: String): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[Transaction]
    
    inline def isCoinbaseHash(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCoinbaseHash")(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait Input extends StObject {
    
    var hash: Buffer
    
    var index: Double
    
    var script: Buffer
    
    var sequence: Double
    
    var witness: js.Array[Buffer]
  }
  object Input {
    
    inline def apply(hash: Buffer, index: Double, script: Buffer, sequence: Double, witness: js.Array[Buffer]): Input = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], witness = witness.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    extension [Self <: Input](x: Self) {
      
      inline def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setWitness(value: js.Array[Buffer]): Self = StObject.set(x, "witness", value.asInstanceOf[js.Any])
      
      inline def setWitnessVarargs(value: Buffer*): Self = StObject.set(x, "witness", js.Array(value*))
    }
  }
  
  trait Output extends StObject {
    
    var script: Buffer
    
    var value: Double
  }
  object Output {
    
    inline def apply(script: Buffer, value: Double): Output = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    extension [Self <: Output](x: Self) {
      
      inline def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
