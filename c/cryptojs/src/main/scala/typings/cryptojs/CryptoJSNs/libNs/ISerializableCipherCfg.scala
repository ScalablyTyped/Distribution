package typings.cryptojs.CryptoJSNs.libNs

import typings.cryptojs.CryptoJSNs.formatNs.IFormatter
import typings.cryptojs.CryptoJSNs.modeNs.IBlockCipherModeImpl
import typings.cryptojs.CryptoJSNs.padNs.IPaddingImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializableCipherCfg extends js.Object {
  var format: js.UndefOr[IFormatter] = js.undefined
  //default OpenSSLFormatter
  var iv: js.UndefOr[WordArray] = js.undefined
  var mode: js.UndefOr[IBlockCipherModeImpl] = js.undefined
  var padding: js.UndefOr[IPaddingImpl] = js.undefined
}

object ISerializableCipherCfg {
  @scala.inline
  def apply(
    format: IFormatter = null,
    iv: WordArray = null,
    mode: IBlockCipherModeImpl = null,
    padding: IPaddingImpl = null
  ): ISerializableCipherCfg = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (iv != null) __obj.updateDynamic("iv")(iv)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[ISerializableCipherCfg]
  }
}

