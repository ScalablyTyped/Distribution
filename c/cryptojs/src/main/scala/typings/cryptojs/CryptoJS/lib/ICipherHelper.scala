package typings.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** see Cipher._createHelper */
@js.native
trait ICipherHelper[C] extends js.Object {
  def decrypt(ciphertext: String, key: WordArray): WordArray = js.native
  def decrypt(ciphertext: String, key: WordArray, cfg: C): WordArray = js.native
  def decrypt(ciphertext: String, password: String): WordArray = js.native
  def decrypt(ciphertext: String, password: String, cfg: C): WordArray = js.native
  def decrypt(ciphertext: CipherParamsData, key: WordArray): WordArray = js.native
  def decrypt(ciphertext: CipherParamsData, key: WordArray, cfg: C): WordArray = js.native
  def decrypt(ciphertext: CipherParamsData, password: String): WordArray = js.native
  def decrypt(ciphertext: CipherParamsData, password: String, cfg: C): WordArray = js.native
  def encrypt(message: String, key: WordArray): CipherParams = js.native
  def encrypt(message: String, key: WordArray, cfg: C): CipherParams = js.native
  def encrypt(message: String, password: String): CipherParams = js.native
  def encrypt(message: String, password: String, cfg: C): CipherParams = js.native
  def encrypt(message: WordArray, key: WordArray): CipherParams = js.native
  def encrypt(message: WordArray, key: WordArray, cfg: C): CipherParams = js.native
  def encrypt(message: WordArray, password: String): CipherParams = js.native
  def encrypt(message: WordArray, password: String, cfg: C): CipherParams = js.native
}

