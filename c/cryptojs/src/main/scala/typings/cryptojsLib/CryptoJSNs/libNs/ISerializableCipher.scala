package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//tparam C - Configuration type
@js.native
trait ISerializableCipher[C /* <: ISerializableCipherCfg */] extends Base {
  var cfg: C = js.native
  def decrypt(cipher: Cipher, ciphertext: CipherParamsData, key: WordArray): WordArray = js.native
  def decrypt(cipher: Cipher, ciphertext: CipherParamsData, key: WordArray, cfg: C): WordArray = js.native
  def decrypt(cipher: Cipher, ciphertext: java.lang.String, key: WordArray): WordArray = js.native
  def decrypt(cipher: Cipher, ciphertext: java.lang.String, key: WordArray, cfg: C): WordArray = js.native
  def encrypt(cipher: Cipher, message: WordArray, key: WordArray): CipherParams = js.native
  def encrypt(cipher: Cipher, message: WordArray, key: WordArray, cfg: C): CipherParams = js.native
  def encrypt(cipher: Cipher, message: java.lang.String, key: WordArray): CipherParams = js.native
  def encrypt(cipher: Cipher, message: java.lang.String, key: WordArray, cfg: C): CipherParams = js.native
}

