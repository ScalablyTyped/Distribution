package typings.cryptoJs

import typings.cryptoJs.anon.Hasher
import typings.cryptoJs.anon.PartialCipherParams
import typings.cryptoJs.mod.BlockCipherMode
import typings.cryptoJs.mod.CipherHelper
import typings.cryptoJs.mod.CipherOption
import typings.cryptoJs.mod.CipherParams
import typings.cryptoJs.mod.CipherStatic
import typings.cryptoJs.mod.Encoder
import typings.cryptoJs.mod.Format_
import typings.cryptoJs.mod.HasherHelper
import typings.cryptoJs.mod.HasherStatic
import typings.cryptoJs.mod.HmacHasherHelper
import typings.cryptoJs.mod.KDFOption
import typings.cryptoJs.mod.Padding
import typings.cryptoJs.mod.WordArray
import typings.cryptoJs.mod.X64Word
import typings.cryptoJs.mod.X64WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object x64CoreMod {
  
  @JSImport("crypto-js/x64-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("crypto-js/x64-core", "AES")
  @js.native
  val AES: CipherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "DES")
  @js.native
  val DES: CipherHelper = js.native
  
  inline def EvpKDF(password: String, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: String, salt: String, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: String, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: String, salt: WordArray, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: WordArray, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: WordArray, salt: String, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: WordArray, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: WordArray, salt: WordArray, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  
  @JSImport("crypto-js/x64-core", "HmacMD5")
  @js.native
  val HmacMD5: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacRIPEMD160")
  @js.native
  val HmacRIPEMD160: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA1")
  @js.native
  val HmacSHA1: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA224")
  @js.native
  val HmacSHA224: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA256")
  @js.native
  val HmacSHA256: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA3")
  @js.native
  val HmacSHA3: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA384")
  @js.native
  val HmacSHA384: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA512")
  @js.native
  val HmacSHA512: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "MD5")
  @js.native
  val MD5: HasherHelper = js.native
  
  inline def PBKDF2(password: String, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: String, salt: String, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: String, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: String, salt: WordArray, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: WordArray, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: WordArray, salt: String, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: WordArray, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: WordArray, salt: WordArray, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  
  @JSImport("crypto-js/x64-core", "RC4")
  @js.native
  val RC4: CipherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "RC4Drop")
  @js.native
  val RC4Drop: CipherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "RIPEMD160")
  @js.native
  val RIPEMD160: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "Rabbit")
  @js.native
  val Rabbit: CipherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "RabbitLegacy")
  @js.native
  val RabbitLegacy: CipherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA1")
  @js.native
  val SHA1: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA224")
  @js.native
  val SHA224: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA256")
  @js.native
  val SHA256: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA3")
  @js.native
  val SHA3: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA384")
  @js.native
  val SHA384: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA512")
  @js.native
  val SHA512: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "TripleDES")
  @js.native
  val TripleDES: CipherHelper = js.native
  
  object algo {
    
    /**
      * AES block cipher algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.AES")
    @js.native
    val AES: CipherStatic = js.native
    
    /**
      * DES block cipher algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.DES")
    @js.native
    val DES: CipherStatic = js.native
    
    /**
      * This key derivation function is meant to conform with EVP_BytesToKey.
      * www.openssl.org/docs/crypto/EVP_BytesToKey.html
      */
    /* note: abstract class */ @JSImport("crypto-js/x64-core", "algo.EvpKDF")
    @js.native
    open class EvpKDF ()
      extends typings.cryptoJs.mod.algo.EvpKDF
    object EvpKDF {
      
      @JSImport("crypto-js/x64-core", "algo.EvpKDF")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Initializes a newly created key derivation function.
        *
        * @param cfg (Optional) The configuration options to use for the derivation.
        *
        * @example
        *
        *     var kdf = CryptoJS.algo.EvpKDF.create();
        *     var kdf = CryptoJS.algo.EvpKDF.create({ keySize: 8 });
        *     var kdf = CryptoJS.algo.EvpKDF.create({ keySize: 8, iterations: 1000 });
        */
      /* static member */
      inline def create(): typings.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.algo.EvpKDF]
      inline def create(cfg: Hasher): typings.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(cfg.asInstanceOf[js.Any]).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.algo.EvpKDF]
    }
    
    /**
      * HMAC algorithm.
      */
    /* note: abstract class */ @JSImport("crypto-js/x64-core", "algo.HMAC")
    @js.native
    open class HMAC ()
      extends typings.cryptoJs.mod.algo.HMAC
    object HMAC {
      
      @JSImport("crypto-js/x64-core", "algo.HMAC")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(hasher: HasherStatic, key: String): typings.cryptoJs.mod.global.CryptoJS.algo.HMAC = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(hasher.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.algo.HMAC]
      /**
        * Initializes a newly created HMAC.
        *
        * @param hasher The hash algorithm to use.
        * @param key The secret key.
        *
        * @example
        *
        *     var hmacHasher = CryptoJS.algo.HMAC.create(CryptoJS.algo.SHA256, key);
        */
      /* static member */
      inline def create(hasher: HasherStatic, key: WordArray): typings.cryptoJs.mod.global.CryptoJS.algo.HMAC = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(hasher.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.algo.HMAC]
    }
    
    /**
      * MD5 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.MD5")
    @js.native
    val MD5: HasherStatic = js.native
    
    /**
      * Password-Based Key Derivation Function 2 algorithm.
      */
    /* note: abstract class */ @JSImport("crypto-js/x64-core", "algo.PBKDF2")
    @js.native
    open class PBKDF2 ()
      extends typings.cryptoJs.mod.algo.PBKDF2
    object PBKDF2 {
      
      @JSImport("crypto-js/x64-core", "algo.PBKDF2")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Initializes a newly created key derivation function.
        *
        * @param cfg (Optional) The configuration options to use for the derivation.
        *
        * @example
        *
        *     var kdf = CryptoJS.algo.PBKDF2.create();
        *     var kdf = CryptoJS.algo.PBKDF2.create({ keySize: 8 });
        *     var kdf = CryptoJS.algo.PBKDF2.create({ keySize: 8, iterations: 1000 });
        */
      /* static member */
      inline def create(): typings.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.algo.PBKDF2]
      inline def create(cfg: KDFOption): typings.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(cfg.asInstanceOf[js.Any]).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.algo.PBKDF2]
    }
    
    /**
      * RC4 stream cipher algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.RC4")
    @js.native
    val RC4: CipherStatic = js.native
    
    /**
      * Modified RC4 stream cipher algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.RC4Drop")
    @js.native
    val RC4Drop: CipherStatic = js.native
    
    /**
      * RIPEMD160 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.RIPEMD160")
    @js.native
    val RIPEMD160: HasherStatic = js.native
    
    /**
      * Rabbit stream cipher algorithm
      */
    @JSImport("crypto-js/x64-core", "algo.Rabbit")
    @js.native
    val Rabbit: CipherStatic = js.native
    
    /**
      * Rabbit stream cipher algorithm.
      *
      * This is a legacy version that neglected to convert the key to little-endian.
      * This error doesn't affect the cipher's security,
      * but it does affect its compatibility with other implementations.
      */
    @JSImport("crypto-js/x64-core", "algo.RabbitLegacy")
    @js.native
    val RabbitLegacy: CipherStatic = js.native
    
    /**
      * SHA-1 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA1")
    @js.native
    val SHA1: HasherStatic = js.native
    
    /**
      * SHA-224 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA224")
    @js.native
    val SHA224: HasherStatic = js.native
    
    /**
      * SHA-256 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA256")
    @js.native
    val SHA256: HasherStatic = js.native
    
    /**
      * SHA-3 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA3")
    @js.native
    val SHA3: HasherStatic = js.native
    
    /**
      * SHA-384 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA384")
    @js.native
    val SHA384: HasherStatic = js.native
    
    /**
      * SHA-512 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA512")
    @js.native
    val SHA512: HasherStatic = js.native
    
    /**
      * Triple-DES block cipher algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.TripleDES")
    @js.native
    val TripleDES: CipherStatic = js.native
  }
  
  object enc {
    
    /**
      * Base64 encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Base64")
    @js.native
    val Base64: Encoder = js.native
    
    /**
      * Base64url encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Base64url")
    @js.native
    val Base64url: Encoder = js.native
    
    /**
      * Hex encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Hex")
    @js.native
    val Hex: Encoder = js.native
    
    /**
      * Latin1 encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Latin1")
    @js.native
    val Latin1: Encoder = js.native
    
    /**
      * UTF-16 BE encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Utf16")
    @js.native
    val Utf16: Encoder = js.native
    
    @JSImport("crypto-js/x64-core", "enc.Utf16BE")
    @js.native
    val Utf16BE: Encoder = js.native
    
    /**
      * UTF-16 LE encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Utf16LE")
    @js.native
    val Utf16LE: Encoder = js.native
    
    /**
      * UTF-8 encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Utf8")
    @js.native
    val Utf8: Encoder = js.native
  }
  
  object format {
    
    @JSImport("crypto-js/x64-core", "format.Hex")
    @js.native
    val Hex: Format_ = js.native
    
    /**
      * OpenSSL formatting strategy.
      */
    @JSImport("crypto-js/x64-core", "format.OpenSSL")
    @js.native
    val OpenSSL: Format_ = js.native
  }
  
  object kdf {
    
    /**
      * OpenSSL key derivation function.
      */
    object OpenSSL {
      
      @JSImport("crypto-js/x64-core", "kdf.OpenSSL")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Derives a key and IV from a password.
        *
        * @param password The password to derive from.
        * @param keySize The size in words of the key to generate.
        * @param ivSize The size in words of the IV to generate.
        * @param salt (Optional) A 64-bit salt to use. If omitted, a salt will be generated randomly.
        *
        * @return A cipher params object with the key, IV, and salt.
        *
        * @example
        *
        *     var derivedParams = CryptoJS.kdf.OpenSSL.execute('Password', 256/32, 128/32);
        *     var derivedParams = CryptoJS.kdf.OpenSSL.execute('Password', 256/32, 128/32, 'saltsalt');
        */
      inline def execute(password: String, keySize: Double, ivSize: Double): CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(password.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any])).asInstanceOf[CipherParams]
      inline def execute(password: String, keySize: Double, ivSize: Double, salt: String): CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(password.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[CipherParams]
      inline def execute(password: String, keySize: Double, ivSize: Double, salt: WordArray): CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(password.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[CipherParams]
    }
  }
  
  object lib {
    
    /**
      * Base object for prototypal inheritance.
      */
    object Base {
      
      @JSImport("crypto-js/x64-core", "lib.Base")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Extends this object and runs the init method.
        * Arguments to create() will be passed to init().
        *
        * @return The new object.
        *
        * @example
        *
        *     var instance = MyType.create();
        */
      inline def create(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
      
      /**
        * Creates a new object that inherits from this object.
        *
        * @param overrides Properties to copy into the new object.
        *
        * @return The new object.
        *
        * @example
        *
        *     var MyType = CryptoJS.lib.Base.extend({
        *         field: 'value',
        *
        *         method: function () {
        *         }
        *     });
        */
      inline def extend(overrides: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(overrides.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /**
        * Copies properties into this object.
        *
        * @param properties The properties to mix in.
        *
        * @example
        *
        *     MyType.mixIn({
        *         field: 'value'
        *     });
        */
      inline def mixIn(properties: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixIn")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
    }
    
    /**
      * Abstract base block cipher mode template.
      */
    @JSImport("crypto-js/x64-core", "lib.BlockCipherMode")
    @js.native
    val BlockCipherMode: Any = js.native
    
    @JSImport("crypto-js/x64-core", "lib.BufferedBlockAlgorithm")
    @js.native
    val BufferedBlockAlgorithm: Any = js.native
    
    object Cipher {
      
      @JSImport("crypto-js/x64-core", "lib.Cipher")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates shortcut functions to a cipher's object interface.
        *
        * @param cipher The cipher to create a helper for.
        *
        * @return An object with encrypt and decrypt shortcut functions.
        *
        * @example
        *
        *     var AES = CryptoJS.lib.Cipher._createHelper(CryptoJS.algo.AES);
        */
      inline def createHelper(cipher: typings.cryptoJs.mod.Cipher): CipherHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("_createHelper")(cipher.asInstanceOf[js.Any]).asInstanceOf[CipherHelper]
    }
    
    object CipherParams {
      
      @JSImport("crypto-js/x64-core", "lib.CipherParams")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Initializes a newly created cipher params object.
        *
        * @param cipherParams An object with any of the possible cipher parameters.
        *
        * @example
        *
        *     var cipherParams = CryptoJS.lib.CipherParams.create({
        *         ciphertext: ciphertextWordArray,
        *         key: keyWordArray,
        *         iv: ivWordArray,
        *         salt: saltWordArray,
        *         algorithm: CryptoJS.algo.AES,
        *         mode: CryptoJS.mode.CBC,
        *         padding: CryptoJS.pad.PKCS7,
        *         blockSize: 4,
        *         formatter: CryptoJS.format.OpenSSL
        *     });
        */
      inline def create(cipherParams: PartialCipherParams): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(cipherParams.asInstanceOf[js.Any]).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
    }
    
    object Hasher {
      
      @JSImport("crypto-js/x64-core", "lib.Hasher")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a shortcut function to a hasher's object interface.
        *
        * @param hasher The hasher to create a helper for.
        *
        * @return The shortcut function.
        *
        * @example
        *
        *     var SHA256 = CryptoJS.lib.Hasher._createHelper(CryptoJS.algo.SHA256);
        */
      inline def createHelper(hasher: HasherStatic): HasherHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("_createHelper")(hasher.asInstanceOf[js.Any]).asInstanceOf[HasherHelper]
      
      /**
        * Creates a shortcut function to the HMAC's object interface.
        *
        * @param hasher The hasher to use in this HMAC helper.
        *
        * @return The shortcut function.
        *
        * @example
        *
        *     var HmacSHA256 = CryptoJS.lib.Hasher._createHmacHelper(CryptoJS.algo.SHA256);
        */
      inline def createHmacHelper(hasher: HasherStatic): HmacHasherHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("_createHmacHelper")(hasher.asInstanceOf[js.Any]).asInstanceOf[HmacHasherHelper]
    }
    
    /**
      * A serializable cipher wrapper that derives the key from a password,
      * and returns ciphertext as a serializable cipher params object.
      */
    object PasswordBasedCipher {
      
      @JSImport("crypto-js/x64-core", "lib.PasswordBasedCipher")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decrypt(cipher: CipherStatic, ciphertext: String, password: String): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.WordArray]
      inline def decrypt(cipher: CipherStatic, ciphertext: String, password: String, cfg: CipherOption): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], password.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.WordArray]
      /**
        * Decrypts serialized ciphertext using a password.
        *
        * @param cipher The cipher algorithm to use.
        * @param ciphertext The ciphertext to decrypt.
        * @param password The password.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return The plaintext.
        *
        * @example
        *
        *     var plaintext = CryptoJS.lib.PasswordBasedCipher.decrypt(CryptoJS.algo.AES, formattedCiphertext, 'password', { format: CryptoJS.format.OpenSSL });
        *     var plaintext = CryptoJS.lib.PasswordBasedCipher.decrypt(CryptoJS.algo.AES, ciphertextParams, 'password', { format: CryptoJS.format.OpenSSL });
        */
      inline def decrypt(
        cipher: CipherStatic,
        ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams,
        password: String
      ): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.WordArray]
      inline def decrypt(
        cipher: CipherStatic,
        ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams,
        password: String,
        cfg: CipherOption
      ): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], password.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.WordArray]
      
      inline def encrypt(cipher: CipherStatic, message: String, password: String): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      inline def encrypt(cipher: CipherStatic, message: String, password: String, cfg: CipherOption): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], password.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      /**
        * Encrypts a message using a password.
        *
        * @param cipher The cipher algorithm to use.
        * @param message The message to encrypt.
        * @param password The password.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return A cipher params object.
        *
        * @example
        *
        *     var ciphertextParams = CryptoJS.lib.PasswordBasedCipher.encrypt(CryptoJS.algo.AES, message, 'password');
        *     var ciphertextParams = CryptoJS.lib.PasswordBasedCipher.encrypt(CryptoJS.algo.AES, message, 'password', { format: CryptoJS.format.OpenSSL });
        */
      inline def encrypt(
        cipher: CipherStatic,
        message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        password: String
      ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      inline def encrypt(
        cipher: CipherStatic,
        message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        password: String,
        cfg: CipherOption
      ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], password.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
    }
    
    /**
      * A cipher wrapper that returns ciphertext as a serializable cipher params object.
      */
    object SerializableCipher {
      
      @JSImport("crypto-js/x64-core", "lib.SerializableCipher")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decrypt(cipher: CipherStatic, ciphertext: String, key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      inline def decrypt(
        cipher: CipherStatic,
        ciphertext: String,
        key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      /**
        * Decrypts serialized ciphertext.
        *
        * @param cipher The cipher algorithm to use.
        * @param ciphertext The ciphertext to decrypt.
        * @param key The key.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return The plaintext.
        *
        * @example
        *
        *     var plaintext = CryptoJS.lib.SerializableCipher.decrypt(CryptoJS.algo.AES, formattedCiphertext, key, { iv: iv, format: CryptoJS.format.OpenSSL });
        *     var plaintext = CryptoJS.lib.SerializableCipher.decrypt(CryptoJS.algo.AES, ciphertextParams, key, { iv: iv, format: CryptoJS.format.OpenSSL });
        */
      inline def decrypt(
        cipher: CipherStatic,
        ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
      ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      inline def decrypt(
        cipher: CipherStatic,
        ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      
      inline def encrypt(cipher: CipherStatic, message: String, key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      inline def encrypt(
        cipher: CipherStatic,
        message: String,
        key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      /**
        * Encrypts a message.
        *
        * @param cipher The cipher algorithm to use.
        * @param message The message to encrypt.
        * @param key The key.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return A cipher params object.
        *
        * @example
        *
        *     var ciphertextParams = CryptoJS.lib.SerializableCipher.encrypt(CryptoJS.algo.AES, message, key);
        *     var ciphertextParams = CryptoJS.lib.SerializableCipher.encrypt(CryptoJS.algo.AES, message, key, { iv: iv });
        *     var ciphertextParams = CryptoJS.lib.SerializableCipher.encrypt(CryptoJS.algo.AES, message, key, { iv: iv, format: CryptoJS.format.OpenSSL });
        */
      inline def encrypt(
        cipher: CipherStatic,
        message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
      ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      inline def encrypt(
        cipher: CipherStatic,
        message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      
      inline def parse(ciphertext: String, format: Format_): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("_parse")(ciphertext.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
      /**
        * Converts serialized ciphertext to CipherParams,
        * else assumed CipherParams already and returns ciphertext unchanged.
        *
        * @param ciphertext The ciphertext.
        * @param format The formatting strategy to use to parse serialized ciphertext.
        *
        * @return The unserialized ciphertext.
        *
        * @example
        *
        *     var ciphertextParams = CryptoJS.lib.SerializableCipher._parse(ciphertextStringOrParams, format);
        */
      inline def parse(ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams, format: Format_): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("_parse")(ciphertext.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams]
    }
    
    object WordArray {
      
      @JSImport("crypto-js/x64-core", "lib.WordArray")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Initializes a newly created word array.
        *
        * @param words (Optional) An array of 32-bit words.
        * @param sigBytes (Optional) The number of significant bytes in the words.
        *
        * @example
        *
        *     var wordArray = CryptoJS.lib.WordArray.create();
        *     var wordArray = CryptoJS.lib.WordArray.create([0x00010203, 0x04050607]);
        *     var wordArray = CryptoJS.lib.WordArray.create([0x00010203, 0x04050607], 6);
        */
      inline def create(): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.WordArray]
      inline def create(words: js.Array[Double]): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any]).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.WordArray]
      inline def create(words: js.Array[Double], sigBytes: Double): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.WordArray]
      inline def create(words: Unit, sigBytes: Double): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.WordArray]
      
      /**
        * Creates a word array filled with random bytes.
        *
        * @param nBytes The number of random bytes to generate.
        *
        * @return The random word array.
        *
        * @example
        *
        *     var wordArray = CryptoJS.lib.WordArray.random(16);
        */
      inline def random(nBytes: Double): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(nBytes.asInstanceOf[js.Any]).asInstanceOf[typings.cryptoJs.mod.global.CryptoJS.lib.WordArray]
    }
  }
  
  object mode {
    
    /**
      * Cipher Block Chaining mode.
      */
    @JSImport("crypto-js/x64-core", "mode.CBC")
    @js.native
    val CBC: BlockCipherMode = js.native
    
    /**
      * Cipher Feedback block mode.
      */
    @JSImport("crypto-js/x64-core", "mode.CFB")
    @js.native
    val CFB: BlockCipherMode = js.native
    
    /**
      * Counter block mode.
      */
    @JSImport("crypto-js/x64-core", "mode.CTR")
    @js.native
    val CTR: BlockCipherMode = js.native
    
    /**
      * @preserve
      * Counter block mode compatible with  Dr Brian Gladman fileenc.c
      * derived from CryptoJS.mode.CTR
      * Jan Hruby jhruby.web@gmail.com
      */
    @JSImport("crypto-js/x64-core", "mode.CTRGladman")
    @js.native
    val CTRGladman: BlockCipherMode = js.native
    
    /**
      * Electronic Codebook block mode.
      */
    @JSImport("crypto-js/x64-core", "mode.ECB")
    @js.native
    val ECB: BlockCipherMode = js.native
    
    /**
      * Output Feedback block mode.
      */
    @JSImport("crypto-js/x64-core", "mode.OFB")
    @js.native
    val OFB: BlockCipherMode = js.native
  }
  
  object pad {
    
    /**
      * ANSI X.923 padding strategy.
      */
    @JSImport("crypto-js/x64-core", "pad.AnsiX923")
    @js.native
    val AnsiX923: Padding = js.native
    
    /**
      * ISO 10126 padding strategy.
      */
    @JSImport("crypto-js/x64-core", "pad.Iso10126")
    @js.native
    val Iso10126: Padding = js.native
    
    /**
      * ISO/IEC 9797-1 Padding Method 2.
      */
    @JSImport("crypto-js/x64-core", "pad.Iso97971")
    @js.native
    val Iso97971: Padding = js.native
    
    /**
      * A noop padding strategy.
      */
    @JSImport("crypto-js/x64-core", "pad.NoPadding")
    @js.native
    val NoPadding: Padding = js.native
    
    /**
      * PKCS #5/7 padding strategy.
      */
    @JSImport("crypto-js/x64-core", "pad.Pkcs7")
    @js.native
    val Pkcs7: Padding = js.native
    
    /**
      * Zero padding strategy.
      */
    @JSImport("crypto-js/x64-core", "pad.ZeroPadding")
    @js.native
    val ZeroPadding: Padding = js.native
  }
  
  object x64 {
    
    object Word {
      
      @JSImport("crypto-js/x64-core", "x64.Word")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Initializes a newly created 64-bit word.
        *
        * @param high The high 32 bits.
        * @param low The low 32 bits.
        *
        * @example
        *
        *     var x64Word = CryptoJS.x64.Word.create(0x00010203, 0x04050607);
        */
      inline def create(high: Double, low: Double): X64Word = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(high.asInstanceOf[js.Any], low.asInstanceOf[js.Any])).asInstanceOf[X64Word]
    }
    
    /**
      * Initializes a newly created word array.
      *
      * @param words (Optional) An array of CryptoJS.x64.Word objects.
      * @param sigBytes (Optional) The number of significant bytes in the words.
      *
      * @example
      *
      *     var wordArray = CryptoJS.x64.WordArray.create();
      *
      *     var wordArray = CryptoJS.x64.WordArray.create([
      *         CryptoJS.x64.Word.create(0x00010203, 0x04050607),
      *         CryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
      *     ]);
      *
      *     var wordArray = CryptoJS.x64.WordArray.create([
      *         CryptoJS.x64.Word.create(0x00010203, 0x04050607),
      *         CryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
      *     ], 10);
      */
    object WordArray {
      
      @JSImport("crypto-js/x64-core", "x64.WordArray")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(): X64WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[X64WordArray]
      inline def create(words: js.Array[X64WordArray]): X64WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any]).asInstanceOf[X64WordArray]
      inline def create(words: js.Array[X64WordArray], sigBytes: Double): X64WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[X64WordArray]
      inline def create(words: Unit, sigBytes: Double): X64WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[X64WordArray]
    }
  }
}
