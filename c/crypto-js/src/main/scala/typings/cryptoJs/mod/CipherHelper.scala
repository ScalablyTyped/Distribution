package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherHelper extends js.Object {
  def decrypt(encryptedMessage: String, secretPassphrase: String): DecryptedMessage = js.native
  def decrypt(encryptedMessage: String, secretPassphrase: String, option: CipherOption): DecryptedMessage = js.native
  def decrypt(encryptedMessage: String, secretPassphrase: WordArray): DecryptedMessage = js.native
  def decrypt(encryptedMessage: String, secretPassphrase: WordArray, option: CipherOption): DecryptedMessage = js.native
  def decrypt(encryptedMessage: WordArray, secretPassphrase: String): DecryptedMessage = js.native
  def decrypt(encryptedMessage: WordArray, secretPassphrase: String, option: CipherOption): DecryptedMessage = js.native
  def decrypt(encryptedMessage: WordArray, secretPassphrase: WordArray): DecryptedMessage = js.native
  def decrypt(encryptedMessage: WordArray, secretPassphrase: WordArray, option: CipherOption): DecryptedMessage = js.native
  def encrypt(message: String, secretPassphrase: String): WordArray = js.native
  def encrypt(message: String, secretPassphrase: String, option: CipherOption): WordArray = js.native
  def encrypt(message: String, secretPassphrase: WordArray): WordArray = js.native
  def encrypt(message: String, secretPassphrase: WordArray, option: CipherOption): WordArray = js.native
  def encrypt(message: LibWordArray, secretPassphrase: String): WordArray = js.native
  def encrypt(message: LibWordArray, secretPassphrase: String, option: CipherOption): WordArray = js.native
  def encrypt(message: LibWordArray, secretPassphrase: WordArray): WordArray = js.native
  def encrypt(message: LibWordArray, secretPassphrase: WordArray, option: CipherOption): WordArray = js.native
}

