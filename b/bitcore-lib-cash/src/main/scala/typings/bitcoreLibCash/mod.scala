package typings.bitcoreLibCash

import typings.bitcoreLibCash.anon.PrevHash
import typings.bitcoreLibCash.anon.Reverse
import typings.bitcoreLibCash.bitcoreLibCashStrings.little
import typings.bitcoreLibCash.mod.Networks.Network
import typings.bitcoreLibCash.mod.Transaction.Input
import typings.bitcoreLibCash.mod.Transaction.Output
import typings.bitcoreLibCash.mod.Transaction.UnspentOutput
import typings.bitcoreLibCash.mod.crypto.Signature
import typings.node.Buffer
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bitcore-lib-cash", "Address")
  @js.native
  class Address protected () extends StObject {
    def this(data: String) = this()
    def this(data: js.Object) = this()
    def this(data: Buffer) = this()
    def this(data: Uint8Array) = this()
    def this(data: String, network: Network) = this()
    def this(data: js.Object, network: Network) = this()
    def this(data: Buffer, network: Network) = this()
    def this(data: Uint8Array, network: Network) = this()
    def this(data: String, network: js.UndefOr[scala.Nothing], `type`: String) = this()
    def this(data: String, network: Network, `type`: String) = this()
    def this(data: js.Object, network: js.UndefOr[scala.Nothing], `type`: String) = this()
    def this(data: js.Object, network: Network, `type`: String) = this()
    def this(data: Buffer, network: js.UndefOr[scala.Nothing], `type`: String) = this()
    def this(data: Buffer, network: Network, `type`: String) = this()
    def this(data: Uint8Array, network: js.UndefOr[scala.Nothing], `type`: String) = this()
    def this(data: Uint8Array, network: Network, `type`: String) = this()
    
    val hashBuffer: Buffer = js.native
    
    val network: Network = js.native
    
    val `type`: String = js.native
  }
  
  @JSImport("bitcore-lib-cash", "Block")
  @js.native
  class Block protected () extends StObject {
    def this(data: js.Object) = this()
    def this(data: Buffer) = this()
    
    var hash: String = js.native
    
    var header: PrevHash = js.native
    
    var height: Double = js.native
    
    var transactions: js.Array[Transaction] = js.native
  }
  
  @JSImport("bitcore-lib-cash", "HDPrivateKey")
  @js.native
  class HDPrivateKey () extends StObject {
    def this(data: String) = this()
    def this(data: js.Object) = this()
    def this(data: Buffer) = this()
    
    def derive(arg: String): HDPrivateKey = js.native
    def derive(arg: String, hardened: Boolean): HDPrivateKey = js.native
    def derive(arg: Double): HDPrivateKey = js.native
    def derive(arg: Double, hardened: Boolean): HDPrivateKey = js.native
    
    def deriveChild(arg: String): HDPrivateKey = js.native
    def deriveChild(arg: String, hardened: Boolean): HDPrivateKey = js.native
    def deriveChild(arg: Double): HDPrivateKey = js.native
    def deriveChild(arg: Double, hardened: Boolean): HDPrivateKey = js.native
    
    def deriveNonCompliantChild(arg: String): HDPrivateKey = js.native
    def deriveNonCompliantChild(arg: String, hardened: Boolean): HDPrivateKey = js.native
    def deriveNonCompliantChild(arg: Double): HDPrivateKey = js.native
    def deriveNonCompliantChild(arg: Double, hardened: Boolean): HDPrivateKey = js.native
    
    val hdPublicKey: HDPublicKey = js.native
    
    def toJSON(): js.Object = js.native
    
    def toObject(): js.Object = js.native
  }
  
  @JSImport("bitcore-lib-cash", "HDPublicKey")
  @js.native
  class HDPublicKey protected () extends StObject {
    def this(arg: String) = this()
    def this(arg: js.Object) = this()
    def this(arg: Buffer) = this()
    
    val depth: Double = js.native
    
    def derive(arg: String): HDPublicKey = js.native
    def derive(arg: String, hardened: Boolean): HDPublicKey = js.native
    def derive(arg: Double): HDPublicKey = js.native
    def derive(arg: Double, hardened: Boolean): HDPublicKey = js.native
    
    def deriveChild(arg: String): HDPublicKey = js.native
    def deriveChild(arg: String, hardened: Boolean): HDPublicKey = js.native
    def deriveChild(arg: Double): HDPublicKey = js.native
    def deriveChild(arg: Double, hardened: Boolean): HDPublicKey = js.native
    
    val fingerPrint: Buffer = js.native
    
    val network: Network = js.native
    
    val publicKey: PublicKey = js.native
    
    val xpubkey: Buffer = js.native
  }
  
  @JSImport("bitcore-lib-cash", "Message")
  @js.native
  class Message protected () extends StObject {
    def this(message: String) = this()
    
    def fromJSON(json: String): Message = js.native
    
    def fromString(str: String): Message = js.native
    
    def inspect(): String = js.native
    
    def magicHash(): Buffer = js.native
    
    def sign(privateKey: PrivateKey): String = js.native
    
    def toJSON(): String = js.native
    
    def toObject(): typings.bitcoreLibCash.anon.Message = js.native
    
    def verify(bitcoinAddress: String, signatureString: String): Boolean = js.native
    def verify(bitcoinAddress: Address, signatureString: String): Boolean = js.native
  }
  
  object Networks {
    
    @JSImport("bitcore-lib-cash", "Networks.add")
    @js.native
    def add(data: js.Any): Network = js.native
    
    @JSImport("bitcore-lib-cash", "Networks.get")
    @js.native
    def get(args: String, keys: String): Network = js.native
    @JSImport("bitcore-lib-cash", "Networks.get")
    @js.native
    def get(args: String, keys: js.Array[String]): Network = js.native
    @JSImport("bitcore-lib-cash", "Networks.get")
    @js.native
    def get(args: Double, keys: String): Network = js.native
    @JSImport("bitcore-lib-cash", "Networks.get")
    @js.native
    def get(args: Double, keys: js.Array[String]): Network = js.native
    @JSImport("bitcore-lib-cash", "Networks.get")
    @js.native
    def get(args: Network, keys: String): Network = js.native
    @JSImport("bitcore-lib-cash", "Networks.get")
    @js.native
    def get(args: Network, keys: js.Array[String]): Network = js.native
    
    @JSImport("bitcore-lib-cash", "Networks.livenet")
    @js.native
    val livenet: Network = js.native
    
    @JSImport("bitcore-lib-cash", "Networks.mainnet")
    @js.native
    val mainnet: Network = js.native
    
    @JSImport("bitcore-lib-cash", "Networks.remove")
    @js.native
    def remove(network: Network): scala.Unit = js.native
    
    @JSImport("bitcore-lib-cash", "Networks.testnet")
    @js.native
    val testnet: Network = js.native
    
    @js.native
    trait Network extends StObject {
      
      val alias: String = js.native
      
      val name: String = js.native
    }
    object Network {
      
      @scala.inline
      def apply(alias: String, name: String): Network = {
        val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Network]
      }
      
      @scala.inline
      implicit class NetworkMutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("bitcore-lib-cash", "PrivateKey")
  @js.native
  class PrivateKey () extends StObject {
    def this(key: String) = this()
    def this(key: js.UndefOr[scala.Nothing], network: Network) = this()
    def this(key: String, network: Network) = this()
    
    val network: Network = js.native
    
    val publicKey: PublicKey = js.native
    
    def toAddress(): Address = js.native
    
    def toJSON(): js.Object = js.native
    
    def toObject(): js.Object = js.native
    
    def toPublicKey(): PublicKey = js.native
    
    def toWIF(): String = js.native
  }
  
  @JSImport("bitcore-lib-cash", "PublicKey")
  @js.native
  class PublicKey protected () extends StObject {
    def this(source: String) = this()
    
    def toBuffer(): Buffer = js.native
    
    def toDER(): Buffer = js.native
  }
  /* static members */
  object PublicKey {
    
    @JSImport("bitcore-lib-cash", "PublicKey.fromPrivateKey")
    @js.native
    def fromPrivateKey(privateKey: PrivateKey): PublicKey = js.native
  }
  
  @JSImport("bitcore-lib-cash", "Script")
  @js.native
  class Script protected () extends StObject {
    def this(data: String) = this()
    def this(data: js.Object) = this()
    
    def add(obj: js.Any): this.type = js.native
    
    def checkMinimalPush(i: Double): Boolean = js.native
    
    def classify(): String = js.native
    
    def classifyInput(): String = js.native
    
    def classifyOutput(): String = js.native
    
    def equals(script: Script): Boolean = js.native
    
    def findAndDelete(script: Script): this.type = js.native
    
    def getAddressInfo(): Address | Boolean = js.native
    
    def getData(): Buffer = js.native
    
    def getPublicKey(): Buffer = js.native
    
    def getPublicKeyHash(): Buffer = js.native
    
    def getSignatureOperationsCount(accurate: Boolean): Double = js.native
    
    def hasCodeseparators(): Boolean = js.native
    
    def isDataOut(): Boolean = js.native
    
    def isMultisigIn(): Boolean = js.native
    
    def isMultisigOut(): Boolean = js.native
    
    def isPublicKeyHashIn(): Boolean = js.native
    
    def isPublicKeyHashOut(): Boolean = js.native
    
    def isPublicKeyIn(): Boolean = js.native
    
    def isPublicKeyOut(): Boolean = js.native
    
    def isPushOnly(): Boolean = js.native
    
    def isScriptHashIn(): Boolean = js.native
    
    def isScriptHashOut(): Boolean = js.native
    
    def isStandard(): Boolean = js.native
    
    def isWitnessProgram(): Boolean = js.native
    
    def isWitnessPublicKeyHashOut(): Boolean = js.native
    
    def isWitnessScriptHashOut(): Boolean = js.native
    
    def prepend(obj: js.Any): this.type = js.native
    
    def removeCodeseparators(): this.type = js.native
    
    def set(obj: js.Object): this.type = js.native
    
    def toASM(): String = js.native
    
    def toAddress(): Address = js.native
    
    def toBuffer(): Buffer = js.native
    
    def toHex(): String = js.native
  }
  object Script {
    
    @JSImport("bitcore-lib-cash", "Script.buildDataOut")
    @js.native
    def buildDataOut(data: String): Script = js.native
    @JSImport("bitcore-lib-cash", "Script.buildDataOut")
    @js.native
    def buildDataOut(data: String, encoding: String): Script = js.native
    @JSImport("bitcore-lib-cash", "Script.buildDataOut")
    @js.native
    def buildDataOut(data: Buffer): Script = js.native
    @JSImport("bitcore-lib-cash", "Script.buildDataOut")
    @js.native
    def buildDataOut(data: Buffer, encoding: String): Script = js.native
    
    @JSImport("bitcore-lib-cash", "Script.buildMultisigIn")
    @js.native
    def buildMultisigIn(pubkeys: js.Array[PublicKey], threshold: Double, signatures: js.Array[Buffer], opts: js.Object): Script = js.native
    
    @JSImport("bitcore-lib-cash", "Script.buildMultisigOut")
    @js.native
    def buildMultisigOut(publicKeys: js.Array[PublicKey], threshold: Double, opts: js.Object): Script = js.native
    
    @JSImport("bitcore-lib-cash", "Script.buildP2SHMultisigIn")
    @js.native
    def buildP2SHMultisigIn(pubkeys: js.Array[PublicKey], threshold: Double, signatures: js.Array[Buffer], opts: js.Object): Script = js.native
    
    @JSImport("bitcore-lib-cash", "Script.buildPublicKeyHashIn")
    @js.native
    def buildPublicKeyHashIn(publicKey: PublicKey, signature: Signature, sigtype: Double): Script = js.native
    @JSImport("bitcore-lib-cash", "Script.buildPublicKeyHashIn")
    @js.native
    def buildPublicKeyHashIn(publicKey: PublicKey, signature: Buffer, sigtype: Double): Script = js.native
    
    @JSImport("bitcore-lib-cash", "Script.buildPublicKeyHashOut")
    @js.native
    def buildPublicKeyHashOut(address: Address): Script = js.native
    
    @JSImport("bitcore-lib-cash", "Script.buildPublicKeyIn")
    @js.native
    def buildPublicKeyIn(signature: Signature, sigtype: Double): Script = js.native
    @JSImport("bitcore-lib-cash", "Script.buildPublicKeyIn")
    @js.native
    def buildPublicKeyIn(signature: Buffer, sigtype: Double): Script = js.native
    
    @JSImport("bitcore-lib-cash", "Script.buildPublicKeyOut")
    @js.native
    def buildPublicKeyOut(pubkey: PublicKey): Script = js.native
    
    @JSImport("bitcore-lib-cash", "Script.buildScriptHashOut")
    @js.native
    def buildScriptHashOut(script: Script): Script = js.native
    
    @JSImport("bitcore-lib-cash", "Script.buildWitnessMultisigOutFromScript")
    @js.native
    def buildWitnessMultisigOutFromScript(script: Script): Script = js.native
    
    @JSImport("bitcore-lib-cash", "Script.empty")
    @js.native
    def empty(): Script = js.native
    
    @JSImport("bitcore-lib-cash", "Script.fromAddress")
    @js.native
    def fromAddress(address: String): Script = js.native
    @JSImport("bitcore-lib-cash", "Script.fromAddress")
    @js.native
    def fromAddress(address: Address): Script = js.native
    
    object types {
      
      @JSImport("bitcore-lib-cash", "Script.types")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("bitcore-lib-cash", "Script.types.DATA_OUT")
      @js.native
      def DATA_OUT: String = js.native
      @scala.inline
      def DATA_OUT_=(x: String): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_OUT")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("bitcore-lib-cash", "Transaction")
  @js.native
  class Transaction () extends StObject {
    def this(serialized: js.Any) = this()
    
    def addData(value: Buffer): this.type = js.native
    
    def addInput(input: Input): this.type = js.native
    
    def addOutput(output: Output): this.type = js.native
    
    def applySignature(sig: Signature): this.type = js.native
    
    def change(address: String): this.type = js.native
    def change(address: Address): this.type = js.native
    
    def enableRBF(): this.type = js.native
    
    def fee(amount: Double): this.type = js.native
    
    def feePerKb(amount: Double): this.type = js.native
    
    def from(utxos: js.Array[UnspentOutput]): this.type = js.native
    
    def getChangeOutput(): Output | Null = js.native
    
    def getFee(): Double = js.native
    
    def getLockTime(): Date | Double = js.native
    
    def hasWitnesses(): Boolean = js.native
    
    val hash: String = js.native
    
    val id: String = js.native
    
    var inputs: js.Array[Input] = js.native
    
    def inspect(): String = js.native
    
    def isCoinbase(): Boolean = js.native
    
    def isRBF(): Boolean = js.native
    
    def lockUntilBlockHeight(height: Double): this.type = js.native
    
    def lockUntilDate(time: Double): this.type = js.native
    def lockUntilDate(time: Date): this.type = js.native
    
    var nid: String = js.native
    
    var outputs: js.Array[Output] = js.native
    
    def serialize(): String = js.native
    
    def sign(privateKey: String): this.type = js.native
    def sign(privateKey: PrivateKey): this.type = js.native
    
    def to(address: String, amount: Double): this.type = js.native
    def to(address: js.Array[Address], amount: Double): this.type = js.native
    def to(address: Address, amount: Double): this.type = js.native
    
    def verify(): String | Boolean = js.native
  }
  object Transaction {
    
    @JSImport("bitcore-lib-cash", "Transaction.Input")
    @js.native
    class Input () extends StObject {
      
      val output: js.UndefOr[Output] = js.native
      
      val outputIndex: Double = js.native
      
      val prevTxId: Buffer = js.native
      
      val script: Script = js.native
      
      val sequenceNumber: Double = js.native
    }
    
    @JSImport("bitcore-lib-cash", "Transaction.Output")
    @js.native
    class Output protected () extends StObject {
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
    class UnspentOutput protected () extends StObject {
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
      
      /* static member */
      @JSImport("bitcore-lib-cash", "Transaction.UnspentOutput.fromObject")
      @js.native
      def fromObject(o: js.Object): UnspentOutput = js.native
    }
  }
  
  @JSImport("bitcore-lib-cash", "Unit")
  @js.native
  class Unit protected () extends StObject {
    def this(amount: Double, unitPreference: String) = this()
    
    def toBTC(): Double = js.native
    
    def toBits(): Double = js.native
    
    def toMilis(): Double = js.native
    
    def toSatoshis(): Double = js.native
  }
  /* static members */
  object Unit {
    
    @JSImport("bitcore-lib-cash", "Unit.fromBTC")
    @js.native
    def fromBTC(amount: Double): Unit = js.native
    
    @JSImport("bitcore-lib-cash", "Unit.fromBits")
    @js.native
    def fromBits(amount: Double): Unit = js.native
    
    @JSImport("bitcore-lib-cash", "Unit.fromMilis")
    @js.native
    def fromMilis(amount: Double): Unit = js.native
    
    @JSImport("bitcore-lib-cash", "Unit.fromSatoshis")
    @js.native
    def fromSatoshis(amount: Double): Unit = js.native
  }
  
  object crypto {
    
    @JSImport("bitcore-lib-cash", "crypto.BN")
    @js.native
    class BN () extends StObject
    
    object ECDSA {
      
      @JSImport("bitcore-lib-cash", "crypto.ECDSA.sign")
      @js.native
      def sign(message: Buffer, key: PrivateKey): Signature = js.native
      
      @JSImport("bitcore-lib-cash", "crypto.ECDSA.verify")
      @js.native
      def verify(hashbuf: Buffer, sig: Signature, pubkey: PublicKey): Boolean = js.native
      @JSImport("bitcore-lib-cash", "crypto.ECDSA.verify")
      @js.native
      def verify_little(hashbuf: Buffer, sig: Signature, pubkey: PublicKey, endian: little): Boolean = js.native
    }
    
    object Hash {
      
      @JSImport("bitcore-lib-cash", "crypto.Hash.ripemd160")
      @js.native
      def ripemd160(buffer: Buffer): Buffer = js.native
      
      @JSImport("bitcore-lib-cash", "crypto.Hash.sha1")
      @js.native
      def sha1(buffer: Buffer): Buffer = js.native
      
      @JSImport("bitcore-lib-cash", "crypto.Hash.sha256")
      @js.native
      def sha256(buffer: Buffer): Buffer = js.native
      
      @JSImport("bitcore-lib-cash", "crypto.Hash.sha256hmac")
      @js.native
      def sha256hmac(data: Buffer, key: Buffer): Buffer = js.native
      
      @JSImport("bitcore-lib-cash", "crypto.Hash.sha256ripemd160")
      @js.native
      def sha256ripemd160(buffer: Buffer): Buffer = js.native
      
      @JSImport("bitcore-lib-cash", "crypto.Hash.sha256sha256")
      @js.native
      def sha256sha256(buffer: Buffer): Buffer = js.native
      
      @JSImport("bitcore-lib-cash", "crypto.Hash.sha512")
      @js.native
      def sha512(buffer: Buffer): Buffer = js.native
      
      @JSImport("bitcore-lib-cash", "crypto.Hash.sha512hmac")
      @js.native
      def sha512hmac(data: Buffer, key: Buffer): Buffer = js.native
    }
    
    object Random {
      
      @JSImport("bitcore-lib-cash", "crypto.Random.getRandomBuffer")
      @js.native
      def getRandomBuffer(size: Double): Buffer = js.native
    }
    
    @JSImport("bitcore-lib-cash", "crypto.Signature")
    @js.native
    class Signature () extends StObject {
      
      var SIGHASH_ALL: Double = js.native
    }
    object Signature {
      
      /* static member */
      @JSImport("bitcore-lib-cash", "crypto.Signature.fromDER")
      @js.native
      def fromDER(sig: Buffer): Signature = js.native
      
      /* static member */
      @JSImport("bitcore-lib-cash", "crypto.Signature.fromString")
      @js.native
      def fromString(data: String): Signature = js.native
    }
  }
  
  @js.native
  trait Util extends StObject {
    
    val buffer: Reverse = js.native
  }
  object Util {
    
    @scala.inline
    def apply(buffer: Reverse): Util = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Util]
    }
    
    @scala.inline
    implicit class UtilMutableBuilder[Self <: Util] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Reverse): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
}
