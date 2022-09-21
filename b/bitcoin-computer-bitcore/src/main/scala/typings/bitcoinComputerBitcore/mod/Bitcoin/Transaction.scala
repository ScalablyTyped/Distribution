package typings.bitcoinComputerBitcore.mod.Bitcoin

import typings.bitcoinComputerBitcore.mod.Bitcoin.Transaction.Input
import typings.bitcoinComputerBitcore.mod.Bitcoin.Transaction.Input.MultiSigScriptHash
import typings.bitcoinComputerBitcore.mod.Bitcoin.Transaction.Output
import typings.bitcoinComputerBitcore.mod.Bitcoin.Transaction.UnspentOutput
import typings.bitcoinComputerBitcore.mod.Bitcoin.crypto.Signature
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoin-computer-bitcore", "Bitcoin.Transaction")
@js.native
open class Transaction () extends StObject {
  def this(serialized: Any) = this()
  
  def _estimateFee(): Double = js.native
  
  def _getInputAmount(): Double = js.native
  
  def _getOutputAmount(): Double = js.native
  
  def addData(value: String): this.type = js.native
  def addData(value: Buffer): this.type = js.native
  
  def addInput(input: Input): this.type = js.native
  def addInput(input: MultiSigScriptHash): Transaction = js.native
  def addInput(input: MultiSigScriptHash, outputScript: Any): Transaction = js.native
  def addInput(input: MultiSigScriptHash, outputScript: Any, satoshis: Any): Transaction = js.native
  def addInput(input: MultiSigScriptHash, outputScript: scala.Unit, satoshis: Any): Transaction = js.native
  
  def addOutput(output: Output): this.type = js.native
  
  def applySignature(sig: Signature): this.type = js.native
  
  def change(address: String): this.type = js.native
  def change(address: Address): this.type = js.native
  
  def enableRBF(): this.type = js.native
  
  def fee(amount: Double): this.type = js.native
  
  def feePerKb(amount: Double): this.type = js.native
  
  def from(utxos: js.Array[UnspentOutput]): this.type = js.native
  def from(utxos: js.Array[UnspentOutput], pubkeys: js.Array[String]): this.type = js.native
  def from(utxos: js.Array[UnspentOutput], pubkeys: js.Array[String], threshold: Double): this.type = js.native
  def from(utxos: js.Array[UnspentOutput], pubkeys: scala.Unit, threshold: Double): this.type = js.native
  def from(utxos: UnspentOutput): this.type = js.native
  def from(utxos: UnspentOutput, pubkeys: js.Array[String]): this.type = js.native
  def from(utxos: UnspentOutput, pubkeys: js.Array[String], threshold: Double): this.type = js.native
  def from(utxos: UnspentOutput, pubkeys: scala.Unit, threshold: Double): this.type = js.native
  
  def fromString(str: String): Transaction = js.native
  
  def getChangeOutput(): Output | Null = js.native
  
  def getFee(): Double = js.native
  
  def getLockTime(): js.Date | Double = js.native
  
  def getSignatures(privateKey: PrivateKey): js.Array[Any] = js.native
  def getSignatures(privateKey: PrivateKey, sigtype: Double): js.Array[Any] = js.native
  
  def hasWitnesses(): Boolean = js.native
  
  val hash: String = js.native
  
  val id: String = js.native
  
  var inputs: js.Array[Input] = js.native
  
  def inspect(): String = js.native
  
  def isCoinbase(): Boolean = js.native
  
  def isRBF(): Boolean = js.native
  
  def lockUntilBlockHeight(height: Double): this.type = js.native
  
  def lockUntilDate(time: js.Date): this.type = js.native
  def lockUntilDate(time: Double): this.type = js.native
  
  val nLockTime: Double = js.native
  
  var nid: String = js.native
  
  var outputs: js.Array[Output] = js.native
  
  def serialize(): String = js.native
  
  def sign(privateKey: String): this.type = js.native
  def sign(privateKey: String, sigtype: Double): this.type = js.native
  def sign(privateKey: PrivateKey): this.type = js.native
  def sign(privateKey: PrivateKey, sigtype: Double): this.type = js.native
  
  def to(address: String, amount: Double): this.type = js.native
  def to(address: js.Array[Address], amount: Double): this.type = js.native
  def to(address: Address, amount: Double): this.type = js.native
  
  def toJSON(): this.type = js.native
  
  def uncheckedAddInput(input: Input): Transaction = js.native
  
  def verify(): String | Boolean = js.native
  
  val version: Double = js.native
}
object Transaction {
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Transaction.Input")
  @js.native
  open class Input protected () extends StObject {
    def this(data: js.Object) = this()
    
    val output: js.UndefOr[Output] = js.native
    
    val outputIndex: Double = js.native
    
    val prevTxId: Buffer = js.native
    
    val script: Script = js.native
    
    val sequenceNumber: Double = js.native
  }
  object Input {
    
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.Transaction.Input.MultiSigScriptHash")
    @js.native
    open class MultiSigScriptHash protected () extends StObject {
      def this(
        input: js.Object,
        pubkeys: js.Array[String],
        threshold: Double,
        signatures: js.Array[Any],
        redeemScript: Script
      ) = this()
      def this(
        input: js.Object,
        pubkeys: js.Array[String],
        threshold: Double,
        signatures: Null,
        redeemScript: Script
      ) = this()
      
      def toObject(): js.Object = js.native
    }
  }
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Transaction.Output")
  @js.native
  open class Output protected () extends StObject {
    def this(data: js.Object) = this()
    
    val _scriptBuffer: Buffer = js.native
    
    def inspect(): String = js.native
    
    val satoshis: Double = js.native
    
    val script: Script = js.native
    
    def setScript(script: String): this.type = js.native
    def setScript(script: Script): this.type = js.native
    def setScript(script: Buffer): this.type = js.native
    
    def toObject(): js.Object = js.native
  }
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Transaction.UnspentOutput")
  @js.native
  open class UnspentOutput protected () extends StObject {
    def this(data: js.Object) = this()
    
    val address: js.UndefOr[Address] = js.native
    
    val amount: Double = js.native
    
    val confirmations: js.UndefOr[Double] = js.native
    
    val inputIndex: js.UndefOr[Double] = js.native
    
    def inspect(): String = js.native
    
    val label: js.UndefOr[String] = js.native
    
    val outputIndex: js.UndefOr[Double] = js.native
    
    val safe: js.UndefOr[Boolean] = js.native
    
    val satoshis: Double = js.native
    
    val script: Script = js.native
    
    val scriptPubKey: js.UndefOr[String | Script] = js.native
    
    val solvable: js.UndefOr[Boolean] = js.native
    
    val spendable: js.UndefOr[Boolean] = js.native
    
    def toObject(): this.type = js.native
    
    val txId: String = js.native
    
    val vout: js.UndefOr[Double] = js.native
  }
  object UnspentOutput {
    
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.Transaction.UnspentOutput")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromObject(o: js.Object): UnspentOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(o.asInstanceOf[js.Any]).asInstanceOf[UnspentOutput]
  }
}
