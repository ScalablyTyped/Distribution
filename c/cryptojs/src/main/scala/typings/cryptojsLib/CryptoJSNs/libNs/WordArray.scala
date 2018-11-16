package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArray extends Base {
  var sigBytes: scala.Double = js.native
  var words: js.Array[scala.Double] = js.native
  def clamp(): scala.Unit = js.native
  def concat(wordArray: WordArray): WordArray = js.native
  def create(): WordArray = js.native
  def create(typedArray: SomeArray): WordArray = js.native
  def create(words: js.Array[scala.Double]): WordArray = js.native
  def create(words: js.Array[scala.Double], sigBytes: scala.Double): WordArray = js.native
  def init(): scala.Unit = js.native
  def init(typedArray: SomeArray): scala.Unit = js.native
  def init(words: js.Array[scala.Double]): scala.Unit = js.native
  def init(words: js.Array[scala.Double], sigBytes: scala.Double): scala.Unit = js.native
  def random(nBytes: scala.Double): WordArray = js.native
  def toString(encoder: cryptojsLib.CryptoJSNs.encNs.IEncoder): java.lang.String = js.native
}

