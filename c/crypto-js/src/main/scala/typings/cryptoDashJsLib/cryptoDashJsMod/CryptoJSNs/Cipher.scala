package typings
package cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cipher extends Base {
  def createDecryptor(secretPassphrase: java.lang.String): Decryptor = js.native
  def createDecryptor(secretPassphrase: java.lang.String, option: CipherOption): Decryptor = js.native
  def createEncryptor(secretPassphrase: java.lang.String): Encryptor = js.native
  def createEncryptor(secretPassphrase: java.lang.String, option: CipherOption): Encryptor = js.native
}

