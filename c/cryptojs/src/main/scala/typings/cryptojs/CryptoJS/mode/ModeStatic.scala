package typings.cryptojs.CryptoJS.mode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModeStatic extends js.Object {
  var CBC: typings.cryptojs.CryptoJS.mode.CBC = js.native
  var CFB: typings.cryptojs.CryptoJS.mode.CFB = js.native
  var CTR: typings.cryptojs.CryptoJS.mode.CTR = js.native
  var CTRGladman: typings.cryptojs.CryptoJS.mode.CTRGladman = js.native
  var ECB: typings.cryptojs.CryptoJS.mode.ECB = js.native
  var OFB: typings.cryptojs.CryptoJS.mode.OFB = js.native
}

object ModeStatic {
  @scala.inline
  def apply(CBC: CBC, CFB: CFB, CTR: CTR, CTRGladman: CTRGladman, ECB: ECB, OFB: OFB): ModeStatic = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], CTRGladman = CTRGladman.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeStatic]
  }
  @scala.inline
  implicit class ModeStaticOps[Self <: ModeStatic] (val x: Self) extends AnyVal {
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
    def setCBC(value: CBC): Self = this.set("CBC", value.asInstanceOf[js.Any])
    @scala.inline
    def setCFB(value: CFB): Self = this.set("CFB", value.asInstanceOf[js.Any])
    @scala.inline
    def setCTR(value: CTR): Self = this.set("CTR", value.asInstanceOf[js.Any])
    @scala.inline
    def setCTRGladman(value: CTRGladman): Self = this.set("CTRGladman", value.asInstanceOf[js.Any])
    @scala.inline
    def setECB(value: ECB): Self = this.set("ECB", value.asInstanceOf[js.Any])
    @scala.inline
    def setOFB(value: OFB): Self = this.set("OFB", value.asInstanceOf[js.Any])
  }
  
}

