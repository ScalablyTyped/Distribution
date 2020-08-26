package typings.chrome.anon

import typings.chrome.chromeStrings.eight
import typings.chrome.chromeStrings.seven
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EIGHT extends js.Object {
  var EIGHT: eight = js.native
  var SEVEN: seven = js.native
}

object EIGHT {
  @scala.inline
  def apply(EIGHT: eight, SEVEN: seven): EIGHT = {
    val __obj = js.Dynamic.literal(EIGHT = EIGHT.asInstanceOf[js.Any], SEVEN = SEVEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[EIGHT]
  }
  @scala.inline
  implicit class EIGHTOps[Self <: EIGHT] (val x: Self) extends AnyVal {
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
    def setEIGHT(value: eight): Self = this.set("EIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSEVEN(value: seven): Self = this.set("SEVEN", value.asInstanceOf[js.Any])
  }
  
}

