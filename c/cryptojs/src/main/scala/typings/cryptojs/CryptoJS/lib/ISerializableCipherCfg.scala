package typings.cryptojs.CryptoJS.lib

import typings.cryptojs.CryptoJS.format.IFormatter
import typings.cryptojs.CryptoJS.mode.IBlockCipherModeImpl
import typings.cryptojs.CryptoJS.pad.IPaddingImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISerializableCipherCfg extends js.Object {
  var format: js.UndefOr[IFormatter] = js.native
  //default OpenSSLFormatter
  var iv: js.UndefOr[WordArray] = js.native
  var mode: js.UndefOr[IBlockCipherModeImpl] = js.native
  var padding: js.UndefOr[IPaddingImpl] = js.native
}

object ISerializableCipherCfg {
  @scala.inline
  def apply(): ISerializableCipherCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISerializableCipherCfg]
  }
  @scala.inline
  implicit class ISerializableCipherCfgOps[Self <: ISerializableCipherCfg] (val x: Self) extends AnyVal {
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
    def setFormat(value: IFormatter): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
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

