package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionMod {
  
  @JSImport("bitcoinjs-lib/types/transaction", "Transaction")
  @js.native
  class Transaction () extends StObject {
    
    var __toBuffer: js.Any = js.native
    
    def addInput(hash: Buffer, index: Double): Double = js.native
    def addInput(hash: Buffer, index: Double, sequence: js.UndefOr[scala.Nothing], scriptSig: Buffer): Double = js.native
    def addInput(hash: Buffer, index: Double, sequence: Double): Double = js.native
    def addInput(hash: Buffer, index: Double, sequence: Double, scriptSig: Buffer): Double = js.native
    
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
    
    var ins: js.Array[Input] = js.native
    
    def isCoinbase(): Boolean = js.native
    
    var locktime: Double = js.native
    
    var outs: js.Array[Output] = js.native
    
    def setInputScript(index: Double, scriptSig: Buffer): Unit = js.native
    
    def setWitness(index: Double, witness: js.Array[Buffer]): Unit = js.native
    
    def toBuffer(): Buffer = js.native
    def toBuffer(buffer: js.UndefOr[scala.Nothing], initialOffset: Double): Buffer = js.native
    def toBuffer(buffer: Buffer): Buffer = js.native
    def toBuffer(buffer: Buffer, initialOffset: Double): Buffer = js.native
    
    def toHex(): String = js.native
    
    var version: Double = js.native
    
    def virtualSize(): Double = js.native
    
    def weight(): Double = js.native
  }
  /* static members */
  object Transaction {
    
    @JSImport("bitcoinjs-lib/types/transaction", "Transaction.ADVANCED_TRANSACTION_FLAG")
    @js.native
    val ADVANCED_TRANSACTION_FLAG: /* 1 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/types/transaction", "Transaction.ADVANCED_TRANSACTION_MARKER")
    @js.native
    val ADVANCED_TRANSACTION_MARKER: /* 0 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/types/transaction", "Transaction.DEFAULT_SEQUENCE")
    @js.native
    val DEFAULT_SEQUENCE: /* 4294967295.0 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/types/transaction", "Transaction.SIGHASH_ALL")
    @js.native
    val SIGHASH_ALL: /* 1 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/types/transaction", "Transaction.SIGHASH_ANYONECANPAY")
    @js.native
    val SIGHASH_ANYONECANPAY: /* 128 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/types/transaction", "Transaction.SIGHASH_NONE")
    @js.native
    val SIGHASH_NONE: /* 2 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/types/transaction", "Transaction.SIGHASH_SINGLE")
    @js.native
    val SIGHASH_SINGLE: /* 3 */ Double = js.native
    
    @JSImport("bitcoinjs-lib/types/transaction", "Transaction.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): Transaction = js.native
    @JSImport("bitcoinjs-lib/types/transaction", "Transaction.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer, _NO_STRICT: Boolean): Transaction = js.native
    
    @JSImport("bitcoinjs-lib/types/transaction", "Transaction.fromHex")
    @js.native
    def fromHex(hex: String): Transaction = js.native
    
    @JSImport("bitcoinjs-lib/types/transaction", "Transaction.isCoinbaseHash")
    @js.native
    def isCoinbaseHash(buffer: Buffer): Boolean = js.native
  }
  
  @js.native
  trait Input extends StObject {
    
    var hash: Buffer = js.native
    
    var index: Double = js.native
    
    var script: Buffer = js.native
    
    var sequence: Double = js.native
    
    var witness: js.Array[Buffer] = js.native
  }
  object Input {
    
    @scala.inline
    def apply(hash: Buffer, index: Double, script: Buffer, sequence: Double, witness: js.Array[Buffer]): Input = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], witness = witness.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWitness(value: js.Array[Buffer]): Self = StObject.set(x, "witness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWitnessVarargs(value: Buffer*): Self = StObject.set(x, "witness", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Output extends StObject {
    
    var script: Buffer = js.native
    
    var value: Double = js.native
  }
  object Output {
    
    @scala.inline
    def apply(script: Buffer, value: Double): Output = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
