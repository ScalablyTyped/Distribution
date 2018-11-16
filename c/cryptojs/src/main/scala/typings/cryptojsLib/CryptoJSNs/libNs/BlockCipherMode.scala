package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockCipherMode extends Base {
  def create(): BlockCipherMode = js.native
  def create(cipher: Cipher): BlockCipherMode = js.native
  def create(cipher: Cipher, iv: js.Array[scala.Double]): BlockCipherMode = js.native
  def createDecryptor(cipher: Cipher, iv: js.Array[scala.Double]): cryptojsLib.CryptoJSNs.modeNs.IBlockCipherDecryptor = js.native
  def createEncryptor(cipher: Cipher, iv: js.Array[scala.Double]): cryptojsLib.CryptoJSNs.modeNs.IBlockCipherEncryptor = js.native
  def init(): scala.Unit = js.native
  def init(cipher: Cipher): scala.Unit = js.native
  def init(cipher: Cipher, iv: js.Array[scala.Double]): scala.Unit = js.native
}

