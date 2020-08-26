package typings.cryptoJs.anon

import typings.cryptoJs.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CBC extends js.Object {
  var CBC: Mode = js.native
  var CFB: Mode = js.native
  var CTR: Mode = js.native
  var CTRGladman: Mode = js.native
  var ECB: Mode = js.native
  var OFB: Mode = js.native
}

object CBC {
  @scala.inline
  def apply(CBC: Mode, CFB: Mode, CTR: Mode, CTRGladman: Mode, ECB: Mode, OFB: Mode): CBC = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], CTRGladman = CTRGladman.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
    __obj.asInstanceOf[CBC]
  }
  @scala.inline
  implicit class CBCOps[Self <: CBC] (val x: Self) extends AnyVal {
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
    def setCBC(value: Mode): Self = this.set("CBC", value.asInstanceOf[js.Any])
    @scala.inline
    def setCFB(value: Mode): Self = this.set("CFB", value.asInstanceOf[js.Any])
    @scala.inline
    def setCTR(value: Mode): Self = this.set("CTR", value.asInstanceOf[js.Any])
    @scala.inline
    def setCTRGladman(value: Mode): Self = this.set("CTRGladman", value.asInstanceOf[js.Any])
    @scala.inline
    def setECB(value: Mode): Self = this.set("ECB", value.asInstanceOf[js.Any])
    @scala.inline
    def setOFB(value: Mode): Self = this.set("OFB", value.asInstanceOf[js.Any])
  }
  
}

