package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBlockCipherCfg extends js.Object {
  var iv: js.UndefOr[WordArray] = js.undefined
  var mode: js.UndefOr[cryptojsLib.CryptoJSNs.modeNs.IBlockCipherModeImpl] = js.undefined
  //default CBC
  var padding: js.UndefOr[cryptojsLib.CryptoJSNs.padNs.IPaddingImpl] = js.undefined
}

object IBlockCipherCfg {
  @scala.inline
  def apply(
    iv: WordArray = null,
    mode: cryptojsLib.CryptoJSNs.modeNs.IBlockCipherModeImpl = null,
    padding: cryptojsLib.CryptoJSNs.padNs.IPaddingImpl = null
  ): IBlockCipherCfg = {
    val __obj = js.Dynamic.literal()
    if (iv != null) __obj.updateDynamic("iv")(iv)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[IBlockCipherCfg]
  }
}

