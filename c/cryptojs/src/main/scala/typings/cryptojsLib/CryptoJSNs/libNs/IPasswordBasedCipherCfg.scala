package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPasswordBasedCipherCfg extends ISerializableCipherCfg {
  var kdf: js.UndefOr[cryptojsLib.CryptoJSNs.kdfNs.IKdfImpl] = js.undefined
}

object IPasswordBasedCipherCfg {
  @scala.inline
  def apply(
    format: cryptojsLib.CryptoJSNs.formatNs.IFormatter = null,
    iv: WordArray = null,
    kdf: cryptojsLib.CryptoJSNs.kdfNs.IKdfImpl = null,
    mode: cryptojsLib.CryptoJSNs.modeNs.IBlockCipherModeImpl = null,
    padding: cryptojsLib.CryptoJSNs.padNs.IPaddingImpl = null
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

