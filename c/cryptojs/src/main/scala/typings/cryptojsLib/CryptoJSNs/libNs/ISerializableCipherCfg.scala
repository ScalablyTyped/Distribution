package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializableCipherCfg extends js.Object {
  var format: js.UndefOr[cryptojsLib.CryptoJSNs.formatNs.IFormatter] = js.undefined
  //default OpenSSLFormatter
  var iv: js.UndefOr[WordArray] = js.undefined
  var mode: js.UndefOr[cryptojsLib.CryptoJSNs.modeNs.IBlockCipherModeImpl] = js.undefined
  var padding: js.UndefOr[cryptojsLib.CryptoJSNs.padNs.IPaddingImpl] = js.undefined
}

object ISerializableCipherCfg {
  @scala.inline
  def apply(
    format: cryptojsLib.CryptoJSNs.formatNs.IFormatter = null,
    iv: WordArray = null,
    mode: cryptojsLib.CryptoJSNs.modeNs.IBlockCipherModeImpl = null,
    padding: cryptojsLib.CryptoJSNs.padNs.IPaddingImpl = null
  ): ISerializableCipherCfg = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (iv != null) __obj.updateDynamic("iv")(iv)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[ISerializableCipherCfg]
  }
}

