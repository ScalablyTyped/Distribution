package typings.bitcoinjsLib

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.PsbtGlobalUpdate
import typings.bip174.interfacesMod.PsbtInput
import typings.bip174.interfacesMod.PsbtInputUpdate
import typings.bip174.interfacesMod.PsbtOutput
import typings.bip174.interfacesMod.PsbtOutputUpdate
import typings.bitcoinjsLib.anon.FinalScriptSig
import typings.bitcoinjsLib.networksMod.Network
import typings.bitcoinjsLib.transactionMod.Transaction
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object psbtMod {
  
  @JSImport("bitcoinjs-lib/src/psbt", "Psbt")
  @js.native
  open class Psbt () extends StObject {
    def this(opts: PsbtOptsOptional) = this()
    def this(opts: Unit, data: typings.bip174.mod.Psbt) = this()
    def this(opts: PsbtOptsOptional, data: typings.bip174.mod.Psbt) = this()
    
    /* private */ var __CACHE: Any = js.native
    
    def addInput(inputData: PsbtInputExtended): this.type = js.native
    
    def addInputs(inputDatas: js.Array[PsbtInputExtended]): this.type = js.native
    
    def addOutput(outputData: PsbtOutputExtended): this.type = js.native
    
    def addOutputs(outputDatas: js.Array[PsbtOutputExtended]): this.type = js.native
    
    def addUnknownKeyValToGlobal(keyVal: KeyValue): this.type = js.native
    
    def addUnknownKeyValToInput(inputIndex: Double, keyVal: KeyValue): this.type = js.native
    
    def addUnknownKeyValToOutput(outputIndex: Double, keyVal: KeyValue): this.type = js.native
    
    def clearFinalizedInput(inputIndex: Double): this.type = js.native
    
    def combine(those: Psbt*): this.type = js.native
    
    val data: typings.bip174.mod.Psbt = js.native
    
    def extractTransaction(): Transaction = js.native
    def extractTransaction(disableFeeCheck: Boolean): Transaction = js.native
    
    def finalizeAllInputs(): this.type = js.native
    
    def finalizeInput(inputIndex: Double): this.type = js.native
    def finalizeInput(inputIndex: Double, finalScriptsFunc: FinalScriptsFunc): this.type = js.native
    
    def getFee(): Double = js.native
    
    def getFeeRate(): Double = js.native
    
    def getInputType(inputIndex: Double): AllScriptType = js.native
    
    def inputCount: Double = js.native
    
    def inputHasHDKey(inputIndex: Double, root: HDSigner): Boolean = js.native
    
    def inputHasPubkey(inputIndex: Double, pubkey: Buffer): Boolean = js.native
    
    def locktime: Double = js.native
    def locktime_=(locktime: Double): Unit = js.native
    
    /* private */ var opts: Any = js.native
    
    def outputHasHDKey(outputIndex: Double, root: HDSigner): Boolean = js.native
    
    def outputHasPubkey(outputIndex: Double, pubkey: Buffer): Boolean = js.native
    
    def setInputSequence(inputIndex: Double, sequence: Double): this.type = js.native
    
    def setLocktime(locktime: Double): this.type = js.native
    
    def setMaximumFeeRate(satoshiPerByte: Double): Unit = js.native
    
    def setVersion(version: Double): this.type = js.native
    
    def signAllInputs(keyPair: Signer): this.type = js.native
    def signAllInputs(keyPair: Signer, sighashTypes: js.Array[Double]): this.type = js.native
    
    def signAllInputsAsync(keyPair: Signer): js.Promise[Unit] = js.native
    def signAllInputsAsync(keyPair: SignerAsync): js.Promise[Unit] = js.native
    def signAllInputsAsync(keyPair: SignerAsync, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
    def signAllInputsAsync(keyPair: Signer, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
    
    def signAllInputsHD(hdKeyPair: HDSigner): this.type = js.native
    def signAllInputsHD(hdKeyPair: HDSigner, sighashTypes: js.Array[Double]): this.type = js.native
    
    def signAllInputsHDAsync(hdKeyPair: HDSigner): js.Promise[Unit] = js.native
    def signAllInputsHDAsync(hdKeyPair: HDSignerAsync): js.Promise[Unit] = js.native
    def signAllInputsHDAsync(hdKeyPair: HDSignerAsync, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
    def signAllInputsHDAsync(hdKeyPair: HDSigner, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
    
    def signInput(inputIndex: Double, keyPair: Signer): this.type = js.native
    def signInput(inputIndex: Double, keyPair: Signer, sighashTypes: js.Array[Double]): this.type = js.native
    
    def signInputAsync(inputIndex: Double, keyPair: Signer): js.Promise[Unit] = js.native
    def signInputAsync(inputIndex: Double, keyPair: SignerAsync): js.Promise[Unit] = js.native
    def signInputAsync(inputIndex: Double, keyPair: SignerAsync, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
    def signInputAsync(inputIndex: Double, keyPair: Signer, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
    
    def signInputHD(inputIndex: Double, hdKeyPair: HDSigner): this.type = js.native
    def signInputHD(inputIndex: Double, hdKeyPair: HDSigner, sighashTypes: js.Array[Double]): this.type = js.native
    
    def signInputHDAsync(inputIndex: Double, hdKeyPair: HDSigner): js.Promise[Unit] = js.native
    def signInputHDAsync(inputIndex: Double, hdKeyPair: HDSignerAsync): js.Promise[Unit] = js.native
    def signInputHDAsync(inputIndex: Double, hdKeyPair: HDSignerAsync, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
    def signInputHDAsync(inputIndex: Double, hdKeyPair: HDSigner, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
    
    def toBase64(): String = js.native
    
    def toBuffer(): Buffer = js.native
    
    def toHex(): String = js.native
    
    def txInputs: js.Array[PsbtTxInput] = js.native
    
    def txOutputs: js.Array[PsbtTxOutput] = js.native
    
    def updateGlobal(updateData: PsbtGlobalUpdate): this.type = js.native
    
    def updateInput(inputIndex: Double, updateData: PsbtInputUpdate): this.type = js.native
    
    def updateOutput(outputIndex: Double, updateData: PsbtOutputUpdate): this.type = js.native
    
    def validateSignaturesOfAllInputs(validator: ValidateSigFunction): Boolean = js.native
    
    def validateSignaturesOfInput(inputIndex: Double, validator: ValidateSigFunction): Boolean = js.native
    def validateSignaturesOfInput(inputIndex: Double, validator: ValidateSigFunction, pubkey: Buffer): Boolean = js.native
    
    def version: Double = js.native
    def version_=(version: Double): Unit = js.native
  }
  /* static members */
  object Psbt {
    
    @JSImport("bitcoinjs-lib/src/psbt", "Psbt")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBase64(data: String): Psbt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(data.asInstanceOf[js.Any]).asInstanceOf[Psbt]
    inline def fromBase64(data: String, opts: PsbtOptsOptional): Psbt = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Psbt]
    
    inline def fromBuffer(buffer: Buffer): Psbt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Psbt]
    inline def fromBuffer(buffer: Buffer, opts: PsbtOptsOptional): Psbt = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Psbt]
    
    inline def fromHex(data: String): Psbt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(data.asInstanceOf[js.Any]).asInstanceOf[Psbt]
    inline def fromHex(data: String, opts: PsbtOptsOptional): Psbt = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Psbt]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bitcoinjsLib.bitcoinjsLibStrings.witnesspubkeyhash
    - typings.bitcoinjsLib.bitcoinjsLibStrings.pubkeyhash
    - typings.bitcoinjsLib.bitcoinjsLibStrings.multisig
    - typings.bitcoinjsLib.bitcoinjsLibStrings.pubkey
    - typings.bitcoinjsLib.bitcoinjsLibStrings.nonstandard
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-witnesspubkeyhash`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkeyhash`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-multisig`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkey`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-nonstandard`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkeyhash`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-multisig`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkey`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-nonstandard`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkeyhash`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-multisig`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkey`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-nonstandard`
  */
  trait AllScriptType extends StObject
  object AllScriptType {
    
    inline def multisig: typings.bitcoinjsLib.bitcoinjsLibStrings.multisig = "multisig".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.multisig]
    
    inline def nonstandard: typings.bitcoinjsLib.bitcoinjsLibStrings.nonstandard = "nonstandard".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.nonstandard]
    
    inline def `p2sh-multisig`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-multisig` = "p2sh-multisig".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-multisig`]
    
    inline def `p2sh-nonstandard`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-nonstandard` = "p2sh-nonstandard".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-nonstandard`]
    
    inline def `p2sh-p2wsh-multisig`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-multisig` = "p2sh-p2wsh-multisig".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-multisig`]
    
    inline def `p2sh-p2wsh-nonstandard`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-nonstandard` = "p2sh-p2wsh-nonstandard".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-nonstandard`]
    
    inline def `p2sh-p2wsh-pubkey`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkey` = "p2sh-p2wsh-pubkey".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkey`]
    
    inline def `p2sh-p2wsh-pubkeyhash`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkeyhash` = "p2sh-p2wsh-pubkeyhash".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkeyhash`]
    
    inline def `p2sh-pubkey`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkey` = "p2sh-pubkey".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkey`]
    
    inline def `p2sh-pubkeyhash`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkeyhash` = "p2sh-pubkeyhash".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkeyhash`]
    
    inline def `p2sh-witnesspubkeyhash`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-witnesspubkeyhash` = "p2sh-witnesspubkeyhash".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-witnesspubkeyhash`]
    
    inline def `p2wsh-multisig`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-multisig` = "p2wsh-multisig".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-multisig`]
    
    inline def `p2wsh-nonstandard`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-nonstandard` = "p2wsh-nonstandard".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-nonstandard`]
    
    inline def `p2wsh-pubkey`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkey` = "p2wsh-pubkey".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkey`]
    
    inline def `p2wsh-pubkeyhash`: typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkeyhash` = "p2wsh-pubkeyhash".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkeyhash`]
    
    inline def pubkey: typings.bitcoinjsLib.bitcoinjsLibStrings.pubkey = "pubkey".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.pubkey]
    
    inline def pubkeyhash: typings.bitcoinjsLib.bitcoinjsLibStrings.pubkeyhash = "pubkeyhash".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.pubkeyhash]
    
    inline def witnesspubkeyhash: typings.bitcoinjsLib.bitcoinjsLibStrings.witnesspubkeyhash = "witnesspubkeyhash".asInstanceOf[typings.bitcoinjsLib.bitcoinjsLibStrings.witnesspubkeyhash]
  }
  
  /**
    * This function must do two things:
    * 1. Check if the `input` can be finalized. If it can not be finalized, throw.
    *   ie. `Can not finalize input #${inputIndex}`
    * 2. Create the finalScriptSig and finalScriptWitness Buffers.
    */
  type FinalScriptsFunc = js.Function6[
    /* inputIndex */ Double, 
    /* input */ PsbtInput, 
    /* script */ Buffer, 
    /* isSegwit */ Boolean, 
    /* isP2SH */ Boolean, 
    /* isP2WSH */ Boolean, 
    FinalScriptSig
  ]
  
  trait HDSigner
    extends StObject
       with HDSignerBase {
    
    /**
      * The path string must match /^m(\/\d+'?)+$/
      * ex. m/44'/0'/0'/1/23 levels with ' must be hard derivations
      */
    def derivePath(path: String): HDSigner
    
    /**
      * Input hash (the "message digest") for the signature algorithm
      * Return a 64 byte signature (32 byte r and 32 byte s in that order)
      */
    def sign(hash: Buffer): Buffer
  }
  object HDSigner {
    
    inline def apply(derivePath: String => HDSigner, fingerprint: Buffer, publicKey: Buffer, sign: Buffer => Buffer): HDSigner = {
      val __obj = js.Dynamic.literal(derivePath = js.Any.fromFunction1(derivePath), fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign))
      __obj.asInstanceOf[HDSigner]
    }
    
    extension [Self <: HDSigner](x: Self) {
      
      inline def setDerivePath(value: String => HDSigner): Self = StObject.set(x, "derivePath", js.Any.fromFunction1(value))
      
      inline def setSign(value: Buffer => Buffer): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
    }
  }
  
  trait HDSignerAsync
    extends StObject
       with HDSignerBase {
    
    def derivePath(path: String): HDSignerAsync
    
    def sign(hash: Buffer): js.Promise[Buffer]
  }
  object HDSignerAsync {
    
    inline def apply(
      derivePath: String => HDSignerAsync,
      fingerprint: Buffer,
      publicKey: Buffer,
      sign: Buffer => js.Promise[Buffer]
    ): HDSignerAsync = {
      val __obj = js.Dynamic.literal(derivePath = js.Any.fromFunction1(derivePath), fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign))
      __obj.asInstanceOf[HDSignerAsync]
    }
    
    extension [Self <: HDSignerAsync](x: Self) {
      
      inline def setDerivePath(value: String => HDSignerAsync): Self = StObject.set(x, "derivePath", js.Any.fromFunction1(value))
      
      inline def setSign(value: Buffer => js.Promise[Buffer]): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
    }
  }
  
  trait HDSignerBase extends StObject {
    
    /**
      * The first 4 bytes of the sha256-ripemd160 of the publicKey
      */
    var fingerprint: Buffer
    
    /**
      * DER format compressed publicKey buffer
      */
    var publicKey: Buffer
  }
  object HDSignerBase {
    
    inline def apply(fingerprint: Buffer, publicKey: Buffer): HDSignerBase = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HDSignerBase]
    }
    
    extension [Self <: HDSignerBase](x: Self) {
      
      inline def setFingerprint(value: Buffer): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: Buffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait PsbtInputExtended
    extends StObject
       with PsbtInput
       with TransactionInput
  object PsbtInputExtended {
    
    inline def apply(hash: String | Buffer, index: Double): PsbtInputExtended = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtInputExtended]
    }
  }
  
  trait PsbtOptsOptional extends StObject {
    
    var maximumFeeRate: js.UndefOr[Double] = js.undefined
    
    var network: js.UndefOr[Network] = js.undefined
  }
  object PsbtOptsOptional {
    
    inline def apply(): PsbtOptsOptional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PsbtOptsOptional]
    }
    
    extension [Self <: PsbtOptsOptional](x: Self) {
      
      inline def setMaximumFeeRate(value: Double): Self = StObject.set(x, "maximumFeeRate", value.asInstanceOf[js.Any])
      
      inline def setMaximumFeeRateUndefined: Self = StObject.set(x, "maximumFeeRate", js.undefined)
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bitcoinjsLib.psbtMod.PsbtOutputExtendedAddress
    - typings.bitcoinjsLib.psbtMod.PsbtOutputExtendedScript
  */
  trait PsbtOutputExtended extends StObject
  object PsbtOutputExtended {
    
    inline def PsbtOutputExtendedAddress(address: String, value: Double): typings.bitcoinjsLib.psbtMod.PsbtOutputExtendedAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bitcoinjsLib.psbtMod.PsbtOutputExtendedAddress]
    }
    
    inline def PsbtOutputExtendedScript(script: Buffer, value: Double): typings.bitcoinjsLib.psbtMod.PsbtOutputExtendedScript = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bitcoinjsLib.psbtMod.PsbtOutputExtendedScript]
    }
  }
  
  trait PsbtOutputExtendedAddress
    extends StObject
       with PsbtOutput
       with PsbtOutputExtended {
    
    var address: String
    
    var value: Double
  }
  object PsbtOutputExtendedAddress {
    
    inline def apply(address: String, value: Double): PsbtOutputExtendedAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtOutputExtendedAddress]
    }
    
    extension [Self <: PsbtOutputExtendedAddress](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PsbtOutputExtendedScript
    extends StObject
       with PsbtOutput
       with PsbtOutputExtended {
    
    var script: Buffer
    
    var value: Double
  }
  object PsbtOutputExtendedScript {
    
    inline def apply(script: Buffer, value: Double): PsbtOutputExtendedScript = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtOutputExtendedScript]
    }
    
    extension [Self <: PsbtOutputExtendedScript](x: Self) {
      
      inline def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PsbtTxInput
    extends StObject
       with TransactionInput {
    
    @JSName("hash")
    var hash_PsbtTxInput: Buffer
  }
  object PsbtTxInput {
    
    inline def apply(hash: Buffer, index: Double): PsbtTxInput = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtTxInput]
    }
    
    extension [Self <: PsbtTxInput](x: Self) {
      
      inline def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  trait PsbtTxOutput
    extends StObject
       with TransactionOutput {
    
    var address: js.UndefOr[String] = js.undefined
  }
  object PsbtTxOutput {
    
    inline def apply(script: Buffer, value: Double): PsbtTxOutput = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtTxOutput]
    }
    
    extension [Self <: PsbtTxOutput](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    }
  }
  
  @js.native
  trait Signer extends StObject {
    
    var getPublicKey: js.UndefOr[js.Function0[Buffer]] = js.native
    
    var network: js.UndefOr[Any] = js.native
    
    var publicKey: Buffer = js.native
    
    def sign(hash: Buffer): Buffer = js.native
    def sign(hash: Buffer, lowR: Boolean): Buffer = js.native
  }
  
  @js.native
  trait SignerAsync extends StObject {
    
    var getPublicKey: js.UndefOr[js.Function0[Buffer]] = js.native
    
    var network: js.UndefOr[Any] = js.native
    
    var publicKey: Buffer = js.native
    
    def sign(hash: Buffer): js.Promise[Buffer] = js.native
    def sign(hash: Buffer, lowR: Boolean): js.Promise[Buffer] = js.native
  }
  
  trait TransactionInput extends StObject {
    
    var hash: String | Buffer
    
    var index: Double
    
    var sequence: js.UndefOr[Double] = js.undefined
  }
  object TransactionInput {
    
    inline def apply(hash: String | Buffer, index: Double): TransactionInput = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionInput]
    }
    
    extension [Self <: TransactionInput](x: Self) {
      
      inline def setHash(value: String | Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    }
  }
  
  trait TransactionOutput extends StObject {
    
    var script: Buffer
    
    var value: Double
  }
  object TransactionOutput {
    
    inline def apply(script: Buffer, value: Double): TransactionOutput = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionOutput]
    }
    
    extension [Self <: TransactionOutput](x: Self) {
      
      inline def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ValidateSigFunction = js.Function3[/* pubkey */ Buffer, /* msghash */ Buffer, /* signature */ Buffer, Boolean]
}
