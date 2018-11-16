package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPasswordBasedCipher[C /* <: IPasswordBasedCipherCfg */] extends Base {
  var cfg: C = js.native
  def decrypt(cipher: Cipher, ciphertext: CipherParamsData, password: java.lang.String): WordArray = js.native
  def decrypt(cipher: Cipher, ciphertext: CipherParamsData, password: java.lang.String, cfg: C): WordArray = js.native
  def decrypt(cipher: Cipher, ciphertext: java.lang.String, password: java.lang.String): WordArray = js.native
  def decrypt(cipher: Cipher, ciphertext: java.lang.String, password: java.lang.String, cfg: C): WordArray = js.native
  def encrypt(cipher: Cipher, message: WordArray, password: java.lang.String): CipherParams = js.native
  def encrypt(cipher: Cipher, message: WordArray, password: java.lang.String, cfg: C): CipherParams = js.native
  def encrypt(cipher: Cipher, message: java.lang.String, password: java.lang.String): CipherParams = js.native
  def encrypt(cipher: Cipher, message: java.lang.String, password: java.lang.String, cfg: C): CipherParams = js.native
}

