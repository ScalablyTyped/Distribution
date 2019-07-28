package typings.cryptojs.CryptoJSNs.x64Ns

import typings.cryptojs.CryptoJSNs.libNs.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArray extends Base {
  var sigBytes: Double = js.native
  var words: js.Array[Word] = js.native
  def create(): WordArray = js.native
  def create(words: js.Array[Word]): WordArray = js.native
  def create(words: js.Array[Word], sigBytes: Double): WordArray = js.native
  def init(): Unit = js.native
  def init(words: js.Array[Word]): Unit = js.native
  def init(words: js.Array[Word], sigBytes: Double): Unit = js.native
  def toX32(): typings.cryptojs.CryptoJSNs.libNs.WordArray = js.native
}

