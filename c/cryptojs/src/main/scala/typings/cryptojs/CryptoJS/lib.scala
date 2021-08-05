package typings.cryptojs.CryptoJS

import typings.cryptojs.CryptoJS.enc.IEncoder
import typings.cryptojs.CryptoJS.format.IFormatter
import typings.cryptojs.CryptoJS.kdf.IKdfImpl
import typings.cryptojs.CryptoJS.mode.IBlockCipherDecryptor
import typings.cryptojs.CryptoJS.mode.IBlockCipherEncryptor
import typings.cryptojs.CryptoJS.mode.IBlockCipherModeImpl
import typings.cryptojs.CryptoJS.pad.IPaddingImpl
import typings.std.ArrayBuffer
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lib {
  
  trait Base extends StObject {
    
    //arguments of create() is same as init(). This is true for all subclasses
    def create(args: js.Any*): Base
    
    def extend(overrides: js.Object): js.Object
    
    def init(args: js.Any*): Unit
    
    def mixIn(properties: js.Object): Unit
  }
  object Base {
    
    inline def apply(
      create: /* repeated */ js.Any => Base,
      extend: js.Object => js.Object,
      init: /* repeated */ js.Any => Unit,
      mixIn: js.Object => Unit
    ): Base = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), init = js.Any.fromFunction1(init), mixIn = js.Any.fromFunction1(mixIn))
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setCreate(value: /* repeated */ js.Any => Base): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setExtend(value: js.Object => js.Object): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      inline def setInit(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setMixIn(value: js.Object => Unit): Self = StObject.set(x, "mixIn", js.Any.fromFunction1(value))
    }
  }
  
  //BlockCipher has interface same as IStreamCipher
  type BlockCipher = IStreamCipher[IBlockCipherCfg]
  
  @js.native
  trait BlockCipherMode
    extends StObject
       with Base {
    
    def create(): BlockCipherMode = js.native
    def create(cipher: Unit, iv: js.Array[Double]): BlockCipherMode = js.native
    def create(cipher: Cipher): BlockCipherMode = js.native
    def create(cipher: Cipher, iv: js.Array[Double]): BlockCipherMode = js.native
    
    def createDecryptor(cipher: Cipher, iv: js.Array[Double]): IBlockCipherDecryptor = js.native
    
    def createEncryptor(cipher: Cipher, iv: js.Array[Double]): IBlockCipherEncryptor = js.native
    
    def init(): Unit = js.native
    def init(cipher: Unit, iv: js.Array[Double]): Unit = js.native
    def init(cipher: Cipher): Unit = js.native
    def init(cipher: Cipher, iv: js.Array[Double]): Unit = js.native
  }
  
  trait BufferedBlockAlgorithm
    extends StObject
       with Base {
    
    def reset(): Unit
  }
  object BufferedBlockAlgorithm {
    
    inline def apply(
      create: /* repeated */ js.Any => Base,
      extend: js.Object => js.Object,
      init: /* repeated */ js.Any => Unit,
      mixIn: js.Object => Unit,
      reset: () => Unit
    ): BufferedBlockAlgorithm = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), init = js.Any.fromFunction1(init), mixIn = js.Any.fromFunction1(mixIn), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[BufferedBlockAlgorithm]
    }
    
    extension [Self <: BufferedBlockAlgorithm](x: Self) {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  type Cipher = ICipher[js.Object]
  
  type CipherHelper = ICipherHelper[js.Object]
  
  @js.native
  trait CipherParams
    extends StObject
       with Base
       with CipherParamsData {
    
    def create(): CipherParams = js.native
    def create(cipherParams: CipherParamsData): CipherParams = js.native
    
    def init(): Unit = js.native
    def init(cipherParams: CipherParamsData): Unit = js.native
    
    def toString(formatter: IFormatter): String = js.native
  }
  
  trait CipherParamsData extends StObject {
    
    var algorithm: js.UndefOr[Cipher] = js.undefined
    
    var blockSize: js.UndefOr[Double] = js.undefined
    
    var ciphertext: js.UndefOr[WordArray] = js.undefined
    
    var formatter: js.UndefOr[IFormatter] = js.undefined
    
    var iv: js.UndefOr[WordArray] = js.undefined
    
    var key: js.UndefOr[WordArray] = js.undefined
    
    var mode: js.UndefOr[IBlockCipherModeImpl] = js.undefined
    
    var padding: js.UndefOr[IPaddingImpl] = js.undefined
    
    var salt: js.UndefOr[WordArray] = js.undefined
  }
  object CipherParamsData {
    
    inline def apply(): CipherParamsData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CipherParamsData]
    }
    
    extension [Self <: CipherParamsData](x: Self) {
      
      inline def setAlgorithm(value: Cipher): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setCiphertext(value: WordArray): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
      
      inline def setFormatter(value: IFormatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setIv(value: WordArray): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setKey(value: WordArray): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMode(value: IBlockCipherModeImpl): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPadding(value: IPaddingImpl): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSalt(value: WordArray): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
  
  type Hasher = IHasher[js.Object]
  
  type HasherHelper = IHasherHelper[js.Object]
  
  trait IBlockCipherCfg extends StObject {
    
    var iv: js.UndefOr[WordArray] = js.undefined
    
    var mode: js.UndefOr[IBlockCipherModeImpl] = js.undefined
    
    //default CBC
    var padding: js.UndefOr[IPaddingImpl] = js.undefined
  }
  object IBlockCipherCfg {
    
    inline def apply(): IBlockCipherCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBlockCipherCfg]
    }
    
    extension [Self <: IBlockCipherCfg](x: Self) {
      
      inline def setIv(value: WordArray): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setMode(value: IBlockCipherModeImpl): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPadding(value: IPaddingImpl): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  //tparam C - Configuration type
  @js.native
  trait ICipher[C]
    extends StObject
       with BufferedBlockAlgorithm {
    
    def _createHelper(cipher: Cipher): ICipherHelper[C] = js.native
    
    var cfg: C = js.native
    
    def create(): ICipher[C] = js.native
    def create(xformMode: Double): ICipher[C] = js.native
    def create(xformMode: Double, key: Unit, cfg: C): ICipher[C] = js.native
    def create(xformMode: Double, key: WordArray): ICipher[C] = js.native
    def create(xformMode: Double, key: WordArray, cfg: C): ICipher[C] = js.native
    def create(xformMode: Unit, key: Unit, cfg: C): ICipher[C] = js.native
    def create(xformMode: Unit, key: WordArray): ICipher[C] = js.native
    def create(xformMode: Unit, key: WordArray, cfg: C): ICipher[C] = js.native
    
    def createDecryptor(key: WordArray): ICipher[C] = js.native
    def createDecryptor(key: WordArray, cfg: C): ICipher[C] = js.native
    
    def createEncryptor(key: WordArray): ICipher[C] = js.native
    def createEncryptor(key: WordArray, cfg: C): ICipher[C] = js.native
    
    def finalize(dataUpdate: String): WordArray = js.native
    def finalize(dataUpdate: WordArray): WordArray = js.native
    
    def init(): Unit = js.native
    def init(xformMode: Double): Unit = js.native
    def init(xformMode: Double, key: Unit, cfg: C): Unit = js.native
    def init(xformMode: Double, key: WordArray): Unit = js.native
    def init(xformMode: Double, key: WordArray, cfg: C): Unit = js.native
    def init(xformMode: Unit, key: Unit, cfg: C): Unit = js.native
    def init(xformMode: Unit, key: WordArray): Unit = js.native
    def init(xformMode: Unit, key: WordArray, cfg: C): Unit = js.native
    
    var ivSize: Double = js.native
    
    var keySize: Double = js.native
    
    def process(dataUpdate: String): WordArray = js.native
    def process(dataUpdate: WordArray): WordArray = js.native
  }
  
  /** see Cipher._createHelper */
  @js.native
  trait ICipherHelper[C] extends StObject {
    
    def decrypt(ciphertext: String, key: WordArray): WordArray = js.native
    def decrypt(ciphertext: String, key: WordArray, cfg: C): WordArray = js.native
    def decrypt(ciphertext: String, password: String): WordArray = js.native
    def decrypt(ciphertext: String, password: String, cfg: C): WordArray = js.native
    def decrypt(ciphertext: CipherParamsData, key: WordArray): WordArray = js.native
    def decrypt(ciphertext: CipherParamsData, key: WordArray, cfg: C): WordArray = js.native
    def decrypt(ciphertext: CipherParamsData, password: String): WordArray = js.native
    def decrypt(ciphertext: CipherParamsData, password: String, cfg: C): WordArray = js.native
    
    def encrypt(message: String, key: WordArray): CipherParams = js.native
    def encrypt(message: String, key: WordArray, cfg: C): CipherParams = js.native
    def encrypt(message: String, password: String): CipherParams = js.native
    def encrypt(message: String, password: String, cfg: C): CipherParams = js.native
    def encrypt(message: WordArray, key: WordArray): CipherParams = js.native
    def encrypt(message: WordArray, key: WordArray, cfg: C): CipherParams = js.native
    def encrypt(message: WordArray, password: String): CipherParams = js.native
    def encrypt(message: WordArray, password: String, cfg: C): CipherParams = js.native
  }
  
  //tparam C - Configuration type
  @js.native
  trait IHasher[C]
    extends StObject
       with BufferedBlockAlgorithm {
    
    def _createHelper(hasher: Hasher): IHasherHelper[C] = js.native
    
    def _createHmacHelper(hasher: Hasher): IHasherHmacHelper = js.native
    
    var blockSize: Double = js.native
    
    var cfg: C = js.native
    
    def create(): IHasher[C] = js.native
    def create(cfg: C): IHasher[C] = js.native
    
    def finalize(messageUpdate: String): WordArray = js.native
    def finalize(messageUpdate: WordArray): WordArray = js.native
    
    def init(): Unit = js.native
    def init(cfg: C): Unit = js.native
    
    def update(messageUpdate: String): Hasher = js.native
    def update(messageUpdate: WordArray): Hasher = js.native
  }
  
  //tparam C - Configuration type
  @js.native
  trait IHasherHelper[C] extends StObject {
    
    def apply(message: String): WordArray = js.native
    def apply(message: String, cfg: C): WordArray = js.native
    def apply(message: WordArray): WordArray = js.native
    def apply(message: WordArray, cfg: C): WordArray = js.native
  }
  
  @js.native
  trait IHasherHmacHelper extends StObject {
    
    def apply(message: String, key: String): WordArray = js.native
    def apply(message: String, key: WordArray): WordArray = js.native
    def apply(message: WordArray, key: String): WordArray = js.native
    def apply(message: WordArray, key: WordArray): WordArray = js.native
  }
  
  @js.native
  trait IPasswordBasedCipher[C /* <: IPasswordBasedCipherCfg */]
    extends StObject
       with Base {
    
    var cfg: C = js.native
    
    def decrypt(cipher: Cipher, ciphertext: String, password: String): WordArray = js.native
    def decrypt(cipher: Cipher, ciphertext: String, password: String, cfg: C): WordArray = js.native
    def decrypt(cipher: Cipher, ciphertext: CipherParamsData, password: String): WordArray = js.native
    def decrypt(cipher: Cipher, ciphertext: CipherParamsData, password: String, cfg: C): WordArray = js.native
    
    def encrypt(cipher: Cipher, message: String, password: String): CipherParams = js.native
    def encrypt(cipher: Cipher, message: String, password: String, cfg: C): CipherParams = js.native
    def encrypt(cipher: Cipher, message: WordArray, password: String): CipherParams = js.native
    def encrypt(cipher: Cipher, message: WordArray, password: String, cfg: C): CipherParams = js.native
  }
  
  trait IPasswordBasedCipherCfg
    extends StObject
       with ISerializableCipherCfg {
    
    var kdf: js.UndefOr[IKdfImpl] = js.undefined
  }
  object IPasswordBasedCipherCfg {
    
    inline def apply(): IPasswordBasedCipherCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPasswordBasedCipherCfg]
    }
    
    extension [Self <: IPasswordBasedCipherCfg](x: Self) {
      
      inline def setKdf(value: IKdfImpl): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
      
      inline def setKdfUndefined: Self = StObject.set(x, "kdf", js.undefined)
    }
  }
  
  //tparam C - Configuration type
  @js.native
  trait ISerializableCipher[C /* <: ISerializableCipherCfg */]
    extends StObject
       with Base {
    
    var cfg: C = js.native
    
    def decrypt(cipher: Cipher, ciphertext: String, key: WordArray): WordArray = js.native
    def decrypt(cipher: Cipher, ciphertext: String, key: WordArray, cfg: C): WordArray = js.native
    def decrypt(cipher: Cipher, ciphertext: CipherParamsData, key: WordArray): WordArray = js.native
    def decrypt(cipher: Cipher, ciphertext: CipherParamsData, key: WordArray, cfg: C): WordArray = js.native
    
    def encrypt(cipher: Cipher, message: String, key: WordArray): CipherParams = js.native
    def encrypt(cipher: Cipher, message: String, key: WordArray, cfg: C): CipherParams = js.native
    def encrypt(cipher: Cipher, message: WordArray, key: WordArray): CipherParams = js.native
    def encrypt(cipher: Cipher, message: WordArray, key: WordArray, cfg: C): CipherParams = js.native
  }
  
  trait ISerializableCipherCfg extends StObject {
    
    var format: js.UndefOr[IFormatter] = js.undefined
    
    //default OpenSSLFormatter
    var iv: js.UndefOr[WordArray] = js.undefined
    
    var mode: js.UndefOr[IBlockCipherModeImpl] = js.undefined
    
    var padding: js.UndefOr[IPaddingImpl] = js.undefined
  }
  object ISerializableCipherCfg {
    
    inline def apply(): ISerializableCipherCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISerializableCipherCfg]
    }
    
    extension [Self <: ISerializableCipherCfg](x: Self) {
      
      inline def setFormat(value: IFormatter): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIv(value: WordArray): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setMode(value: IBlockCipherModeImpl): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPadding(value: IPaddingImpl): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  @js.native
  trait IStreamCipher[C]
    extends StObject
       with ICipher[C] {
    
    var blockSize: Double = js.native
    
    var drop: js.UndefOr[Double] = js.native
  }
  
  trait LibStatic extends StObject {
    
    var Base: typings.cryptojs.CryptoJS.lib.Base
    
    var CipherParams: typings.cryptojs.CryptoJS.lib.CipherParams
    
    var PasswordBasedCipher: typings.cryptojs.CryptoJS.lib.PasswordBasedCipher
    
    var SerializableCipher: typings.cryptojs.CryptoJS.lib.SerializableCipher
    
    var WordArray: typings.cryptojs.CryptoJS.lib.WordArray
  }
  object LibStatic {
    
    inline def apply(
      Base: Base,
      CipherParams: CipherParams,
      PasswordBasedCipher: PasswordBasedCipher,
      SerializableCipher: SerializableCipher,
      WordArray: WordArray
    ): LibStatic = {
      val __obj = js.Dynamic.literal(Base = Base.asInstanceOf[js.Any], CipherParams = CipherParams.asInstanceOf[js.Any], PasswordBasedCipher = PasswordBasedCipher.asInstanceOf[js.Any], SerializableCipher = SerializableCipher.asInstanceOf[js.Any], WordArray = WordArray.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibStatic]
    }
    
    extension [Self <: LibStatic](x: Self) {
      
      inline def setBase(value: Base): Self = StObject.set(x, "Base", value.asInstanceOf[js.Any])
      
      inline def setCipherParams(value: CipherParams): Self = StObject.set(x, "CipherParams", value.asInstanceOf[js.Any])
      
      inline def setPasswordBasedCipher(value: PasswordBasedCipher): Self = StObject.set(x, "PasswordBasedCipher", value.asInstanceOf[js.Any])
      
      inline def setSerializableCipher(value: SerializableCipher): Self = StObject.set(x, "SerializableCipher", value.asInstanceOf[js.Any])
      
      inline def setWordArray(value: WordArray): Self = StObject.set(x, "WordArray", value.asInstanceOf[js.Any])
    }
  }
  
  type PasswordBasedCipher = IPasswordBasedCipher[IPasswordBasedCipherCfg]
  
  type SerializableCipher = ISerializableCipher[ISerializableCipherCfg]
  
  type SomeArray = ArrayBuffer | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
  
  type StreamCipher = IStreamCipher[js.Object]
  
  @js.native
  trait WordArray
    extends StObject
       with Base {
    
    def clamp(): Unit = js.native
    
    def concat(wordArray: WordArray): WordArray = js.native
    
    def create(): WordArray = js.native
    def create(typedArray: SomeArray): WordArray = js.native
    def create(words: js.Array[Double]): WordArray = js.native
    def create(words: js.Array[Double], sigBytes: Double): WordArray = js.native
    def create(words: Unit, sigBytes: Double): WordArray = js.native
    
    def init(): Unit = js.native
    def init(typedArray: SomeArray): Unit = js.native
    def init(words: js.Array[Double]): Unit = js.native
    def init(words: js.Array[Double], sigBytes: Double): Unit = js.native
    def init(words: Unit, sigBytes: Double): Unit = js.native
    
    def random(nBytes: Double): WordArray = js.native
    
    var sigBytes: Double = js.native
    
    def toString(encoder: IEncoder): String = js.native
    
    var words: js.Array[Double] = js.native
  }
}
