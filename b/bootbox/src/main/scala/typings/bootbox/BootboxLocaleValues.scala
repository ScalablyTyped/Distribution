package typings.bootbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootboxLocaleValues extends js.Object {
  var CANCEL: String = js.native
  var CONFIRM: String = js.native
  var OK: String = js.native
}

object BootboxLocaleValues {
  @scala.inline
  def apply(CANCEL: String, CONFIRM: String, OK: String): BootboxLocaleValues = {
    val __obj = js.Dynamic.literal(CANCEL = CANCEL.asInstanceOf[js.Any], CONFIRM = CONFIRM.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxLocaleValues]
  }
  @scala.inline
  implicit class BootboxLocaleValuesOps[Self <: BootboxLocaleValues] (val x: Self) extends AnyVal {
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
    def setCANCEL(value: String): Self = this.set("CANCEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setCONFIRM(value: String): Self = this.set("CONFIRM", value.asInstanceOf[js.Any])
    @scala.inline
    def setOK(value: String): Self = this.set("OK", value.asInstanceOf[js.Any])
  }
  
}

