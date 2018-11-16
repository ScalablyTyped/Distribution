package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//tparam C - Configuration type
@js.native
trait ICipher[C] extends BufferedBlockAlgorithm {
  var cfg: C = js.native
  var ivSize: scala.Double = js.native
  var keySize: scala.Double = js.native
  def _createHelper(cipher: Cipher): ICipherHelper[C] = js.native
  def create(): ICipher[C] = js.native
  def create(xformMode: scala.Double): ICipher[C] = js.native
  def create(xformMode: scala.Double, key: WordArray): ICipher[C] = js.native
  def create(xformMode: scala.Double, key: WordArray, cfg: C): ICipher[C] = js.native
  def createDecryptor(key: WordArray): ICipher[C] = js.native
  def createDecryptor(key: WordArray, cfg: C): ICipher[C] = js.native
  def createEncryptor(key: WordArray): ICipher[C] = js.native
  def createEncryptor(key: WordArray, cfg: C): ICipher[C] = js.native
  def finalize(dataUpdate: WordArray): WordArray = js.native
  def finalize(dataUpdate: java.lang.String): WordArray = js.native
  def init(): scala.Unit = js.native
  def init(xformMode: scala.Double): scala.Unit = js.native
  def init(xformMode: scala.Double, key: WordArray): scala.Unit = js.native
  def init(xformMode: scala.Double, key: WordArray, cfg: C): scala.Unit = js.native
  def process(dataUpdate: WordArray): WordArray = js.native
  def process(dataUpdate: java.lang.String): WordArray = js.native
}

