package typings.cryptojs.CryptoJS.lib

import typings.cryptojs.CryptoJS.format.IFormatter
import typings.cryptojs.CryptoJS.mode.IBlockCipherModeImpl
import typings.cryptojs.CryptoJS.pad.IPaddingImpl
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
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISerializableCipherCfg]
  }
}

