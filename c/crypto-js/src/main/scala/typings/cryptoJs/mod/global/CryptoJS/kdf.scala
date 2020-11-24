package typings.cryptoJs.mod.global.CryptoJS

import typings.cryptoJs.mod.CipherParams
import typings.cryptoJs.mod.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CryptoJS.kdf")
@js.native
object kdf extends js.Object {
  
  /**
    * OpenSSL key derivation function.
    */
  @js.native
  object OpenSSL extends js.Object {
    
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
    def execute(password: String, keySize: Double, ivSize: Double): CipherParams = js.native
    def execute(password: String, keySize: Double, ivSize: Double, salt: String): CipherParams = js.native
    def execute(password: String, keySize: Double, ivSize: Double, salt: WordArray): CipherParams = js.native
  }
}
