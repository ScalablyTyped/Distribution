package typings.chrome.anon

import typings.chrome.chromeStrings.one
import typings.chrome.chromeStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ONE extends js.Object {
  var ONE: one = js.native
  var TWO: two = js.native
}

object ONE {
  @scala.inline
  def apply(ONE: one, TWO: two): ONE = {
    val __obj = js.Dynamic.literal(ONE = ONE.asInstanceOf[js.Any], TWO = TWO.asInstanceOf[js.Any])
    __obj.asInstanceOf[ONE]
  }
  @scala.inline
  implicit class ONEOps[Self <: ONE] (val x: Self) extends AnyVal {
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
    def setONE(value: one): Self = this.set("ONE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWO(value: two): Self = this.set("TWO", value.asInstanceOf[js.Any])
  }
  
}

