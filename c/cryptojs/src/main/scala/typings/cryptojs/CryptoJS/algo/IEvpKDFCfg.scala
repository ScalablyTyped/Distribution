package typings.cryptojs.CryptoJS.algo

import typings.cryptojs.CryptoJS.lib.Hasher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvpKDFCfg extends js.Object {
  //default 128/32
  var hasher: js.UndefOr[Hasher] = js.native
  //default MD5, or SHA1 with PBKDF2
  var iterations: js.UndefOr[Double] = js.native
  var keySize: js.UndefOr[Double] = js.native
}

object IEvpKDFCfg {
  @scala.inline
  def apply(): IEvpKDFCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEvpKDFCfg]
  }
  @scala.inline
  implicit class IEvpKDFCfgOps[Self <: IEvpKDFCfg] (val x: Self) extends AnyVal {
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
    def setHasher(value: Hasher): Self = this.set("hasher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasher: Self = this.set("hasher", js.undefined)
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    @scala.inline
    def setKeySize(value: Double): Self = this.set("keySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySize: Self = this.set("keySize", js.undefined)
  }
  
}

