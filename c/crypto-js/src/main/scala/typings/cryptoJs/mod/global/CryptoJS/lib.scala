package typings.cryptoJs.mod.global.CryptoJS

import typings.cryptoJs.anon.PartialCipherParams
import typings.cryptoJs.mod.Cipher
import typings.cryptoJs.mod.CipherHelper
import typings.cryptoJs.mod.CipherOption
import typings.cryptoJs.mod.CipherStatic
import typings.cryptoJs.mod.Encoder
import typings.cryptoJs.mod.Format_
import typings.cryptoJs.mod.HasherHelper
import typings.cryptoJs.mod.HasherStatic
import typings.cryptoJs.mod.HmacHasherHelper
import typings.cryptoJs.mod.Mode_
import typings.cryptoJs.mod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CryptoJS.lib")
@js.native
object lib extends js.Object {
  
  /**
    * Abstract base block cipher mode template.
    */
  val BlockCipherMode: js.Any = js.native
  
  val BufferedBlockAlgorithm: js.Any = js.native
  
  /**
    * Base object for prototypal inheritance.
    */
  @js.native
  object Base extends js.Object {
    
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
    def mixIn(properties: js.Object): js.Any = js.native
  }
  
  @js.native
  object Cipher extends js.Object {
    
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
    def _createHelper(cipher: typings.cryptoJs.mod.Cipher): CipherHelper = js.native
  }
  
  /**
    * A collection of cipher parameters.
    */
  @js.native
  trait CipherParams extends js.Object {
    
    /**
      * The cipher algorithm.
      */
    var algorithm: CipherStatic = js.native
    
    /**
      * The block size of the cipher.
      */
    var blockSize: Double = js.native
    
    /**
      * The raw ciphertext.
      */
    var ciphertext: WordArray = js.native
    
    /**
      * The default formatting strategy to convert this cipher params object to a string.
      */
    var formatter: Format_ = js.native
    
    /**
      * The IV used in the ciphering operation.
      */
    var iv: WordArray = js.native
    
    /**
      * The key to this ciphertext.
      */
    var key: WordArray = js.native
    
    /**
      * The block mode used in the ciphering operation.
      */
    var mode: Mode_ = js.native
    
    /**
      * The padding scheme used in the ciphering operation.
      */
    var padding: Padding = js.native
    
    /**
      * The salt used with a key derivation function.
      */
    var salt: WordArray = js.native
    
    def toString(formatter: Format_): String = js.native
  }
  @js.native
  object CipherParams extends js.Object {
    
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
    def create(cipherParams: PartialCipherParams): CipherParams = js.native
  }
  
  @js.native
  object Hasher extends js.Object {
    
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
    def _createHelper(hasher: HasherStatic): HasherHelper = js.native
    
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
    def _createHmacHelper(hasher: HasherStatic): HmacHasherHelper = js.native
  }
  
  /**
    * A serializable cipher wrapper that derives the key from a password,
    * and returns ciphertext as a serializable cipher params object.
    */
  @js.native
  object PasswordBasedCipher extends js.Object {
    
    def decrypt(cipher: CipherStatic, ciphertext: String, password: String): WordArray = js.native
    def decrypt(cipher: CipherStatic, ciphertext: String, password: String, cfg: CipherOption): WordArray = js.native
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
    def decrypt(cipher: CipherStatic, ciphertext: CipherParams, password: String): WordArray = js.native
    def decrypt(cipher: CipherStatic, ciphertext: CipherParams, password: String, cfg: CipherOption): WordArray = js.native
    
    def encrypt(cipher: CipherStatic, message: String, password: String): CipherParams = js.native
    def encrypt(cipher: CipherStatic, message: String, password: String, cfg: CipherOption): CipherParams = js.native
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
    def encrypt(cipher: CipherStatic, message: WordArray, password: String): CipherParams = js.native
    def encrypt(cipher: CipherStatic, message: WordArray, password: String, cfg: CipherOption): CipherParams = js.native
  }
  
  /**
    * A cipher wrapper that returns ciphertext as a serializable cipher params object.
    */
  @js.native
  object SerializableCipher extends js.Object {
    
    def _parse(ciphertext: String, format: Format_): CipherParams = js.native
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
    def _parse(ciphertext: CipherParams, format: Format_): CipherParams = js.native
    
    def decrypt(cipher: CipherStatic, ciphertext: String, key: WordArray): CipherParams = js.native
    def decrypt(cipher: CipherStatic, ciphertext: String, key: WordArray, cfg: CipherOption): CipherParams = js.native
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
    def decrypt(cipher: CipherStatic, ciphertext: WordArray, key: WordArray): CipherParams = js.native
    def decrypt(cipher: CipherStatic, ciphertext: WordArray, key: WordArray, cfg: CipherOption): CipherParams = js.native
    
    def encrypt(cipher: CipherStatic, message: String, key: WordArray): CipherParams = js.native
    def encrypt(cipher: CipherStatic, message: String, key: WordArray, cfg: CipherOption): CipherParams = js.native
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
    def encrypt(cipher: CipherStatic, message: WordArray, key: WordArray): CipherParams = js.native
    def encrypt(cipher: CipherStatic, message: WordArray, key: WordArray, cfg: CipherOption): CipherParams = js.native
  }
  
  /**
    * Abstract base stream cipher template.
    */
  @js.native
  trait StreamCipher extends Cipher {
    
    /**
      * The number of 32-bit words this cipher operates on. Default: 1 (32 bits)
      */
    var blockSize: Double = js.native
  }
  
  /**
    * An array of 32-bit words.
    */
  @js.native
  trait WordArray extends js.Object {
    
    /**
      * Removes insignificant bits.
      *
      * @example
      *
      *     wordArray.clamp();
      */
    def clamp(): Unit = js.native
    
    /**
      * Concatenates a word array to this word array.
      *
      * @param wordArray The word array to append.
      *
      * @return This word array.
      *
      * @example
      *
      *     wordArray1.concat(wordArray2);
      */
    def concat(wordArray: WordArray): this.type = js.native
    
    /**
      * The number of significant bytes in this word array.
      */
    var sigBytes: Double = js.native
    
    def toString(encoder: Encoder): String = js.native
    
    /**
      * The array of 32-bit words.
      */
    var words: js.Array[Double] = js.native
  }
  @js.native
  object WordArray extends js.Object {
    
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
    def create(): WordArray = js.native
    def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): WordArray = js.native
    def create(words: js.Array[Double]): WordArray = js.native
    def create(words: js.Array[Double], sigBytes: Double): WordArray = js.native
    
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
    def random(nBytes: Double): WordArray = js.native
  }
}
