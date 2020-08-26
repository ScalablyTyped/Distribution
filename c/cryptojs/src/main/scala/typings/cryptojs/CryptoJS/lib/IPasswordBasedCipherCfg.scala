package typings.cryptojs.CryptoJS.lib

import typings.cryptojs.CryptoJS.kdf.IKdfImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPasswordBasedCipherCfg extends ISerializableCipherCfg {
  var kdf: js.UndefOr[IKdfImpl] = js.native
}

object IPasswordBasedCipherCfg {
  @scala.inline
  def apply(): IPasswordBasedCipherCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPasswordBasedCipherCfg]
  }
  @scala.inline
  implicit class IPasswordBasedCipherCfgOps[Self <: IPasswordBasedCipherCfg] (val x: Self) extends AnyVal {
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
    def setKdf(value: IKdfImpl): Self = this.set("kdf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKdf: Self = this.set("kdf", js.undefined)
  }
  
}

