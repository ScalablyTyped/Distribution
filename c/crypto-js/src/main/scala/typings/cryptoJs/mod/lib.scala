package typings.cryptoJs.mod

import typings.cryptoJs.anon.PartialCipherParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lib {
  
  /**
    * Base object for prototypal inheritance.
    */
  object Base {
    
    @JSImport("crypto-js", "lib.Base")
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
  @JSImport("crypto-js", "lib.BlockCipherMode")
  @js.native
  val BlockCipherMode: Any = js.native
  
  @JSImport("crypto-js", "lib.BufferedBlockAlgorithm")
  @js.native
  val BufferedBlockAlgorithm: Any = js.native
  
  object Cipher {
    
    @JSImport("crypto-js", "lib.Cipher")
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
    
    @JSImport("crypto-js", "lib.CipherParams")
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
    
    @JSImport("crypto-js", "lib.Hasher")
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
    
    @JSImport("crypto-js", "lib.PasswordBasedCipher")
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
    
    @JSImport("crypto-js", "lib.SerializableCipher")
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
    
    @JSImport("crypto-js", "lib.WordArray")
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
