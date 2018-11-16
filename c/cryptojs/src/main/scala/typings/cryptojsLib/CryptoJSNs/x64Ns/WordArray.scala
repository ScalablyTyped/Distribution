package typings
package cryptojsLib.CryptoJSNs.x64Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArray
  extends cryptojsLib.CryptoJSNs.libNs.Base {
  var sigBytes: scala.Double = js.native
  var words: js.Array[Word] = js.native
  def create(): WordArray = js.native
  def create(words: js.Array[Word]): WordArray = js.native
  def create(words: js.Array[Word], sigBytes: scala.Double): WordArray = js.native
  def init(): scala.Unit = js.native
  def init(words: js.Array[Word]): scala.Unit = js.native
  def init(words: js.Array[Word], sigBytes: scala.Double): scala.Unit = js.native
  def toX32(): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
}

