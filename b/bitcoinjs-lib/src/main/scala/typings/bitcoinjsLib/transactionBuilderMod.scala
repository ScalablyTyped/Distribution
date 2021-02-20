package typings.bitcoinjsLib

import typings.bitcoinjsLib.ecpairMod.Signer
import typings.bitcoinjsLib.networksMod.Network
import typings.bitcoinjsLib.transactionMod.Transaction
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionBuilderMod {
  
  @JSImport("bitcoinjs-lib/types/transaction_builder", "TransactionBuilder")
  @js.native
  class TransactionBuilder () extends StObject {
    def this(network: Network) = this()
    def this(network: js.UndefOr[scala.Nothing], maximumFeeRate: Double) = this()
    def this(network: Network, maximumFeeRate: Double) = this()
    
    var __INPUTS: js.Any = js.native
    
    var __PREV_TX_SET: js.Any = js.native
    
    var __TX: js.Any = js.native
    
    var __USE_LOW_R: js.Any = js.native
    
    var __addInputUnsafe: js.Any = js.native
    
    var __build: js.Any = js.native
    
    var __canModifyInputs: js.Any = js.native
    
    var __canModifyOutputs: js.Any = js.native
    
    var __needsOutputs: js.Any = js.native
    
    var __overMaximumFees: js.Any = js.native
    
    def addInput(txHash: String, vout: Double): Double = js.native
    def addInput(txHash: String, vout: Double, sequence: js.UndefOr[scala.Nothing], prevOutScript: Buffer): Double = js.native
    def addInput(txHash: String, vout: Double, sequence: Double): Double = js.native
    def addInput(txHash: String, vout: Double, sequence: Double, prevOutScript: Buffer): Double = js.native
    def addInput(txHash: Transaction, vout: Double): Double = js.native
    def addInput(txHash: Transaction, vout: Double, sequence: js.UndefOr[scala.Nothing], prevOutScript: Buffer): Double = js.native
    def addInput(txHash: Transaction, vout: Double, sequence: Double): Double = js.native
    def addInput(txHash: Transaction, vout: Double, sequence: Double, prevOutScript: Buffer): Double = js.native
    def addInput(txHash: Buffer, vout: Double): Double = js.native
    def addInput(txHash: Buffer, vout: Double, sequence: js.UndefOr[scala.Nothing], prevOutScript: Buffer): Double = js.native
    def addInput(txHash: Buffer, vout: Double, sequence: Double): Double = js.native
    def addInput(txHash: Buffer, vout: Double, sequence: Double, prevOutScript: Buffer): Double = js.native
    
    def addOutput(scriptPubKey: String, value: Double): Double = js.native
    def addOutput(scriptPubKey: Buffer, value: Double): Double = js.native
    
    def build(): Transaction = js.native
    
    def buildIncomplete(): Transaction = js.native
    
    var maximumFeeRate: Double = js.native
    
    var network: Network = js.native
    
    def setLockTime(locktime: Double): Unit = js.native
    
    def setLowR(): Boolean = js.native
    def setLowR(setting: Boolean): Boolean = js.native
    
    def setVersion(version: Double): Unit = js.native
    
    def sign(
      signParams: Double | TxbSignArg,
      keyPair: js.UndefOr[Signer],
      redeemScript: js.UndefOr[Buffer],
      hashType: js.UndefOr[Double],
      witnessValue: js.UndefOr[Double],
      witnessScript: js.UndefOr[Buffer]
    ): Unit = js.native
  }
  /* static members */
  object TransactionBuilder {
    
    @JSImport("bitcoinjs-lib/types/transaction_builder", "TransactionBuilder.fromTransaction")
    @js.native
    def fromTransaction(transaction: Transaction): TransactionBuilder = js.native
    @JSImport("bitcoinjs-lib/types/transaction_builder", "TransactionBuilder.fromTransaction")
    @js.native
    def fromTransaction(transaction: Transaction, network: Network): TransactionBuilder = js.native
  }
  
  @js.native
  trait TxbSignArg extends StObject {
    
    var hashType: js.UndefOr[Double] = js.native
    
    var keyPair: Signer = js.native
    
    var prevOutScriptType: String = js.native
    
    var redeemScript: js.UndefOr[Buffer] = js.native
    
    var vin: Double = js.native
    
    var witnessScript: js.UndefOr[Buffer] = js.native
    
    var witnessValue: js.UndefOr[Double] = js.native
  }
  object TxbSignArg {
    
    @scala.inline
    def apply(keyPair: Signer, prevOutScriptType: String, vin: Double): TxbSignArg = {
      val __obj = js.Dynamic.literal(keyPair = keyPair.asInstanceOf[js.Any], prevOutScriptType = prevOutScriptType.asInstanceOf[js.Any], vin = vin.asInstanceOf[js.Any])
      __obj.asInstanceOf[TxbSignArg]
    }
    
    @scala.inline
    implicit class TxbSignArgMutableBuilder[Self <: TxbSignArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashType(value: Double): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
      
      @scala.inline
      def setKeyPair(value: Signer): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevOutScriptType(value: String): Self = StObject.set(x, "prevOutScriptType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedeemScript(value: Buffer): Self = StObject.set(x, "redeemScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedeemScriptUndefined: Self = StObject.set(x, "redeemScript", js.undefined)
      
      @scala.inline
      def setVin(value: Double): Self = StObject.set(x, "vin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWitnessScript(value: Buffer): Self = StObject.set(x, "witnessScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWitnessScriptUndefined: Self = StObject.set(x, "witnessScript", js.undefined)
      
      @scala.inline
      def setWitnessValue(value: Double): Self = StObject.set(x, "witnessValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWitnessValueUndefined: Self = StObject.set(x, "witnessValue", js.undefined)
    }
  }
}
