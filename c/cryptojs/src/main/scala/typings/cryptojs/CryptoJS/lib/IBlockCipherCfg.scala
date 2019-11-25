package typings.cryptojs.CryptoJS.lib

import typings.cryptojs.CryptoJS.mode.IBlockCipherModeImpl
import typings.cryptojs.CryptoJS.pad.IPaddingImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBlockCipherCfg extends js.Object {
  var iv: js.UndefOr[WordArray] = js.undefined
  var mode: js.UndefOr[IBlockCipherModeImpl] = js.undefined
  //default CBC
  var padding: js.UndefOr[IPaddingImpl] = js.undefined
}

object IBlockCipherCfg {
  @scala.inline
  def apply(iv: WordArray = null, mode: IBlockCipherModeImpl = null, padding: IPaddingImpl = null): IBlockCipherCfg = {
    val __obj = js.Dynamic.literal()
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlockCipherCfg]
  }
}

