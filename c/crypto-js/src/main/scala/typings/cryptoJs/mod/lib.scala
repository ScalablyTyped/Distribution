package typings.cryptoJs.mod

import typings.cryptoJs.anon.PartialCipherParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lib {
  
  /**
    * Base object for prototypal inheritance.
    */
  object Base {
    
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
    @JSImport("crypto-js", "lib.Base.create")
    @js.native
    def create(args: js.Any*): js.Any = js.native
    
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
    @JSImport("crypto-js", "lib.Base.extend")
    @js.native
    def extend(overrides: js.Object): js.Any = js.native
    
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
    @JSImport("crypto-js", "lib.Base.mixIn")
    @js.native
    def mixIn(properties: js.Object): js.Any = js.native
  }
  
  /**
    * Abstract base block cipher mode template.
    */
  @JSImport("crypto-js", "lib.BlockCipherMode")
  @js.native
  val BlockCipherMode: js.Any = js.native
  
  @JSImport("crypto-js", "lib.BufferedBlockAlgorithm")
  @js.native
  val BufferedBlockAlgorithm: js.Any = js.native
  
  object Cipher {
    
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
    @JSImport("crypto-js", "lib.Cipher._createHelper")
    @js.native
    def createHelper(cipher: typings.cryptoJs.mod.Cipher): CipherHelper = js.native
  }
  
  object CipherParams {
    
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
    @JSImport("crypto-js", "lib.CipherParams.create")
    @js.native
    def create(cipherParams: PartialCipherParams): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
  }
  
  object Hasher {
    
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
    @JSImport("crypto-js", "lib.Hasher._createHelper")
    @js.native
    def createHelper(hasher: HasherStatic): HasherHelper = js.native
    
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
    @JSImport("crypto-js", "lib.Hasher._createHmacHelper")
    @js.native
    def createHmacHelper(hasher: HasherStatic): HmacHasherHelper = js.native
  }
  
  /**
    * A serializable cipher wrapper that derives the key from a password,
    * and returns ciphertext as a serializable cipher params object.
    */
  object PasswordBasedCipher {
    
    @JSImport("crypto-js", "lib.PasswordBasedCipher.decrypt")
    @js.native
    def decrypt(cipher: CipherStatic, ciphertext: String, password: String): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
    @JSImport("crypto-js", "lib.PasswordBasedCipher.decrypt")
    @js.native
    def decrypt(cipher: CipherStatic, ciphertext: String, password: String, cfg: CipherOption): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
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
    @JSImport("crypto-js", "lib.PasswordBasedCipher.decrypt")
    @js.native
    def decrypt(
      cipher: CipherStatic,
      ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams,
      password: String
    ): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
    @JSImport("crypto-js", "lib.PasswordBasedCipher.decrypt")
    @js.native
    def decrypt(
      cipher: CipherStatic,
      ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams,
      password: String,
      cfg: CipherOption
    ): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
    
    @JSImport("crypto-js", "lib.PasswordBasedCipher.encrypt")
    @js.native
    def encrypt(cipher: CipherStatic, message: String, password: String): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
    @JSImport("crypto-js", "lib.PasswordBasedCipher.encrypt")
    @js.native
    def encrypt(cipher: CipherStatic, message: String, password: String, cfg: CipherOption): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
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
    @JSImport("crypto-js", "lib.PasswordBasedCipher.encrypt")
    @js.native
    def encrypt(
      cipher: CipherStatic,
      message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
      password: String
    ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
    @JSImport("crypto-js", "lib.PasswordBasedCipher.encrypt")
    @js.native
    def encrypt(
      cipher: CipherStatic,
      message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
      password: String,
      cfg: CipherOption
    ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
  }
  
  /**
    * A cipher wrapper that returns ciphertext as a serializable cipher params object.
    */
  object SerializableCipher {
    
    @JSImport("crypto-js", "lib.SerializableCipher.decrypt")
    @js.native
    def decrypt(cipher: CipherStatic, ciphertext: String, key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
    @JSImport("crypto-js", "lib.SerializableCipher.decrypt")
    @js.native
    def decrypt(
      cipher: CipherStatic,
      ciphertext: String,
      key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
      cfg: CipherOption
    ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
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
    @JSImport("crypto-js", "lib.SerializableCipher.decrypt")
    @js.native
    def decrypt(
      cipher: CipherStatic,
      ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
      key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
    ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
    @JSImport("crypto-js", "lib.SerializableCipher.decrypt")
    @js.native
    def decrypt(
      cipher: CipherStatic,
      ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
      key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
      cfg: CipherOption
    ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
    
    @JSImport("crypto-js", "lib.SerializableCipher.encrypt")
    @js.native
    def encrypt(cipher: CipherStatic, message: String, key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
    @JSImport("crypto-js", "lib.SerializableCipher.encrypt")
    @js.native
    def encrypt(
      cipher: CipherStatic,
      message: String,
      key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
      cfg: CipherOption
    ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
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
    @JSImport("crypto-js", "lib.SerializableCipher.encrypt")
    @js.native
    def encrypt(
      cipher: CipherStatic,
      message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
      key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
    ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
    @JSImport("crypto-js", "lib.SerializableCipher.encrypt")
    @js.native
    def encrypt(
      cipher: CipherStatic,
      message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
      key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
      cfg: CipherOption
    ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
    
    @JSImport("crypto-js", "lib.SerializableCipher._parse")
    @js.native
    def parse(ciphertext: String, format: Format_): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
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
    @JSImport("crypto-js", "lib.SerializableCipher._parse")
    @js.native
    def parse(ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams, format: Format_): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
  }
  
  object WordArray {
    
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
    @JSImport("crypto-js", "lib.WordArray.create")
    @js.native
    def create(): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
    @JSImport("crypto-js", "lib.WordArray.create")
    @js.native
    def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
    @JSImport("crypto-js", "lib.WordArray.create")
    @js.native
    def create(words: js.Array[Double]): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
    @JSImport("crypto-js", "lib.WordArray.create")
    @js.native
    def create(words: js.Array[Double], sigBytes: Double): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
    
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
    @JSImport("crypto-js", "lib.WordArray.random")
    @js.native
    def random(nBytes: Double): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
  }
}
