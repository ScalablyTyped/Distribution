package typings.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//tparam C - Configuration type
@js.native
trait ICipher[C] extends BufferedBlockAlgorithm {
  
  def _createHelper(cipher: Cipher): ICipherHelper[C] = js.native
  
  var cfg: C = js.native
  
  def create(): ICipher[C] = js.native
  def create(xformMode: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], cfg: C): ICipher[C] = js.native
  def create(xformMode: js.UndefOr[scala.Nothing], key: WordArray): ICipher[C] = js.native
  def create(xformMode: js.UndefOr[scala.Nothing], key: WordArray, cfg: C): ICipher[C] = js.native
  def create(xformMode: Double): ICipher[C] = js.native
  def create(xformMode: Double, key: js.UndefOr[scala.Nothing], cfg: C): ICipher[C] = js.native
  def create(xformMode: Double, key: WordArray): ICipher[C] = js.native
  def create(xformMode: Double, key: WordArray, cfg: C): ICipher[C] = js.native
  
  def createDecryptor(key: WordArray): ICipher[C] = js.native
  def createDecryptor(key: WordArray, cfg: C): ICipher[C] = js.native
  
  def createEncryptor(key: WordArray): ICipher[C] = js.native
  def createEncryptor(key: WordArray, cfg: C): ICipher[C] = js.native
  
  def finalize(dataUpdate: String): WordArray = js.native
  def finalize(dataUpdate: WordArray): WordArray = js.native
  
  def init(): Unit = js.native
  def init(xformMode: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], cfg: C): Unit = js.native
  def init(xformMode: js.UndefOr[scala.Nothing], key: WordArray): Unit = js.native
  def init(xformMode: js.UndefOr[scala.Nothing], key: WordArray, cfg: C): Unit = js.native
  def init(xformMode: Double): Unit = js.native
  def init(xformMode: Double, key: js.UndefOr[scala.Nothing], cfg: C): Unit = js.native
  def init(xformMode: Double, key: WordArray): Unit = js.native
  def init(xformMode: Double, key: WordArray, cfg: C): Unit = js.native
  
  var ivSize: Double = js.native
  
  var keySize: Double = js.native
  
  def process(dataUpdate: String): WordArray = js.native
  def process(dataUpdate: WordArray): WordArray = js.native
}
