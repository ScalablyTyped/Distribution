package typings.chrome.anon

import typings.chrome.chromeStrings.even
import typings.chrome.chromeStrings.no
import typings.chrome.chromeStrings.odd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EVEN extends js.Object {
  var EVEN: even = js.native
  var NO: no = js.native
  var ODD: odd = js.native
}

object EVEN {
  @scala.inline
  def apply(EVEN: even, NO: no, ODD: odd): EVEN = {
    val __obj = js.Dynamic.literal(EVEN = EVEN.asInstanceOf[js.Any], NO = NO.asInstanceOf[js.Any], ODD = ODD.asInstanceOf[js.Any])
    __obj.asInstanceOf[EVEN]
  }
  @scala.inline
  implicit class EVENOps[Self <: EVEN] (val x: Self) extends AnyVal {
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
    def setEVEN(value: even): Self = this.set("EVEN", value.asInstanceOf[js.Any])
    @scala.inline
    def setNO(value: no): Self = this.set("NO", value.asInstanceOf[js.Any])
    @scala.inline
    def setODD(value: odd): Self = this.set("ODD", value.asInstanceOf[js.Any])
  }
  
}

