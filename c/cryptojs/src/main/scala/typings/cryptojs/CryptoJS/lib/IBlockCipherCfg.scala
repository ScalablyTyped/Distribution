package typings.cryptojs.CryptoJS.lib

import typings.cryptojs.CryptoJS.mode.IBlockCipherModeImpl
import typings.cryptojs.CryptoJS.pad.IPaddingImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlockCipherCfg extends js.Object {
  var iv: js.UndefOr[WordArray] = js.native
  var mode: js.UndefOr[IBlockCipherModeImpl] = js.native
  //default CBC
  var padding: js.UndefOr[IPaddingImpl] = js.native
}

object IBlockCipherCfg {
  @scala.inline
  def apply(): IBlockCipherCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBlockCipherCfg]
  }
  @scala.inline
  implicit class IBlockCipherCfgOps[Self <: IBlockCipherCfg] (val x: Self) extends AnyVal {
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
    def setIv(value: WordArray): Self = this.set("iv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    @scala.inline
    def setMode(value: IBlockCipherModeImpl): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPadding(value: IPaddingImpl): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

