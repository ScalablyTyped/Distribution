package typings.bitcoreLibCash.mod

import typings.bitcoreLibCash.bitcoreLibCashStrings.ecdsa
import typings.bitcoreLibCash.bitcoreLibCashStrings.schnorr
import typings.bitcoreLibCash.mod.Transaction.Input
import typings.bitcoreLibCash.mod.Transaction.Output
import typings.bitcoreLibCash.mod.Transaction.UnspentOutput
import typings.bitcoreLibCash.mod.crypto.BN
import typings.bitcoreLibCash.mod.crypto.Signature
import typings.bitcoreLibCash.mod.crypto.TransactionSignature
import typings.bitcoreLibCash.mod.encoding.BufferReader
import typings.bitcoreLibCash.mod.encoding.BufferWriter
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "Transaction")
@js.native
open class Transaction () extends StObject {
  def this(serialized: Any) = this()
  
  def addData(value: String): this.type = js.native
  def addData(value: Buffer): this.type = js.native
  
  def addInput(input: Input): this.type = js.native
  def addInput(input: Input, outputScript: String): this.type = js.native
  def addInput(input: Input, outputScript: String, satoshis: Double): this.type = js.native
  def addInput(input: Input, outputScript: scala.Unit, satoshis: Double): this.type = js.native
  def addInput(input: Input, outputScript: Script): this.type = js.native
  def addInput(input: Input, outputScript: Script, satoshis: Double): this.type = js.native
  
  def addOutput(output: Output): this.type = js.native
  
  def applySignature(sig: Signature): this.type = js.native
  def applySignature(sig: Signature, signingMethod: String): this.type = js.native
  
  def change(address: String): this.type = js.native
  def change(address: Address): this.type = js.native
  
  def checkedSerialize(opts: js.Object): String = js.native
  
  def clearOutputs(): this.type = js.native
  
  def fee(amount: Double): this.type = js.native
  
  def feePerByte(amount: Double): this.type = js.native
  
  def feePerKb(amount: Double): this.type = js.native
  
  def from(utxos: js.Array[UnspentOutput]): this.type = js.native
  def from(utxos: js.Array[UnspentOutput], pubkeys: js.Array[PublicKey]): this.type = js.native
  def from(utxos: js.Array[UnspentOutput], pubkeys: js.Array[PublicKey], threshold: Double): this.type = js.native
  def from(utxos: js.Array[UnspentOutput], pubkeys: js.Array[PublicKey], threshold: Double, opts: js.Object): this.type = js.native
  def from(
    utxos: js.Array[UnspentOutput],
    pubkeys: js.Array[PublicKey],
    threshold: scala.Unit,
    opts: js.Object
  ): this.type = js.native
  def from(utxos: js.Array[UnspentOutput], pubkeys: scala.Unit, threshold: Double): this.type = js.native
  def from(utxos: js.Array[UnspentOutput], pubkeys: scala.Unit, threshold: Double, opts: js.Object): this.type = js.native
  def from(utxos: js.Array[UnspentOutput], pubkeys: scala.Unit, threshold: scala.Unit, opts: js.Object): this.type = js.native
  
  def getChangeOutput(): Output | Null = js.native
  
  def getFee(): Double = js.native
  
  def getLockTime(): js.Date | Double = js.native
  
  def getSerializationError(opts: js.Object): js.Error = js.native
  
  def getSignatures(privKey: String): js.Array[TransactionSignature] = js.native
  def getSignatures(privKey: String, sigtype: Double): js.Array[TransactionSignature] = js.native
  def getSignatures(privKey: String, sigtype: Double, signingMethod: String): js.Array[TransactionSignature] = js.native
  def getSignatures(privKey: String, sigtype: scala.Unit, signingMethod: String): js.Array[TransactionSignature] = js.native
  def getSignatures(privKey: PrivateKey): js.Array[TransactionSignature] = js.native
  def getSignatures(privKey: PrivateKey, sigtype: Double): js.Array[TransactionSignature] = js.native
  def getSignatures(privKey: PrivateKey, sigtype: Double, signingMethod: String): js.Array[TransactionSignature] = js.native
  def getSignatures(privKey: PrivateKey, sigtype: scala.Unit, signingMethod: String): js.Array[TransactionSignature] = js.native
  
  def hasAllUtxoInfo(): Boolean = js.native
  
  val hash: String = js.native
  
  val id: String = js.native
  
  var inputs: js.Array[Input] = js.native
  
  def inspect(): String = js.native
  
  def invalidSatoshis(): Boolean = js.native
  
  def isCoinbase(): Boolean = js.native
  
  def isFullySigned(): Boolean = js.native
  
  def isValidSignature(sig: TransactionSignature): Boolean = js.native
  
  def lockUntilBlockHeight(height: Double): this.type = js.native
  
  def lockUntilDate(time: js.Date): this.type = js.native
  def lockUntilDate(time: Double): this.type = js.native
  
  var nid: String = js.native
  
  var outputs: js.Array[Output] = js.native
  
  def removeInput(index: Double): scala.Unit = js.native
  
  def removeOutput(index: Double): scala.Unit = js.native
  
  def serialize(): String = js.native
  def serialize(unsafe: js.Object): String = js.native
  def serialize(unsafe: Boolean): String = js.native
  
  def setVersion(version: Double): this.type = js.native
  
  def shallowCopy(transaction: Transaction): Transaction = js.native
  
  def shuffleOutputs(): this.type = js.native
  
  def sign(privateKey: String): this.type = js.native
  def sign(privateKey: String, sigtype: Double): this.type = js.native
  def sign(privateKey: String, sigtype: Double, signingMethod: String): this.type = js.native
  def sign(privateKey: String, sigtype: Null, signingMethod: String): this.type = js.native
  def sign(privateKey: String, sigtype: scala.Unit, signingMethod: String): this.type = js.native
  def sign(privateKey: js.Array[PrivateKey | String]): this.type = js.native
  def sign(privateKey: js.Array[PrivateKey | String], sigtype: Double): this.type = js.native
  def sign(privateKey: js.Array[PrivateKey | String], sigtype: Double, signingMethod: String): this.type = js.native
  def sign(privateKey: js.Array[PrivateKey | String], sigtype: Null, signingMethod: String): this.type = js.native
  def sign(privateKey: js.Array[PrivateKey | String], sigtype: scala.Unit, signingMethod: String): this.type = js.native
  def sign(privateKey: PrivateKey): this.type = js.native
  def sign(privateKey: PrivateKey, sigtype: Double): this.type = js.native
  def sign(privateKey: PrivateKey, sigtype: Double, signingMethod: String): this.type = js.native
  def sign(privateKey: PrivateKey, sigtype: Null, signingMethod: String): this.type = js.native
  def sign(privateKey: PrivateKey, sigtype: scala.Unit, signingMethod: String): this.type = js.native
  
  def sort(): this.type = js.native
  
  def sortInputs(sortingFunction: js.Function1[/* inputs */ js.Array[Input], js.Array[Input]]): this.type = js.native
  
  def sortOutputs(sortingFunction: js.Function1[/* outputs */ js.Array[Output], js.Array[Output]]): this.type = js.native
  
  def to(address: String, amount: Double): this.type = js.native
  def to(address: js.Array[Address], amount: Double): this.type = js.native
  def to(address: Address, amount: Double): this.type = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toBufferWriter(): BufferWriter = js.native
  
  def toJSON(): js.Object = js.native
  
  def toObject(): js.Object = js.native
  
  def uncheckedAddInput(input: Input): this.type = js.native
  
  def uncheckedSerialize(): String = js.native
  
  def verify(): String | Boolean = js.native
  
  def verifySignature(sig: Signature, pubkey: PublicKey, nin: Double, subscript: Script, satoshisBN: BN): Boolean = js.native
  def verifySignature(sig: Signature, pubkey: PublicKey, nin: Double, subscript: Script, satoshisBN: BN, flags: Double): Boolean = js.native
  def verifySignature(
    sig: Signature,
    pubkey: PublicKey,
    nin: Double,
    subscript: Script,
    satoshisBN: BN,
    flags: Double,
    signingMethod: String
  ): Boolean = js.native
  def verifySignature(
    sig: Signature,
    pubkey: PublicKey,
    nin: Double,
    subscript: Script,
    satoshisBN: BN,
    flags: scala.Unit,
    signingMethod: String
  ): Boolean = js.native
}
/* static members */
object Transaction {
  
  @JSImport("bitcore-lib-cash", "Transaction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bitcore-lib-cash", "Transaction.Input")
  @js.native
  open class Input protected () extends StObject {
    def this(params: js.Object) = this()
    
    def addSignature(transaction: Transaction, signature: Signature): this.type = js.native
    def addSignature(transaction: Transaction, signature: Signature, signingMethod: String): this.type = js.native
    
    def clearSignatures(): this.type = js.native
    
    def getLockTime(): js.Date | Double = js.native
    
    def getSignatures(transaction: Transaction, privateKey: PrivateKey, index: Double): js.Array[TransactionSignature] = js.native
    def getSignatures(transaction: Transaction, privateKey: PrivateKey, index: Double, sigtype: Double): js.Array[TransactionSignature] = js.native
    def getSignatures(transaction: Transaction, privateKey: PrivateKey, index: Double, sigtype: Double, hashData: Any): js.Array[TransactionSignature] = js.native
    def getSignatures(
      transaction: Transaction,
      privateKey: PrivateKey,
      index: Double,
      sigtype: Double,
      hashData: Any,
      signingMethod: String
    ): js.Array[TransactionSignature] = js.native
    def getSignatures(
      transaction: Transaction,
      privateKey: PrivateKey,
      index: Double,
      sigtype: Double,
      hashData: scala.Unit,
      signingMethod: String
    ): js.Array[TransactionSignature] = js.native
    def getSignatures(
      transaction: Transaction,
      privateKey: PrivateKey,
      index: Double,
      sigtype: scala.Unit,
      hashData: Any
    ): js.Array[TransactionSignature] = js.native
    def getSignatures(
      transaction: Transaction,
      privateKey: PrivateKey,
      index: Double,
      sigtype: scala.Unit,
      hashData: Any,
      signingMethod: String
    ): js.Array[TransactionSignature] = js.native
    def getSignatures(
      transaction: Transaction,
      privateKey: PrivateKey,
      index: Double,
      sigtype: scala.Unit,
      hashData: scala.Unit,
      signingMethod: String
    ): js.Array[TransactionSignature] = js.native
    
    def isFinal(): Boolean = js.native
    
    def isFullySigned(): Boolean = js.native
    
    def isNull(): Boolean = js.native
    
    def isValidSignature(transaction: Transaction, signature: Signature): Boolean = js.native
    def isValidSignature(transaction: Transaction, signature: Signature, signingMethod: String): Boolean = js.native
    
    def lockForSeconds(seconds: Double): this.type = js.native
    
    def lockUntilBlockHeight(heightDiff: Double): this.type = js.native
    
    val output: js.UndefOr[Output] = js.native
    
    val outputIndex: Double = js.native
    
    val prevTxId: Buffer = js.native
    
    val script: Script = js.native
    
    val sequenceNumber: Double = js.native
    
    def setScript(script: Script): this.type = js.native
    
    def toBufferWriter(writer: BufferWriter): BufferWriter = js.native
    
    def toObject(): js.Object = js.native
  }
  object Input {
    
    @JSImport("bitcore-lib-cash", "Transaction.Input")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcore-lib-cash", "Transaction.Input.Multisig")
    @js.native
    open class Multisig protected () extends Input {
      def this(input: Input) = this()
      def this(input: Input, pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey]) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: Double
      ) = this()
      def this(input: Input, pubkeys: scala.Unit, threshold: Double) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: Double,
        signatures: js.Array[Signature]
      ) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: scala.Unit,
        signatures: js.Array[Signature]
      ) = this()
      def this(input: Input, pubkeys: scala.Unit, threshold: Double, signatures: js.Array[Signature]) = this()
      def this(input: Input, pubkeys: scala.Unit, threshold: scala.Unit, signatures: js.Array[Signature]) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: Double,
        signatures: js.Array[Signature],
        opts: js.Object
      ) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: Double,
        signatures: scala.Unit,
        opts: js.Object
      ) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: scala.Unit,
        signatures: js.Array[Signature],
        opts: js.Object
      ) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: scala.Unit,
        signatures: scala.Unit,
        opts: js.Object
      ) = this()
      def this(
        input: Input,
        pubkeys: scala.Unit,
        threshold: Double,
        signatures: js.Array[Signature],
        opts: js.Object
      ) = this()
      def this(input: Input, pubkeys: scala.Unit, threshold: Double, signatures: scala.Unit, opts: js.Object) = this()
      def this(
        input: Input,
        pubkeys: scala.Unit,
        threshold: scala.Unit,
        signatures: js.Array[Signature],
        opts: js.Object
      ) = this()
      def this(input: Input, pubkeys: scala.Unit, threshold: scala.Unit, signatures: scala.Unit, opts: js.Object) = this()
      
      def countMissingSignatures(): Double = js.native
      
      def countSignatures(): Double = js.native
      
      def normalizeSignatures(
        transaction: Transaction,
        input: Input,
        inputIndex: Double,
        signatures: js.Array[Buffer],
        publicKeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey]
      ): js.Array[TransactionSignature] = js.native
      def normalizeSignatures(
        transaction: Transaction,
        input: Input,
        inputIndex: Double,
        signatures: js.Array[Buffer],
        publicKeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        signingMethod: String
      ): js.Array[TransactionSignature] = js.native
      
      def publicKeysWithoutSignature(): Double = js.native
    }
    
    @JSImport("bitcore-lib-cash", "Transaction.Input.MultisigScriptHash")
    @js.native
    open class MultisigScriptHash protected () extends Input {
      def this(input: Input) = this()
      def this(input: Input, pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey]) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: Double
      ) = this()
      def this(input: Input, pubkeys: scala.Unit, threshold: Double) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: Double,
        signatures: js.Array[Signature]
      ) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: scala.Unit,
        signatures: js.Array[Signature]
      ) = this()
      def this(input: Input, pubkeys: scala.Unit, threshold: Double, signatures: js.Array[Signature]) = this()
      def this(input: Input, pubkeys: scala.Unit, threshold: scala.Unit, signatures: js.Array[Signature]) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: Double,
        signatures: js.Array[Signature],
        opts: js.Object
      ) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: Double,
        signatures: scala.Unit,
        opts: js.Object
      ) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: scala.Unit,
        signatures: js.Array[Signature],
        opts: js.Object
      ) = this()
      def this(
        input: Input,
        pubkeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        threshold: scala.Unit,
        signatures: scala.Unit,
        opts: js.Object
      ) = this()
      def this(
        input: Input,
        pubkeys: scala.Unit,
        threshold: Double,
        signatures: js.Array[Signature],
        opts: js.Object
      ) = this()
      def this(input: Input, pubkeys: scala.Unit, threshold: Double, signatures: scala.Unit, opts: js.Object) = this()
      def this(
        input: Input,
        pubkeys: scala.Unit,
        threshold: scala.Unit,
        signatures: js.Array[Signature],
        opts: js.Object
      ) = this()
      def this(input: Input, pubkeys: scala.Unit, threshold: scala.Unit, signatures: scala.Unit, opts: js.Object) = this()
      
      def countMissingSignatures(): Double = js.native
      
      def countSignatures(): Double = js.native
      
      def normalizeSignatures(
        transaction: Transaction,
        input: Input,
        inputIndex: Double,
        signatures: js.Array[Buffer],
        publicKeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey]
      ): js.Array[TransactionSignature] = js.native
      def normalizeSignatures(
        transaction: Transaction,
        input: Input,
        inputIndex: Double,
        signatures: js.Array[Buffer],
        publicKeys: js.Array[typings.bitcoreLibCash.mod.Transaction.Input.PublicKey],
        signingMethod: String
      ): js.Array[TransactionSignature] = js.native
      
      def publicKeysWithoutSignature(): Double = js.native
    }
    
    @JSImport("bitcore-lib-cash", "Transaction.Input.PublicKey")
    @js.native
    open class PublicKey protected () extends Input {
      def this(params: js.Object) = this()
    }
    
    @JSImport("bitcore-lib-cash", "Transaction.Input.PublicKeyHash")
    @js.native
    open class PublicKeyHash protected () extends Input {
      def this(params: js.Object) = this()
    }
    
    /* static member */
    inline def fromBufferReader(br: BufferReader): Input = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBufferReader")(br.asInstanceOf[js.Any]).asInstanceOf[Input]
    
    /* static member */
    inline def fromObject(obj: js.Object): Input = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Input]
  }
  
  @JSImport("bitcore-lib-cash", "Transaction.Output")
  @js.native
  open class Output protected () extends StObject {
    def this(data: js.Object) = this()
    
    def inspect(): String = js.native
    
    val satoshis: Double = js.native
    
    val script: Script = js.native
    
    def setScript(script: String): this.type = js.native
    def setScript(script: Script): this.type = js.native
    def setScript(script: Buffer): this.type = js.native
    
    def toObject(): js.Object = js.native
  }
  
  @JSImport("bitcore-lib-cash", "Transaction.UnspentOutput")
  @js.native
  open class UnspentOutput protected () extends StObject {
    def this(data: js.Object) = this()
    
    val address: Address = js.native
    
    def inspect(): String = js.native
    
    val outputIndex: Double = js.native
    
    val satoshis: Double = js.native
    
    val script: Script = js.native
    
    def toObject(): this.type = js.native
    
    val txId: String = js.native
  }
  object UnspentOutput {
    
    @JSImport("bitcore-lib-cash", "Transaction.UnspentOutput")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromObject(o: js.Object): UnspentOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(o.asInstanceOf[js.Any]).asInstanceOf[UnspentOutput]
  }
  
  inline def fromBuffer(buffer: Buffer): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  inline def fromBufferReader(reader: BufferReader): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBufferReader")(reader.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  inline def fromObject(arg: js.Object): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(arg.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  inline def fromString(str: String): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  object sighash {
    
    @JSImport("bitcore-lib-cash", "Transaction.sighash")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sign(
      transaction: Transaction,
      privateKey: PrivateKey,
      sighashType: Double,
      inputIndex: Double,
      subscript: Script,
      inputSatoshis: BN,
      flags: Double,
      signingMethod: ecdsa | schnorr
    ): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(transaction.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], sighashType.asInstanceOf[js.Any], inputIndex.asInstanceOf[js.Any], subscript.asInstanceOf[js.Any], inputSatoshis.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], signingMethod.asInstanceOf[js.Any])).asInstanceOf[Signature]
  }
}
