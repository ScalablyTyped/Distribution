package typings.cryptojs.CryptoJSNs.padNs

import typings.cryptojs.CryptoJSNs.libNs.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaddingImpl extends js.Object {
  def pad(data: WordArray, blockSize: Double): Unit
  def unpad(data: WordArray): Unit
}

object IPaddingImpl {
  @scala.inline
  def apply(pad: (WordArray, Double) => Unit, unpad: WordArray => Unit): IPaddingImpl = {
    val __obj = js.Dynamic.literal(pad = js.Any.fromFunction2(pad), unpad = js.Any.fromFunction1(unpad))
  
    __obj.asInstanceOf[IPaddingImpl]
  }
}

