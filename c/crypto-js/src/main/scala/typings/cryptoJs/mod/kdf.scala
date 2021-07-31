package typings.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdf {
  
  /**
    * OpenSSL key derivation function.
    */
  object OpenSSL {
    
    @JSImport("crypto-js", "kdf.OpenSSL")
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
    @scala.inline
    def execute(password: String, keySize: Double, ivSize: Double): CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(password.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any])).asInstanceOf[CipherParams]
    @scala.inline
    def execute(password: String, keySize: Double, ivSize: Double, salt: String): CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(password.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[CipherParams]
    @scala.inline
    def execute(password: String, keySize: Double, ivSize: Double, salt: WordArray): CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(password.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[CipherParams]
  }
}
