package typings.cryptojs.CryptoJS.lib

import typings.cryptojs.CryptoJS.format.IFormatter
import typings.cryptojs.CryptoJS.mode.IBlockCipherModeImpl
import typings.cryptojs.CryptoJS.pad.IPaddingImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherParamsData extends js.Object {
  var algorithm: js.UndefOr[Cipher] = js.native
  var blockSize: js.UndefOr[Double] = js.native
  var ciphertext: js.UndefOr[WordArray] = js.native
  var formatter: js.UndefOr[IFormatter] = js.native
  var iv: js.UndefOr[WordArray] = js.native
  var key: js.UndefOr[WordArray] = js.native
  var mode: js.UndefOr[IBlockCipherModeImpl] = js.native
  var padding: js.UndefOr[IPaddingImpl] = js.native
  var salt: js.UndefOr[WordArray] = js.native
}

object CipherParamsData {
  @scala.inline
  def apply(): CipherParamsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CipherParamsData]
  }
  @scala.inline
  implicit class CipherParamsDataOps[Self <: CipherParamsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithm(value: Cipher): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockSize: Self = this.set("blockSize", js.undefined)
    @scala.inline
    def setCiphertext(value: WordArray): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphertext: Self = this.set("ciphertext", js.undefined)
    @scala.inline
    def setFormatter(value: IFormatter): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setIv(value: WordArray): Self = this.set("iv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    @scala.inline
    def setKey(value: WordArray): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMode(value: IBlockCipherModeImpl): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPadding(value: IPaddingImpl): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setSalt(value: WordArray): Self = this.set("salt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
  }
  
}

