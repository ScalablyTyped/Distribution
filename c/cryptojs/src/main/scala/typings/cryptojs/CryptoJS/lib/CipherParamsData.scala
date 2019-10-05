package typings.cryptojs.CryptoJS.lib

import typings.cryptojs.CryptoJS.format.IFormatter
import typings.cryptojs.CryptoJS.mode.IBlockCipherModeImpl
import typings.cryptojs.CryptoJS.pad.IPaddingImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CipherParamsData extends js.Object {
  var algorithm: js.UndefOr[Cipher] = js.undefined
  var blockSize: js.UndefOr[Double] = js.undefined
  var ciphertext: js.UndefOr[WordArray] = js.undefined
  var formatter: js.UndefOr[IFormatter] = js.undefined
  var iv: js.UndefOr[WordArray] = js.undefined
  var key: js.UndefOr[WordArray] = js.undefined
  var mode: js.UndefOr[IBlockCipherModeImpl] = js.undefined
  var padding: js.UndefOr[IPaddingImpl] = js.undefined
  var salt: js.UndefOr[WordArray] = js.undefined
}

object CipherParamsData {
  @scala.inline
  def apply(
    algorithm: Cipher = null,
    blockSize: Int | Double = null,
    ciphertext: WordArray = null,
    formatter: IFormatter = null,
    iv: WordArray = null,
    key: WordArray = null,
    mode: IBlockCipherModeImpl = null,
    padding: IPaddingImpl = null,
    salt: WordArray = null
  ): CipherParamsData = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (ciphertext != null) __obj.updateDynamic("ciphertext")(ciphertext)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (iv != null) __obj.updateDynamic("iv")(iv)
    if (key != null) __obj.updateDynamic("key")(key)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    __obj.asInstanceOf[CipherParamsData]
  }
}

