package typings.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Abstract base block cipher mode template.
  */
@js.native
trait BlockCipherMode extends StObject {
  
  var Decryptor: ModeStatic = js.native
  
  var Encryptor: ModeStatic = js.native
  
  /**
    * Creates this mode for decryption.
    *
    * @param cipher A block cipher instance.
    * @param iv The IV words.
    *
    * @example
    *
    *     var mode = CryptoJS.mode.CBC.createDecryptor(cipher, iv.words);
    */
  def createDecryptor(cipher: Cipher, iv: js.Array[Double]): Mode_ = js.native
  
  /**
    * Creates this mode for encryption.
    *
    * @param cipher A block cipher instance.
    * @param iv The IV words.
    *
    * @example
    *
    *     var mode = CryptoJS.mode.CBC.createEncryptor(cipher, iv.words);
    */
  def createEncryptor(cipher: Cipher): Mode_ = js.native
  /**
    * Creates this mode for encryption.
    *
    * @param cipher A block cipher instance.
    * @param iv The IV words.
    *
    * @example
    *
    *     var mode = CryptoJS.mode.CBC.createEncryptor(cipher, iv.words);
    */
  def createEncryptor(cipher: Cipher, iv: js.Array[Double]): Mode_ = js.native
}
