package typings
package cryptoDashJsLib.cryptoDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherHelper extends js.Object {
  def decrypt(encryptedMessage: WordArray, secretPassphrase: WordArray): DecryptedMessage = js.native
  def decrypt(encryptedMessage: WordArray, secretPassphrase: WordArray, option: CipherOption): DecryptedMessage = js.native
  def decrypt(encryptedMessage: WordArray, secretPassphrase: java.lang.String): DecryptedMessage = js.native
  def decrypt(encryptedMessage: WordArray, secretPassphrase: java.lang.String, option: CipherOption): DecryptedMessage = js.native
  def decrypt(encryptedMessage: java.lang.String, secretPassphrase: WordArray): DecryptedMessage = js.native
  def decrypt(encryptedMessage: java.lang.String, secretPassphrase: WordArray, option: CipherOption): DecryptedMessage = js.native
  def decrypt(encryptedMessage: java.lang.String, secretPassphrase: java.lang.String): DecryptedMessage = js.native
  def decrypt(encryptedMessage: java.lang.String, secretPassphrase: java.lang.String, option: CipherOption): DecryptedMessage = js.native
  def encrypt(message: LibWordArray, secretPassphrase: WordArray): WordArray = js.native
  def encrypt(message: LibWordArray, secretPassphrase: WordArray, option: CipherOption): WordArray = js.native
  def encrypt(message: LibWordArray, secretPassphrase: java.lang.String): WordArray = js.native
  def encrypt(message: LibWordArray, secretPassphrase: java.lang.String, option: CipherOption): WordArray = js.native
  def encrypt(message: java.lang.String, secretPassphrase: WordArray): WordArray = js.native
  def encrypt(message: java.lang.String, secretPassphrase: WordArray, option: CipherOption): WordArray = js.native
  def encrypt(message: java.lang.String, secretPassphrase: java.lang.String): WordArray = js.native
  def encrypt(message: java.lang.String, secretPassphrase: java.lang.String, option: CipherOption): WordArray = js.native
}

