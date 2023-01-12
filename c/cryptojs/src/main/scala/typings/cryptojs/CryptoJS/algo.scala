package typings.cryptojs.CryptoJS

import typings.cryptojs.CryptoJS.lib.Base
import typings.cryptojs.CryptoJS.lib.CipherParamsData
import typings.cryptojs.CryptoJS.lib.Hasher
import typings.cryptojs.CryptoJS.lib.IBlockCipherCfg
import typings.cryptojs.CryptoJS.lib.IHasher
import typings.cryptojs.CryptoJS.lib.IStreamCipher
import typings.cryptojs.CryptoJS.lib.StreamCipher
import typings.cryptojs.CryptoJS.lib.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algo {
  
  type AES = IBlockCipherImpl
  
  trait AlgoStatic extends StObject {
    
    var AES: typings.cryptojs.CryptoJS.algo.AES
    
    var DES: typings.cryptojs.CryptoJS.algo.DES
    
    var EvpKDF: typings.cryptojs.CryptoJS.algo.EvpKDF
    
    var HMAC: typings.cryptojs.CryptoJS.algo.HMAC
    
    var MD5: typings.cryptojs.CryptoJS.algo.MD5
    
    var PBKDF2: typings.cryptojs.CryptoJS.algo.PBKDF2
    
    var RC4: typings.cryptojs.CryptoJS.algo.RC4
    
    var RC4Drop: typings.cryptojs.CryptoJS.algo.RC4Drop
    
    var RIPEMD160: typings.cryptojs.CryptoJS.algo.RIPEMD160
    
    var Rabbit: typings.cryptojs.CryptoJS.algo.Rabbit
    
    var RabbitLegacy: typings.cryptojs.CryptoJS.algo.RabbitLegacy
    
    var SHA1: typings.cryptojs.CryptoJS.algo.SHA1
    
    var SHA224: typings.cryptojs.CryptoJS.algo.SHA224
    
    var SHA256: typings.cryptojs.CryptoJS.algo.SHA256
    
    var SHA3: typings.cryptojs.CryptoJS.algo.SHA3
    
    var SHA384: typings.cryptojs.CryptoJS.algo.SHA384
    
    var SHA512: typings.cryptojs.CryptoJS.algo.SHA512
    
    var TripleDES: typings.cryptojs.CryptoJS.algo.TripleDES
  }
  object AlgoStatic {
    
    inline def apply(
      AES: AES,
      DES: DES,
      EvpKDF: EvpKDF,
      HMAC: HMAC,
      MD5: MD5,
      PBKDF2: PBKDF2,
      RC4: RC4,
      RC4Drop: RC4Drop,
      RIPEMD160: RIPEMD160,
      Rabbit: Rabbit,
      RabbitLegacy: RabbitLegacy,
      SHA1: SHA1,
      SHA224: SHA224,
      SHA256: SHA256,
      SHA3: SHA3,
      SHA384: SHA384,
      SHA512: SHA512,
      TripleDES: TripleDES
    ): AlgoStatic = {
      val __obj = js.Dynamic.literal(AES = AES.asInstanceOf[js.Any], DES = DES.asInstanceOf[js.Any], EvpKDF = EvpKDF.asInstanceOf[js.Any], HMAC = HMAC.asInstanceOf[js.Any], MD5 = MD5.asInstanceOf[js.Any], PBKDF2 = PBKDF2.asInstanceOf[js.Any], RC4 = RC4.asInstanceOf[js.Any], RC4Drop = RC4Drop.asInstanceOf[js.Any], RIPEMD160 = RIPEMD160.asInstanceOf[js.Any], Rabbit = Rabbit.asInstanceOf[js.Any], RabbitLegacy = RabbitLegacy.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], SHA224 = SHA224.asInstanceOf[js.Any], SHA256 = SHA256.asInstanceOf[js.Any], SHA3 = SHA3.asInstanceOf[js.Any], SHA384 = SHA384.asInstanceOf[js.Any], SHA512 = SHA512.asInstanceOf[js.Any], TripleDES = TripleDES.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlgoStatic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlgoStatic] (val x: Self) extends AnyVal {
      
      inline def setAES(value: AES): Self = StObject.set(x, "AES", value.asInstanceOf[js.Any])
      
      inline def setDES(value: DES): Self = StObject.set(x, "DES", value.asInstanceOf[js.Any])
      
      inline def setEvpKDF(value: EvpKDF): Self = StObject.set(x, "EvpKDF", value.asInstanceOf[js.Any])
      
      inline def setHMAC(value: HMAC): Self = StObject.set(x, "HMAC", value.asInstanceOf[js.Any])
      
      inline def setMD5(value: MD5): Self = StObject.set(x, "MD5", value.asInstanceOf[js.Any])
      
      inline def setPBKDF2(value: PBKDF2): Self = StObject.set(x, "PBKDF2", value.asInstanceOf[js.Any])
      
      inline def setRC4(value: RC4): Self = StObject.set(x, "RC4", value.asInstanceOf[js.Any])
      
      inline def setRC4Drop(value: RC4Drop): Self = StObject.set(x, "RC4Drop", value.asInstanceOf[js.Any])
      
      inline def setRIPEMD160(value: RIPEMD160): Self = StObject.set(x, "RIPEMD160", value.asInstanceOf[js.Any])
      
      inline def setRabbit(value: Rabbit): Self = StObject.set(x, "Rabbit", value.asInstanceOf[js.Any])
      
      inline def setRabbitLegacy(value: RabbitLegacy): Self = StObject.set(x, "RabbitLegacy", value.asInstanceOf[js.Any])
      
      inline def setSHA1(value: SHA1): Self = StObject.set(x, "SHA1", value.asInstanceOf[js.Any])
      
      inline def setSHA224(value: SHA224): Self = StObject.set(x, "SHA224", value.asInstanceOf[js.Any])
      
      inline def setSHA256(value: SHA256): Self = StObject.set(x, "SHA256", value.asInstanceOf[js.Any])
      
      inline def setSHA3(value: SHA3): Self = StObject.set(x, "SHA3", value.asInstanceOf[js.Any])
      
      inline def setSHA384(value: SHA384): Self = StObject.set(x, "SHA384", value.asInstanceOf[js.Any])
      
      inline def setSHA512(value: SHA512): Self = StObject.set(x, "SHA512", value.asInstanceOf[js.Any])
      
      inline def setTripleDES(value: TripleDES): Self = StObject.set(x, "TripleDES", value.asInstanceOf[js.Any])
    }
  }
  
  type DES = IBlockCipherImpl
  
  @js.native
  trait EvpKDF
    extends StObject
       with Base {
    
    var cfg: IEvpKDFCfg = js.native
    
    def compute(password: String, salt: String): WordArray = js.native
    def compute(password: String, salt: WordArray): WordArray = js.native
    def compute(password: WordArray, salt: String): WordArray = js.native
    def compute(password: WordArray, salt: WordArray): WordArray = js.native
    
    def create(): EvpKDF = js.native
    def create(cfg: IEvpKDFCfg): EvpKDF = js.native
    
    def init(): Unit = js.native
    def init(cfg: IEvpKDFCfg): Unit = js.native
  }
  
  @js.native
  trait HMAC
    extends StObject
       with Base {
    
    def create(): HMAC = js.native
    def create(hasher: Unit, key: String): HMAC = js.native
    def create(hasher: Unit, key: WordArray): HMAC = js.native
    def create(hasher: Hasher): HMAC = js.native
    def create(hasher: Hasher, key: String): HMAC = js.native
    def create(hasher: Hasher, key: WordArray): HMAC = js.native
    
    def finalize(messageUpdate: String): WordArray = js.native
    def finalize(messageUpdate: WordArray): WordArray = js.native
    
    def init(): Unit = js.native
    def init(hasher: Unit, key: String): Unit = js.native
    def init(hasher: Unit, key: WordArray): Unit = js.native
    def init(hasher: Hasher): Unit = js.native
    def init(hasher: Hasher, key: String): Unit = js.native
    def init(hasher: Hasher, key: WordArray): Unit = js.native
    
    def update(messageUpdate: String): HMAC = js.native
    def update(messageUpdate: WordArray): HMAC = js.native
  }
  
  @js.native
  trait IBlockCipherImpl
    extends StObject
       with IStreamCipher[IBlockCipherCfg] {
    
    def createDecryptor(key: WordArray, cfg: CipherParamsData): IBlockCipherImpl = js.native
    
    def createEncryptor(key: WordArray, cfg: CipherParamsData): IBlockCipherImpl = js.native
    
    def decryptBlock(M: js.Array[Double], offset: Double): Unit = js.native
    
    def encryptBlock(M: js.Array[Double], offset: Double): Unit = js.native
  }
  
  trait IEvpKDFCfg extends StObject {
    
    //default 128/32
    var hasher: js.UndefOr[Hasher] = js.undefined
    
    //default MD5, or SHA1 with PBKDF2
    var iterations: js.UndefOr[Double] = js.undefined
    
    var keySize: js.UndefOr[Double] = js.undefined
  }
  object IEvpKDFCfg {
    
    inline def apply(): IEvpKDFCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEvpKDFCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEvpKDFCfg] (val x: Self) extends AnyVal {
      
      inline def setHasher(value: Hasher): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
      
      inline def setHasherUndefined: Self = StObject.set(x, "hasher", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
      
      inline def setKeySizeUndefined: Self = StObject.set(x, "keySize", js.undefined)
    }
  }
  
  @js.native
  trait IEvpKDFHelper extends StObject {
    
    def apply(password: String, salt: String): WordArray = js.native
    def apply(password: String, salt: String, cfg: IEvpKDFCfg): WordArray = js.native
    def apply(password: String, salt: WordArray): WordArray = js.native
    def apply(password: String, salt: WordArray, cfg: IEvpKDFCfg): WordArray = js.native
    def apply(password: WordArray, salt: String): WordArray = js.native
    def apply(password: WordArray, salt: String, cfg: IEvpKDFCfg): WordArray = js.native
    def apply(password: WordArray, salt: WordArray): WordArray = js.native
    def apply(password: WordArray, salt: WordArray, cfg: IEvpKDFCfg): WordArray = js.native
  }
  
  trait ISHA3Cfg extends StObject {
    
    var outputLength: js.UndefOr[Double] = js.undefined
  }
  object ISHA3Cfg {
    
    inline def apply(): ISHA3Cfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISHA3Cfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISHA3Cfg] (val x: Self) extends AnyVal {
      
      inline def setOutputLength(value: Double): Self = StObject.set(x, "outputLength", value.asInstanceOf[js.Any])
      
      inline def setOutputLengthUndefined: Self = StObject.set(x, "outputLength", js.undefined)
    }
  }
  
  type MD5 = Hasher
  
  type PBKDF2 = EvpKDF
  
  type RC4 = StreamCipher
  
  //PBKDF2 is same as EvpKDF
  type RC4Drop = RC4
  
  type RIPEMD160 = Hasher
  
  type Rabbit = StreamCipher
  
  type RabbitLegacy = StreamCipher
  
  type SHA1 = Hasher
  
  type SHA224 = Hasher
  
  type SHA256 = Hasher
  
  type SHA3 = IHasher[ISHA3Cfg]
  
  type SHA384 = Hasher
  
  type SHA512 = Hasher
  
  type TripleDES = IBlockCipherImpl
}
