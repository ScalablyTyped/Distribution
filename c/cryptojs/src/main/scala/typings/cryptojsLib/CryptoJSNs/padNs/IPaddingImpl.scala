package typings
package cryptojsLib.CryptoJSNs.padNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaddingImpl extends js.Object {
  def pad(data: cryptojsLib.CryptoJSNs.libNs.WordArray, blockSize: scala.Double): scala.Unit
  def unpad(data: cryptojsLib.CryptoJSNs.libNs.WordArray): scala.Unit
}

object IPaddingImpl {
  @scala.inline
  def apply(
    pad: js.Function2[cryptojsLib.CryptoJSNs.libNs.WordArray, scala.Double, scala.Unit],
    unpad: js.Function1[cryptojsLib.CryptoJSNs.libNs.WordArray, scala.Unit]
  ): IPaddingImpl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pad")(pad)
    __obj.updateDynamic("unpad")(unpad)
    __obj.asInstanceOf[IPaddingImpl]
  }
}

