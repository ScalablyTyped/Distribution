package typings.bitcoinjsLib

import typings.bip32.bip32Mod.BIP32Interface
import typings.bitcoinjsLib.addressMod.Base58CheckResult
import typings.bitcoinjsLib.addressMod.Bech32Result
import typings.bitcoinjsLib.ecpairMod.ECPairOptions
import typings.bitcoinjsLib.networksMod.Network
import typings.bitcoinjsLib.paymentsMod.Payment
import typings.bitcoinjsLib.paymentsMod.PaymentOpts
import typings.bitcoinjsLib.paymentsMod.Stack
import typings.bitcoinjsLib.psbtMod.PsbtOptsOptional
import typings.bitcoinjsLib.scriptSignatureMod.ScriptSignature
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bitcoinjs-lib", "Block")
  @js.native
  class Block ()
    extends typings.bitcoinjsLib.blockMod.Block
  /* static members */
  object Block {
    
    @JSImport("bitcoinjs-lib", "Block.calculateMerkleRoot")
    @js.native
    def calculateMerkleRoot(transactions: js.Array[typings.bitcoinjsLib.transactionMod.Transaction]): Buffer = js.native
    @JSImport("bitcoinjs-lib", "Block.calculateMerkleRoot")
    @js.native
    def calculateMerkleRoot(transactions: js.Array[typings.bitcoinjsLib.transactionMod.Transaction], forWitness: Boolean): Buffer = js.native
    
    @JSImport("bitcoinjs-lib", "Block.calculateTarget")
    @js.native
    def calculateTarget(bits: Double): Buffer = js.native
    
    @JSImport("bitcoinjs-lib", "Block.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): typings.bitcoinjsLib.blockMod.Block = js.native
    
    @JSImport("bitcoinjs-lib", "Block.fromHex")
    @js.native
    def fromHex(hex: String): typings.bitcoinjsLib.blockMod.Block = js.native
  }
  
  object ECPair {
    
    @JSImport("bitcoinjs-lib", "ECPair.fromPrivateKey")
    @js.native
    def fromPrivateKey(buffer: Buffer): typings.bitcoinjsLib.ecpairMod.ECPair = js.native
    @JSImport("bitcoinjs-lib", "ECPair.fromPrivateKey")
    @js.native
    def fromPrivateKey(buffer: Buffer, options: ECPairOptions): typings.bitcoinjsLib.ecpairMod.ECPair = js.native
    
    @JSImport("bitcoinjs-lib", "ECPair.fromPublicKey")
    @js.native
    def fromPublicKey(buffer: Buffer): typings.bitcoinjsLib.ecpairMod.ECPair = js.native
    @JSImport("bitcoinjs-lib", "ECPair.fromPublicKey")
    @js.native
    def fromPublicKey(buffer: Buffer, options: ECPairOptions): typings.bitcoinjsLib.ecpairMod.ECPair = js.native
    
    @JSImport("bitcoinjs-lib", "ECPair.fromWIF")
    @js.native
    def fromWIF(wifString: String): typings.bitcoinjsLib.ecpairMod.ECPair = js.native
    @JSImport("bitcoinjs-lib", "ECPair.fromWIF")
    @js.native
    def fromWIF(wifString: String, network: js.Array[Network]): typings.bitcoinjsLib.ecpairMod.ECPair = js.native
    @JSImport("bitcoinjs-lib", "ECPair.fromWIF")
    @js.native
    def fromWIF(wifString: String, network: Network): typings.bitcoinjsLib.ecpairMod.ECPair = js.native
    
    @JSImport("bitcoinjs-lib", "ECPair.makeRandom")
    @js.native
    def makeRandom(): typings.bitcoinjsLib.ecpairMod.ECPair = js.native
    @JSImport("bitcoinjs-lib", "ECPair.makeRandom")
    @js.native
    def makeRandom(options: ECPairOptions): typings.bitcoinjsLib.ecpairMod.ECPair = js.native
  }
  
  @JSImport("bitcoinjs-lib", "Psbt")
  @js.native
  class Psbt ()
    extends typings.bitcoinjsLib.psbtMod.Psbt {
    def this(opts: PsbtOptsOptional) = this()
    def this(opts: js.UndefOr[scala.Nothing], data: typings.bip174.mod.Psbt) = this()
    def this(opts: PsbtOptsOptional, data: typings.bip174.mod.Psbt) = this()
  }
  /* static members */
  object Psbt {
    
    @JSImport("bitcoinjs-lib", "Psbt.fromBase64")
    @js.native
    def fromBase64(data: String): typings.bitcoinjsLib.psbtMod.Psbt = js.native
    @JSImport("bitcoinjs-lib", "Psbt.fromBase64")
    @js.native
    def fromBase64(data: String, opts: PsbtOptsOptional): typings.bitcoinjsLib.psbtMod.Psbt = js.native
    
    @JSImport("bitcoinjs-lib", "Psbt.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): typings.bitcoinjsLib.psbtMod.Psbt = js.native
    @JSImport("bitcoinjs-lib", "Psbt.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer, opts: PsbtOptsOptional): typings.bitcoinjsLib.psbtMod.Psbt = js.native
    
    @JSImport("bitcoinjs-lib", "Psbt.fromHex")
    @js.native
    def fromHex(data: String): typings.bitcoinjsLib.psbtMod.Psbt = js.native
    @JSImport("bitcoinjs-lib", "Psbt.fromHex")
    @js.native
    def fromHex(data: String, opts: PsbtOptsOptional): typings.bitcoinjsLib.psbtMod.Psbt = js.native
  }
  
  @JSImport("bitcoinjs-lib", "Transaction")
  @js.native
  class Transaction ()
    extends typings.bitcoinjsLib.transactionMod.Transaction
  /* static members */
  object Transaction {
    
    @JSImport("bitcoinjs-lib", "Transaction.ADVANCED_TRANSACTION_FLAG")
    @js.native
    val ADVANCED_TRANSACTION_FLAG: /* 1 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.ADVANCED_TRANSACTION_MARKER")
    @js.native
    val ADVANCED_TRANSACTION_MARKER: /* 0 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.DEFAULT_SEQUENCE")
    @js.native
    val DEFAULT_SEQUENCE: /* 4294967295.0 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.SIGHASH_ALL")
    @js.native
    val SIGHASH_ALL: /* 1 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.SIGHASH_ANYONECANPAY")
    @js.native
    val SIGHASH_ANYONECANPAY: /* 128 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.SIGHASH_NONE")
    @js.native
    val SIGHASH_NONE: /* 2 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.SIGHASH_SINGLE")
    @js.native
    val SIGHASH_SINGLE: /* 3 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): typings.bitcoinjsLib.transactionMod.Transaction = js.native
    @JSImport("bitcoinjs-lib", "Transaction.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer, _NO_STRICT: Boolean): typings.bitcoinjsLib.transactionMod.Transaction = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.fromHex")
    @js.native
    def fromHex(hex: String): typings.bitcoinjsLib.transactionMod.Transaction = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.isCoinbaseHash")
    @js.native
    def isCoinbaseHash(buffer: Buffer): Boolean = js.native
  }
  
  @JSImport("bitcoinjs-lib", "TransactionBuilder")
  @js.native
  class TransactionBuilder ()
    extends typings.bitcoinjsLib.transactionBuilderMod.TransactionBuilder {
    def this(network: Network) = this()
    def this(network: js.UndefOr[scala.Nothing], maximumFeeRate: Double) = this()
    def this(network: Network, maximumFeeRate: Double) = this()
  }
  /* static members */
  object TransactionBuilder {
    
    @JSImport("bitcoinjs-lib", "TransactionBuilder.fromTransaction")
    @js.native
    def fromTransaction(transaction: typings.bitcoinjsLib.transactionMod.Transaction): typings.bitcoinjsLib.transactionBuilderMod.TransactionBuilder = js.native
    @JSImport("bitcoinjs-lib", "TransactionBuilder.fromTransaction")
    @js.native
    def fromTransaction(transaction: typings.bitcoinjsLib.transactionMod.Transaction, network: Network): typings.bitcoinjsLib.transactionBuilderMod.TransactionBuilder = js.native
  }
  
  object address {
    
    @JSImport("bitcoinjs-lib", "address.fromBase58Check")
    @js.native
    def fromBase58Check(address: String): Base58CheckResult = js.native
    
    @JSImport("bitcoinjs-lib", "address.fromBech32")
    @js.native
    def fromBech32(address: String): Bech32Result = js.native
    
    @JSImport("bitcoinjs-lib", "address.fromOutputScript")
    @js.native
    def fromOutputScript(output: Buffer): String = js.native
    @JSImport("bitcoinjs-lib", "address.fromOutputScript")
    @js.native
    def fromOutputScript(output: Buffer, network: Network): String = js.native
    
    @JSImport("bitcoinjs-lib", "address.toBase58Check")
    @js.native
    def toBase58Check(hash: Buffer, version: Double): String = js.native
    
    @JSImport("bitcoinjs-lib", "address.toBech32")
    @js.native
    def toBech32(data: Buffer, version: Double, prefix: String): String = js.native
    
    @JSImport("bitcoinjs-lib", "address.toOutputScript")
    @js.native
    def toOutputScript(address: String): Buffer = js.native
    @JSImport("bitcoinjs-lib", "address.toOutputScript")
    @js.native
    def toOutputScript(address: String, network: Network): Buffer = js.native
  }
  
  object bip32 {
    
    @JSImport("bitcoinjs-lib", "bip32.fromBase58")
    @js.native
    def fromBase58(inString: String): BIP32Interface = js.native
    @JSImport("bitcoinjs-lib", "bip32.fromBase58")
    @js.native
    def fromBase58(inString: String, network: typings.bip32.bip32Mod.Network): BIP32Interface = js.native
    
    @JSImport("bitcoinjs-lib", "bip32.fromPrivateKey")
    @js.native
    def fromPrivateKey(privateKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
    @JSImport("bitcoinjs-lib", "bip32.fromPrivateKey")
    @js.native
    def fromPrivateKey(privateKey: Buffer, chainCode: Buffer, network: typings.bip32.bip32Mod.Network): BIP32Interface = js.native
    
    @JSImport("bitcoinjs-lib", "bip32.fromPublicKey")
    @js.native
    def fromPublicKey(publicKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
    @JSImport("bitcoinjs-lib", "bip32.fromPublicKey")
    @js.native
    def fromPublicKey(publicKey: Buffer, chainCode: Buffer, network: typings.bip32.bip32Mod.Network): BIP32Interface = js.native
    
    @JSImport("bitcoinjs-lib", "bip32.fromSeed")
    @js.native
    def fromSeed(seed: Buffer): BIP32Interface = js.native
    @JSImport("bitcoinjs-lib", "bip32.fromSeed")
    @js.native
    def fromSeed(seed: Buffer, network: typings.bip32.bip32Mod.Network): BIP32Interface = js.native
  }
  
  object crypto {
    
    @JSImport("bitcoinjs-lib", "crypto.hash160")
    @js.native
    def hash160(buffer: Buffer): Buffer = js.native
    
    @JSImport("bitcoinjs-lib", "crypto.hash256")
    @js.native
    def hash256(buffer: Buffer): Buffer = js.native
    
    @JSImport("bitcoinjs-lib", "crypto.ripemd160")
    @js.native
    def ripemd160(buffer: Buffer): Buffer = js.native
    
    @JSImport("bitcoinjs-lib", "crypto.sha1")
    @js.native
    def sha1(buffer: Buffer): Buffer = js.native
    
    @JSImport("bitcoinjs-lib", "crypto.sha256")
    @js.native
    def sha256(buffer: Buffer): Buffer = js.native
  }
  
  object networks {
    
    @JSImport("bitcoinjs-lib", "networks.bitcoin")
    @js.native
    val bitcoin: Network = js.native
    
    @JSImport("bitcoinjs-lib", "networks.regtest")
    @js.native
    val regtest: Network = js.native
    
    @JSImport("bitcoinjs-lib", "networks.testnet")
    @js.native
    val testnet: Network = js.native
  }
  
  object payments {
    
    @JSImport("bitcoinjs-lib", "payments.embed")
    @js.native
    def embed(a: Payment): Payment = js.native
    @JSImport("bitcoinjs-lib", "payments.embed")
    @js.native
    def embed(a: Payment, opts: PaymentOpts): Payment = js.native
    
    @JSImport("bitcoinjs-lib", "payments.p2ms")
    @js.native
    def p2ms(a: Payment): Payment = js.native
    @JSImport("bitcoinjs-lib", "payments.p2ms")
    @js.native
    def p2ms(a: Payment, opts: PaymentOpts): Payment = js.native
    
    @JSImport("bitcoinjs-lib", "payments.p2pk")
    @js.native
    def p2pk(a: Payment): Payment = js.native
    @JSImport("bitcoinjs-lib", "payments.p2pk")
    @js.native
    def p2pk(a: Payment, opts: PaymentOpts): Payment = js.native
    
    @JSImport("bitcoinjs-lib", "payments.p2pkh")
    @js.native
    def p2pkh(a: Payment): Payment = js.native
    @JSImport("bitcoinjs-lib", "payments.p2pkh")
    @js.native
    def p2pkh(a: Payment, opts: PaymentOpts): Payment = js.native
    
    @JSImport("bitcoinjs-lib", "payments.p2sh")
    @js.native
    def p2sh(a: Payment): Payment = js.native
    @JSImport("bitcoinjs-lib", "payments.p2sh")
    @js.native
    def p2sh(a: Payment, opts: PaymentOpts): Payment = js.native
    
    @JSImport("bitcoinjs-lib", "payments.p2wpkh")
    @js.native
    def p2wpkh(a: Payment): Payment = js.native
    @JSImport("bitcoinjs-lib", "payments.p2wpkh")
    @js.native
    def p2wpkh(a: Payment, opts: PaymentOpts): Payment = js.native
    
    @JSImport("bitcoinjs-lib", "payments.p2wsh")
    @js.native
    def p2wsh(a: Payment): Payment = js.native
    @JSImport("bitcoinjs-lib", "payments.p2wsh")
    @js.native
    def p2wsh(a: Payment, opts: PaymentOpts): Payment = js.native
  }
  
  object script {
    
    @JSImport("bitcoinjs-lib", "script.compile")
    @js.native
    def compile(chunks: Stack): Buffer = js.native
    @JSImport("bitcoinjs-lib", "script.compile")
    @js.native
    def compile(chunks: Buffer): Buffer = js.native
    
    @JSImport("bitcoinjs-lib", "script.decompile")
    @js.native
    def decompile(buffer: js.Array[Double | Buffer]): (js.Array[Double | Buffer]) | Null = js.native
    @JSImport("bitcoinjs-lib", "script.decompile")
    @js.native
    def decompile(buffer: Buffer): (js.Array[Double | Buffer]) | Null = js.native
    
    @JSImport("bitcoinjs-lib", "script.fromASM")
    @js.native
    def fromASM(asm: String): Buffer = js.native
    
    @JSImport("bitcoinjs-lib", "script.isCanonicalPubKey")
    @js.native
    def isCanonicalPubKey(buffer: Buffer): Boolean = js.native
    
    @JSImport("bitcoinjs-lib", "script.isCanonicalScriptSignature")
    @js.native
    def isCanonicalScriptSignature(buffer: Buffer): Boolean = js.native
    
    @JSImport("bitcoinjs-lib", "script.isDefinedHashType")
    @js.native
    def isDefinedHashType(hashType: Double): Boolean = js.native
    
    @JSImport("bitcoinjs-lib", "script.isPushOnly")
    @js.native
    def isPushOnly(value: Stack): Boolean = js.native
    
    object number {
      
      @JSImport("bitcoinjs-lib", "script.number.decode")
      @js.native
      def decode(buffer: Buffer): Double = js.native
      @JSImport("bitcoinjs-lib", "script.number.decode")
      @js.native
      def decode(buffer: Buffer, maxLength: js.UndefOr[scala.Nothing], minimal: Boolean): Double = js.native
      @JSImport("bitcoinjs-lib", "script.number.decode")
      @js.native
      def decode(buffer: Buffer, maxLength: Double): Double = js.native
      @JSImport("bitcoinjs-lib", "script.number.decode")
      @js.native
      def decode(buffer: Buffer, maxLength: Double, minimal: Boolean): Double = js.native
      
      @JSImport("bitcoinjs-lib", "script.number.encode")
      @js.native
      def encode(_number: Double): Buffer = js.native
    }
    
    object signature {
      
      @JSImport("bitcoinjs-lib", "script.signature.decode")
      @js.native
      def decode(buffer: Buffer): ScriptSignature = js.native
      
      @JSImport("bitcoinjs-lib", "script.signature.encode")
      @js.native
      def encode(signature: Buffer, hashType: Double): Buffer = js.native
    }
    
    @JSImport("bitcoinjs-lib", "script.toASM")
    @js.native
    def toASM(chunks: js.Array[Double | Buffer]): String = js.native
    @JSImport("bitcoinjs-lib", "script.toASM")
    @js.native
    def toASM(chunks: Buffer): String = js.native
    
    @JSImport("bitcoinjs-lib", "script.toStack")
    @js.native
    def toStack(chunks: js.Array[Double | Buffer]): js.Array[Buffer] = js.native
    @JSImport("bitcoinjs-lib", "script.toStack")
    @js.native
    def toStack(chunks: Buffer): js.Array[Buffer] = js.native
  }
}
