package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** see Cipher._createHelper */
@js.native
trait ICipherHelper[C] extends js.Object {
  def decrypt(ciphertext: CipherParamsData, key: WordArray): WordArray = js.native
  def decrypt(ciphertext: CipherParamsData, key: WordArray, cfg: C): WordArray = js.native
  def decrypt(ciphertext: CipherParamsData, password: java.lang.String): WordArray = js.native
  def decrypt(ciphertext: CipherParamsData, password: java.lang.String, cfg: C): WordArray = js.native
  def decrypt(ciphertext: java.lang.String, key: WordArray): WordArray = js.native
  def decrypt(ciphertext: java.lang.String, key: WordArray, cfg: C): WordArray = js.native
  def decrypt(ciphertext: java.lang.String, password: java.lang.String): WordArray = js.native
  def decrypt(ciphertext: java.lang.String, password: java.lang.String, cfg: C): WordArray = js.native
  def encrypt(message: WordArray, key: WordArray): CipherParams = js.native
  def encrypt(message: WordArray, key: WordArray, cfg: C): CipherParams = js.native
  def encrypt(message: WordArray, password: java.lang.String): CipherParams = js.native
  def encrypt(message: WordArray, password: java.lang.String, cfg: C): CipherParams = js.native
  def encrypt(message: java.lang.String, key: WordArray): CipherParams = js.native
  def encrypt(message: java.lang.String, key: WordArray, cfg: C): CipherParams = js.native
  def encrypt(message: java.lang.String, password: java.lang.String): CipherParams = js.native
  def encrypt(message: java.lang.String, password: java.lang.String, cfg: C): CipherParams = js.native
}

