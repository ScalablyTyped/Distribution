package typings.cryptojs.CryptoJSNs.libNs

import typings.cryptojs.CryptoJSNs.formatNs.IFormatter
import typings.cryptojs.CryptoJSNs.kdfNs.IKdfImpl
import typings.cryptojs.CryptoJSNs.modeNs.IBlockCipherModeImpl
import typings.cryptojs.CryptoJSNs.padNs.IPaddingImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPasswordBasedCipherCfg extends ISerializableCipherCfg {
  var kdf: js.UndefOr[IKdfImpl] = js.undefined
}

object IPasswordBasedCipherCfg {
  @scala.inline
  def apply(
    format: IFormatter = null,
    iv: WordArray = null,
    kdf: IKdfImpl = null,
    mode: IBlockCipherModeImpl = null,
    padding: IPaddingImpl = null
  ): IPasswordBasedCipherCfg = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (iv != null) __obj.updateDynamic("iv")(iv)
    if (kdf != null) __obj.updateDynamic("kdf")(kdf)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[IPasswordBasedCipherCfg]
  }
}

