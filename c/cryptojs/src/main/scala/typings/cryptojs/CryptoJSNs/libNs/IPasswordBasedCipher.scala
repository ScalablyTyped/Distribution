package typings.cryptojs.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPasswordBasedCipher[C /* <: IPasswordBasedCipherCfg */] extends Base {
  var cfg: C = js.native
  def decrypt(cipher: Cipher, ciphertext: String, password: String): WordArray = js.native
  def decrypt(cipher: Cipher, ciphertext: String, password: String, cfg: C): WordArray = js.native
  def decrypt(cipher: Cipher, ciphertext: CipherParamsData, password: String): WordArray = js.native
  def decrypt(cipher: Cipher, ciphertext: CipherParamsData, password: String, cfg: C): WordArray = js.native
  def encrypt(cipher: Cipher, message: String, password: String): CipherParams = js.native
  def encrypt(cipher: Cipher, message: String, password: String, cfg: C): CipherParams = js.native
  def encrypt(cipher: Cipher, message: WordArray, password: String): CipherParams = js.native
  def encrypt(cipher: Cipher, message: WordArray, password: String, cfg: C): CipherParams = js.native
}

