package typings.cryptojs.CryptoJSNs.libNs

import typings.cryptojs.CryptoJSNs.encNs.IEncoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArray extends Base {
  var sigBytes: Double = js.native
  var words: js.Array[Double] = js.native
  def clamp(): Unit = js.native
  def concat(wordArray: WordArray): WordArray = js.native
  def create(): WordArray = js.native
  def create(typedArray: SomeArray): WordArray = js.native
  def create(words: js.Array[Double]): WordArray = js.native
  def create(words: js.Array[Double], sigBytes: Double): WordArray = js.native
  def init(): Unit = js.native
  def init(typedArray: SomeArray): Unit = js.native
  def init(words: js.Array[Double]): Unit = js.native
  def init(words: js.Array[Double], sigBytes: Double): Unit = js.native
  def random(nBytes: Double): WordArray = js.native
  def toString(encoder: IEncoder): String = js.native
}

