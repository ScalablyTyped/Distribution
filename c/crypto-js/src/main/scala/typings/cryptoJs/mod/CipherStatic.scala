package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherStatic extends js.Object {
  
  /**
    * Initializes a newly created cipher.
    *
    * @param xformMode Either the encryption or decryption transormation mode constant.
    * @param key The key.
    * @param cfg (Optional) The configuration options to use for this operation.
    *
    * @example
    *
    *     var cipher = CryptoJS.algo.AES.create(CryptoJS.algo.AES._ENC_XFORM_MODE, keyWordArray, { iv: ivWordArray });
    */
  def create(xformMode: Double, key: WordArray): Cipher = js.native
  def create(xformMode: Double, key: WordArray, cfg: CipherOption): Cipher = js.native
  
  /**
    * Creates this cipher in decryption mode.
    *
    * @param key The key.
    * @param cfg (Optional) The configuration options to use for this operation.
    *
    * @return A cipher instance.
    *
    * @example
    *
    *     var cipher = CryptoJS.algo.AES.createDecryptor(keyWordArray, { iv: ivWordArray });
    */
  def createDecryptor(key: WordArray): Cipher = js.native
  def createDecryptor(key: WordArray, cfg: CipherOption): Cipher = js.native
  
  /**
    * Creates this cipher in encryption mode.
    *
    * @param key The key.
    * @param cfg (Optional) The configuration options to use for this operation.
    *
    * @return A cipher instance.
    *
    * @example
    *
    *     var cipher = CryptoJS.algo.AES.createEncryptor(keyWordArray, { iv: ivWordArray });
    */
  def createEncryptor(key: WordArray): Cipher = js.native
  def createEncryptor(key: WordArray, cfg: CipherOption): Cipher = js.native
}
