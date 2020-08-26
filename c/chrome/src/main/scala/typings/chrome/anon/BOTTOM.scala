package typings.chrome.anon

import typings.chrome.chromeStrings.bottom
import typings.chrome.chromeStrings.left
import typings.chrome.chromeStrings.right
import typings.chrome.chromeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BOTTOM extends js.Object {
  var BOTTOM: bottom = js.native
  var LEFT: left = js.native
  var RIGHT: right = js.native
  var TOP: top = js.native
}

object BOTTOM {
  @scala.inline
  def apply(BOTTOM: bottom, LEFT: left, RIGHT: right, TOP: top): BOTTOM = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOTTOM]
  }
  @scala.inline
  implicit class BOTTOMOps[Self <: BOTTOM] (val x: Self) extends AnyVal {
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
    def setBOTTOM(value: bottom): Self = this.set("BOTTOM", value.asInstanceOf[js.Any])
    @scala.inline
    def setLEFT(value: left): Self = this.set("LEFT", value.asInstanceOf[js.Any])
    @scala.inline
    def setRIGHT(value: right): Self = this.set("RIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOP(value: top): Self = this.set("TOP", value.asInstanceOf[js.Any])
  }
  
}

